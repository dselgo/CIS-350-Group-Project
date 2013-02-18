package view;

import java.util.logging.Logger;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import controller.TwitterEngine;
import model.Tweet;

/**
 * This class creates the user interface for the Twitter Desktop Application.
 *
 * @author Morgan Heyboer
 */
public class Twitter4JGUI extends JFrame {

/**
 * Creates new form Twitter4JGUI.
 */
public Twitter4JGUI() {
	engine = new TwitterEngine();
	initComponents();
}

/**
 * This method is called from within the constructor to initialize
 * all of the elements of the GUI.
 */
private void initComponents() {
	consumerSecretInputDialog = new JOptionPane("Input");
	mainPanel = new JPanel();
	mainTabPane = new JTabbedPane();
	createTweetPanel = new JPanel();
	enterTweetLabel = new JLabel();
	tweetTextArea = new JScrollPane();
	enterTweetTextArea = new JTextArea();
	updateButton = new JButton();
	searchTopicsPanel = new JPanel();
	searchTopicLabel = new JLabel();
	searchTopicTextField = new JTextField();
	searchTopicsButton = new JButton();
	searchPeoplePanel = new JPanel();
	searchPeopleLabel = new JLabel();
	searchPeopleTextField = new JTextField();
	searchPeopleButton = new JButton();
	profilePanel = new JPanel();
	profileLabel = new JLabel();
	nameLabel = new JLabel();
	usernameLabel = new JLabel();
	followingLabel = new JLabel();
	followersLabel = new JLabel();
	nameLabelContent = new JLabel();
	displayNameLabelContent = new JLabel();
	followingLabelContent = new JLabel();
	followersLabelContent = new JLabel();
	twitterPic = new JLabel();
	switchAccountButton = new JButton();
	jScrollPane2 = new JScrollPane();
	tweetTable = new JTable(engine.getTable());
	displayTweetText = new JTextArea();
	followButton = new JButton();
	retweetButton = new JButton();
	menubar = new JMenuBar();
	fileMenu = new JMenu();
	quitMenuItem = new JMenuItem();

	consumerSecretInputDialog
		.setMessage("Please enter your consumer secret:");
	consumerSecretInputDialog.setMessageType(3);
	consumerSecretInputDialog.setOptionType(2);
	consumerSecretInputDialog.setWantsInput(true);

	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	setTitle("Twitter Desktop Application");
	setBackground(UIManager.getDefaults().getColor(
			"Menu.selectionBackground"));
	setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	setForeground(new Color(0, 204, 204));
	setResizable(false);

	mainPanel.setBackground(new Color(0, 204, 204));
	profilePanel.setBackground(new Color(0, 204, 204));

	updateButton.setFont(new Font("Aharoni", 0, 14));
	updateButton.setText("Update");
	updateButton.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			updateButtonActionPerformed(evt);
		}
	});

	searchTopicsButton.setFont(new Font("Aharoni", 0, 14));
	searchTopicsButton.setText("Search Topics");
	searchTopicsButton.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			searchTopicsButtonActionPerformed(evt);
		}
	});

	searchPeopleButton.setFont(new Font("Aharoni", 0, 14));
	searchPeopleButton.setText("Search People");
	searchPeopleButton.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			searchPeopleButtonActionPerformed(evt);
		}
	});

	switchAccountButton.setFont(new Font("Aharoni", 0, 12));
	switchAccountButton.setText("Switch Account");
	switchAccountButton.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			switchAccountButtonActionPerformed(evt);
		}
	});

	followButton.setFont(new Font("Aharoni", 0, 14));
	followButton.setText("Follow");
	followButton.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			followButtonActionPerformed(evt);
		}
	});

	retweetButton.setFont(new Font("Aharoni", 0, 14));
	retweetButton.setText("Retweet");
	retweetButton.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			retweetButtonActionPerformed(evt);
		}
	});

	searchTopicTextField.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			searchTopicTextFieldActionPerformed(evt);
		}
	});

	searchPeopleTextField.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			searchPeopleTextFieldActionPerformed(evt);
		}
	});

	tweetTable.setModel(engine.getTable());
	tweetTable.getTableHeader().setReorderingAllowed(false);
	jScrollPane2.setViewportView(tweetTable);
	tweetTable.addMouseListener(new java.awt.event.MouseAdapter() {
		public void mouseClicked(java.awt.event.MouseEvent evt) {
			tweetTableMouseClicked(evt);
		}
	});

	searchTopicLabel.setFont(new Font("Aharoni", 0, 18));
	searchTopicLabel.setText("Search for:");

	enterTweetLabel.setFont(new Font("Aharoni", 0, 18));
	enterTweetLabel.setText("Enter your Tweet:");

	searchPeopleLabel.setFont(new Font("Aharoni", 0, 18));
	searchPeopleLabel.setText("Search for:");

	profileLabel.setFont(new Font("Aharoni", 3, 24));
	profileLabel.setForeground(new Color(255, 255, 255));
	profileLabel.setText("PROFILE:");

	nameLabel.setBackground(new Color(255, 255, 255));
	nameLabel.setFont(new Font("Aharoni", 1, 18));
	nameLabel.setForeground(new Color(255, 255, 255));
	nameLabel.setText("Name:");

	usernameLabel.setFont(new Font("Aharoni", 1, 18));
	usernameLabel.setForeground(new Color(255, 255, 255));
	usernameLabel.setText("Username:");

	followingLabel.setFont(new java.awt.Font("Aharoni", 1, 18));
	followingLabel.setForeground(new java.awt.Color(255, 255, 255));
	followingLabel.setText("Following:");

	followersLabel.setFont(new Font("Aharoni", 1, 18));
	followersLabel.setForeground(new Color(255, 255, 255));
	followersLabel.setText("Followers:");

	nameLabelContent.setFont(new Font("Aharoni", 0, 18));
	nameLabelContent.setForeground(new Color(255, 255, 255));
	nameLabelContent.setText(engine.getUserInformation()[0]);

	displayNameLabelContent.setFont(new Font("Aharoni", 0, 18));
	displayNameLabelContent
			.setForeground(new Color(255, 255, 255));
	displayNameLabelContent.setText(engine.getUserInformation()[1]);

	followingLabelContent.setFont(new Font("Aharoni", 0, 18));
	followingLabelContent.setForeground(new Color(255, 255, 255));
	followingLabelContent.setText(engine.getUserInformation()[2]);

	followersLabelContent.setFont(new Font("Aharoni", 0, 18));
	followersLabelContent.setForeground(new Color(255, 255, 255));
	followersLabelContent.setText(engine.getUserInformation()[3]);

	displayTweetText.setColumns(20);
	displayTweetText.setLineWrap(true);
	displayTweetText.setRows(5);

	enterTweetTextArea.setColumns(20);
	enterTweetTextArea.setLineWrap(true);
	enterTweetTextArea.setRows(5);
	tweetTextArea.setViewportView(enterTweetTextArea);

	mainTabPane.setBackground(new Color(0, 204, 204));
	mainTabPane.addTab("Compose a Tweet", createTweetPanel);
	mainTabPane.addTab("Search Topics", searchTopicsPanel);
	mainTabPane.addTab("Search People", searchPeoplePanel);

	fileMenu.setText("File");

	quitMenuItem.setText("Quit");
	quitMenuItem.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			quitMenuItemActionPerformed(evt);
		}
	});

	fileMenu.add(quitMenuItem);
	menubar.add(fileMenu);
	setJMenuBar(menubar);

	twitterPic.setIcon(new ImageIcon(getClass().getResource(
		"/view/twitterimage.jpg")));

	GroupLayout createTweetPanelLayout = new GroupLayout(
		createTweetPanel);
	createTweetPanel.setLayout(createTweetPanelLayout);
	createTweetPanelLayout
		.setHorizontalGroup(createTweetPanelLayout
		.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addGroup(createTweetPanelLayout.createSequentialGroup()
		.addContainerGap().addComponent(tweetTextArea)
		.addContainerGap())
		.addGroup(createTweetPanelLayout.createSequentialGroup()
		.addGap(122, 122, 122)
		.addComponent(updateButton, GroupLayout.PREFERRED_SIZE,
			92, GroupLayout.PREFERRED_SIZE)
		.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		.addGroup(GroupLayout.Alignment.TRAILING,
			createTweetPanelLayout.createSequentialGroup()
		.addContainerGap(99, Short.MAX_VALUE)
		.addComponent(enterTweetLabel).addGap(96, 96, 96)));

	createTweetPanelLayout
		.setVerticalGroup(createTweetPanelLayout
		.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addGroup(createTweetPanelLayout.createSequentialGroup()
		.addContainerGap()
		.addComponent(enterTweetLabel, GroupLayout.PREFERRED_SIZE,
			29, GroupLayout.PREFERRED_SIZE)
		.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
		.addComponent(tweetTextArea, GroupLayout.PREFERRED_SIZE,
			GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
		.addComponent(updateButton, GroupLayout.PREFERRED_SIZE,
			35, GroupLayout.PREFERRED_SIZE)
		.addContainerGap(16, Short.MAX_VALUE)));

	GroupLayout searchTopicsPanelLayout = new GroupLayout(searchTopicsPanel);
	searchTopicsPanel.setLayout(searchTopicsPanelLayout);
	searchTopicsPanelLayout
		.setHorizontalGroup(searchTopicsPanelLayout
		.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addGroup(searchTopicsPanelLayout.createSequentialGroup()
		.addGroup(searchTopicsPanelLayout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addGroup(searchTopicsPanelLayout.createSequentialGroup()
		.addContainerGap()
		.addComponent(searchTopicTextField))
		.addGroup(searchTopicsPanelLayout.createSequentialGroup()
		.addGap(123, 123, 123)
		.addComponent(searchTopicLabel)
		.addGap(0, 0, Short.MAX_VALUE)))
		.addContainerGap())
		.addGroup(searchTopicsPanelLayout.createSequentialGroup()
		.addGap(110, 110, 110)
		.addComponent(searchTopicsButton)
		.addContainerGap(110, Short.MAX_VALUE)));

	searchTopicsPanelLayout
		.setVerticalGroup(searchTopicsPanelLayout
		.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addGroup(searchTopicsPanelLayout.createSequentialGroup()
		.addGap(30, 30, 30)
		.addComponent(searchTopicLabel)
		.addGap(18, 18, 18)
		.addComponent(searchTopicTextField, GroupLayout.PREFERRED_SIZE,
			GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		.addGap(18, 18, 18)
		.addComponent(searchTopicsButton)
		.addContainerGap(76, Short.MAX_VALUE)));

	GroupLayout searchPeoplePanelLayout = new GroupLayout(searchPeoplePanel);
	searchPeoplePanel.setLayout(searchPeoplePanelLayout);
	searchPeoplePanelLayout
		.setHorizontalGroup(searchPeoplePanelLayout
		.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addGroup(searchPeoplePanelLayout.createSequentialGroup()
		.addGroup(searchPeoplePanelLayout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addGroup(searchPeoplePanelLayout.createSequentialGroup()
		.addContainerGap()
		.addComponent(searchPeopleTextField))
		.addGroup(searchPeoplePanelLayout.createSequentialGroup()
		.addGap(124, 124, 124)
		.addComponent(searchPeopleLabel)
		.addGap(0, 0, Short.MAX_VALUE)))
		.addContainerGap())
		.addGroup(GroupLayout.Alignment.TRAILING,
			searchPeoplePanelLayout.createSequentialGroup()
		.addGap(0, 109, Short.MAX_VALUE)
		.addComponent(searchPeopleButton)
		.addGap(107, 107, 107)));

	searchPeoplePanelLayout
		.setVerticalGroup(searchPeoplePanelLayout
		.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addGroup(searchPeoplePanelLayout.createSequentialGroup()
		.addGap(31, 31, 31)
		.addComponent(searchPeopleLabel)
		.addGap(18, 18, 18)
		.addComponent(searchPeopleTextField, GroupLayout.PREFERRED_SIZE,
			GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		.addGap(18, 18, 18)
		.addComponent(searchPeopleButton)
		.addContainerGap(75, Short.MAX_VALUE)));

	GroupLayout profilePanelLayout = new GroupLayout(profilePanel);
	profilePanel.setLayout(profilePanelLayout);
	profilePanelLayout
		.setHorizontalGroup(profilePanelLayout
		.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addGroup(profilePanelLayout.createSequentialGroup()
		.addGroup(profilePanelLayout
			.createParallelGroup(GroupLayout.Alignment.TRAILING)
		.addGroup(GroupLayout.Alignment.LEADING,
			profilePanelLayout.createSequentialGroup()
		.addComponent(nameLabel)
		.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
		.addComponent(nameLabelContent))
		.addGroup(GroupLayout.Alignment.LEADING,
			profilePanelLayout.createSequentialGroup()
		.addComponent(usernameLabel)
		.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
		.addComponent(displayNameLabelContent))
		.addGroup(GroupLayout.Alignment.LEADING,
			profilePanelLayout.createSequentialGroup()
		.addComponent(followingLabel)
		.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
		.addComponent(followingLabelContent))
		.addGroup(GroupLayout.Alignment.LEADING,
			profilePanelLayout.createSequentialGroup()
		.addComponent(followersLabel)
		.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
		.addComponent(followersLabelContent))
		.addComponent(profileLabel, GroupLayout.Alignment.LEADING))
		.addGap(0, 8, Short.MAX_VALUE)));

	profilePanelLayout
		.setVerticalGroup(profilePanelLayout
		.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addGroup(profilePanelLayout.createSequentialGroup()
		.addComponent(profileLabel)
		.addGap(1, 1, 1)
		.addGroup(profilePanelLayout
			.createParallelGroup(GroupLayout.Alignment.BASELINE)
		.addComponent(nameLabel)
		.addComponent(nameLabelContent))
		.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
		.addGroup(profilePanelLayout
			.createParallelGroup(GroupLayout.Alignment.BASELINE)
		.addComponent(usernameLabel)
		.addComponent(displayNameLabelContent))
		.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
		.addGroup(profilePanelLayout
			.createParallelGroup(GroupLayout.Alignment.BASELINE)
		.addComponent(followingLabel)
		.addComponent(followingLabelContent))
		.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
		.addGroup(profilePanelLayout
			.createParallelGroup(GroupLayout.Alignment.BASELINE)
		.addComponent(followersLabel)
		.addComponent(followersLabelContent))
		.addGap(0, 18, Short.MAX_VALUE)));

	GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
	mainPanel.setLayout(mainPanelLayout);
	mainPanelLayout
		.setHorizontalGroup(mainPanelLayout
		.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addGroup(mainPanelLayout.createSequentialGroup()
		.addContainerGap()
		.addGroup(mainPanelLayout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addGroup(mainPanelLayout.createSequentialGroup()
		.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE,
			656, GroupLayout.PREFERRED_SIZE)
		.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		.addGroup(mainPanelLayout.createSequentialGroup()
		.addGroup(mainPanelLayout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addComponent(mainTabPane, GroupLayout.PREFERRED_SIZE,
			348, GroupLayout.PREFERRED_SIZE)
		.addGroup(mainPanelLayout.createSequentialGroup()
		.addGap(0, 2, Short.MAX_VALUE)
		.addComponent(displayTweetText, GroupLayout.PREFERRED_SIZE,
			232, GroupLayout.PREFERRED_SIZE)
		.addGap(18, 18, 18)
		.addGroup(mainPanelLayout.createParallelGroup(
			GroupLayout.Alignment.LEADING, false)
		.addComponent(retweetButton, GroupLayout.DEFAULT_SIZE,
			98, Short.MAX_VALUE)
		.addComponent(followButton, GroupLayout.DEFAULT_SIZE,
			GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
		.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
		.addGroup(mainPanelLayout
			.createParallelGroup(GroupLayout.Alignment.TRAILING)
		.addGroup(mainPanelLayout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addComponent(twitterPic)
		.addComponent(profilePanel, GroupLayout.PREFERRED_SIZE,
			GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		.addComponent(switchAccountButton))
		.addContainerGap(13, Short.MAX_VALUE)))));

	mainPanelLayout
		.setVerticalGroup(mainPanelLayout
		.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addGroup(mainPanelLayout.createSequentialGroup()
		.addContainerGap(22, Short.MAX_VALUE)
		.addGroup(mainPanelLayout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addGroup(GroupLayout.Alignment.TRAILING,
			mainPanelLayout.createSequentialGroup()
		.addComponent(mainTabPane, GroupLayout.PREFERRED_SIZE,
			232, GroupLayout.PREFERRED_SIZE)
		.addGroup(mainPanelLayout
			.createParallelGroup(GroupLayout.Alignment.LEADING, false)
		.addGroup(mainPanelLayout.createSequentialGroup()
		.addGap(18, 18, 18)
		.addComponent(followButton)
		.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
			GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		.addComponent(retweetButton)
		.addGap(11, 11, 11))
		.addGroup(mainPanelLayout.createSequentialGroup()
		.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
		.addComponent(displayTweetText, GroupLayout.PREFERRED_SIZE,
			99, GroupLayout.PREFERRED_SIZE))))
		.addGroup(mainPanelLayout.createSequentialGroup()
		.addComponent(switchAccountButton, GroupLayout.PREFERRED_SIZE,
			34, GroupLayout.PREFERRED_SIZE)
		.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
		.addComponent(twitterPic, GroupLayout.PREFERRED_SIZE, 102,
			GroupLayout.PREFERRED_SIZE)
		.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
		.addComponent(profilePanel, GroupLayout.PREFERRED_SIZE,
			GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		.addGap(7, 7, 7)
		.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE,
			222, GroupLayout.PREFERRED_SIZE)
		.addContainerGap()));

	GroupLayout layout = new GroupLayout(getContentPane());
	getContentPane().setLayout(layout);
	layout
		.setHorizontalGroup(layout
		.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addComponent(mainPanel, GroupLayout.PREFERRED_SIZE,
			GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE));

	layout
		.setVerticalGroup(layout
		.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addGroup(GroupLayout.Alignment.TRAILING,
			layout.createSequentialGroup()
		.addGap(0, 0, Short.MAX_VALUE)
		.addComponent(mainPanel, GroupLayout.PREFERRED_SIZE,
			GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));

	pack();
	}

private static final Logger LOG = Logger.getLogger(Twitter4JGUI.class.getName());

/**
 * The method asks the user for the four elements of the authorization
 * information when the switchAccount button is pressed. It then calls
 * the switchAccount method in the TwitterEngine class and updates the
 * current user information in the profilePanel.
 *
 * @param evt the event
 */
private void switchAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {
	String consumerKey = JOptionPane
		.showInputDialog("Please enter your consumer key:");
	String consumerSecret = JOptionPane
		.showInputDialog("Please enter your consumer secret:");
	String accessToken = JOptionPane
		.showInputDialog("Please enter your access token:");
	String accessTokenSecret = JOptionPane
		.showInputDialog("Please enter your access token secret:");
	engine.switchAccount(consumerKey, consumerSecret, accessToken,
		accessTokenSecret);
	updateUserInformation();
}

/**
 * This method calls the searchPeople method from the TwitterEngine class
 * when text is entered into the searchPeopleTextField and the user presses
 * "Enter".
 *
 * @param evt the event
 */
private void searchPeopleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
	engine.searchPeople(searchPeopleTextField.getText());
}

/**
 * This method calls the updateStatus method from the TwitterEngine class
 * when the updateButton button is pressed.
 *
 * @param evt the event
 */
private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {
	engine.updateStatus(enterTweetTextArea.getText());
}

/**
 * This method calls the searchTweets method from the TwitterEngine class
 * when text is entered into the searchTopicTextField and the user presses
 * "Enter".
 *
 * @param evt the event
 */
private void searchTopicTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
	engine.searchTweets(searchTopicTextField.getText());
}

/**
 * This method calls the searchTweets method from the TwitterEngine class
 * when the searchTopicButton button is pressed.
 *
 * @param evt the event
 */
private void searchTopicsButtonActionPerformed(java.awt.event.ActionEvent evt) {
	engine.searchTweets(searchTopicTextField.getText());
}

/**
 * This method calls the searchPeople method from the TwitterEngine class
 * when the searchPeopleButton button is pressed.
 *
 * @param evt the event
 */
private void searchPeopleButtonActionPerformed(java.awt.event.ActionEvent evt) {
	engine.searchPeople(searchPeopleTextField.getText());
}

/**
 * This method gets the main text of the Tweet selected in the tweetTable.
 *
 * @param evt the event
 */
private void tweetTableMouseClicked(java.awt.event.MouseEvent evt) {
	int index = tweetTable.getSelectedRow();
	if (index != -1) {
		Tweet t = engine.getTable().get(index);
		displayTweetText.setText(t.getText());
	}
}

/**
 * This method quits the application when the menu item is selected.
 *
 * @param evt the event
 */
private void quitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
	System.exit(0);
}

/**
 * This method makes sure a valid Tweet is selected in the table. Then it
 * gets ID of the Tweet and calls the retweet method from the TwitterEngine
 * class.
 *
 * @param evt the event
 */
private void retweetButtonActionPerformed(java.awt.event.ActionEvent evt) {
	try {
		int index = tweetTable.getSelectedRow();
		if (index != -1) {
			long sid = engine.getTable().get(index).getId();
			engine.retweet(sid);
		}
	} catch (Exception ex) {
		JOptionPane.showMessageDialog(null, ex.getMessage());
	}
}

/**
 * This method checks to make sure a valid Tweet is selected in the table.
 * Then it gets the ID of the Tweet and calls the follow method in the
 * TwitterEngine class.
 *
 * @param evt the event
 */
private void followButtonActionPerformed(java.awt.event.ActionEvent evt) {
	int index = tweetTable.getSelectedRow();
	if (index != -1) {
		long id = engine.getTable().get(index).getId();
		engine.followUser(id);
	}
}

/**
 * Updates the user information in the profilePanel.
 */
private void updateUserInformation() {
	engine = new TwitterEngine();
	nameLabelContent.setText(engine.getUserInformation()[0]);
	displayNameLabelContent.setText(engine.getUserInformation()[1]);
	followingLabelContent.setText(engine.getUserInformation()[2]);
	followersLabelContent.setText(engine.getUserInformation()[3]);
	repaint();
}

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
	try {
		for (UIManager.LookAndFeelInfo info : UIManager
				.getInstalledLookAndFeels()) {
			if ("Nimbus".equals(info.getName())) {
				UIManager.setLookAndFeel(info.getClassName());
				break;
			}
		}
	} catch (ClassNotFoundException ex) {
		java.util.logging.Logger.getLogger(Twitter4JGUI.class.getName())
			.log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
		java.util.logging.Logger.getLogger(Twitter4JGUI.class.getName())
			.log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
		java.util.logging.Logger.getLogger(Twitter4JGUI.class.getName())
			.log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
		java.util.logging.Logger.getLogger(Twitter4JGUI.class.getName())
			.log(java.util.logging.Level.SEVERE, null, ex);
	}

java.awt.EventQueue.invokeLater(new Runnable() {
	public void run() {
		try {
			new Twitter4JGUI().setVisible(true);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
				"An error has occurred.");
			}
		}
	});
}

private javax.swing.JOptionPane consumerSecretInputDialog;
private javax.swing.JPanel createTweetPanel;
private javax.swing.JLabel displayNameLabelContent;
private javax.swing.JTextArea displayTweetText;
private javax.swing.JLabel enterTweetLabel;
private javax.swing.JTextArea enterTweetTextArea;
private javax.swing.JMenu fileMenu;
private javax.swing.JButton followButton;
private javax.swing.JLabel followersLabel;
private javax.swing.JLabel followersLabelContent;
private javax.swing.JLabel followingLabel;
private javax.swing.JLabel followingLabelContent;
private javax.swing.JScrollPane jScrollPane2;
private javax.swing.JPanel mainPanel;
private javax.swing.JTabbedPane mainTabPane;
private javax.swing.JMenuBar menubar;
private javax.swing.JLabel nameLabel;
private javax.swing.JLabel nameLabelContent;
private javax.swing.JLabel profileLabel;
private javax.swing.JPanel profilePanel;
private javax.swing.JMenuItem quitMenuItem;
private javax.swing.JButton retweetButton;
private javax.swing.JButton searchPeopleButton;
private javax.swing.JLabel searchPeopleLabel;
private javax.swing.JPanel searchPeoplePanel;
private javax.swing.JTextField searchPeopleTextField;
private javax.swing.JLabel searchTopicLabel;
private javax.swing.JTextField searchTopicTextField;
private javax.swing.JButton searchTopicsButton;
private javax.swing.JPanel searchTopicsPanel;
private javax.swing.JButton switchAccountButton;
private javax.swing.JTable tweetTable;
private javax.swing.JScrollPane tweetTextArea;
private javax.swing.JLabel twitterPic;
private javax.swing.JButton updateButton;
private javax.swing.JLabel usernameLabel;
private TwitterEngine engine;
}
