package model;

import javax.swing.table.AbstractTableModel;
import java.util.*;
import java.lang.Integer;

/**
 * This class stores all of the information gathered from the controller. The
 * class extends the AbstractTableModel class so that we may display the
 * information on the JTable in the GUI.
 * 
 * @author Danny Selgo
 */
public class TableModel extends AbstractTableModel {

	public String[] columnNames = new String[] { "Date", "Login Name",
			"Display Name", "Friends", "Followers" };
	public ArrayList<Tweet> tweets;

	/**
	 * Constructor for the class. Initializes the ArrayList<Tweet> tweets.
	 */
	public TableModel() {
		tweets = new ArrayList<Tweet>();
	}

	/**
	 * @param index - the index to store the tweet in ArrayList<Tweet> tweets.
	 * @return the tweet stored in ArrayList<Tweet> tweets at the given index.
	 */
	public Tweet get(int index) {
		return tweets.get(index);
	}

	/**
	 * @return the ArrayList<Tweet> tweets.
	 */
	public ArrayList<Tweet> getTweets() {
		return tweets;
	}

	/**
	 * Adds a tweet to ArrayList<Tweet> tweets and updates the table.
	 * 
	 * @param tweet - the tweet to be added to ArrayList<Tweet> tweets.
	 */
	public void add(Tweet tweet) {
		if (tweet != null) {
			tweets.add(tweet);
			fireTableRowsInserted(tweets.size() - 1, tweets.size() - 1);
		}
	}

	/**
	 * Adds a tweet to ArrayList<Tweet> tweets at the specified index and
	 * updates the tabel.
	 * 
	 * @param index - the index of ArrayList<Tweet> tweets in which the tweet will be stored.
	 * @param tweet - the tweet to be stored.
	 */
	public void add(int index, Tweet tweet) {
		if (tweet != null) {
			tweets.add(index, tweet);
			fireTableRowsInserted(index, index);
		}
	}

	/**
	 * Removes the tweet at the given index from ArrayList<Tweet> tweets and
	 * then updates the table.
	 * 
	 * @param index - the index location of the tweet to be removed.
	 */
	public void remove(int index) {
		tweets.remove(index);
		fireTableRowsDeleted(index, index);
	}

	/**
	 * Removes the tweet from ArrayList<Tweet> tweets.
	 * 
	 * @param tweet - the tweet that is to be removed.
	 */
	public void remove(Tweet tweet) {
		remove(tweets.indexOf(tweet));
	}

	/**
	 * Clears ArrayList<Tweet> tweets so that it contains no values and then
	 * updates the table.
	 */
	public void clear() {
		if (tweets.size() > 0) {
			int size = tweets.size();
			tweets.clear();
			this.fireTableRowsDeleted(0, size - 1);
		}
	}

	/**
	 * @return the number of columns in the TableModel.
	 */
	public int getColumnCount() {
		return columnNames.length;
	}

	/**
	 * @return the number of rows in the TableModel.
	 */
	public int getRowCount() {
		return tweets.size();
	}

	/**
	 * @param col - the column number.
	 * @return a String containing the columnname of the specified column.
	 */
	public String getColumnName(int col) {
		return columnNames[col];
	}

	/**
	 * Species where the information is stored in the table.
	 * 
	 * @return the data that is stored in the specified row and column.
	 */
	public Object getValueAt(int row, int col) {
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
		}
		return val;
	}

	/**
	 * @param t - the tweet in ArrayList<Tweet> tweets.
	 * @return the index of the the tweet in ArrayList<Tweet> tweets.
	 */
	public int indexOf(Tweet t) {
		return tweets.indexOf(t);
	}
}
