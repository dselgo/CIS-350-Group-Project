package controller;

import java.util.List;
import java.util.Properties;
import java.awt.event.ActionListener;
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
import view.Twitter4JGUI;


/**
 * This class represents the engine that connects to the Twitter Service.
 *
 * @version 2.0
 * @author Cameron Ohrt & Danny Selgo
 */
public class TwitterEngine {
	/** represents the Twitter service. */
	private Twitter engine;
	
	/** represents the table in the GUI. */
	private TableModel table;
	
	/** represents the Trends JList in the GUI. */
	private TrendModel trendList;
	
	/** represents the Followers JList in the GUI. */
	private UserModel userList;
	
	private Twitter4JGUI view;

	/**
	 * Constructor for the TwitterEngine class - uses the
	 * twitter4j.properties file for authentication values.
	 */
	public TwitterEngine() {
		engine = TwitterFactory.getSingleton();
		table = new TableModel();
		view = new Twitter4JGUI();
		
		addDeleteButtonListener(new DeleteButtonListener());
	    addRetweetButtonListener(new RetweetButtonListener());
	    addFollowButtonListener(new FollowButtonListener());
	    addTimelineButtonListener(new TimelineButtonListener());
	    addCloseButtonListener(new CloseButtonListener());
	    addUpdateButtonListener(new UpdateButtonListener());
	    addSwitchAccountButtonListener(new SwitchAccountButtonListener());
	    addSwitchAccountDialogButtonListener(new SwitchAccountDialogButtonListener());
	    addSearchTopicsButtonListener(new SearchTopicsButtonListener());
	    addSearchPeopleButtonListener(new SearchPeopleButtonListener());
	    addSearchTopicTextFieldListener(new SearchTopicsTextFieldListener());
	    addSearchPeopleTextFieldListener(new SearchPeopleTextFieldListener());
	    addRefreshMenuItemListener(new RefreshMenuItemListener());
	    addGetHelpMenuItemListener(new GetHelpMenuItemListener());
	    addQuitMenuItemListener(new QuitMenuItemListener());
	}

	/**
	 * This method updates the status of the current user
	 * and modifies the table model.
	 *
	 * @param status the status to be posted.
	 * @throws RuntimeException if Twitter fails to update the status.
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
			throw new RuntimeException("Failed to update status: " 
					+ ex.getMessage());
		}
	}

	/**
	 * This method retweets a status selected by the user
	 * and modifies the table model.
	 *
	 * @param sID the status to be retweeted.
	 * @throws RuntimeException if Twitter fails to retweet the status.
	 */
	public final void retweet(final long sID) {
		try {
			if (sID == 0) {
				throw new IllegalArgumentException("Unable to retweet "
						+ "this status.");
			}
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
		} catch (IllegalArgumentException ex) {
			throw new RuntimeException("Failed to retweet: " + ex.getMessage());
		}
	}

	/**
	 * This method searches Twitter for the requested users
	 * and updates the table model.
	 *
	 * @param query the users to be searched.
	 * @throws RuntimeException if Twitter fails to search for the user.
	 */
	public final void searchPeople(final String query) {
		try {
			ResponseList<User> results =
				engine.searchUsers(query, 1);
			table.clear();
			for (int i = 0; i < results.size(); i++) {
				if (results.get(i).getStatus() == null) {
					table.add(new Tweet(0,
							null,
							results.get(i).getScreenName(),
							results.get(i).getName(),
							"",
							results.get(i).getFriendsCount(),
							results.get(i).getFollowersCount()));
				} else {
					table.add(new Tweet(results.get(i).getStatus().getId(),
							results.get(i).getStatus().getCreatedAt(),
							results.get(i).getScreenName(),
							results.get(i).getName(),
							results.get(i).getStatus().getText(),
							results.get(i).getFriendsCount(),
							results.get(i).getFollowersCount()));
				}
			}
		} catch (TwitterException ex) {
			throw new RuntimeException("Search failed: " + ex.getMessage());
		}
	}

	/**
	 * This method searches Twitter for the requested tweets
	 * and updates the table model.
	 *
	 * @param query the tweets to be searched.
	 * @throws RuntimeException if Twitter fails search for tweets.
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
	 * 
	 * @throws RuntimeException if Twitter fails to show the users timeline.
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
			throw new RuntimeException("Failed to find user timeline: "
					+ ex.getMessage());
		}
	}
	
	/**
	 * This method updates the table model with the most recent
	 * tweets of the user with the given screenName.
	 * 
	 * @param screenName screen name of the desired timeline.
	 * @throws RuntimeException if Twitter fails to show the desired timeline.
	 */
	public void showTimeLine(final String screenName) {
		try {
			ResponseList<Status> results =
					engine.getUserTimeline(screenName);
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
			throw new RuntimeException("Failed to find user timeline: " 
					+ ex.getMessage());
		}
	}
	
