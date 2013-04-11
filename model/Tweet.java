package model;

/**
 * Stores the information of a tweet.
 * 
 * @author Danny Selgo
 */
public class Tweet {

	/** id of the Tweet. */
	private long id;

	/** date the Tweet was created. */
	private java.util.Date createdAt;

	/** login name of the user that created the Tweet. */
	private String loginName;

	/** display name of the user that created the Tweet. */
	private String displayName;

	/** text of the Tweet. */
	private String text;

	/** friends count of the user that created the Tweet. */
	private int friendsCount;

	/** followers count of the user that created the Tweet. */
	private int followersCount;

	/**
	 * Constructor that stores all of the information into the fields.
	 * 
	 * @param id
	 *            the id of the tweet.
	 * @param createdAt
	 *            the date and time the tweet was created.
	 * @param loginName
	 *            the login name of the user who wrote the tweet.
	 * @param displayName
	 *            the diplay name of the user who wrote the tweet.
	 * @param text
	 *            the actual text of the tweet.
	 * @param friendsCount
	 *            the number of friends that the user has.
	 * @param followersCount
	 *            the number of followers that the user has.
	 */
	public Tweet(final long id, final java.util.Date createdAt,
			final String loginName, final String displayName,
			final String text, final int friendsCount, final int followersCount) {
		this.id = id;
		this.createdAt = createdAt;
		this.loginName = loginName;
		this.displayName = displayName;
		this.text = text;
		this.friendsCount = friendsCount;
		this.followersCount = followersCount;
	}

	/**
	 * Returns id.
	 * 
	 * @return id.
	 */
	public final long getId() {
		return id;
	}

	/**
	 * Returns createdAt.
	 * 
	 * @return createdAt.
	 */
	public final java.util.Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * Returns loginName.
	 * 
	 * @return loginName.
	 */
	public final String getLoginName() {
		return loginName;
	}

	/**
	 * Returns displayName.
	 * 
	 * @return displayName.
	 */
	public final String getDisplayName() {
		return displayName;
	}

	/**
	 * Returns text.
	 * 
	 * @return text.
	 */
	public final String getText() {
		return text;
	}

	/**
	 * Returns friendsCount.
	 * 
	 * @return friendsCount.
	 */
	public final int getFriendsCount() {
		return friendsCount;
	}

	/**
	 * Returns followersCount.
	 * 
	 * @return followersCount.
	 */
	public final int getFollowersCount() {
		return followersCount;
	}
}
