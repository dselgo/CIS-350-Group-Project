package controller;

import java.util.List;
import java.util.Properties;
import java.io.FileOutputStream;
import java.io.IOException;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.Query;
import twitter4j.conf.ConfigurationBuilder;
import model.Tweet;
import model.TableModel;


/**
 * This class represents the engine that connects to the Twitter Service.
 *
 * @author Cameron Ohrt
 */
public class TwitterEngine {

	private Twitter engine;
	private TableModel table;

	/**
	 * Constructor for the TwitterEngine class - uses the
	 * twitter4j.properties file for authentication values.
	 */
	public TwitterEngine() {
		engine = TwitterFactory.getSingleton();
		table = new TableModel();
	}

	/**
	 * This method updates the status of the current user
	 * and modifies the table model.
	 *
	 * @param status the status to be posted
	 */
	public final void updateStatus(final String status) {
		try {
			Status result = engine.updateStatus(status);
			table.clear();
			table.add(new Tweet(result.getId(),
				result.getCreatedAt(),
				result.getUser().getScreenName(),
				result.getUser().getName(),
				result.getText(),
				result.getUser().getFriendsCount(),
				result.getUser().getFollowersCount()));
		} catch (TwitterException ex) {
			System.out.println("Tweet failed.");
		}
	}

	/**
	 * This method retweets a status selected by the user
	 * and modifies the table model.
	 *
	 * @param sID the status to be retweeted
	 */
	public final void retweet(final long sID) {
		try {
			Status result = engine.retweetStatus(sID);
			table.clear();
			table.add(new Tweet(result.getId(),
				result.getCreatedAt(),
				result.getUser().getScreenName(),
				result.getUser().getName(),
				result.getText(),
				result.getUser().getFriendsCount(),
				result.getUser().getFollowersCount()));
		} catch (TwitterException ex) {
			System.out.println("Retweet failed.");
		}
	}

	/**
	 * This method searches Twitter for the requested users
	 * and updates the table model.
	 *
	 * @param query the users to be searched
	 */
	public final void searchPeople(final String query) {
		try {
			ResponseList<User> results =
				engine.searchUsers(query, 1);
			table.clear();
			for (int i = 0; i < results.size(); i++) {
				table.add(new Tweet(results.get(i).getId(),
					results.get(i).getCreatedAt(),
					results.get(i).getScreenName(),
					results.get(i).getName(),
					results.get(i).getStatus().getText(),
					results.get(i).getFriendsCount(),
					results.get(i).getFollowersCount()));
			}
		} catch (TwitterException ex) {
			System.out.println("Search failed.");
		}
	}

	/**
	 * This method searches Twitter for the requested tweets
	 * and updates the table model.
	 *
	 * @param query the tweets to be searched
	 */
	public final void searchTweets(final String query) {
		try {
			Query toSearch = new Query(query);
			List<Status> results = engine.search(toSearch).getTweets();
			table.clear();
			for (int i = 0; i < results.size(); i++) {
				table.add(new Tweet(results.get(i).getId(),
					results.get(i).getCreatedAt(),
					results.get(i).getUser().getScreenName(),
					results.get(i).getUser().getName(),
					results.get(i).getText(),
					results.get(i).getUser().getFriendsCount(),
					results.get(i).getUser().getFollowersCount()));
			}
		} catch (TwitterException ex) {
			System.out.println("Search failed.");
		}
	}

	/**
	 * This method updates the table model with the most recent
	 * tweets of the current user logged in.
	 */
	public final void showTimeLine() {
		try {
			ResponseList<Status> results =
				engine.getUserTimeline();
			table.clear();
			for (int i = 0; i < results.size(); i++) {
				table.add(new Tweet(results.get(i).getId(),
						results.get(i).getCreatedAt(),
						results.get(i).getUser().getScreenName(),
						results.get(i).getUser().getName(),
						results.get(i).getText(),
						results.get(i).getUser().getFriendsCount(),
						results.get(i).getUser().getFollowersCount()));
			}
		} catch (TwitterException ex) {
			System.out.println("Search failed.");
		}
	}
	
	/**
	 * This method deletes a selected tweet. The tweet selected
	 * must be a owned by the authenticated user.
	 * @param sID the id of the tweet to delete
	 */
	
	public final void deleteTweet(final long sID) {
		try {
			Status result = engine.destroyStatus(sID);
			//table.remove(tweet);
			// or just clear table?
                        showTimeLine();
                        
		} catch (TwitterException ex) {
			System.out.println("Delete failed.");
		}
	}
	

	/**
	 * This method follows a selected user requested by the logged in user.
	 *
	 * @param id the selected user to follow
	 */
	public final void followUser(final long id) {
		try {
			engine.createFriendship(id);
		} catch (TwitterException ex) {
			System.out.println("Follow unsuccessful.");
		}
	}

	/**
	 * This method returns the table model of the engine.
	 *
	 * @return the table model
	 */
	public final TableModel getTable() {
		return table;
	}

	/**
	 * This method returns the logged in user information to be displayed.
	 *
	 * @return an array of strings that holds the logged in user information
	 */
	public final String[] getUserInformation() {
		String[] info = new String[5];
		try {
			User user = engine.showUser(engine.getId());
			info[0] = user.getName();
			info[1] = user.getScreenName();
			info[2] = "" + user.getFriendsCount();
			info[3] = "" + user.getFollowersCount();
			info[4] = "" + user.getStatusesCount();
		} catch (Exception ex) {
			System.out.println(
				"Failed to accumulate user information.");
		}
		return info;
	}

	/**
	 * This method allows the logged in user to switch accounts.
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
	public final void switchAccount(final String consumerKey,
			final String consumerSecret,
			final String accessToken,
			final String accessTokenSecret) {
		try {
			Properties prop = new Properties();

			prop.setProperty("oauth.consumerKey",
				consumerKey);
			prop.setProperty("oauth.consumerSecret",
				consumerSecret);
			prop.setProperty("oauth.accessToken",
				accessToken);
			prop.setProperty("oauth.accessTokenSecret",
				accessTokenSecret);

			prop.store(new FileOutputStream(
				"src/twitter4j.properties"), null);

			ConfigurationBuilder cb = new ConfigurationBuilder();
			cb.setDebugEnabled(true)
				.setOAuthConsumerKey(consumerKey)
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
