package model;
/**
 * Implements ITweet.  Stores the information of a tweet.
 * 
 * @author Danny Selgo
 */
public class Tweet {

	private long id;
	private java.util.Date createdAt;
	private String loginName;
	private String displayName;
	private String text;
	private int friendsCount;
	private int followersCount;
/**
 * Constructor that stores all of the information into the fields.
 * 
 * @param id - the id of the tweet.
 * @param createdAt - the date and time the tweet was created.
 * @param loginName - the login name of the user who wrote the tweet.
 * @param displayName - the diplay nme of the user who wrote the tweet.
 * @param text - the actual text of the tweet.
 * @param friendsCount - the number of friends that the user has.
 * @param followersCount - the number of followers that the user has.
 */
	public Tweet(long id, java.util.Date createdAt,
			String loginName, String displayName, String text,
			int friendsCount, int followersCount) {
		this.id = id;
		this.createdAt = createdAt;
		this.loginName = loginName;
		this.displayName = displayName;
		this.text = text;
		this.friendsCount = friendsCount;
		this.followersCount = followersCount;
	}
	/**
	 * @return id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @return createdAt
	 */
	public java.util.Date getCreatedAt() {
		return createdAt;
	}
	/**
	 * @return loginName
	 */
	public String getLoginName() {
		return loginName;
	}
	/**
	 * @return displayName
	 */
	public String getDisplayName() {
		return displayName;
	}
	/**
	 * @return text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @return friendsCount
	 */
	public int getFriendsCount() {
		return friendsCount;
	}
	/**
	 * @return followersCount
	 */
	public int getFollowersCount() {
		return followersCount;
	}
}

