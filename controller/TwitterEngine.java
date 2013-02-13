package controller;

/**
 *
 * @author Cameron Ohrt
 *
 */
import java.util.List;

import twitter4j.*;
import view.*;
import model.*;

public class TwitterEngine {
	private Twitter engine;
	private TableModel table;
	private final int NUM_PAGES = 1;

	public TwitterEngine() {
		engine = TwitterFactory.getSingleton();
		table = new TableModel();
	}

	public void updateStatus(String status) {
		try {
			Status result = engine.updateStatus(status);
			table.clear();
			table.add(new Tweet(result.getId(), result.getCreatedAt(),
						result.getUser().getName(), result.getUser().getName(),
						result.getUser().getStatus().getText(), result.getUser().getFriendsCount(),
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
						result.getUser().getName(), result.getUser().getName(),
						result.getUser().getStatus().getText(), result.getUser().getFriendsCount(),
						result.getUser().getFollowersCount()));
		} catch (TwitterException ex) {
			System.out.println("Retweet failed.");
		}
	}

	public void searchPeople(String query) {
		try {
			ResponseList<User> results = engine.searchUsers(query, NUM_PAGES);
			table.clear();
			for (int i = 0; i < results.size(); i++) {
				table.add(new Tweet(results.get(i).getId(), results.get(i).getCreatedAt(),
						results.get(i).getName(), results.get(i).getName(),
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
						results.get(i).getUser().getName(), results.get(i).getUser().getName(),
						results.get(i).getUser().getStatus().getText(), results.get(i).getUser().getFriendsCount(),
						results.get(i).getUser().getFollowersCount()));
			}
		} catch (TwitterException ex) {
			System.out.println("Search failed.");
		}
	}

	public void followUser(String screenName) {
		try {
			engine.createFriendship(screenName);
		} catch (TwitterException ex) {
			System.out.println("Follow unsuccessful.");
		}
	}

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

	public static void main(String[] args) {
		Twitter4JGUI gui = new Twitter4JGUI();
	}
}
