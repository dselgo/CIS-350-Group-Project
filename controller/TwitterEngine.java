package controller;

/**
 *
 * @author Cameron Ohrt
 *
 */
import java.util.List;
import java.util.Properties;
import java.io.FileOutputStream;
import java.io.IOException;

import twitter4j.*;
import view.*;
import model.*;

public class TwitterEngine {
	private Twitter engine;
	private TableModel table;

	public TwitterEngine() {
		engine = TwitterFactory.getSingleton();
		table = new TableModel();
	}

	public void updateStatus(String status) {
		try {
			Status result = engine.updateStatus(status);
			table.clear();
			table.add(new Tweet(result.getId(), result.getCreatedAt(),
						result.getUser().getScreenName(), result.getUser().getName(),
						result.getText(), result.getUser().getFriendsCount(),
						result.getUser().getFollowersCount()));
		} catch (TwitterException ex) {
			System.out.println("Tweet failed.");
		}
	}

	public void retweet(long SID) {
		try {
			Status result = engine.retweetStatus(SID);
			table.clear();
			table.add(new Tweet(result.getId(), result.getCreatedAt(),
						result.getUser().getScreenName(), result.getUser().getName(),
						result.getText(), result.getUser().getFriendsCount(),
						result.getUser().getFollowersCount()));
		} catch (TwitterException ex) {
			System.out.println("Retweet failed.");
		}
	}

	public void searchPeople(String query) {
		try {
			ResponseList<User> results = engine.searchUsers(query, 1);
			table.clear();
			for (int i = 0; i < results.size(); i++) {
				table.add(new Tweet(results.get(i).getId(), results.get(i).getCreatedAt(),
						results.get(i).getScreenName(), results.get(i).getName(),
						results.get(i).getStatus().getText(), results.get(i).getFriendsCount(),
						results.get(i).getFollowersCount()));
			}
		} catch (TwitterException ex) {
			System.out.println("Search failed.");
		}
	}

	public void searchTweets(String query) {
		try {
			Query toSearch = new Query(query);
			List<Status> results = engine.search(toSearch).getTweets();
			table.clear();
			for (int i = 0; i < results.size(); i++) {
				table.add(new Tweet(results.get(i).getId(), results.get(i).getCreatedAt(),
						results.get(i).getUser().getScreenName(), results.get(i).getUser().getName(),
						results.get(i).getText(), results.get(i).getUser().getFriendsCount(),
						results.get(i).getUser().getFollowersCount()));
			}
		} catch (TwitterException ex) {
			System.out.println("Search failed.");
		}
	}

	/*public void followUser(String screenName) {
		try {
			engine.createFriendship(screenName);
		} catch (TwitterException ex) {
			System.out.println("Follow unsuccessful.");
		}
	}*/

	public void followUser(long ID) {
		try {
			engine.createFriendship(ID);
		} catch (TwitterException ex) {
			System.out.println("Follow unsuccessful.");
		}
	}

	public TableModel getTable() {
		return table;
	}
	
	public String[] getUserInformation(){
		String[] info = new String[4];
		try{
			User user = engine.showUser(engine.getId());
			info[0] = user.getName();
			info[1] = user.getScreenName();
			info[2] = "" + user.getFriendsCount();
			info[3] = "" + user.getFollowersCount();
		} catch (Exception ex){}
		return info;
	}
        
        public void switchAccount(String consumerKey, String consumerSecret, 
                                  String accessToken, String accessTokenSecret){
            try{
                Properties prop = new Properties();
                
                prop.setProperty("oauth.consumerKey", consumerKey);
                prop.setProperty("oauth.consumerSecret", consumerSecret);
                prop.setProperty("oauth.accessToken", accessToken);
                prop.setProperty("oauth.accessTokenSecret", accessTokenSecret);
                prop.store(new FileOutputStream("src/twitter4j.properties"), null);
            } catch (IOException ex){
                System.out.println("Write to .properties file failed");
            }
        }

	public static void main(String[] args) {
		Twitter4JGUI gui = new Twitter4JGUI();
	}
}
