package model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

/**
 * This class stores all of the tweets gathered from the controller. The
 * class extends the AbstractTableModel class so that we may display the
 * information on a JTable in the GUI.
 *
 * @version 2.0
 * @author Danny Selgo
 */
public class TableModel extends AbstractTableModel {

	private String[] columnNames = new String[] {"Date", "Login Name",
			"Display Name", "Following", "Followers" };
	private ArrayList<Tweet> tweets;

	/**
	 * Constructor for the class. Initializes the ArrayList<Tweet> tweets.
	 */
	public TableModel() {
		tweets = new ArrayList<Tweet>();
	}

	/**
	 * Returns the tweet at the given index.
	 *
	 * @param index the index to store the tweet in ArrayList<Tweet> tweets.
	 * @return the tweet stored in ArrayList<Tweet> tweets
	 * 		   at the given index.
	 */
	public final Tweet get(final int index) {
		return tweets.get(index);
	}

	/**
	 * Returns all of the tweets in the TableModel.
	 *
	 * @return the ArrayList<Tweet> tweets.
	 */
	public final ArrayList<Tweet> getTweets() {
		return tweets;
	}

	/**
	 * Adds a tweet to ArrayList<Tweet> tweets and updates the table.
	 *
	 * @param tweet the tweet to be added to ArrayList<Tweet> tweets.
	 */
	public final void add(final Tweet tweet) {
		if (tweet != null) {
			tweets.add(tweet);
			fireTableRowsInserted(tweets.size() - 1,
				tweets.size() - 1);
		}
	}

	/**
	 * Adds a tweet to ArrayList<Tweet> tweets at the specified index and
	 * updates the table.
	 *
	 * @param index the index of ArrayList<Tweet> tweets in
	 * 				which the tweet will be stored.
	 * @param tweet the tweet to be stored.
	 */
	public final void add(final int index, final Tweet tweet) {
		if (tweet != null) {
			tweets.add(index, tweet);
			fireTableRowsInserted(index, index);
		}
	}

	/**
	 * Removes the tweet at the given index from ArrayList<Tweet> tweets and
	 * then updates the table.
	 *
	 * @param index the index location of the tweet to be removed.
	 */
	public final void remove(final int index) {
		tweets.remove(index);
		fireTableRowsDeleted(index, index);
	}

	/**
	 * Removes the tweet from ArrayList<Tweet> tweets.
	 *
	 * @param tweet the tweet that is to be removed.
	 */
	public final void remove(final Tweet tweet) {
		remove(tweets.indexOf(tweet));
	}

	/**
	 * Clears ArrayList<Tweet> tweets so that it contains no values and then
	 * updates the table.
	 */
	public final void clear() {
		if (tweets.size() > 0) {
			int size = tweets.size();
			tweets.clear();
			this.fireTableRowsDeleted(0, size - 1);
		}
	}

	/**
	 * Returns the number of columns in the TableModel.
	 *
	 * @return the number of columns in the TableModel.
	 */
	public final int getColumnCount() {
		return columnNames.length;
	}

	/**
	 * Returns the number of rows in the TableModel.
	 *
	 * @return the number of rows in the TableModel.
	 */
	public final int getRowCount() {
		return tweets.size();
	}

	/**
	 * Returns the name of the column in position col.
	 *
	 * @param col the column number.
	 * @return a String containing the columnname of the specified column.
	 */
	public final String getColumnName(final int col) {
		return columnNames[col];
	}

	/**
	 * Returns a piece of information at the specified cell in the table.
	 *
	 * @param row the row of the desired cell.
	 * @param col the column of the desired cell.
	 * @return the data that is stored in the specified row and column.
	 */
	public final Object getValueAt(final int row, final int col) {
		Object val = null;
		switch (col) {
		case 0:
			val = tweets.get(row).getCreatedAt();
			break;

		case 1:
			val = tweets.get(row).getLoginName();
			break;

		case 2:
			val = tweets.get(row).getDisplayName();
			break;

		case 3:
			val = new Integer(tweets.get(row).getFriendsCount());
			break;

		case 4:
			val = new Integer(tweets.get(row).getFollowersCount());
			break;
		default:
			System.out.println("Invalid column entry.");
		}
		return val;
	}

	/**
	 * Returns the index of a given tweet t.
	 *
	 * @param t the tweet in ArrayList<Tweet> tweets.
	 * @return the index of the the tweet in ArrayList<Tweet> tweets.
	 */
	public final int indexOf(final Tweet t) {
		return tweets.indexOf(t);
	}
}