	/**
	 * This method deletes a selected tweet. The tweet selected
	 * must be owned by the authenticated user.
	 * 
	 * @param sID the id of the tweet to delete.
	 * @throws RuntimeException if Twitter fails to delete the tweet.
	 */
	public final void deleteTweet(final long sID) {
		try {
			Status result = engine.destroyStatus(sID);
			//table.remove(tweet);
			// or just clear table?
                        showTimeLine();
                        
		} catch (TwitterException ex) {
			throw new RuntimeException("Failed to delete tweet: " 
					+ ex.getMessage());
		}
	}
	

	/**
	 * This method follows a selected user requested by the logged in user.
	 *
	 * @param screenName id of the selected user to follow
	 * @throws RuntimeException if Twitter fails to follow the user.
	 */
	public final void followUser(final String screenName) {
		try {
			engine.createFriendship(screenName);
		} catch (TwitterException ex) {
			throw new RuntimeException("Failed to follow: " + ex.getMessage());
		}
	}
	
	/**
	 * Generates a list of users that Twitter suggests you follow.  
	 * Adds this list to the UserModel.
	 * 
	 * @return userList - the current UserModel.
	 * @throws RuntimeException if Twitter fails to generate a who to follow 
	 * 		   list.
	 */
	public UserModel generateSuggestedUsers() {
		try {
			ResponseList<Category> categories = 
					engine.getSuggestedUserCategories();
			ResponseList<User> users = 
					engine.getUserSuggestions(categories.get(0).getSlug());
			userList = new UserModel(users);
			return userList;
		} catch (TwitterException ex) {
			throw new RuntimeException("Failed to generate suggested users"
					+ "to follow: " + ex.getMessage());
		}
	}
	
	/**
	 * Generates a list of current worldwide trending topics.  
	 * Adds this list to the TrendModel.
	 * 
	 * @return trendList - the current TrendModel.
	 * @throws RuntimeException if Twitter generate a trending topics list.
	 */
	public TrendModel generateTrendingTopics() {
		try {
			Trends trends = engine.getPlaceTrends(1);
			trendList = new TrendModel(trends);
			return trendList;
		} catch (TwitterException ex) {
			throw new RuntimeException("Failed to generate trending topics: " 
					+ ex.getMessage());
		}
	}

	/**
	 * This method returns the current TableModel.
	 *
	 * @return table - the current TableModel.
	 */
	public final TableModel getTable() {
		return table;
	}
	
	/**
	 * This method returns the current TrendModel.
	 *
	 * @return trendList - the current TrendModel.
	 */
	public TrendModel getTrends() {
		return trendList;
	}

	/**
	 * This method returns the current UserModel.
	 *
	 * @return userList - the current UserModel.
	 */
	public UserModel getUsers() {
		return userList;
	}
	
	/**
	 * This method returns the logged in user information to be displayed.
	 *
	 * @return an array of strings that holds the logged in user information.
	 * @throws RuntimeException if Twitter fails to get the desired information.
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
			throw new RuntimeException("Failed to accumulate user information: "
					+ ex.getMessage());
		}
		return info;
	}

	/**
	 * This method allows the logged in user to switch accounts.
	 * It also updates the twitter4j.properties file to allow the
	 * new user to be automatically logged in on startup.
	 *
	 * @param consumerKey
	 *            the consumerKey of the account to switch to
	 * @param consumerSecret
	 *            the consumerSecret of the account to switch to
	 * @param accessToken
	 *            the accessToken of the account to switch to
	 * @param accessTokenSecret
	 *            the accessTokenSecret of the account to switch to
	 * @throws RuntimeException if Twitter fails to switch the accounts.
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
			throw new RuntimeException("Failed to write to .properties file: " 
					+ ex.getMessage());
		} catch (Exception ex) {
			throw new RuntimeException("Failed to switch account: " 
					+ ex.getMessage());
		}
	}
	
	public final void DeleteButtonListener() {
		
	}
	
	public final void RetweetButtonListener() {
		
	}
	
	public final void FollowButtonListener() {
		
	}
	
	public final void TimelineButtonListener() {
		
	}
	
	public final void CloseButtonListener() {
		
	}
	
	public final void UpdateButtonListener() {
		
	}
	
	public final void SwitchAccountButtonListener() {
		
	}
	
	public final void SwitchAccountDialogButtonListener() {
		
	}
	
	public final void SearchTopicsButtonListener() {
		
	}
	
	public final void SearchPeopleButtonListener() {
		
	}
	
	public final void SearchTopicsTextFieldListener() {
		
	}
	
	public final void SearchPeopleTextFieldListener() {
		
	}
	
	public final void RefreshMenuItemListener() {
		
	}
	
	public final void GetHelpMenuItemListener() {
		
	}
	
	public final void QuitMenuItemListener() {
		
	}
}
