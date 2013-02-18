package controller;

/**
 * This class represents the engine that connects to the Twitter Service
 * @author Cameron Ohrt
 *
 */
import java.util.List;
import java.util.Properties;
import java.io.FileOutputStream;
import java.io.IOException;

import twitter4j.*;
import twitter4j.conf.*;
import view.*;
import model.*;

public class TwitterEngine {
	private Twitter engine;
	private TableModel table;

	/**
	 * Constructor for the TwitterEngine class - uses the twitter4j.properties
	 * file for authentication values
	 */
	public TwitterEngine() {
		engine = TwitterFactory.getSingleton();
		table = new TableModel();
	}

	/**
	 * This method updates the status of the current user and modifies the table
	 * model
	 * 
	 * @param status
	 *            the status to be posted
	 */
	public void updateStatus(String status) {
		try {
			Status result = engine.updateStatus(status);
			table.clear();
			table.add(new Tweet(result.getId(), result.getCreatedAt(), result
					.getUser().getScreenName(), result.getUser().getName(),
					result.getText(), result.getUser().getFriendsCount(),
					result.getUser().getFollowersCount()));
		} catch (TwitterException ex) {
			System.out.println("Tweet failed.");
		}
	}

	/**
	 * This method retweets a status selected by the user and modifies the table
	 * model
	 * 
	 * @param SID
	 *            the status to be retweeted
	 */
	public void retweet(long SID) {
		try {
			Status result = engine.retweetStatus(SID);
			table.clear();
			table.add(new Tweet(result.getId(), result.getCreatedAt(), result
					.getUser().getScreenName(), result.getUser().getName(),
					result.getText(), result.getUser().getFriendsCount(),
					result.getUser().getFollowersCount()));
		} catch (TwitterException ex) {
			System.out.println("Retweet failed.");
		}
	}

	/**
	 * This method searches Twitter for the requested users and updates the
	 * table model
	 * 
	 * @param query
	 *            the users to be searched
	 */
	public void searchPeople(String query) {
		try {
			ResponseList<User> results = engine.searchUsers(query, 1);
			table.clear();
			for (int i = 0; i < results.size(); i++) {
				table.add(new Tweet(results.get(i).getId(), results.get(i)
						.getCreatedAt(), results.get(i).getScreenName(),
						results.get(i).getName(), results.get(i).getStatus()
								.getText(), results.get(i).getFriendsCount(),
						results.get(i).getFollowersCount()));
			}
		} catch (TwitterException ex) {
			System.out.println("Search failed.");
		}
	}

	/**
	 * This method searches Twitter for the requested tweets and updates the
	 * table model
	 * 
	 * @param query
	 *            the tweets to be searched
	 */
	public void searchTweets(String query) {
		try {
			Query toSearch = new Query(query);
			List<Status> results = engine.search(toSearch).getTweets();
			table.clear();
			for (int i = 0; i < results.size(); i++) {
				table.add(new Tweet(results.get(i).getId(), results.get(i)
						.getCreatedAt(), results.get(i).getUser()
						.getScreenName(), results.get(i).getUser().getName(),
						results.get(i).getText(), results.get(i).getUser()
								.getFriendsCount(), results.get(i).getUser()
								.getFollowersCount()));
			}
		} catch (TwitterException ex) {
			System.out.println("Search failed.");
		}
	}

	/*
	 * public void followUser(String screenName) { try {
	 * engine.createFriendship(screenName); } catch (TwitterException ex) {
	 * System.out.println("Follow unsuccessful."); } }
	 */

	/**
	 * This method follows a selected user requested by the logged in user
	 * 
	 * @param ID
	 *            the selected user to follow
	 */
	public void followUser(long ID) {
		try {
			engine.createFriendship(ID);
		} catch (TwitterException ex) {
			System.out.println("Follow unsuccessful.");
		}
	}

	/**
	 * This method returns the table model of the engine
	 * 
	 * @return the table model
	 */
	public TableModel getTable() {
		return table;
	}

	/**
	 * This method returns the logged in user information to be displayed
	 * 
	 * @return an array of strings that holds the logged in user information
	 */
	public String[] getUserInformation() {
		String[] info = new String[4];
		try {
			User user = engine.showUser(engine.getId());
			info[0] = user.getName();
			info[1] = user.getScreenName();
			info[2] = "" + user.getFriendsCount();
			info[3] = "" + user.getFollowersCount();
		} catch (Exception ex) {
		}
		return info;
	}

	/**
	 * This method allows the logged in user to switch accounts
	 * 
	 * @param consumerKey
	 *            the consumerKey of the account to switch to
	 * @param consumerSecret
	 *            the consumerSecret of the account to switch to
	 * @param accessToken
	 *            the accessToken of the account to switch to
	 * @param accessTokenSecret
	 *            the accessTokenSecret of the account to switch to
	 */
	public void switchAccount(String consumerKey, String consumerSecret,
			String accessToken, String accessTokenSecret) {
		try {
			Properties prop = new Properties();

			prop.setProperty("oauth.consumerKey", consumerKey);
			prop.setProperty("oauth.consumerSecret", consumerSecret);
			prop.setProperty("oauth.accessToken", accessToken);
			prop.setProperty("oauth.accessTokenSecret", accessTokenSecret);

			prop.store(new FileOutputStream("src/twitter4j.properties"), null);

			ConfigurationBuilder cb = new ConfigurationBuilder();
			cb.setDebugEnabled(true).setOAuthConsumerKey(consumerKey)
					.setOAuthConsumerSecret(consumerSecret)
					.setOAuthAccessToken(accessToken)
					.setOAuthAccessTokenSecret(accessTokenSecret);
			TwitterFactory tf = new TwitterFactory(cb.build());
			engine = tf.getInstance();

		} catch (IOException ex) {
			System.out.println("Write to .properties file failed");
		}
	}
}
