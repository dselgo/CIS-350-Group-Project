package controller;

import java.util.List;
import java.util.Properties;
import java.io.FileOutputStream;
import java.io.IOException;
import twitter4j.Category;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Trends;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.Query;
import twitter4j.conf.ConfigurationBuilder;
import model.Tweet;
import model.TableModel;
import model.TrendModel;
import model.UserModel;


/**
 * This class represents the engine that connects to the Twitter Service.
 *
 * @author Cameron Ohrt
 */
public class TwitterEngine {

	private Twitter engine;
	private TableModel table;
	private TrendModel trendList;
	private UserModel userList;

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
			throw new RuntimeException("Failed to update status: " + ex.getMessage());
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
			throw new RuntimeException("Failed to retweet: " + ex.getMessage());
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
			throw new RuntimeException("Search failed: " + ex.getMessage());
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
			throw new RuntimeException("Search failed: " + ex.getMessage());
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
			throw new RuntimeException("Failed to find user timeline: " + ex.getMessage());
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
			throw new RuntimeException("Failed to delete tweet: " + ex.getMessage());
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
			throw new RuntimeException("Failed to follow: " + ex.getMessage());
		}
	}
	
	public UserModel generateSuggestedUsers() {
		try {
			ResponseList<Category> categories = engine.getSuggestedUserCategories();
			ResponseList<User> users = engine.getUserSuggestions(categories.get(0).getSlug());
			userList = new UserModel(users);
			return userList;
		} catch (TwitterException ex){
			throw new RuntimeException("Failed to generate suggested users to follow: " + ex.getMessage());
		}
	}
	
	public TrendModel generateTrendingTopics() {
		try{
			Trends trends = engine.getPlaceTrends(1);
			trendList = new TrendModel(trends);
			return trendList;
		} catch (TwitterException ex){
			throw new RuntimeException("Failed to generate trending topics: " + ex.getMessage());
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
	
	public TrendModel getTrends(){
		return trendList;
	}

	public UserModel getUsers(){
		return userList;
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
		} catch (TwitterException ex) {
			throw new RuntimeException("Failed to accumulate user information: " + ex.getMessage());
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
			throw new RuntimeException("Failed to write to .properties file: " + ex.getMessage());
		} catch (Exception ex) {
			throw new RuntimeException("Failed to switch account: " + ex.getMessage());
		}
	}
}
