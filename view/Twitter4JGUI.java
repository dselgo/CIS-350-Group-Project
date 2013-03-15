package view;

import java.util.logging.Logger;
import javax.swing.*;
import controller.*;
import model.*;



/**
 * This class creates the user interface and handles all user interactions.
 * 
 * @author Morgan Heyboer
 * @version 2.0
 */
public class Twitter4JGUI extends javax.swing.JFrame {

    /** Creates new Twitter4JGUI. */
    public Twitter4JGUI() {
        engine = new TwitterEngine();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize
     * the entire user interface.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        switchAccountDialog = new javax.swing.JDialog();
        switchAccountPanel = new javax.swing.JPanel();
        switchAccountPromptLabel = new javax.swing.JLabel();
        consumerKeyLabel = new javax.swing.JLabel();
        consumerSecretLabel = new javax.swing.JLabel();
        accessTokenLabel = new javax.swing.JLabel();
        accessTokenSecretLabel = new javax.swing.JLabel();
        consumerKeyTextField = new javax.swing.JTextField();
        consumerSecretTextField = new javax.swing.JTextField();
        accessTokenTextField = new javax.swing.JTextField();
        accessTokenSecretTextField = new javax.swing.JTextField();
        switchAccountDialogButton = new javax.swing.JButton();
        helpFrame = new javax.swing.JFrame();
        closePanel = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        helpScrollPane = new javax.swing.JScrollPane();
        mainHelpPanel = new javax.swing.JPanel();
        timelineLine1 = new javax.swing.JLabel();
        timelineLine2 = new javax.swing.JLabel();
        timelineLine3 = new javax.swing.JLabel();
        timelineLine4 = new javax.swing.JLabel();
        timelineLine5 = new javax.swing.JLabel();
        timelineLine6 = new javax.swing.JLabel();
        timelineHeading = new javax.swing.JLabel();
        searchUserHeading = new javax.swing.JLabel();
        searchUserLine1 = new javax.swing.JLabel();
        searchUserLine2 = new javax.swing.JLabel();
        searchUserLine3 = new javax.swing.JLabel();
        searchUserLine4 = new javax.swing.JLabel();
        searchUserLine5 = new javax.swing.JLabel();
        searchUserLine6 = new javax.swing.JLabel();
        searchTopicHeading = new javax.swing.JLabel();
        searchTopicLine1 = new javax.swing.JLabel();
        searchTopicLine2 = new javax.swing.JLabel();
        searchTopicLine3 = new javax.swing.JLabel();
        searchTopicLine4 = new javax.swing.JLabel();
        searchTopicLine8 = new javax.swing.JLabel();
        searchTopicLine9 = new javax.swing.JLabel();
        retweetHeading = new javax.swing.JLabel();
        retweetLine1 = new javax.swing.JLabel();
        retweetLine2 = new javax.swing.JLabel();
        retweetLine3 = new javax.swing.JLabel();
        retweetLine4 = new javax.swing.JLabel();
        retweetLine5 = new javax.swing.JLabel();
        retweetLine6 = new javax.swing.JLabel();
        followHeading = new javax.swing.JLabel();
        followLine1 = new javax.swing.JLabel();
        followLine2 = new javax.swing.JLabel();
        followLine3 = new javax.swing.JLabel();
        followLine4 = new javax.swing.JLabel();
        followLine5 = new javax.swing.JLabel();
        followLine6 = new javax.swing.JLabel();
        followLine7 = new javax.swing.JLabel();
        followLine8 = new javax.swing.JLabel();
        followLine9 = new javax.swing.JLabel();
        followLine10 = new javax.swing.JLabel();
        followLine11 = new javax.swing.JLabel();
        searchTopicLine5 = new javax.swing.JLabel();
        searchTopicLine6 = new javax.swing.JLabel();
        searchTopicLine7 = new javax.swing.JLabel();
        createTweetHeading = new javax.swing.JLabel();
        createTweetLine1 = new javax.swing.JLabel();
        createTweetLine2 = new javax.swing.JLabel();
        createTweetLine3 = new javax.swing.JLabel();
        createTweetLine4 = new javax.swing.JLabel();
        createTweetLine5 = new javax.swing.JLabel();
        retweetLine7 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        mainTabPane = new javax.swing.JTabbedPane();
        createTweetPanel = new javax.swing.JPanel();
        enterTweetLabel = new javax.swing.JLabel();
        tweetTextArea = new javax.swing.JScrollPane();
        enterTweetTextArea = new javax.swing.JTextArea();
        updateButton = new javax.swing.JButton();
        searchTopicsPanel = new javax.swing.JPanel();
        searchTopicLabel = new javax.swing.JLabel();
        searchTopicTextField = new javax.swing.JTextField();
        searchTopicsButton = new javax.swing.JButton();
        searchPeoplePanel = new javax.swing.JPanel();
        searchPeopleLabel = new javax.swing.JLabel();
        searchPeopleTextField = new javax.swing.JTextField();
        searchPeopleButton = new javax.swing.JButton();
        profilePanel = new javax.swing.JPanel();
        profileLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        followingLabel = new javax.swing.JLabel();
        followersLabel = new javax.swing.JLabel();
        nameLabelContent = new javax.swing.JLabel();
        displayNameLabelContent = new javax.swing.JLabel();
        followingLabelContent = new javax.swing.JLabel();
        followersLabelContent = new javax.swing.JLabel();
        tweetLabel = new javax.swing.JLabel();
        tweetContentLabel = new javax.swing.JLabel();
        timelineButton = new javax.swing.JButton();
        twitterPic = new javax.swing.JLabel();
        switchAccountButton = new javax.swing.JButton();
        tweetTableScrollPane = new javax.swing.JScrollPane();
        tweetTable = new JTable(engine.getTable());
        displayTweetText = new javax.swing.JTextArea();
        followButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        retweetButton = new javax.swing.JButton();
        trendsFollowersPanel = new javax.swing.JPanel();
        trendLabel = new javax.swing.JLabel();
        followerLabel = new javax.swing.JLabel();
        trendsListScrollPane = new javax.swing.JScrollPane();
        trendsList = new JList(engine.generateTrendingTopics());
        followersListScrollPane = new javax.swing.JScrollPane();
        followersList = new JList(engine.generateSuggestedUsers());
        menubar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        refreshMenuItem = new javax.swing.JMenuItem();
        quitMenuItem = new javax.swing.JMenuItem();
        helpMenuBar = new javax.swing.JMenu();
        getHelpMenuItem = new javax.swing.JMenuItem();

        switchAccountDialog.setTitle("Switch Account");
        switchAccountDialog.setMinimumSize(new java.awt.Dimension(400, 275));
        switchAccountDialog.setResizable(false);

        switchAccountPromptLabel.setText("Please enter the following "
        		+ "information to switch accounts:");

        consumerKeyLabel.setText("Consumer Key:");

        consumerSecretLabel.setText("Consumer Secret:");

        accessTokenLabel.setText("Access Token:");

        accessTokenSecretLabel.setText("Access Token Secret:");

        switchAccountDialogButton.setText("OK");
        switchAccountDialogButton.addActionListener(new java.awt.event.
        		ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                switchAccountDialogButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout switchAccountPanelLayout = 
        		new javax.swing.GroupLayout(switchAccountPanel);
        switchAccountPanel.setLayout(switchAccountPanelLayout);
        switchAccountPanelLayout.setHorizontalGroup(
            switchAccountPanelLayout.createParallelGroup(javax.swing.
            		GroupLayout.Alignment.LEADING)
            .addGroup(switchAccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(switchAccountPanelLayout.createParallelGroup(javax.
                		swing.GroupLayout.Alignment.LEADING)
                    .addGroup(switchAccountPanelLayout.createSequentialGroup()
                        .addComponent(switchAccountPromptLabel)
                        .addGap(0, 84, Short.MAX_VALUE))
                    .addGroup(switchAccountPanelLayout.createSequentialGroup()
                        .addGroup(switchAccountPanelLayout.createParallelGroup(
                        		javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accessTokenSecretLabel)
                            .addComponent(accessTokenLabel, javax.swing.
                            		GroupLayout.Alignment.TRAILING)
                            .addComponent(consumerSecretLabel, javax.swing.
                            		GroupLayout.Alignment.TRAILING)
                            .addComponent(consumerKeyLabel, javax.swing.
                            		GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.
                        		ComponentPlacement.RELATED)
                        .addGroup(switchAccountPanelLayout.createParallelGroup(
                        		javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consumerKeyTextField)
                            .addComponent(consumerSecretTextField)
                            .addComponent(accessTokenTextField)
                            .addComponent(accessTokenSecretTextField))))
                .addContainerGap())
            .addGroup(switchAccountPanelLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(switchAccountDialogButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE))
        );
        switchAccountPanelLayout.setVerticalGroup(
            switchAccountPanelLayout.createParallelGroup(javax.swing.
            		GroupLayout.Alignment.LEADING)
            .addGroup(switchAccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(switchAccountPromptLabel)
                .addGap(18, 18, 18)
                .addGroup(switchAccountPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consumerKeyLabel)
                    .addComponent(consumerKeyTextField, javax.swing.
                    		GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addGroup(switchAccountPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consumerSecretLabel)
                    .addComponent(consumerSecretTextField, javax.swing.
                    		GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addGroup(switchAccountPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accessTokenLabel)
                    .addComponent(accessTokenTextField, javax.swing.GroupLayout.
                    		DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addGroup(switchAccountPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accessTokenSecretLabel)
                    .addComponent(accessTokenSecretTextField, javax.swing.
                    		GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(switchAccountDialogButton))
        );

        javax.swing.GroupLayout switchAccountDialogLayout = new javax.swing.
        		GroupLayout(switchAccountDialog.getContentPane());
        switchAccountDialog.getContentPane().setLayout(
        		switchAccountDialogLayout);
        switchAccountDialogLayout.setHorizontalGroup(
            switchAccountDialogLayout.createParallelGroup(javax.swing.
            		GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
            		switchAccountDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(switchAccountPanel, javax.swing.
                		GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.
                		DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        switchAccountDialogLayout.setVerticalGroup(
            switchAccountDialogLayout.createParallelGroup(javax.swing.
            		GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
            		switchAccountDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(switchAccountPanel, javax.swing.
                		GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.
                		DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        helpFrame.setDefaultCloseOperation(javax.swing.WindowConstants.
        		EXIT_ON_CLOSE);
        helpFrame.setTitle("Help");
        helpFrame.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        helpFrame.setMinimumSize(new java.awt.Dimension(382, 565));
        helpFrame.setPreferredSize(new java.awt.Dimension(382, 554));
        helpFrame.setResizable(false);

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout closePanelLayout = new javax.swing.
        		GroupLayout(closePanel);
        closePanel.setLayout(closePanelLayout);
        closePanelLayout.setHorizontalGroup(
            closePanelLayout.createParallelGroup(javax.swing.
            		GroupLayout.Alignment.LEADING)
            .addGroup(closePanelLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(closeButton)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        closePanelLayout.setVerticalGroup(
            closePanelLayout.createParallelGroup(javax.swing.
            		GroupLayout.Alignment.LEADING)
            .addComponent(closeButton, javax.swing.GroupLayout.
            		Alignment.TRAILING)
        );

        mainHelpPanel.setBackground(new java.awt.Color(0, 240, 240));

        timelineLine1.setFont(new java.awt.Font("Aharoni", 0, 14));
        timelineLine1.setText("Click the \"Show My Timeline\" button located"
        		+ " in");

        timelineLine2.setFont(new java.awt.Font("Aharoni", 0, 14));
        timelineLine2.setText("the middle of the screen. This will display");

        timelineLine3.setFont(new java.awt.Font("Aharoni", 0, 14));
        timelineLine3.setText("your timeline in the table at the bottom of "
        		+ "the");

        timelineLine4.setFont(new java.awt.Font("Aharoni", 0, 14));
        timelineLine4.setText("window. From the table, you can click on any");

        timelineLine5.setFont(new java.awt.Font("Aharoni", 0, 14));
        timelineLine5.setText("row and the content of your tweet will appear");

        timelineLine6.setFont(new java.awt.Font("Aharoni", 0, 14));
        timelineLine6.setText("in the white area above the table");

        timelineHeading.setFont(new java.awt.Font("Aharoni", 1, 24));
        timelineHeading.setForeground(new java.awt.Color(255, 255, 255));
        timelineHeading.setText("How to View Your Timeline");

        searchUserHeading.setFont(new java.awt.Font("Aharoni", 1, 
        		24));
        searchUserHeading.setForeground(new java.awt.Color(255, 255, 255));
        searchUserHeading.setText("How to Search For Users");

        searchUserLine1.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchUserLine1.setText("First, click on the \"Search People\" tab "
        		+ "located");

        searchUserLine2.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchUserLine2.setText("near the top of the window. In the white "
        		+ "space,");

        searchUserLine3.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchUserLine3.setText("type the name of the person you would like "
        		+ "to");

        searchUserLine4.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchUserLine4.setText("search and hit <Enter> or click the button");

        searchUserLine5.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchUserLine5.setText("\"Search People\". A list of users will be "
        		+ "displayed");

        searchUserLine6.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchUserLine6.setText("in the table at the bottom. ");

        searchTopicHeading.setFont(new java.awt.Font("Aharoni", 1, 24));
        searchTopicHeading.setForeground(new java.awt.Color(255, 255, 255));
        searchTopicHeading.setText("How to Search For Topics");

        searchTopicLine1.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchTopicLine1.setText("First, click on the \"Search Topics\" tab "
        		+ "located");

        searchTopicLine2.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchTopicLine2.setText("near the top of the window. In the white "
        		+ "space,");

        searchTopicLine3.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchTopicLine3.setText("type the topic you would like to search "
        		+ "and ");

        searchTopicLine4.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchTopicLine4.setText("hit <Enter> or click the button \"Search "
        		+ "Topics\".");

        searchTopicLine8.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchTopicLine8.setText("topic will be displayed in the table at the");

        searchTopicLine9.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchTopicLine9.setText("bottom.");

        retweetHeading.setFont(new java.awt.Font("Aharoni", 1, 24));
        retweetHeading.setForeground(new java.awt.Color(255, 255, 255));
        retweetHeading.setText("How to Retweet");

        retweetLine1.setFont(new java.awt.Font("Aharoni", 0, 14));
        retweetLine1.setText("First, search for a topic or user to get a "
        		+ "list of");

        retweetLine2.setFont(new java.awt.Font("Aharoni", 0, 14));
        retweetLine2.setText("Tweets displayed in the table at the bottom of");

        retweetLine3.setFont(new java.awt.Font("Aharoni", 0, 14));
        retweetLine3.setText("the window. Click on the Login Name of the ");

        retweetLine4.setFont(new java.awt.Font("Aharoni", 0, 14));
        retweetLine4.setText("Tweet to highlight it, then click the "
        		+ "\"Retweet\"");

        retweetLine5.setFont(new java.awt.Font("Aharoni", 0, 14));
        retweetLine5.setText("button located above the table. The Tweet that");

        retweetLine6.setFont(new java.awt.Font("Aharoni", 0, 14));
        retweetLine6.setText("you retweeted will now be displayed in the");

        followHeading.setFont(new java.awt.Font("Aharoni", 1, 24));
        followHeading.setForeground(new java.awt.Color(255, 255, 255));
        followHeading.setText("How to Follow Users");

        followLine1.setFont(new java.awt.Font("Aharoni", 0, 14));
        followLine1.setText("First, search for a topic or user to get a list "
        		+ "of");

        followLine2.setFont(new java.awt.Font("Aharoni", 0, 14));
        followLine2.setText("Tweets displayed in the table at the bottom of");

        followLine3.setFont(new java.awt.Font("Aharoni", 0, 14));
        followLine3.setText("the window. Click on the Login Name of the a");

        followLine4.setFont(new java.awt.Font("Aharoni", 0, 14));
        followLine4.setText("Tweet to highlight it, then click the \"Follow\"");

        followLine5.setFont(new java.awt.Font("Aharoni", 0, 14));
        followLine5.setText("button located above the table. You can also");

        followLine6.setFont(new java.awt.Font("Aharoni", 0, 14));
        followLine6.setText("click on the name of a user from the Suggested");

        followLine7.setFont(new java.awt.Font("Aharoni", 0, 14));
        followLine7.setText("Users list located in the bottom right corner "
        		+ "of the");

        followLine8.setFont(new java.awt.Font("Aharoni", 0, 14));
        followLine8.setText("window. It will display that user's timeline. "
        		+ "You");

        followLine9.setFont(new java.awt.Font("Aharoni", 0, 14));
        followLine9.setText("can then click on any Tweet and click the "
        		+ "\"Follow\" ");

        followLine10.setFont(new java.awt.Font("Aharoni", 0, 14));
        followLine10.setText("button. A window will appear confirming that ");

        followLine11.setFont(new java.awt.Font("Aharoni", 0, 14));
        followLine11.setText("you have followed a user.");

        searchTopicLine5.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchTopicLine5.setText("You can also click on one of the Trending "
        		+ "Topics");

        searchTopicLine6.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchTopicLine6.setText("from the list located in the upper right "
        		+ "corner");

        searchTopicLine7.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchTopicLine7.setText("of the window. A list of Tweets related "
        		+ "to that");

        createTweetHeading.setFont(new java.awt.Font("Aharoni", 1, 24));
        createTweetHeading.setForeground(new java.awt.Color(255, 255, 255));
        createTweetHeading.setText("How to Create a Tweet");

        createTweetLine1.setFont(new java.awt.Font("Aharoni", 0, 14));
        createTweetLine1.setText("Click the \"Compose a Tweet\" tab at the top "
        		+ "of the");

        createTweetLine2.setFont(new java.awt.Font("Aharoni", 0, 14));
        createTweetLine2.setText("window. Type what you want your Tweet to "
        		+ "say");

        createTweetLine3.setFont(new java.awt.Font("Aharoni", 0, 14));
        createTweetLine3.setText("in the white space and then hit <Enter> or "
        		+ "click");

        createTweetLine4.setFont(new java.awt.Font("Aharoni", 0, 14));
        createTweetLine4.setText("the \"Update\" button. You window will "
        		+ "appear");

        createTweetLine5.setFont(new java.awt.Font("Aharoni", 0, 14));
        createTweetLine5.setText("confirming that you created a new Tweet.");

        retweetLine7.setFont(new java.awt.Font("Aharoni", 0, 14));
        retweetLine7.setText("table.");

        javax.swing.GroupLayout mainHelpPanelLayout = new javax.swing.
        		GroupLayout(mainHelpPanel);
        mainHelpPanel.setLayout(mainHelpPanelLayout);
        mainHelpPanelLayout.setHorizontalGroup(
            mainHelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.
            		Alignment.LEADING)
            .addGroup(mainHelpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainHelpPanelLayout.createParallelGroup(javax.
                		swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timelineLine1)
                    .addComponent(timelineLine2)
                    .addComponent(timelineLine3)
                    .addComponent(timelineLine4)
                    .addComponent(timelineLine5)
                    .addComponent(timelineLine6)
                    .addComponent(timelineHeading)
                    .addComponent(searchUserHeading)
                    .addComponent(searchUserLine1)
                    .addComponent(searchUserLine2)
                    .addComponent(searchUserLine3)
                    .addComponent(searchUserLine4)
                    .addComponent(searchUserLine5)
                    .addComponent(searchUserLine6)
                    .addComponent(searchTopicHeading)
                    .addComponent(searchTopicLine1)
                    .addComponent(searchTopicLine2)
                    .addComponent(searchTopicLine3)
                    .addComponent(searchTopicLine4)
                    .addComponent(searchTopicLine8)
                    .addComponent(searchTopicLine9)
                    .addComponent(searchTopicLine5)
                    .addComponent(searchTopicLine6)
                    .addComponent(searchTopicLine7)
                    .addComponent(retweetHeading)
                    .addComponent(retweetLine1)
                    .addComponent(retweetLine2)
                    .addComponent(retweetLine3)
                    .addComponent(retweetLine4)
                    .addComponent(retweetLine5)
                    .addComponent(retweetLine6)
                    .addComponent(followHeading)
                    .addComponent(followLine1)
                    .addComponent(followLine2)
                    .addComponent(followLine3)
                    .addComponent(followLine4)
                    .addComponent(followLine5)
                    .addComponent(followLine6)
                    .addComponent(followLine7)
                    .addComponent(followLine8)
                    .addComponent(followLine9)
                    .addComponent(followLine10)
                    .addComponent(followLine11)
                    .addComponent(createTweetHeading)
                    .addComponent(createTweetLine3)
                    .addComponent(createTweetLine4)
                    .addComponent(createTweetLine5)
                    .addComponent(createTweetLine1)
                    .addComponent(createTweetLine2)
                    .addComponent(retweetLine7))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        mainHelpPanelLayout.setVerticalGroup(
            mainHelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.
            		Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
            		mainHelpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createTweetHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(createTweetLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(createTweetLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(createTweetLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(createTweetLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(createTweetLine5)
                .addGap(18, 18, 18)
                .addComponent(timelineHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(timelineLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(timelineLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(timelineLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(timelineLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(timelineLine5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(timelineLine6)
                .addGap(18, 18, 18)
                .addComponent(searchUserHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchUserLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchUserLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchUserLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchUserLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchUserLine5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchUserLine6)
                .addGap(18, 18, 18)
                .addComponent(searchTopicHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchTopicLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchTopicLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchTopicLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchTopicLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchTopicLine5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchTopicLine6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchTopicLine7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchTopicLine8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchTopicLine9)
                .addGap(18, 18, 18)
                .addComponent(retweetHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(retweetLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(retweetLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(retweetLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(retweetLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(retweetLine5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(retweetLine6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(retweetLine7)
                .addGap(18, 18, 18)
                .addComponent(followHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(followLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(followLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(followLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(followLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(followLine5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(followLine6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(followLine7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(followLine8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(followLine9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(followLine10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement
                		.RELATED)
                .addComponent(followLine11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE))
        );

        helpScrollPane.setViewportView(mainHelpPanel);

        javax.swing.GroupLayout helpFrameLayout = new javax.swing.GroupLayout(
        		helpFrame.getContentPane());
        helpFrame.getContentPane().setLayout(helpFrameLayout);
        helpFrameLayout.setHorizontalGroup(
            helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.
            		Alignment.LEADING)
            .addComponent(closePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 
            		javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(helpFrameLayout.createParallelGroup(javax.swing.
            		GroupLayout.Alignment.LEADING)
                .addComponent(helpScrollPane, javax.swing.GroupLayout.
                		DEFAULT_SIZE, 378, Short.MAX_VALUE))
        );
        helpFrameLayout.setVerticalGroup(
            helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.
            		Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
            		helpFrameLayout.createSequentialGroup()
                .addGap(0, 531, Short.MAX_VALUE)
                .addComponent(closePanel, javax.swing.GroupLayout.
                		PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 
                		javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(helpFrameLayout.createParallelGroup(javax.swing.
            		GroupLayout.Alignment.LEADING)
                .addGroup(helpFrameLayout.createSequentialGroup()
                    .addComponent(helpScrollPane, javax.swing.
                    		GroupLayout.PREFERRED_SIZE, 519, javax.swing.
                    		GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 35, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Twitter Desktop Application");
        setBackground(javax.swing.UIManager.getDefaults().getColor(
        		"Menu.selectionBackground"));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 204, 204));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(0, 204, 204));

        mainTabPane.setBackground(new java.awt.Color(0, 204, 204));

        enterTweetLabel.setFont(new java.awt.Font("Aharoni", 0, 18));
        enterTweetLabel.setText("Enter your Tweet:");

        enterTweetTextArea.setColumns(20);
        enterTweetTextArea.setLineWrap(true);
        enterTweetTextArea.setRows(5);
        tweetTextArea.setViewportView(enterTweetTextArea);

        updateButton.setFont(new java.awt.Font("Aharoni", 0, 14));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createTweetPanelLayout = 
        		new javax.swing.GroupLayout(createTweetPanel);
        createTweetPanel.setLayout(createTweetPanelLayout);
        createTweetPanelLayout.setHorizontalGroup(
            createTweetPanelLayout.createParallelGroup(javax.swing.
            		GroupLayout.Alignment.LEADING)
            .addGroup(createTweetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tweetTextArea)
                .addContainerGap())
            .addGroup(createTweetPanelLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(updateButton, javax.swing.GroupLayout.
                		PREFERRED_SIZE, 92, javax.swing.GroupLayout.
                		PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                		Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
            		createTweetPanelLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(enterTweetLabel)
                .addGap(96, 96, 96))
        );
        createTweetPanelLayout.setVerticalGroup(
            createTweetPanelLayout.createParallelGroup(javax.swing.
            		GroupLayout.Alignment.LEADING)
            .addGroup(createTweetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enterTweetLabel, javax.swing.GroupLayout.
                		PREFERRED_SIZE, 29, javax.swing.GroupLayout.
                		PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(tweetTextArea, javax.swing.GroupLayout.
                		PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 
                		javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		UNRELATED)
                .addComponent(updateButton, javax.swing.GroupLayout.
                		PREFERRED_SIZE, 35, javax.swing.GroupLayout.
                		PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        mainTabPane.addTab("Compose a Tweet", createTweetPanel);

        searchTopicLabel.setFont(new java.awt.Font("Aharoni", 0, 18));
        searchTopicLabel.setText("Search for:");

        searchTopicTextField.addActionListener(
        		new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                searchTopicTextFieldActionPerformed(evt);
            }
        });

        searchTopicsButton.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchTopicsButton.setText("Search Topics");
        searchTopicsButton.addActionListener(new java.awt.event.
        		ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                searchTopicsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchTopicsPanelLayout = new javax.swing.
        		GroupLayout(searchTopicsPanel);
        searchTopicsPanel.setLayout(searchTopicsPanelLayout);
        searchTopicsPanelLayout.setHorizontalGroup(
            searchTopicsPanelLayout.createParallelGroup(javax.swing.
            		GroupLayout.Alignment.LEADING)
            .addGroup(searchTopicsPanelLayout.createSequentialGroup()
                .addGroup(searchTopicsPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.LEADING)
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
                .addContainerGap(110, Short.MAX_VALUE))
        );
        searchTopicsPanelLayout.setVerticalGroup(
            searchTopicsPanelLayout.createParallelGroup(javax.swing.GroupLayout.
            		Alignment.LEADING)
            .addGroup(searchTopicsPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(searchTopicLabel)
                .addGap(18, 18, 18)
                .addComponent(searchTopicTextField, javax.swing.GroupLayout.
                		PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 
                		javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchTopicsButton)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        mainTabPane.addTab("Search Topics", searchTopicsPanel);

        searchPeopleLabel.setFont(new java.awt.Font("Aharoni", 0, 18));
        searchPeopleLabel.setText("Search for:");

        searchPeopleTextField.addActionListener(
        		new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                searchPeopleTextFieldActionPerformed(evt);
            }
        });

        searchPeopleButton.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchPeopleButton.setText("Search People");
        searchPeopleButton.addActionListener(
        		new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                searchPeopleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPeoplePanelLayout = 
        		new javax.swing.GroupLayout(searchPeoplePanel);
        searchPeoplePanel.setLayout(searchPeoplePanelLayout);
        searchPeoplePanelLayout.setHorizontalGroup(
            searchPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.
            		Alignment.LEADING)
            .addGroup(searchPeoplePanelLayout.createSequentialGroup()
                .addGroup(searchPeoplePanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPeoplePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchPeopleTextField))
                    .addGroup(searchPeoplePanelLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(searchPeopleLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(searchPeoplePanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(searchPeopleButton)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        searchPeoplePanelLayout.setVerticalGroup(
            searchPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.
            		Alignment.LEADING)
            .addGroup(searchPeoplePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(searchPeopleLabel)
                .addGap(18, 18, 18)
                .addComponent(searchPeopleTextField, javax.swing.GroupLayout.
                		PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 
                		javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchPeopleButton)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        mainTabPane.addTab("Search People", searchPeoplePanel);

        profilePanel.setBackground(new java.awt.Color(0, 204, 204));

        profileLabel.setFont(new java.awt.Font("Aharoni", 3, 24));
        profileLabel.setForeground(new java.awt.Color(255, 255, 255));
        profileLabel.setText("PROFILE:");

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setFont(new java.awt.Font("Aharoni", 1, 18));
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name:");

        usernameLabel.setFont(new java.awt.Font("Aharoni", 1, 18));
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username:");

        followingLabel.setFont(new java.awt.Font("Aharoni", 1, 18));
        followingLabel.setForeground(new java.awt.Color(255, 255, 255));
        followingLabel.setText("Following:");

        followersLabel.setFont(new java.awt.Font("Aharoni", 1, 18));
        followersLabel.setForeground(new java.awt.Color(255, 255, 255));
        followersLabel.setText("Followers:");

        nameLabelContent.setFont(new java.awt.Font("Aharoni", 0, 18));
        nameLabelContent.setForeground(new java.awt.Color(255, 255, 255));
        nameLabelContent.setText(engine.getUserInformation()[0]);

        displayNameLabelContent.setFont(new java.awt.Font(
        		"Aharoni", 0, 18));
        displayNameLabelContent.setForeground(new java.awt.Color(
        		255, 255, 255));
        displayNameLabelContent.setText(engine.getUserInformation()[1]);

        followingLabelContent.setFont(new java.awt.Font("Aharoni", 0, 18));
        followingLabelContent.setForeground(new java.awt.Color(255, 255, 255));
        followingLabelContent.setText(engine.getUserInformation()[2]);

        followersLabelContent.setFont(new java.awt.Font("Aharoni", 0, 18));
        followersLabelContent.setForeground(new java.awt.Color(255, 255, 255));
        followersLabelContent.setText(engine.getUserInformation()[3]);

        tweetLabel.setFont(new java.awt.Font("Aharoni", 1, 18));
        tweetLabel.setForeground(new java.awt.Color(255, 255, 255));
        tweetLabel.setText("Tweets:");

        tweetContentLabel.setFont(new java.awt.Font("Aharoni", 0, 18));
        tweetContentLabel.setForeground(new java.awt.Color(255, 255, 255));
        tweetContentLabel.setText(engine.getUserInformation()[4]);

        timelineButton.setFont(new java.awt.Font("Aharoni", 0, 14));
        timelineButton.setText("View My Timeline");
        timelineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                timelineButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.
        		GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.
            		GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing
                		.GroupLayout.Alignment.LEADING)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.
                        		ComponentPlacement.RELATED)
                        .addComponent(nameLabelContent))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(usernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.
                        		ComponentPlacement.RELATED)
                        .addComponent(displayNameLabelContent))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(followingLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.
                        		ComponentPlacement.RELATED)
                        .addComponent(followingLabelContent))
                    .addComponent(profileLabel)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(followersLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.
                        		ComponentPlacement.RELATED)
                        .addComponent(followersLabelContent))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(tweetLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.
                        		ComponentPlacement.RELATED)
                        .addComponent(tweetContentLabel))
                    .addComponent(timelineButton))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout
            		.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addComponent(profileLabel)
                .addGap(1, 1, 1)
                .addGroup(profilePanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameLabelContent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.
                		GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(displayNameLabelContent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.
                		GroupLayout.Alignment.BASELINE)
                    .addComponent(followingLabel)
                    .addComponent(followingLabelContent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.
                		GroupLayout.Alignment.BASELINE)
                    .addComponent(followersLabel)
                    .addComponent(followersLabelContent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.
                		GroupLayout.Alignment.BASELINE)
                    .addComponent(tweetLabel)
                    .addComponent(tweetContentLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.
                		MAX_VALUE)
                .addComponent(timelineButton))
        );

        twitterPic.setIcon(new javax.swing.ImageIcon(getClass().
        		getResource("/view/twitterimage.jpg")));

        switchAccountButton.setFont(new java.awt.Font("Aharoni", 0, 12));
        switchAccountButton.setText("Switch Account");
        switchAccountButton.addActionListener(new java.awt.event.
        		ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                switchAccountButtonActionPerformed(evt);
            }
        });

        tweetTable.getTableHeader().setReorderingAllowed(false);
        tweetTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(final java.awt.event.MouseEvent evt) {
                tweetTableMouseClicked(evt);
            }
        });
        tweetTableScrollPane.setViewportView(tweetTable);

        displayTweetText.setColumns(20);
        displayTweetText.setLineWrap(true);
        displayTweetText.setRows(5);

        followButton.setFont(new java.awt.Font("Aharoni", 0, 14));
        followButton.setText("Follow");
        followButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                followButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Aharoni", 0, 14));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        retweetButton.setFont(new java.awt.Font("Aharoni", 0, 14));
        retweetButton.setText("Retweet");
        retweetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                retweetButtonActionPerformed(evt);
            }
        });

        trendsFollowersPanel.setBackground(new java.awt.Color(255, 255, 255));
        trendsFollowersPanel.setOpaque(false);

        trendLabel.setFont(new java.awt.Font("Aharoni", 1, 24));
        trendLabel.setForeground(new java.awt.Color(255, 255, 255));
        trendLabel.setText("TOP TRENDS");

        followerLabel.setFont(new java.awt.Font("Aharoni", 1, 24));
        followerLabel.setForeground(new java.awt.Color(255, 255, 255));
        followerLabel.setText("WHO TO FOLLOW");

        trendsList.setFont(new java.awt.Font("Aharoni", 0, 14));
        trendsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(final java.awt.event.MouseEvent evt) {
                trendsListMouseClicked(evt);
            }
        });
        trendsListScrollPane.setViewportView(trendsList);

        followersList.setFont(new java.awt.Font("Aharoni", 0, 14));
        followersList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(final java.awt.event.MouseEvent evt) {
                followersListMouseClicked(evt);
            }
        });
        followersListScrollPane.setViewportView(followersList);

        javax.swing.GroupLayout trendsFollowersPanelLayout = 
        		new javax.swing.GroupLayout(trendsFollowersPanel);
        trendsFollowersPanel.setLayout(trendsFollowersPanelLayout);
        trendsFollowersPanelLayout.setHorizontalGroup(
            trendsFollowersPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(trendsListScrollPane, javax.swing.GroupLayout.
            		PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(followersListScrollPane, javax.swing.GroupLayout.
            		PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(trendsFollowersPanelLayout.createSequentialGroup()
                .addGroup(trendsFollowersPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trendLabel)
                    .addComponent(followerLabel))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        trendsFollowersPanelLayout.setVerticalGroup(
            trendsFollowersPanelLayout.createParallelGroup(javax.swing.
            		GroupLayout.Alignment.LEADING)
            .addGroup(trendsFollowersPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE)
                .addComponent(trendLabel)
                .addGap(1, 1, 1)
                .addComponent(trendsListScrollPane, javax.swing.
                		GroupLayout.PREFERRED_SIZE, 211, javax.swing.
                		GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(followerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(followersListScrollPane, javax.swing.
                		GroupLayout.PREFERRED_SIZE, 223, javax.swing.
                		GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout mainPanelLayout = 
        		new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.
            		Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.
                		GroupLayout.Alignment.LEADING)
                    .addComponent(tweetTableScrollPane, javax.swing.
                    		GroupLayout.PREFERRED_SIZE, 656, javax.swing.
                    		GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(
                        		javax.swing.GroupLayout.Alignment.LEADING, 
                        		false)
                            .addComponent(mainTabPane, javax.swing.
                            		GroupLayout.PREFERRED_SIZE, 348, 
                            		javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.
                            		TRAILING, mainPanelLayout.
                            		createSequentialGroup()
                                .addComponent(displayTweetText)
                                .addPreferredGap(javax.swing.LayoutStyle.
                                		ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(
                                		javax.swing.GroupLayout.Alignment.
                                		LEADING, false)
                                    .addComponent(retweetButton, javax.swing.
                                    		GroupLayout.Alignment.TRAILING, 
                                    		javax.swing.GroupLayout.
                                    		DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(deleteButton, javax.swing.
                                    		GroupLayout.Alignment.TRAILING, 
                                    		javax.swing.GroupLayout.
                                    		DEFAULT_SIZE, javax.swing.
                                    		GroupLayout.DEFAULT_SIZE, 
                                    		Short.MAX_VALUE)
                                    .addComponent(followButton, javax.swing.
                                    		GroupLayout.Alignment.TRAILING, 
                                    		javax.swing.GroupLayout.
                                    		DEFAULT_SIZE, javax.swing.
                                    		GroupLayout.DEFAULT_SIZE, 
                                    		Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.
                        		ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(
                        		javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(twitterPic)
                            .addComponent(profilePanel, javax.swing.GroupLayout.
                            		PREFERRED_SIZE, javax.swing.GroupLayout.
                            		DEFAULT_SIZE, javax.swing.GroupLayout.
                            		PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.
                		GroupLayout.Alignment.LEADING)
                    .addComponent(trendsFollowersPanel, javax.swing.GroupLayout.
                    		DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 
                    		Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
                    		mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(switchAccountButton)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.
            		Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(mainTabPane, javax.swing.
                        		GroupLayout.PREFERRED_SIZE, 232, 
                        		javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.
                        		ComponentPlacement.RELATED, javax.swing.
                        		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(
                        		javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(
                                		javax.swing.GroupLayout.Alignment.
                                		LEADING)
                                    .addGroup(mainPanelLayout.
                                    		createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(retweetButton))
                                    .addComponent(followButton))
                                .addPreferredGap(javax.swing.LayoutStyle.
                                		ComponentPlacement.RELATED, javax.swing.
                                		GroupLayout.DEFAULT_SIZE, 
                                		Short.MAX_VALUE)
                                .addComponent(deleteButton))
                            .addComponent(displayTweetText, javax.swing.
                            		GroupLayout.PREFERRED_SIZE, 99, 
                            		javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.
                        		ComponentPlacement.RELATED)
                        .addComponent(tweetTableScrollPane, javax.swing.
                        		GroupLayout.PREFERRED_SIZE, 222, 
                        		javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(switchAccountButton, javax.swing.
                        		GroupLayout.PREFERRED_SIZE, 34, 
                        		javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.
                        		ComponentPlacement.RELATED)
                        .addComponent(trendsFollowersPanel, 
                        		javax.swing.GroupLayout.PREFERRED_SIZE, 
                        		javax.swing.GroupLayout.DEFAULT_SIZE, 
                        		javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(twitterPic, 
                        		javax.swing.GroupLayout.PREFERRED_SIZE, 
                        		102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(profilePanel, 
                        		javax.swing.GroupLayout.DEFAULT_SIZE, 
                        		javax.swing.GroupLayout.DEFAULT_SIZE, 
                        		Short.MAX_VALUE)
                        .addGap(228, 228, 228)))
                .addGap(761, 761, 761))
        );

        fileMenu.setText("File");

        refreshMenuItem.setText("Refresh");
        refreshMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                refreshMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(refreshMenuItem);

        quitMenuItem.setText("Quit");
        quitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                quitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(quitMenuItem);

        menubar.add(fileMenu);

        helpMenuBar.setText("Help");

        getHelpMenuItem.setText("Get Help");
        getHelpMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                getHelpMenuItemActionPerformed(evt);
            }
        });
        helpMenuBar.add(getHelpMenuItem);

        menubar.add(helpMenuBar);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
        		getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
            		LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 
            		javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
            		LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.
            		createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.
                		PREFERRED_SIZE, 586, javax.swing.GroupLayout.
                		PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
    }
    
    /** Logger for Twitter. */
    private static final Logger LOG = 
    		Logger.getLogger(Twitter4JGUI.class.getName());

    /** 
     * exits the application when the quit menu item is clicked.
     * @param evt the menu item under the file menu
     */
    private void quitMenuItemActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    /**
     * deletes the Tweet.
     * @param evt the delete button
     */
    private void deleteButtonActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            int index = tweetTable.getSelectedRow();
            if (index != -1) {
                long sid = engine.getTable().get(index).getId();
                engine.deleteTweet(sid);
            }
            JOptionPane.showMessageDialog(null, 
            		"You have successfully deleted a Tweet.");
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /** 
     * retweets the selected Tweet in the table.
     * @param evt the retweet button
     */
    private void retweetButtonActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            int index = tweetTable.getSelectedRow();
            if (index != -1) {
                long sid = engine.getTable().get(index).getId();
                engine.retweet(sid);
            }
            JOptionPane.showMessageDialog(null,
            		"You have successfully retweeted.");
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * follows the selected user from either the followers JList
     * or the table.
     * @param evt the follow button
     */
    private void followButtonActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            int index = tweetTable.getSelectedRow();
            if (index != -1) {
                String id = engine.getTable().get(index).getLoginName();
                engine.followUser(id);
                JOptionPane.showMessageDialog(null, 
                		"You have successfully followed a new user.");
            } else {
                index = followersList.getSelectedIndex();
                if (index != -1) {
                    engine.followUser(engine.getUsers().getElementAt(index));
                    JOptionPane.showMessageDialog(null,
                    		"You have successfully followed a new user.");
                }
            }
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /** 
     * displays the text of the selected tweet.
     * @param evt any row of the table
     */
    private void tweetTableMouseClicked(
    		final java.awt.event.MouseEvent evt) {
        try {
            int index = tweetTable.getSelectedRow();
            if (index != -1) {
                Tweet t = engine.getTable().get(index);
                displayTweetText.setText(t.getText());
            }
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /** 
     * displays the switch account dialog window.
     * @param evt the switch account button
     */
    private void switchAccountButtonActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        switchAccountDialog.setVisible(true);
    }

    /**
     * searches and displays topics.
     * @param evt the search topics button
     */
    private void searchTopicsButtonActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            engine.searchTweets(searchTopicTextField.getText());
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * searches topics if you hit enter in the text field.
     * @param evt hitting enter in the text field
     */
    private void searchTopicTextFieldActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            engine.searchTweets(searchTopicTextField.getText());
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * updates the user's status.
     * @param evt the update button
     */
    private void updateButtonActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            engine.updateStatus(enterTweetTextArea.getText());
            enterTweetTextArea.setText(null);
            JOptionPane.showMessageDialog(null, 
            		"You have successfully created a Tweet.");
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * searches for people when you hit enter in the text field.
     * @param evt hitting enter in the text field
     */
    private void searchPeopleTextFieldActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            engine.searchPeople(searchPeopleTextField.getText());
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * searches for people. 
     * @param evt the search people button
     */
    private void searchPeopleButtonActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            engine.searchPeople(searchPeopleTextField.getText());
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * shows the current user's timeline.
     * @param evt the show my timeline button
     */
    private void timelineButtonActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            engine.showTimeLine();
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * asks the user for the four pieces of information for the .properties file
     * then switches the account and updates the information.
     * @param evt the OK button on the switch account dialog window
     */
    private void switchAccountDialogButtonActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            String consumerKey = consumerKeyTextField.getText();
            String consumerSecret = consumerSecretTextField.getText();
            String accessToken = accessTokenTextField.getText();
            String accessTokenSecret = accessTokenSecretTextField.getText();
            engine.switchAccount(consumerKey, consumerSecret, 
            		accessToken, accessTokenSecret);
            updateUserInformation();
            switchAccountDialog.setVisible(false);
            trendsList = new JList(engine.generateTrendingTopics());
            followersList = new JList(engine.generateSuggestedUsers());
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * gets the selected row of trends JList.
     * @param evt any row of the trends JList
     */
    private void trendsListMouseClicked(
    		final java.awt.event.MouseEvent evt) {
        try {
            int index = trendsList.getSelectedIndex();
            if (index != -1) {
                engine.searchTweets(engine.getTrends().getElementAt(index));
            }
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * gets the selected row of the followers JList.
     * @param evt any row of the followers JList
     */
    private void followersListMouseClicked(
    		final java.awt.event.MouseEvent evt) {
        try {
            int index = followersList.getSelectedIndex();
            if (index != -1) {
                engine.showTimeLine(engine.getUsers().getElementAt(index));
            }
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * refreshes the trends and followers JLists.
     * @param evt the refresh menu item in the file menu
     */
    private void refreshMenuItemActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            trendsList = new JList(engine.generateTrendingTopics());
            followersList = new JList(engine.generateSuggestedUsers());
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * closes the help window.
     * @param evt close button on the help window
     */
    private void closeButtonActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        helpFrame.setVisible(false);
    }

    /**
     * displays the help window.
     * @param evt get help menu item in the help menu
     */
    private void getHelpMenuItemActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        helpFrame.setVisible(true);
    }
    
    /**
     * updates the current user's information in the GUI. 
     */
    private void updateUserInformation() {
        nameLabelContent.setText(engine.getUserInformation()[0]);
        displayNameLabelContent.setText(engine.getUserInformation()[1]);
        followingLabelContent.setText(engine.getUserInformation()[2]);
        followersLabelContent.setText(engine.getUserInformation()[3]);
        tweetContentLabel.setText(engine.getUserInformation()[4]);
    }
    
    /**
     * displays a JOptionPane for errors.
     * @param ex an exception
     */
    private void displayError(final Exception ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Twitter4J Error", 
        		JOptionPane.ERROR_MESSAGE);
    }

    /**
     * main method that starts the application. 
     * @param args the command line arguments
     */
    public static void main(final String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : 
            	javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Twitter4JGUI.class.getName()).
            log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Twitter4JGUI.class.getName()).
            log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Twitter4JGUI.class.getName()).
            log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Twitter4JGUI.class.getName()).
            log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new Twitter4JGUI().setVisible(true);
            }
        });
    }
    /** label for access token in switch account window. */
    private javax.swing.JLabel accessTokenLabel;
    /** label for access token secret in switch account window. */
    private javax.swing.JLabel accessTokenSecretLabel;
    /** text field to enter access token secret in switch account window. */
    private javax.swing.JTextField accessTokenSecretTextField;
    /** text field to enter access token in switch account window. */
    private javax.swing.JTextField accessTokenTextField;
    /** button to close help window. */
    private javax.swing.JButton closeButton;
    /** panel to hold the close button in the help window. */
    private javax.swing.JPanel closePanel;
    /** label for consumer key in switch account window. */
    private javax.swing.JLabel consumerKeyLabel;
    /** text field to enter consumer key in switch account window. */
    private javax.swing.JTextField consumerKeyTextField;
    /** label for consumer secret in switch account window. */
    private javax.swing.JLabel consumerSecretLabel;
    /** text field to enter consumer secret in switch account window. */
    private javax.swing.JTextField consumerSecretTextField;
    /** label for creating a tweet heading in help window. */
    private javax.swing.JLabel createTweetHeading;
    /** first line of create a tweet help section. */
    private javax.swing.JLabel createTweetLine1;
    /** second line of create a tweet help section. */
    private javax.swing.JLabel createTweetLine2;
    /** third line of create a tweet help section. */
    private javax.swing.JLabel createTweetLine3;
    /** fourth line of create a tweet help section. */
    private javax.swing.JLabel createTweetLine4;
    /** fifth line of create a tweet help section. */
    private javax.swing.JLabel createTweetLine5;
    /** panel for creating a tweet. first tab pane in the main GUI. */
    private javax.swing.JPanel createTweetPanel;
    /** button used for deleting tweets. */
    private javax.swing.JButton deleteButton;
    /** label for the actual display name of the current user. */
    private javax.swing.JLabel displayNameLabelContent;
    /** text area to display the content of a tweet. */
    private javax.swing.JTextArea displayTweetText;
    /** label to prompt the user to enter text for a tweet. */
    private javax.swing.JLabel enterTweetLabel;
    /** text area for the user to enter the content of a new tweet. */
    private javax.swing.JTextArea enterTweetTextArea;
    /** file menu in menu bar. */
    private javax.swing.JMenu fileMenu;
    /** button used for following users. */
    private javax.swing.JButton followButton;
    /** label used for the heading of the how to 
     * follow section of the help window. */
    private javax.swing.JLabel followHeading;
    /** first line of the how to follow section of the help window. */
    private javax.swing.JLabel followLine1;
    /** tenth line of the how to follow section of the help window. */
    private javax.swing.JLabel followLine10;
    /** eleventh line of the how to follow section of the help window. */
    private javax.swing.JLabel followLine11;
    /** second line of the how to follow section of the help window. */
    private javax.swing.JLabel followLine2;
    /** third line of the how to follow section of the help window. */
    private javax.swing.JLabel followLine3;
    /** fourth line of the how to follow section of the help window. */
    private javax.swing.JLabel followLine4;
    /** fifth line of the how to follow section of the help window. */
    private javax.swing.JLabel followLine5;
    /** sixth line of the how to follow section of the help window. */
    private javax.swing.JLabel followLine6;
    /** seventh line of the how to follow section of the help window. */
    private javax.swing.JLabel followLine7;
    /** eight line of the how to follow section of the help window. */
    private javax.swing.JLabel followLine8;
    /** ninth line of the how to follow section of the help window. */
    private javax.swing.JLabel followLine9;
    /** label for heading of the followers JList. */
    private javax.swing.JLabel followerLabel;
    /** label for how many followers a user has. */
    private javax.swing.JLabel followersLabel;
    /** label for the actual number of followers a user has. */
    private javax.swing.JLabel followersLabelContent;
    /** the JList holding the list of suggested user to follow. */
    private javax.swing.JList followersList;
    /** scroll pane to allow the user to scroll
     * through the list of suggested followers. */
    private javax.swing.JScrollPane followersListScrollPane;
    /** label for how many people the current user is following. */
    private javax.swing.JLabel followingLabel;
    /** label for the actual number of how many 
     * people the current user is following. */
    private javax.swing.JLabel followingLabelContent;
    /** menu item used to display the help window. */
    private javax.swing.JMenuItem getHelpMenuItem;
    /** frame for the help window. */
    private javax.swing.JFrame helpFrame;
    /** help menu bar to hold the get help menu item. */
    private javax.swing.JMenu helpMenuBar;
    /** allows for the user to scroll through the help window. */
    private javax.swing.JScrollPane helpScrollPane;
    /** panel that contains all the labesl for the help window. */
    private javax.swing.JPanel mainHelpPanel;
    /** main panel for the main GUI. */
    private javax.swing.JPanel mainPanel;
    /** primary tab pane to hold the 3 secondary components. */
    private javax.swing.JTabbedPane mainTabPane;
    /** menu bar displayed at the top of the screen. */ 
    private javax.swing.JMenuBar menubar;
    /** label for the current user's name. */
    private javax.swing.JLabel nameLabel;
    /** label for the actual name of the current user. */
    private javax.swing.JLabel nameLabelContent;
    /** label for the title of the profile section. */
    private javax.swing.JLabel profileLabel;
    /** panel to hold all the info about the current user's profile. */
    private javax.swing.JPanel profilePanel;
    /** menu item used to quit the application. */
    private javax.swing.JMenuItem quitMenuItem;
    /** menu item used to refresh the trends and followers JLists. */
    private javax.swing.JMenuItem refreshMenuItem;
    /** button used for retweeting. */
    private javax.swing.JButton retweetButton;
    /** label used for the heading of the 
     * retweeting section of the help window. */
    private javax.swing.JLabel retweetHeading;
    /** first line of the retweeting section in the help window. */
    private javax.swing.JLabel retweetLine1;
    /** second line of the retweeting section in the help window. */
    private javax.swing.JLabel retweetLine2;
    /** third line of the retweeting section in the help window. */
    private javax.swing.JLabel retweetLine3;
    /** fourth line of the retweeting section in the help window. */
    private javax.swing.JLabel retweetLine4;
    /** fifth line of the retweeting section in the help window. */
    private javax.swing.JLabel retweetLine5;
    /** sixth line of the retweeting section in the help window. */
    private javax.swing.JLabel retweetLine6;
    /** seventh line of the retweeting section in the help window. */
    private javax.swing.JLabel retweetLine7;
    /** button used for searching people. */
    private javax.swing.JButton searchPeopleButton;
    /** label used for the prompt to search people. */
    private javax.swing.JLabel searchPeopleLabel;
    /** panel contained in the tab pane for searching people. */
    private javax.swing.JPanel searchPeoplePanel;
    /** text field to enter people to search for. */
    private javax.swing.JTextField searchPeopleTextField;
    /** label used for the heading of the search
     * topic section of the help window. */
    private javax.swing.JLabel searchTopicHeading;
    /** label used for the prompt to search topics. */
    private javax.swing.JLabel searchTopicLabel;
    /** first line of the search topic section in the help window. */
    private javax.swing.JLabel searchTopicLine1;
    /** second line of the search topic section in the help window. */
    private javax.swing.JLabel searchTopicLine2;
    /** third line of the search topic section in the help window. */
    private javax.swing.JLabel searchTopicLine3;
    /** fourth line of the search topic section in the help window. */
    private javax.swing.JLabel searchTopicLine4;
    /** fifth line of the search topic section in the help window. */
    private javax.swing.JLabel searchTopicLine5;
    /** sixth line of the search topic section in the help window. */
    private javax.swing.JLabel searchTopicLine6;
    /** seventh line of the search topic section in the help window. */
    private javax.swing.JLabel searchTopicLine7;
    /** eighth line of the search topic section in the help window. */
    private javax.swing.JLabel searchTopicLine8;
    /** ninth line of the search topic section in the help window. */
    private javax.swing.JLabel searchTopicLine9;
    /** text field to enter a topic to search for. */
    private javax.swing.JTextField searchTopicTextField;
    /** button for searching topics. */
    private javax.swing.JButton searchTopicsButton;
    /** panel contained in the tab pane for searching topics. */
    private javax.swing.JPanel searchTopicsPanel;
    /** label for the heading of the search 
     * user section of the help window. */
    private javax.swing.JLabel searchUserHeading;
    /** first line of the search user section in the help window. */
    private javax.swing.JLabel searchUserLine1;
    /** second line of the search user section in the help window. */
    private javax.swing.JLabel searchUserLine2;
    /** third line of the search user section in the help window. */
    private javax.swing.JLabel searchUserLine3;
    /** fourth line of the search user section in the help window. */
    private javax.swing.JLabel searchUserLine4;
    /** fifth line of the search user section in the help window. */
    private javax.swing.JLabel searchUserLine5;
    /** sixth line of the search user section in the help window. */
    private javax.swing.JLabel searchUserLine6;
    /** button used for switching accounts. */
    private javax.swing.JButton switchAccountButton;
    /** dialog box that displays for switching accounts. */
    private javax.swing.JDialog switchAccountDialog;
    /** button in the switch account dialog window for switching accounts. */
    private javax.swing.JButton switchAccountDialogButton;
    /** panel for switching accounts. */
    private javax.swing.JPanel switchAccountPanel;
    /** label for the prompth to enter the info to switch accounts. */
    private javax.swing.JLabel switchAccountPromptLabel;
    /** button used to show the timeline. */
    private javax.swing.JButton timelineButton;
    /** label used for the heading of the 
     * timeline section of the help window. */
    private javax.swing.JLabel timelineHeading;
    /** first line of the timeline section in the help window. */
    private javax.swing.JLabel timelineLine1;
    /** second line of the timeline section in the help window. */
    private javax.swing.JLabel timelineLine2;
    /** third line of the timeline section in the help window. */
    private javax.swing.JLabel timelineLine3;
    /** fourth line of the timeline section in the help window. */
    private javax.swing.JLabel timelineLine4;
    /** fifth line of the timeline section in the help window. */
    private javax.swing.JLabel timelineLine5;
    /** sixth line of the timeline section in the help window. */
    private javax.swing.JLabel timelineLine6;
    /** label for the title of the trends JList. */
    private javax.swing.JLabel trendLabel;
    /** panel to hold the JLists for trends and followers. */
    private javax.swing.JPanel trendsFollowersPanel;
    /** Jlist to hold the list of trends. */
    private javax.swing.JList trendsList;
    /** scroll pane to allow the user to scroll through the list. */
    private javax.swing.JScrollPane trendsListScrollPane;
    /** label to hold the actual number of tweets of the current user. */
    private javax.swing.JLabel tweetContentLabel;
    /** label for the numbef of tweets of the current user. */
    private javax.swing.JLabel tweetLabel;
    /** table to hold a list of tweets. */
    private javax.swing.JTable tweetTable;
    /** scroll pane for the tweet table to allow the
     * user to scroll through the list of tweets. */
    private javax.swing.JScrollPane tweetTableScrollPane;
    /** text area to display the contents of a selected tweet. */
    private javax.swing.JScrollPane tweetTextArea;
    /** label to hold the picture of the word "Twitter". */
    private javax.swing.JLabel twitterPic;
    /** button used for updating or creating a tweet. */
    private javax.swing.JButton updateButton;
    /** label for the username of the current user. */
    private javax.swing.JLabel usernameLabel;
    /** TwitterEngine object. */
    private TwitterEngine engine;
}
