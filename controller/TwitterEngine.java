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
	}

	public Status updateStatus(String status) {
		try {
			Status result = engine.updateStatus(status);
			return result;
		} catch (TwitterException ex) {
			System.out.println("Tweet failed.");
		}
		return null;
	}

	public Status retweet(long SID) {
		try {
			Status result = engine.retweetStatus(SID);
			return result;
		} catch (TwitterException ex) {
			System.out.println("Retweet failed.");
		}
		return null;
	}

	public TableModel searchPeople(String query) {
		try {
			ResponseList<User> results = engine.searchUsers(query, NUM_PAGES);
			table.clear();
			for (int i = 0; i < results.size(); i++) {
				table.add(new Tweet(results.get(i).getId(), results.get(i).getCreatedAt(),
						results.get(i).getName(), results.get(i).getName(),
						results.get(i).getStatus().getText(), results.get(i).getFriendsCount(),
						results.get(i).getFollowersCount()));
			}
			return table;
		} catch (TwitterException ex) {
			System.out.println("Search failed.");
		}
		return null;
	}

	public TableModel searchTweets(String query) {
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
			return table;
		} catch (TwitterException ex) {
			System.out.println("Search failed.");
		}
		return null;
	}

	public User followUser(String screenName) {
		try {
			return engine.createFriendship(screenName);
		} catch (TwitterException ex) {
			System.out.println("Follow unsuccessful.");
		}
		return null;
	}

	public User followUser(long ID) {
		try {
			return engine.createFriendship(ID);
		} catch (TwitterException ex) {
			System.out.println("Follow unsuccessful.");
		}
		return null;
	}

	public TableModel getTable() {
		return table;
	}

	public static void main(String[] args) {
		Twitter4JGUI gui = new Twitter4JGUI();
	}
}
