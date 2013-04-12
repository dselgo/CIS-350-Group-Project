package view;

import java.util.logging.Logger;
import javax.swing.*;
import controller.*;
import model.*;
import java.io.*;

/**
 * This class creates the user interface for the Twitter Desktop Application
 * and manages all the user actions. It interacts with the models through
 * the controller (TwitterEngine). 
 * 
 * @author Morgan Heyboer
 */
public class Twitter4JGUI extends javax.swing.JFrame {
    /**
     * Creates new form Twitter4JGUI.
     */
    public Twitter4JGUI() {
        engine = new TwitterEngine();
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize all the
     * components of the GUI.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        signInUNPWDialog = new javax.swing.JDialog();
        signInMainPanel = new javax.swing.JPanel();
        signInPromptLabel = new javax.swing.JLabel();
        siUsernameLabel = new javax.swing.JLabel();
        siPasswordLabel = new javax.swing.JLabel();
        siPasswordTextField = new javax.swing.JTextField();
        signInButton = new javax.swing.JButton();
        siUsernameTextField = new javax.swing.JTextField();
        helpFrame = new javax.swing.JFrame();
        helpMainPanel = new javax.swing.JPanel();
        helpMainLine1 = new javax.swing.JLabel();
        helpMainLine2 = new javax.swing.JLabel();
        helpMainLine3 = new javax.swing.JLabel();
        helpMainLine4 = new javax.swing.JLabel();
        helpMainLine5 = new javax.swing.JLabel();
        helpContentTabbedPane = new javax.swing.JTabbedPane();
        createTweetHelpContentPanel = new javax.swing.JPanel();
        createTweetLine1 = new javax.swing.JLabel();
        createTweetLine2 = new javax.swing.JLabel();
        createTweetLine3 = new javax.swing.JLabel();
        createTweetLine4 = new javax.swing.JLabel();
        createTweetLine5 = new javax.swing.JLabel();
        createTweetLine6 = new javax.swing.JLabel();
        viewTimelinesHelpContentPanel = new javax.swing.JPanel();
        viewTimelineLine1 = new javax.swing.JLabel();
        viewTimelineLine2 = new javax.swing.JLabel();
        viewTimelineLine3 = new javax.swing.JLabel();
        viewTimelineLine4 = new javax.swing.JLabel();
        viewTimelineLine5 = new javax.swing.JLabel();
        viewTimelineLine6 = new javax.swing.JLabel();
        viewTimelineLine8 = new javax.swing.JLabel();
        viewTimelineLine7 = new javax.swing.JLabel();
        viewTimelineLine9 = new javax.swing.JLabel();
        viewTimelineLine10 = new javax.swing.JLabel();
        viewTimelineLine11 = new javax.swing.JLabel();
        viewTimelineLine12 = new javax.swing.JLabel();
        searchUsersHelpContentPanel = new javax.swing.JPanel();
        searchUsersLine1 = new javax.swing.JLabel();
        searchUsersLine2 = new javax.swing.JLabel();
        searchUsersLine3 = new javax.swing.JLabel();
        searchUsersLine4 = new javax.swing.JLabel();
        searchUsersLine5 = new javax.swing.JLabel();
        searchUsersLine6 = new javax.swing.JLabel();
        searchTopicsHelpContentPanel = new javax.swing.JPanel();
        searchTopicsLine1 = new javax.swing.JLabel();
        searchTopicsLine2 = new javax.swing.JLabel();
        searchTopicsLine3 = new javax.swing.JLabel();
        searchTopicsLine4 = new javax.swing.JLabel();
        searchTopicsLine5 = new javax.swing.JLabel();
        searchTopicsLine6 = new javax.swing.JLabel();
        searchTopicsLine7 = new javax.swing.JLabel();
        searchTopicsLine8 = new javax.swing.JLabel();
        followHelpContentPanel = new javax.swing.JPanel();
        followLine1 = new javax.swing.JLabel();
        followLine2 = new javax.swing.JLabel();
        followLine3 = new javax.swing.JLabel();
        followLine4 = new javax.swing.JLabel();
        followLine5 = new javax.swing.JLabel();
        followLine6 = new javax.swing.JLabel();
        followLine7 = new javax.swing.JLabel();
        followLine8 = new javax.swing.JLabel();
        followLine9 = new javax.swing.JLabel();
        retweetHelpContentPanel = new javax.swing.JPanel();
        retweetLine1 = new javax.swing.JLabel();
        retweetLine2 = new javax.swing.JLabel();
        retweetLine3 = new javax.swing.JLabel();
        retweetLine4 = new javax.swing.JLabel();
        retweetLine5 = new javax.swing.JLabel();
        retweetLine6 = new javax.swing.JLabel();
        retweetLine7 = new javax.swing.JLabel();
        deleteHelpContentPanel = new javax.swing.JPanel();
        deleteLine1 = new javax.swing.JLabel();
        deleteLine2 = new javax.swing.JLabel();
        deleteLine3 = new javax.swing.JLabel();
        deleteLine4 = new javax.swing.JLabel();
        deleteLine5 = new javax.swing.JLabel();
        deleteLine6 = new javax.swing.JLabel();
        favoriteHelpScrollPane = new javax.swing.JScrollPane();
        favoriteHelpContentPanel = new javax.swing.JPanel();
        favoriteLine1 = new javax.swing.JLabel();
        favoriteLine2 = new javax.swing.JLabel();
        favoriteLine3 = new javax.swing.JLabel();
        favoriteLine4 = new javax.swing.JLabel();
        favoriteLine5 = new javax.swing.JLabel();
        favoriteLine6 = new javax.swing.JLabel();
        favoriteLine7 = new javax.swing.JLabel();
        favoriteLine8 = new javax.swing.JLabel();
        favoriteLine9 = new javax.swing.JLabel();
        favoriteLine10 = new javax.swing.JLabel();
        favoriteLine11 = new javax.swing.JLabel();
        favoriteLine12 = new javax.swing.JLabel();
        favoriteLine13 = new javax.swing.JLabel();
        favoriteLine14 = new javax.swing.JLabel();
        favoriteLine15 = new javax.swing.JLabel();
        favoriteLine16 = new javax.swing.JLabel();
        favoriteLine17 = new javax.swing.JLabel();
        favoriteLine18 = new javax.swing.JLabel();
        favoriteLine19 = new javax.swing.JLabel();
        favoriteLine20 = new javax.swing.JLabel();
        favoriteLine21 = new javax.swing.JLabel();
        favoriteLine22 = new javax.swing.JLabel();
        favoriteLine23 = new javax.swing.JLabel();
        favoriteLine24 = new javax.swing.JLabel();
        favoriteLine25 = new javax.swing.JLabel();
        favoriteLine26 = new javax.swing.JLabel();
        blockUsersHelpContentPanel = new javax.swing.JPanel();
        blockLine1 = new javax.swing.JLabel();
        blockLine6 = new javax.swing.JLabel();
        blockLine3 = new javax.swing.JLabel();
        blockLine4 = new javax.swing.JLabel();
        blockLine5 = new javax.swing.JLabel();
        blockLine2 = new javax.swing.JLabel();
        blockLine7 = new javax.swing.JLabel();
        blockLine8 = new javax.swing.JLabel();
        blockLine9 = new javax.swing.JLabel();
        blockLine10 = new javax.swing.JLabel();
        blockLine11 = new javax.swing.JLabel();
        blockLine12 = new javax.swing.JLabel();
        blockLine13 = new javax.swing.JLabel();
        reportUsersHelpContentPanel = new javax.swing.JPanel();
        reportLine1 = new javax.swing.JLabel();
        reportLine2 = new javax.swing.JLabel();
        reportLine3 = new javax.swing.JLabel();
        reportLine4 = new javax.swing.JLabel();
        reportLine5 = new javax.swing.JLabel();
        signUpDialog = new javax.swing.JDialog();
        signUpMainPanel = new javax.swing.JPanel();
        signUpPromptLabel = new javax.swing.JLabel();
        suUsernameLabel = new javax.swing.JLabel();
        suPasswordLabel = new javax.swing.JLabel();
        suPasswordTextField = new javax.swing.JTextField();
        signUpButton = new javax.swing.JButton();
        suUsernameTextField = new javax.swing.JTextField();
        consumerSecretTextField = new javax.swing.JTextField();
        consumerKeyTextField = new javax.swing.JTextField();
        consumerKeyLabel = new javax.swing.JLabel();
        consumerSecretLabel = new javax.swing.JLabel();
        accessTokenSecretTextField = new javax.swing.JTextField();
        accessTokenTextField = new javax.swing.JTextField();
        accessTokenLabel = new javax.swing.JLabel();
        accessTokenSecretLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        mainTabPane = new javax.swing.JTabbedPane();
        createTweetPanel = new javax.swing.JPanel();
        enterTweetLabel = new javax.swing.JLabel();
        enterTweetTextArea = new javax.swing.JTextArea();
        postTweetButton = new javax.swing.JButton();
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
        myTweetsButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        twitterPic = new javax.swing.JLabel();
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
        homeButton = new javax.swing.JButton();
        menubar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        refreshMenuItem = new javax.swing.JMenuItem();
        quitMenuItem = new javax.swing.JMenuItem();
        accountMenu = new javax.swing.JMenu();
        signInMenuItem = new javax.swing.JMenuItem();
        signUpMenuItem = new javax.swing.JMenuItem();
        switchAccountMenuItem = new javax.swing.JMenuItem();
        signOutMenuItem = new javax.swing.JMenuItem();
        favoritesMenu = new javax.swing.JMenu();
        addFavoritesMenuItem = new javax.swing.JMenuItem();
        removeFavoritesMenuItem = new javax.swing.JMenuItem();
        showFavoritesMenuItem = new javax.swing.JMenuItem();
        showUserFavoritesMenuItem = new javax.swing.JMenuItem();
        blockMenu = new javax.swing.JMenu();
        blockUserMenuItem = new javax.swing.JMenuItem();
        unblockUserMenuItem = new javax.swing.JMenuItem();
        showBlockedUsersMenuItem = new javax.swing.JMenuItem();
        helpMenuBar = new javax.swing.JMenu();
        getHelpMenuItem = new javax.swing.JMenuItem();

        signInUNPWDialog.setTitle("Switch Account");
        signInUNPWDialog.setMinimumSize(new java.awt.Dimension(428, 210));
        signInUNPWDialog.setResizable(false);

        signInMainPanel.setBackground(new java.awt.Color(0, 204, 204));

        signInPromptLabel.setFont(new java.awt.Font("Aharoni", 0, 14));
        signInPromptLabel.setHorizontalAlignment(javax.swing.SwingConstants.
        		CENTER);
        signInPromptLabel.setText("Please enter the following information "
        		+ "to switch accounts:");

        siUsernameLabel.setFont(new java.awt.Font("Aharoni", 0, 12));
        siUsernameLabel.setText("Username:");

        siPasswordLabel.setFont(new java.awt.Font("Aharoni", 0, 12));
        siPasswordLabel.setText("Password:");

        signInButton.setFont(new java.awt.Font("Aharoni", 0, 12));
        signInButton.setText("Sign In");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signInMainPanelLayout = 
        		new javax.swing.GroupLayout(signInMainPanel);
        signInMainPanel.setLayout(signInMainPanelLayout);
        signInMainPanelLayout.setHorizontalGroup(
            signInMainPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(signInMainPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signInMainPanelLayout.createSequentialGroup()
                        .addComponent(signInPromptLabel)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(signInMainPanelLayout.createSequentialGroup()
                        .addGroup(signInMainPanelLayout.createParallelGroup(
                        		javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(siPasswordLabel)
                            .addComponent(siUsernameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.
                        		ComponentPlacement.RELATED)
                        .addGroup(signInMainPanelLayout.createParallelGroup(
                        		javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(siPasswordTextField)
                            .addComponent(siUsernameTextField))))
                .addContainerGap())
            .addGroup(signInMainPanelLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(signInButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE))
        );
        signInMainPanelLayout.setVerticalGroup(
            signInMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.
            		Alignment.LEADING)
            .addGroup(signInMainPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(signInPromptLabel)
                .addGap(18, 18, 18)
                .addGroup(signInMainPanelLayout.createParallelGroup(javax.swing.
                		GroupLayout.Alignment.BASELINE)
                    .addComponent(siUsernameTextField, javax.swing.
                    		GroupLayout.PREFERRED_SIZE, javax.swing.
                    		GroupLayout.DEFAULT_SIZE, javax.swing.
                    		GroupLayout.PREFERRED_SIZE)
                    .addComponent(siUsernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		UNRELATED)
                .addGroup(signInMainPanelLayout.createParallelGroup(javax.swing.
                		GroupLayout.Alignment.BASELINE)
                    .addComponent(siPasswordLabel)
                    .addComponent(siPasswordTextField, javax.swing.GroupLayout.
                    		PREFERRED_SIZE, javax.swing.GroupLayout.
                    		DEFAULT_SIZE, javax.swing.GroupLayout.
                    		PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(signInButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE))
        );

        javax.swing.GroupLayout signInUNPWDialogLayout = 
        		new javax.swing.GroupLayout(signInUNPWDialog.getContentPane());
        signInUNPWDialog.getContentPane().setLayout(signInUNPWDialogLayout);
        signInUNPWDialogLayout.setHorizontalGroup(
            signInUNPWDialogLayout.createParallelGroup(javax.swing.GroupLayout.
            		Alignment.LEADING)
            .addComponent(signInMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
            		javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        signInUNPWDialogLayout.setVerticalGroup(
            signInUNPWDialogLayout.createParallelGroup(javax.swing.GroupLayout.
            		Alignment.LEADING)
            .addComponent(signInMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
            		javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        helpFrame.setMinimumSize(new java.awt.Dimension(450, 610));
        helpFrame.setResizable(false);

        helpMainPanel.setBackground(new java.awt.Color(0, 204, 204));
        helpMainPanel.setPreferredSize(new java.awt.Dimension(435, 435));

        helpMainLine1.setFont(new java.awt.Font("Aharoni", 1, 24));
        helpMainLine1.setForeground(new java.awt.Color(255, 255, 255));
        helpMainLine1.setText("Twitter Desktop Application");

        helpMainLine2.setFont(new java.awt.Font("Aharoni", 1, 24));
        helpMainLine2.setForeground(new java.awt.Color(255, 255, 255));
        helpMainLine2.setText("Help Window");

        helpMainLine3.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        helpMainLine3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helpMainLine3.setText("Please use the buttons along the right side " 
        		+ " to navigate ");

        helpMainLine4.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        helpMainLine4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helpMainLine4.setText("through the help window. If you have any "
        		+ "more questions,");

        helpMainLine5.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        helpMainLine5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helpMainLine5.setText("please visit www.twitter.com.");

        createTweetHelpContentPanel.setOpaque(false);
        createTweetHelpContentPanel.setPreferredSize(new java.awt.
        		Dimension(435, 435));

        createTweetLine1.setFont(new java.awt.Font("Aharoni", 1, 24));
        createTweetLine1.setHorizontalAlignment(javax.swing.SwingConstants.
        		LEFT);
        createTweetLine1.setText("Creating a Tweet:");

        createTweetLine2.setFont(new java.awt.Font("Aharoni", 0, 14));
        createTweetLine2.setText("Click the \"Compose a Tweet\" tab at " 
        		+ "the top of the window.");

        createTweetLine3.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        createTweetLine3.setText("Type what you want your Tweet to say "
        		+ "in the white space");

        createTweetLine4.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        createTweetLine4.setText("and then hit <Enter> or click the "
        		+ "\"Post Tweet\" button. A");

        createTweetLine5.setFont(new java.awt.Font("Aharoni", 0, 14));
        createTweetLine5.setText("window will appear confirming that "
        		+ "you have successfully");

        createTweetLine6.setFont(new java.awt.Font("Aharoni", 0, 14));
        createTweetLine6.setText("created a new Tweet.");

        javax.swing.GroupLayout createTweetHelpContentPanelLayout = 
        		new javax.swing.GroupLayout(createTweetHelpContentPanel);
        createTweetHelpContentPanel.setLayout(
        		createTweetHelpContentPanelLayout);
        createTweetHelpContentPanelLayout.setHorizontalGroup(
            createTweetHelpContentPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createTweetHelpContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createTweetHelpContentPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createTweetHelpContentPanelLayout.
                    		createParallelGroup(javax.swing.GroupLayout.
                    				Alignment.LEADING)
                        .addComponent(createTweetLine2, javax.swing.GroupLayout.
                        		Alignment.TRAILING)
                        .addComponent(createTweetLine3, javax.swing.GroupLayout.
                        		Alignment.TRAILING)
                        .addGroup(createTweetHelpContentPanelLayout.
                        		createSequentialGroup()
                            .addGroup(createTweetHelpContentPanelLayout.
                            		createParallelGroup(javax.swing.GroupLayout.
                            				Alignment.LEADING)
                                .addComponent(createTweetLine4)
                                .addComponent(createTweetLine6)
                                .addComponent(createTweetLine5))
                            .addGap(1, 1, 1)))
                    .addComponent(createTweetLine1))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        createTweetHelpContentPanelLayout.setVerticalGroup(
            createTweetHelpContentPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createTweetHelpContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createTweetLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(createTweetLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(createTweetLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(createTweetLine4, javax.swing.GroupLayout.
                		PREFERRED_SIZE, 15, javax.swing.GroupLayout.
                		PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(createTweetLine5, javax.swing.GroupLayout.
                		PREFERRED_SIZE, 15, javax.swing.GroupLayout
                		.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(createTweetLine6)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        helpContentTabbedPane.addTab("Creating Tweets", 
        		createTweetHelpContentPanel);

        viewTimelinesHelpContentPanel.setOpaque(false);
        viewTimelinesHelpContentPanel.setPreferredSize(
        		new java.awt.Dimension(435, 435));

        viewTimelineLine1.setFont(new java.awt.Font("Aharoni", 1, 24));
        viewTimelineLine1.setHorizontalAlignment(javax.swing.SwingConstants.
        		LEFT);
        viewTimelineLine1.setText("To View Your Tweets:");

        viewTimelineLine2.setFont(new java.awt.Font("Aharoni", 0, 14));
        viewTimelineLine2.setText("Click the \"Show my Tweets\" button "
        		+ "located in the middle of");

        viewTimelineLine3.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        viewTimelineLine3.setText("the window. This will display the "
        		+ "Tweets you have created in");

        viewTimelineLine4.setFont(new java.awt.Font("Aharoni", 0, 14));
        viewTimelineLine4.setText("the table at the bottom of the "
        		+ "window. From the table, you");

        viewTimelineLine5.setFont(new java.awt.Font("Aharoni", 0, 14));
        viewTimelineLine5.setText("can click on any row and the "
        		+ "content of your Tweet will");

        viewTimelineLine6.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        viewTimelineLine6.setText("appear in the white area above the table.");

        viewTimelineLine8.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        viewTimelineLine8.setText("Click the \"Home\" button located near "
        		+ "the top right corner of");

        viewTimelineLine7.setFont(new java.awt.Font("Aharoni", 1, 24));
        viewTimelineLine7.setHorizontalAlignment(javax.swing.SwingConstants.
        		LEFT);
        viewTimelineLine7.setText("To View Your Home Timeline:");

        viewTimelineLine9.setFont(new java.awt.Font("Aharoni", 0, 14));
        viewTimelineLine9.setText("the window. This will display the "
        		+ "Tweets from your home ");

        viewTimelineLine10.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        viewTimelineLine10.setText("timeline in the table at the bottom "
        		+ "of the window. From the");

        viewTimelineLine11.setFont(new java.awt.Font("Aharoni", 0, 14));
        viewTimelineLine11.setText("table, you can click on any row and "
        		+ "the content of that Tweet");

        viewTimelineLine12.setFont(new java.awt.Font("Aharoni", 0, 14));
        viewTimelineLine12.setText("will appear in the white area above "
        		+ "the table.");

        javax.swing.GroupLayout viewTimelinesHelpContentPanelLayout = 
        		new javax.swing.GroupLayout(viewTimelinesHelpContentPanel);
        viewTimelinesHelpContentPanel.setLayout(
        		viewTimelinesHelpContentPanelLayout);
        viewTimelinesHelpContentPanelLayout.setHorizontalGroup(
            viewTimelinesHelpContentPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewTimelinesHelpContentPanelLayout.
            		createSequentialGroup()
                .addContainerGap()
                .addGroup(viewTimelinesHelpContentPanelLayout.
                		createParallelGroup(javax.swing.GroupLayout.Alignment.
                				LEADING)
                    .addComponent(viewTimelineLine2)
                    .addComponent(viewTimelineLine3)
                    .addComponent(viewTimelineLine4)
                    .addComponent(viewTimelineLine5)
                    .addComponent(viewTimelineLine6)
                    .addComponent(viewTimelineLine8)
                    .addComponent(viewTimelineLine9)
                    .addComponent(viewTimelineLine10)
                    .addComponent(viewTimelineLine11)
                    .addComponent(viewTimelineLine12)
                    .addComponent(viewTimelineLine1)
                    .addComponent(viewTimelineLine7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE))
        );
        viewTimelinesHelpContentPanelLayout.setVerticalGroup(
            viewTimelinesHelpContentPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewTimelinesHelpContentPanelLayout.
            		createSequentialGroup()
                .addContainerGap()
                .addComponent(viewTimelineLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(viewTimelineLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(viewTimelineLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(viewTimelineLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(viewTimelineLine5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(viewTimelineLine6)
                .addGap(18, 18, 18)
                .addComponent(viewTimelineLine7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(viewTimelineLine8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(viewTimelineLine9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(viewTimelineLine10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(viewTimelineLine11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(viewTimelineLine12)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        helpContentTabbedPane.addTab("Viewing Timelines", 
        		viewTimelinesHelpContentPanel);

        searchUsersHelpContentPanel.setOpaque(false);
        searchUsersHelpContentPanel.setPreferredSize(new java.awt.
        		Dimension(435, 435));

        searchUsersLine1.setFont(new java.awt.Font("Aharoni", 1, 24));
        searchUsersLine1.setHorizontalAlignment(javax.swing.SwingConstants.
        		LEFT);
        searchUsersLine1.setText("Searching for Users:");

        searchUsersLine2.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        searchUsersLine2.setText("First, click on the \"Search People\" "
        		+ "tab located near the top");

        searchUsersLine3.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchUsersLine3.setText("of the window. In the white space, "
        		+ "type the name or");

        searchUsersLine4.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        searchUsersLine4.setText("screenname of the person you would "
        		+ "like to search for");

        searchUsersLine5.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        searchUsersLine5.setText("and hit <Enter> or  click the \"Search "
        		+ "People\" button. A list");

        searchUsersLine6.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        searchUsersLine6.setText("of users will be displayed in the "
        		+ "table at the bottom.");

        javax.swing.GroupLayout searchUsersHelpContentPanelLayout = 
        		new javax.swing.GroupLayout(searchUsersHelpContentPanel);
        searchUsersHelpContentPanel.setLayout(
        		searchUsersHelpContentPanelLayout);
        searchUsersHelpContentPanelLayout.setHorizontalGroup(
            searchUsersHelpContentPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchUsersHelpContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchUsersHelpContentPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchUsersLine1)
                    .addComponent(searchUsersLine2)
                    .addComponent(searchUsersLine3)
                    .addComponent(searchUsersLine4)
                    .addComponent(searchUsersLine5)
                    .addComponent(searchUsersLine6))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        searchUsersHelpContentPanelLayout.setVerticalGroup(
            searchUsersHelpContentPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchUsersHelpContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchUsersLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchUsersLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchUsersLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchUsersLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchUsersLine5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchUsersLine6)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        helpContentTabbedPane.addTab("Searching People", 
        		searchUsersHelpContentPanel);

        searchTopicsHelpContentPanel.setOpaque(false);
        searchTopicsHelpContentPanel.setPreferredSize(new java.awt.
        		Dimension(435, 435));

        searchTopicsLine1.setFont(new java.awt.Font("Aharoni", 1, 24));
        searchTopicsLine1.setHorizontalAlignment(javax.swing.SwingConstants.
        		LEFT);
        searchTopicsLine1.setText("Searching for Topics:");

        searchTopicsLine2.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchTopicsLine2.setText("First, click on the \"Search Topics\" "
        		+ "tab located near the top of");

        searchTopicsLine3.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        searchTopicsLine3.setText("the window. In the white space, type "
        		+ "the topic you would");

        searchTopicsLine4.setFont(new java.awt.Font("Aharoni", 0, 14));
        searchTopicsLine4.setText("like to search and hit <Enter> or click "
        		+ "the \"Search Topics\"");

        searchTopicsLine5.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        searchTopicsLine5.setText("button. You can also click on one of "
        		+ "the Trending Topics from");

        searchTopicsLine6.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        searchTopicsLine6.setText("the list located in the upper right "
        		+ "corner of the window. A");

        searchTopicsLine7.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        searchTopicsLine7.setText("list of Tweets related to that topic "
        		+ "will be displayed in the");

        searchTopicsLine8.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        searchTopicsLine8.setText("table at the bottom of the window.");

        javax.swing.GroupLayout searchTopicsHelpContentPanelLayout = 
        		new javax.swing.GroupLayout(searchTopicsHelpContentPanel);
        searchTopicsHelpContentPanel.setLayout(
        		searchTopicsHelpContentPanelLayout);
        searchTopicsHelpContentPanelLayout.setHorizontalGroup(
            searchTopicsHelpContentPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTopicsHelpContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchTopicsHelpContentPanelLayout.
                		createParallelGroup(javax.swing.GroupLayout.Alignment.
                				LEADING)
                    .addComponent(searchTopicsLine5)
                    .addComponent(searchTopicsLine2)
                    .addComponent(searchTopicsLine3)
                    .addComponent(searchTopicsLine6)
                    .addComponent(searchTopicsLine7)
                    .addComponent(searchTopicsLine8)
                    .addComponent(searchTopicsLine1)
                    .addComponent(searchTopicsLine4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE))
        );
        searchTopicsHelpContentPanelLayout.setVerticalGroup(
            searchTopicsHelpContentPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTopicsHelpContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchTopicsLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchTopicsLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchTopicsLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchTopicsLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchTopicsLine5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchTopicsLine6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchTopicsLine7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(searchTopicsLine8)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        helpContentTabbedPane.addTab("Searching Topics", 
        		searchTopicsHelpContentPanel);

        followHelpContentPanel.setOpaque(false);
        followHelpContentPanel.setPreferredSize(new java.awt.
        		Dimension(435, 435));

        followLine1.setFont(new java.awt.Font("Aharoni", 1, 24)); 
        followLine1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        followLine1.setText("Following Users:");

        followLine2.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        followLine2.setText("First, search for a topic or user to get a "
        		+ "list of Tweets");

        followLine3.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        followLine3.setText("displayed in the table at the bottom of the "
        		+ "window. Click on");

        followLine4.setFont(new java.awt.Font("Aharoni", 0, 14));
        followLine4.setText("any Tweet to highlight it, then click "
        		+ "the \"Follow\" button");

        followLine5.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        followLine5.setText("located above the table. You can also "
        		+ "click on the name of a");

        followLine6.setFont(new java.awt.Font("Aharoni", 0, 14));
        followLine6.setText("user from the Suggested Users list located "
        		+ "along the right");

        followLine7.setFont(new java.awt.Font("Aharoni", 0, 14));
        followLine7.setText("side of the window and then click "
        		+ "the \"Follow\" button. A");

        followLine8.setFont(new java.awt.Font("Aharoni", 0, 14));
        followLine8.setText("window will appear confirming that you "
        		+ "have followed a");

        followLine9.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        followLine9.setText("new user.");

        javax.swing.GroupLayout followHelpContentPanelLayout = 
        		new javax.swing.GroupLayout(followHelpContentPanel);
        followHelpContentPanel.setLayout(followHelpContentPanelLayout);
        followHelpContentPanelLayout.setHorizontalGroup(
            followHelpContentPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(followHelpContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(followHelpContentPanelLayout.
                		createParallelGroup(javax.swing.GroupLayout.Alignment.
                				LEADING)
                    .addComponent(followLine2)
                    .addComponent(followLine4)
                    .addComponent(followLine5)
                    .addComponent(followLine6)
                    .addComponent(followLine7)
                    .addComponent(followLine8)
                    .addComponent(followLine9)
                    .addComponent(followLine1)
                    .addComponent(followLine3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE))
        );
        followHelpContentPanelLayout.setVerticalGroup(
            followHelpContentPanelLayout.createParallelGroup(javax.swing.
            		GroupLayout.Alignment.LEADING)
            .addGroup(followHelpContentPanelLayout.createSequentialGroup()
                .addContainerGap()
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
                .addContainerGap(175, Short.MAX_VALUE))
        );

        helpContentTabbedPane.addTab("Following Users", followHelpContentPanel);

        retweetHelpContentPanel.setOpaque(false);
        retweetHelpContentPanel.setPreferredSize(new java.awt.
        		Dimension(435, 435));

        retweetLine1.setFont(new java.awt.Font("Aharoni", 1, 24)); 
        retweetLine1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        retweetLine1.setText("Retweeting:");

        retweetLine2.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        retweetLine2.setText("First, search for a topic or user to get a "
        		+ "list of Tweets");

        retweetLine3.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        retweetLine3.setText("displayed in the table at the bottom of the "
        		+ "window. Click on");

        retweetLine4.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        retweetLine4.setText("any row to highlight the Tweet. Then click "
        		+ "the \"Retweet\"");

        retweetLine5.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        retweetLine5.setText("button located above the table. A window "
        		+ "will appear to ");

        retweetLine6.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        retweetLine6.setText("show that you have successfully retweeted "
        		+ "a Tweet. The");

        retweetLine7.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        retweetLine7.setText("Tweet will also be displayed in the table.");

        javax.swing.GroupLayout retweetHelpContentPanelLayout = 
        		new javax.swing.GroupLayout(retweetHelpContentPanel);
        retweetHelpContentPanel.setLayout(retweetHelpContentPanelLayout);
        retweetHelpContentPanelLayout.setHorizontalGroup(
            retweetHelpContentPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(retweetHelpContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(retweetHelpContentPanelLayout.
                		createParallelGroup(javax.swing.GroupLayout.Alignment.
                				LEADING)
                    .addComponent(retweetLine2)
                    .addComponent(retweetLine3)
                    .addComponent(retweetLine4)
                    .addComponent(retweetLine5)
                    .addComponent(retweetLine6)
                    .addComponent(retweetLine7)
                    .addComponent(retweetLine1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE))
        );
        retweetHelpContentPanelLayout.setVerticalGroup(
            retweetHelpContentPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(retweetHelpContentPanelLayout.createSequentialGroup()
                .addContainerGap()
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
                .addContainerGap(217, Short.MAX_VALUE))
        );

        helpContentTabbedPane.addTab("Retweeting", retweetHelpContentPanel);

        deleteHelpContentPanel.setOpaque(false);
        deleteHelpContentPanel.setPreferredSize(new java.awt.
        		Dimension(435, 435));

        deleteLine1.setFont(new java.awt.Font("Aharoni", 1, 24)); 
        deleteLine1.setText("Deleting Tweets:");

        deleteLine2.setFont(new java.awt.Font("Aharoni", 0, 14));
        deleteLine2.setText("First, click the \"View My Tweets\" button "
        		+ "to have your Tweets");

        deleteLine3.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        deleteLine3.setText("displayed in the table. From here, select "
        		+ "the Tweet you wish ");

        deleteLine4.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        deleteLine4.setText("to delete, then click the \"Delete\" button "
        		+ "located above the");

        deleteLine5.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        deleteLine5.setText("table. A window will appear confirming that "
        		+ "you have");

        deleteLine6.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        deleteLine6.setText("deleted a Tweet.");

        javax.swing.GroupLayout deleteHelpContentPanelLayout = 
        		new javax.swing.GroupLayout(deleteHelpContentPanel);
        deleteHelpContentPanel.setLayout(deleteHelpContentPanelLayout);
        deleteHelpContentPanelLayout.setHorizontalGroup(
            deleteHelpContentPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteHelpContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deleteHelpContentPanelLayout.
                		createParallelGroup(javax.swing.GroupLayout.Alignment.
                				LEADING)
                    .addComponent(deleteLine2)
                    .addComponent(deleteLine3)
                    .addComponent(deleteLine4)
                    .addComponent(deleteLine1)
                    .addComponent(deleteLine5)
                    .addComponent(deleteLine6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE))
        );
        deleteHelpContentPanelLayout.setVerticalGroup(
            deleteHelpContentPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteHelpContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(deleteLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(deleteLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(deleteLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(deleteLine5, javax.swing.GroupLayout.
                		PREFERRED_SIZE, 15, javax.swing.GroupLayout.
                		PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(deleteLine6, javax.swing.GroupLayout.
                		PREFERRED_SIZE, 15, javax.swing.GroupLayout.
                		PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        helpContentTabbedPane.addTab("Deleting Tweets", deleteHelpContentPanel);

        favoriteHelpScrollPane.setBackground(new java.awt.Color(0, 204, 204));
        favoriteHelpScrollPane.setHorizontalScrollBarPolicy(
        		javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        favoriteHelpScrollPane.setOpaque(false);

        favoriteHelpContentPanel.setBackground(new java.awt.Color(0, 204, 204));
        favoriteHelpContentPanel.setOpaque(false);
        favoriteHelpContentPanel.setPreferredSize(new java.awt.
        		Dimension(435, 641));

        favoriteLine1.setFont(new java.awt.Font("Aharoni", 1, 24)); 
        favoriteLine1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        favoriteLine1.setText("Adding a Favorite Tweet:");

        favoriteLine2.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        favoriteLine2.setText("First, get a list of Tweets displayed in the "
        		+ "table by");

        favoriteLine3.setFont(new java.awt.Font("Aharoni", 0, 14));
        favoriteLine3.setText(" searching for a topic or user. From there, "
        		+ "select");

        favoriteLine4.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        favoriteLine4.setText("the Tweet you wish to add to your Favorites. "
        		+ "Then ");

        favoriteLine5.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        favoriteLine5.setText("select \"Add To Favorites\" from "
        		+ "the \"Favorites\" menu. ");

        favoriteLine6.setFont(new java.awt.Font("Aharoni", 0, 14));
        favoriteLine6.setText("A window will appear confirming that you have");

        favoriteLine7.setFont(new java.awt.Font("Aharoni", 0, 14));
        favoriteLine7.setText("added a new favorite Tweet.");

        favoriteLine8.setFont(new java.awt.Font("Aharoni", 1, 24)); 
        favoriteLine8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        favoriteLine8.setText("Showing Your Favorite Tweets:");

        favoriteLine9.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        favoriteLine9.setText("Select \"Show My Favorites\" from "
        		+ "the \"Favorites\"");

        favoriteLine10.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        favoriteLine10.setText("menu. Your favorites Tweets will be "
        		+ "displayed in");

        favoriteLine11.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        favoriteLine11.setText("the table.");

        favoriteLine12.setFont(new java.awt.Font("Aharoni", 1, 24)); 
        favoriteLine12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        favoriteLine12.setText("Removing a Favorite Tweet:");

        favoriteLine13.setFont(new java.awt.Font("Aharoni", 0, 14));
        favoriteLine13.setText("First, select \"Show My Favorites\" from the");

        favoriteLine14.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        favoriteLine14.setText("\"Favorites\" menu to display your favorite "
        		+ "Tweets");

        favoriteLine15.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        favoriteLine15.setText("in the table. From there, select the Tweet "
        		+ "you wish");

        favoriteLine16.setFont(new java.awt.Font("Aharoni", 0, 14));
        favoriteLine16.setText("to remove from your favorites. Then, "
        		+ "select \"Remove");

        favoriteLine17.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        favoriteLine17.setText("From Favorites\" in the \"Favorites\" "
        		+ "menu. A window");

        favoriteLine18.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        favoriteLine18.setText("will appear confirming that you have "
        		+ "removed a");

        favoriteLine19.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        favoriteLine19.setText("favorite Tweet.");

        favoriteLine20.setFont(new java.awt.Font("Aharoni", 1, 24)); 
        favoriteLine20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        favoriteLine20.setText("Showing a User's Favorite");

        favoriteLine21.setFont(new java.awt.Font("Aharoni", 1, 24)); 
        favoriteLine21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        favoriteLine21.setText("Tweets:");

        favoriteLine22.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        favoriteLine22.setText("First, search for a topic or user to display "
        		+ "a list of");

        favoriteLine23.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        favoriteLine23.setText("Tweets in the table. Then, select the "
        		+ "user whose");

        favoriteLine24.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        favoriteLine24.setText("favorites you want to see. From there, "
        		+ "select \"Show");

        favoriteLine25.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        favoriteLine25.setText("User Favorites\" from the \"Favorites\" "
        		+ "menu. This will");

        favoriteLine26.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        favoriteLine26.setText("display the list of the selected user's "
        		+ "favorite Tweets.");

        javax.swing.GroupLayout favoriteHelpContentPanelLayout = 
        		new javax.swing.GroupLayout(favoriteHelpContentPanel);
        favoriteHelpContentPanel.setLayout(favoriteHelpContentPanelLayout);
        favoriteHelpContentPanelLayout.setHorizontalGroup(
            favoriteHelpContentPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(favoriteHelpContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(favoriteHelpContentPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
                    		favoriteHelpContentPanelLayout.
                    		createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(favoriteHelpContentPanelLayout.
                        		createParallelGroup(javax.swing.
                        				GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.
                            		TRAILING, favoriteHelpContentPanelLayout.
                            		createSequentialGroup()
                                .addGroup(favoriteHelpContentPanelLayout.
                                		createParallelGroup(javax.swing.
                                				GroupLayout.Alignment.LEADING)
                                    .addComponent(favoriteLine8)
                                    .addComponent(favoriteLine9)
                                    .addComponent(favoriteLine10))
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.
                            		TRAILING, favoriteHelpContentPanelLayout.
                            		createSequentialGroup()
                                .addGroup(favoriteHelpContentPanelLayout.
                                		createParallelGroup(javax.swing.
                                				GroupLayout.Alignment.LEADING)
                                    .addComponent(favoriteLine12)
                                    .addComponent(favoriteLine13)
                                    .addComponent(favoriteLine14)
                                    .addComponent(favoriteLine15)
                                    .addComponent(favoriteLine16)
                                    .addComponent(favoriteLine17)
                                    .addComponent(favoriteLine18))
                                .addGap(77, 77, 77))))
                    .addGroup(favoriteHelpContentPanelLayout.
                    		createSequentialGroup()
                        .addGroup(favoriteHelpContentPanelLayout.
                        		createParallelGroup(javax.swing.
                        				GroupLayout.Alignment.LEADING)
                            .addComponent(favoriteLine2)
                            .addComponent(favoriteLine3)
                            .addComponent(favoriteLine4)
                            .addComponent(favoriteLine1)
                            .addComponent(favoriteLine5)
                            .addComponent(favoriteLine6)
                            .addComponent(favoriteLine7)
                            .addComponent(favoriteLine11)
                            .addComponent(favoriteLine19))
                        .addContainerGap())
                    .addGroup(favoriteHelpContentPanelLayout.
                    		createSequentialGroup()
                        .addGroup(favoriteHelpContentPanelLayout.
                        		createParallelGroup(javax.swing.
                        				GroupLayout.Alignment.LEADING)
                            .addComponent(favoriteLine20)
                            .addComponent(favoriteLine21)
                            .addComponent(favoriteLine22)
                            .addComponent(favoriteLine23)
                            .addComponent(favoriteLine24)
                            .addComponent(favoriteLine25)
                            .addComponent(favoriteLine26))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        favoriteHelpContentPanelLayout.setVerticalGroup(
            favoriteHelpContentPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(favoriteHelpContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(favoriteLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine7)
                .addGap(18, 18, 18)
                .addComponent(favoriteLine8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine10)
                .addGap(7, 7, 7)
                .addComponent(favoriteLine11)
                .addGap(18, 18, 18)
                .addComponent(favoriteLine12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine19)
                .addGap(18, 18, 18)
                .addComponent(favoriteLine20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(favoriteLine26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE))
        );

        favoriteHelpScrollPane.setViewportView(favoriteHelpContentPanel);

        helpContentTabbedPane.addTab("Favoriting Tweets", 
        		favoriteHelpScrollPane);

        blockUsersHelpContentPanel.setOpaque(false);
        blockUsersHelpContentPanel.setPreferredSize(new java.awt.
        		Dimension(435, 435));

        blockLine1.setFont(new java.awt.Font("Aharoni", 1, 24)); 
        blockLine1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        blockLine1.setText("Blocking a User:");

        blockLine6.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        blockLine6.setText("Select \"Show Blocked Users\" from the "
        		+ "\"Block\" menu. A list");

        blockLine3.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        blockLine3.setText("User\" from the \"Block\" menu. A window "
        		+ "will appear");

        blockLine4.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        blockLine4.setText("confirming that you have blocked a user.");

        blockLine5.setFont(new java.awt.Font("Aharoni", 1, 24)); 
        blockLine5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        blockLine5.setText("Viewing Your Blocked Users:");

        blockLine2.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        blockLine2.setText("First, select the user you wish to block. "
        		+ "Then, select \"Block");

        blockLine7.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        blockLine7.setText("of the users you have blocked will appear "
        		+ "in the table.");

        blockLine8.setFont(new java.awt.Font("Aharoni", 1, 24)); 
        blockLine8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        blockLine8.setText("Unblocking a User:");

        blockLine9.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        blockLine9.setText("First, view the users you have blocked by "
        		+ "selecting the");

        blockLine10.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        blockLine10.setText("\"Show Blocked Users\" from the \"Block\" "
        		+ "menu. From there,");

        blockLine11.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        blockLine11.setText("select the user you wish to unblock. Then "
        		+ "select \"Unblock");

        blockLine12.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        blockLine12.setText("User\" from the \"Block\" menu. A window will "
        		+ "appear");

        blockLine13.setFont(new java.awt.Font("Aharoni", 0, 14));
        blockLine13.setText("confirming that you have unblocked a user.");

        javax.swing.GroupLayout blockUsersHelpContentPanelLayout = 
        		new javax.swing.GroupLayout(blockUsersHelpContentPanel);
        blockUsersHelpContentPanel.setLayout(blockUsersHelpContentPanelLayout);
        blockUsersHelpContentPanelLayout.setHorizontalGroup(
            blockUsersHelpContentPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blockUsersHelpContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blockUsersHelpContentPanelLayout.
                		createParallelGroup(javax.swing.GroupLayout.Alignment.
                				LEADING)
                    .addComponent(blockLine6)
                    .addComponent(blockLine3)
                    .addComponent(blockLine4)
                    .addComponent(blockLine1)
                    .addComponent(blockLine5)
                    .addComponent(blockLine7)
                    .addComponent(blockLine8)
                    .addComponent(blockLine2)
                    .addComponent(blockLine9)
                    .addComponent(blockLine10)
                    .addComponent(blockLine11)
                    .addComponent(blockLine12)
                    .addComponent(blockLine13))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        blockUsersHelpContentPanelLayout.setVerticalGroup(
            blockUsersHelpContentPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blockUsersHelpContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blockLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(blockLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(blockLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(blockLine4)
                .addGap(18, 18, 18)
                .addComponent(blockLine5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(blockLine6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(blockLine7)
                .addGap(18, 18, 18)
                .addComponent(blockLine8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(blockLine9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(blockLine10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(blockLine11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(blockLine12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(blockLine13)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        helpContentTabbedPane.addTab("Blocking Users", 
        		blockUsersHelpContentPanel);

        reportUsersHelpContentPanel.setOpaque(false);
        reportUsersHelpContentPanel.setPreferredSize(new java.awt.
        		Dimension(435, 435));

        reportLine1.setFont(new java.awt.Font("Aharoni", 1, 24)); 
        reportLine1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reportLine1.setText("Reporting Users:");

        reportLine2.setFont(new java.awt.Font("Aharoni", 0, 14));
        reportLine2.setText("First, select the user you wish to report as "
        		+ "a spammer. Then,");

        reportLine3.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        reportLine3.setText("click the \"Report User\" button located above "
        		+ "the table. A");

        reportLine4.setFont(new java.awt.Font("Aharoni", 0, 14));
        reportLine4.setText("window will appear confirmig that you have " 
        		+ "reported a");

        reportLine5.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        reportLine5.setText("user.");

        javax.swing.GroupLayout reportUsersHelpContentPanelLayout = 
        		new javax.swing.GroupLayout(reportUsersHelpContentPanel);
        reportUsersHelpContentPanel.setLayout(
        		reportUsersHelpContentPanelLayout);
        reportUsersHelpContentPanelLayout.setHorizontalGroup(
            reportUsersHelpContentPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportUsersHelpContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reportUsersHelpContentPanelLayout.
                		createParallelGroup(javax.swing.GroupLayout.Alignment.
                				LEADING)
                    .addComponent(reportLine2)
                    .addComponent(reportLine3)
                    .addComponent(reportLine4)
                    .addComponent(reportLine1)
                    .addComponent(reportLine5))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        reportUsersHelpContentPanelLayout.setVerticalGroup(
            reportUsersHelpContentPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportUsersHelpContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(reportLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(reportLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(reportLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(reportLine5)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        helpContentTabbedPane.addTab("Reporting Users", 
        		reportUsersHelpContentPanel);

        javax.swing.GroupLayout helpMainPanelLayout = 
        		new javax.swing.GroupLayout(helpMainPanel);
        helpMainPanel.setLayout(helpMainPanelLayout);
        helpMainPanelLayout.setHorizontalGroup(
            helpMainPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
            		helpMainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE)
                .addComponent(helpMainLine2)
                .addGap(134, 134, 134))
            .addGroup(helpMainPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(helpMainLine1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE))
            .addGroup(helpMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(helpMainPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helpMainLine3, javax.swing.GroupLayout.
                    		DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 
                    		Short.MAX_VALUE)
                    .addComponent(helpMainLine4, javax.swing.GroupLayout.
                    		DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addComponent(helpMainLine5, javax.swing.GroupLayout.
                    		DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 
                    		Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(helpMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helpContentTabbedPane, javax.swing.GroupLayout.
                		PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        helpMainPanelLayout.setVerticalGroup(
            helpMainPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helpMainLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(helpMainLine2)
                .addGap(18, 18, 18)
                .addComponent(helpMainLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(helpMainLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(helpMainLine5)
                .addGap(18, 18, 18)
                .addComponent(helpContentTabbedPane, javax.swing.GroupLayout.
                		DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout helpFrameLayout = new javax.swing.GroupLayout(
        		helpFrame.getContentPane());
        helpFrame.getContentPane().setLayout(helpFrameLayout);
        helpFrameLayout.setHorizontalGroup(
            helpFrameLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(helpMainPanel, javax.swing.GroupLayout.
            		DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        helpFrameLayout.setVerticalGroup(
            helpFrameLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(helpMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 
            		610, Short.MAX_VALUE)
        );

        signUpDialog.setTitle("Switch Account");
        signUpDialog.setMinimumSize(new java.awt.Dimension(411, 375));
        signUpDialog.setResizable(false);

        signUpMainPanel.setBackground(new java.awt.Color(0, 204, 204));

        signUpPromptLabel.setFont(new java.awt.Font("Aharoni", 0, 14));
        signUpPromptLabel.setHorizontalAlignment(javax.swing.SwingConstants.
        		CENTER);
        signUpPromptLabel.setText("Please enter the following information to " 
        		+ "switch accounts:");

        suUsernameLabel.setFont(new java.awt.Font("Aharoni", 0, 12)); 
        suUsernameLabel.setText("Username:");

        suPasswordLabel.setFont(new java.awt.Font("Aharoni", 0, 12));
        suPasswordLabel.setText("Password:");

        signUpButton.setFont(new java.awt.Font("Aharoni", 0, 12)); 
        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        consumerKeyLabel.setFont(new java.awt.Font("Aharoni", 0, 12));
        consumerKeyLabel.setText("Consumer Key:");

        consumerSecretLabel.setFont(new java.awt.Font("Aharoni", 0, 12)); 
        consumerSecretLabel.setText("Consumer Secret:");

        accessTokenLabel.setFont(new java.awt.Font("Aharoni", 0, 12)); 
        accessTokenLabel.setText("Access Token:");

        accessTokenSecretLabel.setFont(new java.awt.Font("Aharoni", 0, 12)); 
        accessTokenSecretLabel.setText("Access Token Secret:");

        javax.swing.GroupLayout signUpMainPanelLayout = 
        		new javax.swing.GroupLayout(signUpMainPanel);
        signUpMainPanel.setLayout(signUpMainPanelLayout);
        signUpMainPanelLayout.setHorizontalGroup(
            signUpMainPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(signUpMainPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signUpMainPanelLayout.createSequentialGroup()
                        .addGroup(signUpMainPanelLayout.createParallelGroup(
                        		javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(signUpPromptLabel)
                            .addGroup(signUpMainPanelLayout.
                            		createSequentialGroup()
                                .addGroup(signUpMainPanelLayout.
                                		createParallelGroup(javax.swing.
                                				GroupLayout.Alignment.TRAILING)
                                    .addComponent(consumerSecretLabel)
                                    .addComponent(accessTokenLabel)
                                    .addComponent(accessTokenSecretLabel)
                                    .addComponent(suUsernameLabel)
                                    .addComponent(suPasswordLabel))
                                .addGap(18, 18, 18)
                                .addGroup(signUpMainPanelLayout.
                                		createParallelGroup(javax.swing.
                                				GroupLayout.Alignment.LEADING)
                                    .addComponent(suPasswordTextField, 
                                    		javax.swing.GroupLayout.Alignment.
                                    		TRAILING)
                                    .addComponent(consumerSecretTextField, 
                                    		javax.swing.GroupLayout.Alignment.
                                    		TRAILING)
                                    .addComponent(suUsernameTextField, 
                                    		javax.swing.GroupLayout.Alignment.
                                    		TRAILING)
                                    .addComponent(accessTokenSecretTextField, 
                                    		javax.swing.GroupLayout.Alignment.
                                    		TRAILING)
                                    .addComponent(accessTokenTextField, 
                                    		javax.swing.GroupLayout.Alignment.
                                    		TRAILING))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
                    		signUpMainPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(consumerKeyLabel)
                        .addGap(18, 18, 18)
                        .addComponent(consumerKeyTextField)
                        .addContainerGap())))
            .addGroup(signUpMainPanelLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(signUpButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        signUpMainPanelLayout.setVerticalGroup(
            signUpMainPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpMainPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(signUpPromptLabel)
                .addGap(18, 18, 18)
                .addGroup(signUpMainPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consumerKeyTextField, 
                    		javax.swing.GroupLayout.PREFERRED_SIZE, 
                    		javax.swing.GroupLayout.DEFAULT_SIZE, 
                    		javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consumerKeyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		UNRELATED)
                .addGroup(signUpMainPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consumerSecretTextField, 
                    		javax.swing.GroupLayout.PREFERRED_SIZE, 
                    		javax.swing.GroupLayout.DEFAULT_SIZE, 
                    		javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consumerSecretLabel))
                .addGap(14, 14, 14)
                .addGroup(signUpMainPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accessTokenTextField, 
                    		javax.swing.GroupLayout.PREFERRED_SIZE, 
                    		javax.swing.GroupLayout.DEFAULT_SIZE, 
                    		javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accessTokenLabel))
                .addGap(18, 18, 18)
                .addGroup(signUpMainPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accessTokenSecretTextField, 
                    		javax.swing.GroupLayout.PREFERRED_SIZE, 
                    		javax.swing.GroupLayout.DEFAULT_SIZE, 
                    		javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accessTokenSecretLabel))
                .addGap(18, 18, 18)
                .addGroup(signUpMainPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suUsernameTextField, 
                    		javax.swing.GroupLayout.PREFERRED_SIZE, 
                    		javax.swing.GroupLayout.DEFAULT_SIZE, 
                    		javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suUsernameLabel))
                .addGap(18, 18, 18)
                .addGroup(signUpMainPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suPasswordTextField, 
                    		javax.swing.GroupLayout.PREFERRED_SIZE, 
                    		javax.swing.GroupLayout.DEFAULT_SIZE,
                    		javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suPasswordLabel))
                .addGap(18, 18, 18)
                .addComponent(signUpButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE))
        );

        javax.swing.GroupLayout signUpDialogLayout = 
        		new javax.swing.GroupLayout(signUpDialog.getContentPane());
        signUpDialog.getContentPane().setLayout(signUpDialogLayout);
        signUpDialogLayout.setHorizontalGroup(
            signUpDialogLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpMainPanel, 
            		javax.swing.GroupLayout.Alignment.TRAILING, 
            		javax.swing.GroupLayout.DEFAULT_SIZE, 
            		javax.swing.GroupLayout.DEFAULT_SIZE,
            		Short.MAX_VALUE)
        );
        signUpDialogLayout.setVerticalGroup(
            signUpDialogLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpMainPanel, 
            		javax.swing.GroupLayout.PREFERRED_SIZE, 
            		javax.swing.GroupLayout.DEFAULT_SIZE, 
            		javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Twitter Desktop Application");
        setBackground(javax.swing.UIManager.getDefaults().
        		getColor("Menu.selectionBackground"));
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

        postTweetButton.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        postTweetButton.setText("Post Tweet");
        postTweetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                postTweetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createTweetPanelLayout = 
        		new javax.swing.GroupLayout(createTweetPanel);
        createTweetPanel.setLayout(createTweetPanelLayout);
        createTweetPanelLayout.setHorizontalGroup(
            createTweetPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createTweetPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(postTweetButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE))
            .addGroup(createTweetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enterTweetTextArea)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
            		createTweetPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE)
                .addComponent(enterTweetLabel)
                .addGap(97, 97, 97))
        );
        createTweetPanelLayout.setVerticalGroup(
            createTweetPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createTweetPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE)
                .addComponent(enterTweetLabel, 
                		javax.swing.GroupLayout.PREFERRED_SIZE, 29, 
                		javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		UNRELATED)
                .addComponent(enterTweetTextArea, 
                		javax.swing.GroupLayout.PREFERRED_SIZE, 96, 
                		javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		UNRELATED)
                .addComponent(postTweetButton, 
                		javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                		javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        searchTopicsButton.addActionListener(
        		new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                searchTopicsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchTopicsPanelLayout = 
        		new javax.swing.GroupLayout(searchTopicsPanel);
        searchTopicsPanel.setLayout(searchTopicsPanelLayout);
        searchTopicsPanelLayout.setHorizontalGroup(
            searchTopicsPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
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
            searchTopicsPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTopicsPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(searchTopicLabel)
                .addGap(18, 18, 18)
                .addComponent(searchTopicTextField, 
                		javax.swing.GroupLayout.PREFERRED_SIZE, 
                		javax.swing.GroupLayout.DEFAULT_SIZE, 
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
            searchPeoplePanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
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
            searchPeoplePanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPeoplePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(searchPeopleLabel)
                .addGap(18, 18, 18)
                .addComponent(searchPeopleTextField, 
                		javax.swing.GroupLayout.PREFERRED_SIZE, 
                		javax.swing.GroupLayout.DEFAULT_SIZE, 
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

        displayNameLabelContent.setFont(new java.awt.Font("Aharoni", 0, 18)); 
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

        myTweetsButton.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        myTweetsButton.setText("View My Tweets");
        myTweetsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                myTweetsButtonActionPerformed(evt);
            }
        });

        reportButton.setFont(new java.awt.Font("Aharoni", 0, 14)); 
        reportButton.setText("Report User");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profilePanelLayout = 
        		new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGroup(profilePanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(myTweetsButton)
                    .addComponent(reportButton))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addComponent(profileLabel)
                .addGap(1, 1, 1)
                .addGroup(profilePanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameLabelContent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(displayNameLabelContent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(followingLabel)
                    .addComponent(followingLabelContent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(followersLabel)
                    .addComponent(followersLabelContent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tweetLabel)
                    .addComponent(tweetContentLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE)
                .addComponent(reportButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		UNRELATED)
                .addComponent(myTweetsButton))
        );

        twitterPic.setIcon(new javax.swing.ImageIcon(getClass().
        		getResource("/view/twitterimage.jpg")));

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
            		DEFAULT_SIZE, 261, Short.MAX_VALUE)
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
            trendsFollowersPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trendsFollowersPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE)
                .addComponent(trendLabel)
                .addGap(1, 1, 1)
                .addComponent(trendsListScrollPane, 
                		javax.swing.GroupLayout.PREFERRED_SIZE, 211, 
                		javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(followerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
                		RELATED)
                .addComponent(followersListScrollPane, javax.swing.GroupLayout.
                		PREFERRED_SIZE, 223, javax.swing.GroupLayout.
                		PREFERRED_SIZE))
        );

        homeButton.setFont(new java.awt.Font("Aharoni", 0, 12));
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = 
        		new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tweetTableScrollPane, 
                    		javax.swing.GroupLayout.PREFERRED_SIZE, 656, 
                    		javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(
                        		javax.swing.GroupLayout.Alignment.LEADING, 
                        		false)
                            .addComponent(mainTabPane, 
                            		javax.swing.GroupLayout.PREFERRED_SIZE, 
                            		348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.
                            		TRAILING, mainPanelLayout.
                            		createSequentialGroup()
                                .addComponent(displayTweetText)
                                .addPreferredGap(javax.swing.LayoutStyle.
                                		ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(
                                		javax.swing.GroupLayout.Alignment.
                                		LEADING, false)
                                    .addComponent(followButton, 
                                    		javax.swing.GroupLayout.Alignment.
                                    		TRAILING, javax.swing.GroupLayout.
                                    		DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(deleteButton, javax.swing.
                                    		GroupLayout.DEFAULT_SIZE,
                                    		javax.swing.GroupLayout.
                                    		DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(retweetButton, 
                                    		javax.swing.GroupLayout.Alignment.
                                    		TRAILING, javax.swing.GroupLayout.
                                    		DEFAULT_SIZE, javax.swing.
                                    		GroupLayout.DEFAULT_SIZE, 
                                    		Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.
                        		ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(
                        		javax.swing.GroupLayout.Alignment.LEADING, 
                        		false)
                            .addComponent(twitterPic)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(profilePanel, 
                                		javax.swing.GroupLayout.DEFAULT_SIZE, 
                                		javax.swing.GroupLayout.DEFAULT_SIZE, 
                                		Short.MAX_VALUE)
                                .addGap(1, 1, 1)))))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trendsFollowersPanel, 
                    		javax.swing.GroupLayout.DEFAULT_SIZE, 
                    		javax.swing.GroupLayout.DEFAULT_SIZE, 
                    		Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                    		mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(homeButton,
                        		javax.swing.GroupLayout.PREFERRED_SIZE, 109, 
                        		javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(
            		javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, 
                		Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(
                		javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
                    		mainPanelLayout.createSequentialGroup()
                        .addComponent(homeButton, 
                        		javax.swing.GroupLayout.PREFERRED_SIZE, 34, 
                        		javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(trendsFollowersPanel, 
                        		javax.swing.GroupLayout.PREFERRED_SIZE, 
                        		javax.swing.GroupLayout.DEFAULT_SIZE, 
                        		javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
                    		mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(
                        		javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(mainTabPane, 
                                		javax.swing.GroupLayout.PREFERRED_SIZE,
                                		232, 
                                		javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(mainPanelLayout.createParallelGroup(
                                		javax.swing.GroupLayout.Alignment.
                                		LEADING, false)
                                    .addGroup(mainPanelLayout.
                                    		createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle
                                        		.ComponentPlacement.RELATED, 
                                        		javax.swing.GroupLayout.
                                        		DEFAULT_SIZE, 
                                        		Short.MAX_VALUE)
                                        .addComponent(followButton)
                                        .addPreferredGap(javax.swing
                                        		.LayoutStyle.ComponentPlacement.
                                        		UNRELATED)
                                        .addComponent(retweetButton)
                                        .addPreferredGap(javax.swing.
                                        		LayoutStyle.ComponentPlacement.
                                        		UNRELATED)
                                        .addComponent(deleteButton))
                                    .addGroup(mainPanelLayout.
                                    		createSequentialGroup()
                                        .addPreferredGap(javax.swing.
                                        		LayoutStyle.ComponentPlacement.
                                        		UNRELATED)
                                        .addComponent(displayTweetText, 
                                        		javax.swing.GroupLayout.
                                        		PREFERRED_SIZE, 
                                        		102, javax.swing.GroupLayout.
                                        		PREFERRED_SIZE))))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(twitterPic, 
                                		javax.swing.GroupLayout.PREFERRED_SIZE, 
                                		102, javax.swing.GroupLayout.
                                		PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(profilePanel, 
                                		javax.swing.GroupLayout.PREFERRED_SIZE, 
                                		javax.swing.GroupLayout.DEFAULT_SIZE, 
                                		javax.swing.GroupLayout.
                                		PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.
                        		ComponentPlacement.RELATED)
                        .addComponent(tweetTableScrollPane, 
                        		javax.swing.GroupLayout.PREFERRED_SIZE, 222, 
                        		javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

        accountMenu.setText("Account");

        signInMenuItem.setText("Sign In");
        signInMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                signInMenuItemActionPerformed(evt);
            }
        });
        accountMenu.add(signInMenuItem);

        signUpMenuItem.setText("Sign Up");
        signUpMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                signUpMenuItemActionPerformed(evt);
            }
        });
        accountMenu.add(signUpMenuItem);

        switchAccountMenuItem.setText("Switch Account");
        switchAccountMenuItem.addActionListener(
        		new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                switchAccountMenuItemActionPerformed(evt);
            }
        });
        accountMenu.add(switchAccountMenuItem);

        signOutMenuItem.setText("Sign Out");
        signOutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                signOutMenuItemActionPerformed(evt);
            }
        });
        accountMenu.add(signOutMenuItem);

        menubar.add(accountMenu);

        favoritesMenu.setText("Favorites");

        addFavoritesMenuItem.setText("Add to Favorites");
        addFavoritesMenuItem.addActionListener(
        		new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                addFavoritesMenuItemActionPerformed(evt);
            }
        });
        favoritesMenu.add(addFavoritesMenuItem);

        removeFavoritesMenuItem.setText("Remove from Favorites");
        removeFavoritesMenuItem.addActionListener(
        		new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                removeFavoritesMenuItemActionPerformed(evt);
            }
        });
        favoritesMenu.add(removeFavoritesMenuItem);

        showFavoritesMenuItem.setText("Show My Favorites");
        showFavoritesMenuItem.addActionListener(
        		new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                showFavoritesMenuItemActionPerformed(evt);
            }
        });
        favoritesMenu.add(showFavoritesMenuItem);

        showUserFavoritesMenuItem.setText("Show User Favorites");
        showUserFavoritesMenuItem.addActionListener(
        		new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                showUserFavoritesMenuItemActionPerformed(evt);
            }
        });
        favoritesMenu.add(showUserFavoritesMenuItem);

        menubar.add(favoritesMenu);

        blockMenu.setText("Block");

        blockUserMenuItem.setText("Block User");
        blockUserMenuItem.addActionListener(
        		new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                blockUserMenuItemActionPerformed(evt);
            }
        });
        blockMenu.add(blockUserMenuItem);

        unblockUserMenuItem.setText("Unblock User");
        unblockUserMenuItem.addActionListener(
        		new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                unblockUserMenuItemActionPerformed(evt);
            }
        });
        blockMenu.add(unblockUserMenuItem);

        showBlockedUsersMenuItem.setText("Show Blocked Users");
        showBlockedUsersMenuItem.addActionListener(
        		new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                showBlockedUsersMenuItemActionPerformed(evt);
            }
        });
        blockMenu.add(showBlockedUsersMenuItem);

        menubar.add(blockMenu);

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

        javax.swing.GroupLayout layout = 
        		new javax.swing.GroupLayout(getContentPane());
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
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 
            		javax.swing.GroupLayout.DEFAULT_SIZE, 
            		javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }
    /** Logger for Twitter4JGUI. */
    private static final Logger LOG = 
    		Logger.getLogger(Twitter4JGUI.class.getName());

    /**
     * Exits the application.
     * @param evt selecting Quit from the File menu
     */
    private void quitMenuItemActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    /**
     * Deletes the selected Tweet.
     * @param evt clicking the Delete button
     */
    private void deleteButtonActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            int index = tweetTable.getSelectedRow();
            if (index != -1) {
                long sid = engine.getTable().get(index).getId();
                engine.deleteTweet(sid);
            }
            JOptionPane.showMessageDialog(null, "You have successfully " 
            + "deleted a Tweet.");
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * Retweets the selected Tweet.
     * @param evt clicking the Retweet button
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
     * Follows the selected user.
     * @param evt clicking the Follow button
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
     * Displays the text of the selected Tweet in the table.
     * @param evt clicking a row in the table
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
     * searches for topics related to what the user specifies.
     * @param evt clicking the Search Topics button
     */
    private void searchTopicsButtonActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            engine.searchTweets(searchTopicTextField.getText());
            searchTopicTextField.setText(null);
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * searches for topics related to what the user specifies.
     * @param evt pressing <Enter> from the searchTopicTextField
     */
    private void searchTopicTextFieldActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            engine.searchTweets(searchTopicTextField.getText());
            searchTopicTextField.setText(null);
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * creates a new Tweet.
     * @param evt clicking the Post Tweet button
     */
    private void postTweetButtonActionPerformed(
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
     * searches for people based on what the user specifies.
     * @param evt pressing <Enter> from the searchPeopleTextField
     */
    private void searchPeopleTextFieldActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            engine.searchPeople(searchPeopleTextField.getText());
            searchPeopleTextField.setText(null);
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * searches for people based on what the user specifies.
     * @param evt clicking the Search People button
     */
    private void searchPeopleButtonActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            engine.searchPeople(searchPeopleTextField.getText());
            searchPeopleTextField.setText(null);
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * Searches for the selected topic. Results are displayed in the table.
     * @param evt clicking a row in the Trending Topics list
     */
    private void trendsListMouseClicked(final java.awt.event.MouseEvent evt) {
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
     * Displays the selected user's timeline in the table.
     * @param evt clicking a row in the Who To Follow list
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
     * Refreshes the Trending Topics and Who To Follow lists.
     * @param evt selecting Refresh in the File menu
     */
    private void refreshMenuItemActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            trendsList.setModel(engine.generateTrendingTopics());
            followersList.setModel(engine.generateSuggestedUsers());
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * displays the Help window.
     * @param evt selecting Get Help from the Help menu
     */
    private void getHelpMenuItemActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        helpFrame.setVisible(true);
    }

    /**
     * Shows the user's list of Tweets in the table.
     * @param evt clicking the View My Tweets button
     */
    private void myTweetsButtonActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            engine.showTimeLine();
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * Shows the current user's list of favorite Tweets in the table.
     * @param evt selecting Show My Favorites in the Favorites menu
     */
    private void showFavoritesMenuItemActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
                engine.showUserFavorites();
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * Shows the selected user's list of favorite Tweets in the table.
     * @param evt selecting Show User Favorites in the Favorites menu
     */
    private void showUserFavoritesMenuItemActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            int index = tweetTable.getSelectedRow();
            if (index != -1) {
                String sid = engine.getTable().get(index).getLoginName();
                engine.showUserFavorites(sid);
            }
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * Adds the selected Tweet to the current user's list of favorite Tweets.
     * @param evt selecting Add to Favorites in the Favorites menu
     */
    private void addFavoritesMenuItemActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            int index = tweetTable.getSelectedRow();
            if (index != -1) {
                long sid = engine.getTable().get(index).getId();
                engine.addFavorite(sid);
            }
            JOptionPane.showMessageDialog(null, 
            		"You have successfully added a favorite.");
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * Reports the selected user as a spammer.
     * @param evt clicking the Report User button
     */
    private void reportButtonActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            int index = tweetTable.getSelectedRow();
            if (index != -1) {
                String sid = engine.getTable().get(index).getLoginName();
                engine.reportSpam(sid);
            }
            JOptionPane.showMessageDialog(null, 
            		"You have successfully reported a user.");
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * Removes the selected Tweet from the current user's list of favorite
     * Tweets.
     * @param evt selecting Remove from Favorites in the Favorites menu
     */
    private void removeFavoritesMenuItemActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            int index = tweetTable.getSelectedRow();
            if (index != -1) {
                long sid = engine.getTable().get(index).getId();
                engine.deleteFavorite(sid);
            }
            JOptionPane.showMessageDialog(null, 
            		"You have successfully removed a favorite.");
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * Blocks the selected user.
     * @param evt selecting Block User from the Block menu
     */
    private void blockUserMenuItemActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            int index = tweetTable.getSelectedRow();
            if (index != -1) {
                String sid = engine.getTable().get(index).getLoginName();
                engine.blockUser(sid);
            }
            JOptionPane.showMessageDialog(null, 
            		"You have successfully blocked a user.");
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * Unblocks the selected user.
     * @param evt selecting Unblock User from the Block menu
     */
    private void unblockUserMenuItemActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            int index = tweetTable.getSelectedRow();
            if (index != -1) {
                String sid = engine.getTable().get(index).getLoginName();
                engine.unblockUser(sid);
            }
            JOptionPane.showMessageDialog(null, 
            		"You have successfully unblocked a user.");
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * Shows the current user's blocked users in the table.
     * @param evt selected Show Blocked Users in the Block menu
     */
    private void showBlockedUsersMenuItemActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
        	engine.showBlockedUsers();
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * displays the Home timeline of the current user.
     * @param evt clicking the Home button.
     */
    private void homeButtonActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try { 
            engine.showHomeTimeline();
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * signs in a user based on a username and password.
     * @param evt clicking the Sign In button
     */
    private void signInButtonActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            engine.switchAccount(siUsernameTextField.getText(), 
            		siPasswordTextField.getText());
            updateUserInformation();
            signInUNPWDialog.setVisible(false);
            trendsList.setModel(engine.generateTrendingTopics());
            followersList.setModel(engine.generateSuggestedUsers());
            siUsernameTextField.setText(null); 
            siPasswordTextField.setText(null); 
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * Signs up the user for the desktop application based on OAuth credentials
     * and a username and password.
     * @param evt clicking the Sign Up button
     */
    private void signUpButtonActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        try {
            engine.signUp(consumerKeyTextField.getText(), 
                    consumerSecretTextField.getText(), 
                    accessTokenTextField.getText(), 
                    accessTokenSecretTextField.getText(), 
                    suUsernameTextField.getText(), 
                    suPasswordTextField.getText());
            updateUserInformation();
            signUpDialog.setVisible(false);
            trendsList.setModel(engine.generateTrendingTopics());
            followersList.setModel(engine.generateSuggestedUsers());
            consumerKeyTextField.setText(null);
            consumerSecretTextField.setText(null); 
            accessTokenTextField.setText(null); 
            accessTokenSecretTextField.setText(null); 
            suUsernameTextField.setText(null); 
            suPasswordTextField.setText(null); 
        } catch (Exception ex) {
            displayError(ex);
        }
    }

    /**
     * Displays the Sign In window.
     * @param evt selecting Sign In from the Account menu
     */
    private void signInMenuItemActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        signInUNPWDialog.setVisible(true);
    }

    /**
     * Displays the Sign Up window.
     * @param evt selecting Sign Up from the Account menu
     */
    private void signUpMenuItemActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        signUpDialog.setVisible(true);
    }

    /**
     * displays the Sign In window.
     * @param evt selecting Switch Account from the Account menu
     */
    private void switchAccountMenuItemActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        signInUNPWDialog.setVisible(true);
    }

    /**
     * Signs out the current user. Sets all user information to "null". Also
     * clears the Trending Topics and Who To Follow lists, the table, and the
     * text area that displays Tweet contents.
     * @param evt selecting Sign Out from the Account menu
     */
    private void signOutMenuItemActionPerformed(
    		final java.awt.event.ActionEvent evt) {
        engine.signOut();
        updateUserInformation();
        trendsList.setModel(engine.generateTrendingTopics());
        followersList.setModel(engine.generateSuggestedUsers());
        displayTweetText.setText(null);
        engine.getTable().clear();
        tweetTable.setModel(engine.getTable());
    }
    
    /**
     * Updates the GUI profile information of the current user.
     */
    private void updateUserInformation() {
        nameLabelContent.setText(engine.getUserInformation()[0]);
        displayNameLabelContent.setText(engine.getUserInformation()[1]);
        followingLabelContent.setText(engine.getUserInformation()[2]);
        followersLabelContent.setText(engine.getUserInformation()[3]);
        tweetContentLabel.setText(engine.getUserInformation()[4]);
    }
    
    /**
     * displays any errors that might occur.
     * @param ex the Exception that is raised
     */
    private void displayError(final Exception ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage(), 
        		"Twitter4J Error", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info 
            		: javax.swing.UIManager.getInstalledLookAndFeels()) {
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
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new Twitter4JGUI().setVisible(true);
            }
        });
    }

    
    /** label for access token. */
    private javax.swing.JLabel accessTokenLabel;
    /** label for access token secret. */
    private javax.swing.JLabel accessTokenSecretLabel;
    /** text field for access token secret. */
    private javax.swing.JTextField accessTokenSecretTextField;
    /** text field for access token. */
    private javax.swing.JTextField accessTokenTextField;
    /** Account menu. */
    private javax.swing.JMenu accountMenu;
    /** menu item to add favorites. */
    private javax.swing.JMenuItem addFavoritesMenuItem;
    /** 1st line in blocking help. */
    private javax.swing.JLabel blockLine1;
    /** 10th line in blocking help. */
    private javax.swing.JLabel blockLine10;
    /** 11th line in blocking help. */
    private javax.swing.JLabel blockLine11;
    /** 12th line in blocking help. */
    private javax.swing.JLabel blockLine12;
    /** 13th line in blocking help. */
    private javax.swing.JLabel blockLine13;
    /** 2nd line in blocking help. */
    private javax.swing.JLabel blockLine2;
    /** 3rd line in blocking help. */
    private javax.swing.JLabel blockLine3;
    /** 4th line in blocking help. */
    private javax.swing.JLabel blockLine4;
    /** 5th line in blocking help. */
    private javax.swing.JLabel blockLine5;
    /** 6th line in blocking help. */
    private javax.swing.JLabel blockLine6;
    /** 7th line in blocking help. */
    private javax.swing.JLabel blockLine7;
    /** 8th line in blocking help. */
    private javax.swing.JLabel blockLine8;
    /** 9th line in blocking help. */
    private javax.swing.JLabel blockLine9;
    /** Block menu. */
    private javax.swing.JMenu blockMenu;
    /** menu item to block users. */
    private javax.swing.JMenuItem blockUserMenuItem;
    /** panel to hold help info about blocking. */
    private javax.swing.JPanel blockUsersHelpContentPanel;
    /** label for consumer key. */
    private javax.swing.JLabel consumerKeyLabel;
    /** text field for consumer key. */
    private javax.swing.JTextField consumerKeyTextField;
    /** label for consumer secret. */
    private javax.swing.JLabel consumerSecretLabel;
    /** text field consumer secret. */
    private javax.swing.JTextField consumerSecretTextField;
    /** panel to hold info about creating a Tweet. */
    private javax.swing.JPanel createTweetHelpContentPanel;
    /** 1st line in creating a Tweet help. */
    private javax.swing.JLabel createTweetLine1;
    /** 2nd line in creating a Tweet help. */
    private javax.swing.JLabel createTweetLine2;
    /** 3rd line in creating a Tweet help. */
    private javax.swing.JLabel createTweetLine3;
    /** 4th line in creating a Tweet help. */
    private javax.swing.JLabel createTweetLine4;
    /** 5th line in creating a Tweet help. */
    private javax.swing.JLabel createTweetLine5;
    /** 6th line in creating a Tweet help. */
    private javax.swing.JLabel createTweetLine6;
    /** panel for creating a Tweet. */
    private javax.swing.JPanel createTweetPanel;
    /** button to delete Tweets. */
    private javax.swing.JButton deleteButton;
    /** panel to hold info about deleting Tweets. */
    private javax.swing.JPanel deleteHelpContentPanel;
    /** 1stline in deleting help. */
    private javax.swing.JLabel deleteLine1;
    /** 2nd line in deleting help. */
    private javax.swing.JLabel deleteLine2;
    /** 3rd line in deleting help. */
    private javax.swing.JLabel deleteLine3;
    /** 4th line in deleting help. */
    private javax.swing.JLabel deleteLine4;
    /** 5th line in deleting help. */
    private javax.swing.JLabel deleteLine5;
    /** 6th line in deleting help. */
    private javax.swing.JLabel deleteLine6;
    /** label for user's display name. */
    private javax.swing.JLabel displayNameLabelContent;
    /** text area to display Tweet text. */
    private javax.swing.JTextArea displayTweetText;
    /** label for entering a Tweet. */
    private javax.swing.JLabel enterTweetLabel;
    /** text area for user to enter Tweet content. */
    private javax.swing.JTextArea enterTweetTextArea;
    /** panel to hold info about favoriting help. */
    private javax.swing.JPanel favoriteHelpContentPanel;
    /** scroll pane to hold favorite help. */
    private javax.swing.JScrollPane favoriteHelpScrollPane;
    /** 1st line in favoriting help. */
    private javax.swing.JLabel favoriteLine1;
    /** 10th line in favoriting help. */
    private javax.swing.JLabel favoriteLine10;
    /** 11th line in favoriting help. */
    private javax.swing.JLabel favoriteLine11;
    /** 12th line in favoriting help. */
    private javax.swing.JLabel favoriteLine12;
    /** 13th line in favoriting help. */
    private javax.swing.JLabel favoriteLine13;
    /** 14th line in favoriting help. */
    private javax.swing.JLabel favoriteLine14;
    /** 15th line in favoriting help. */
    private javax.swing.JLabel favoriteLine15;
    /** 16th line in favoriting help. */
    private javax.swing.JLabel favoriteLine16;
    /** 17th line in favoriting help. */
    private javax.swing.JLabel favoriteLine17;
    /** 18th line in favoriting help. */
    private javax.swing.JLabel favoriteLine18;
    /** 19th line in favoriting help. */
    private javax.swing.JLabel favoriteLine19;
    /** 2nd line in favoriting help. */
    private javax.swing.JLabel favoriteLine2;
    /** 20th line in favoriting help. */
    private javax.swing.JLabel favoriteLine20;
    /** 21th line in favoriting help. */
    private javax.swing.JLabel favoriteLine21;
    /** 22nd line in favoriting help. */
    private javax.swing.JLabel favoriteLine22;
    /** 23rd line in favoriting help. */
    private javax.swing.JLabel favoriteLine23;
    /** 24th line in favoriting help. */
    private javax.swing.JLabel favoriteLine24;
    /** 25th line in favoriting help. */
    private javax.swing.JLabel favoriteLine25;
    /** 26th line in favoriting help. */
    private javax.swing.JLabel favoriteLine26;
    /** 3rd line in favoriting help. */
    private javax.swing.JLabel favoriteLine3;
    /** 4th line in favoriting help. */
    private javax.swing.JLabel favoriteLine4;
    /** 5th line in favoriting help. */
    private javax.swing.JLabel favoriteLine5;
    /** 6th line in favoriting help. */
    private javax.swing.JLabel favoriteLine6;
    /** 7th line in favoriting help. */
    private javax.swing.JLabel favoriteLine7;
    /** 8th line in favoriting help. */
    private javax.swing.JLabel favoriteLine8;
    /** 9th line in favoriting help. */
    private javax.swing.JLabel favoriteLine9;
    /** Favorites Menu. */
    private javax.swing.JMenu favoritesMenu;
    /** File Menu. */
    private javax.swing.JMenu fileMenu;
    /** button for following users. */
    private javax.swing.JButton followButton;
    /** panel to hold help info about following. */
    private javax.swing.JPanel followHelpContentPanel;
    /** 1st line in following help. */
    private javax.swing.JLabel followLine1;
    /** 2nd line in following help. */
    private javax.swing.JLabel followLine2;
    /** 3rd line in following help. */
    private javax.swing.JLabel followLine3;
    /** 4th line in following help. */
    private javax.swing.JLabel followLine4;
    /** 5th line in following help. */
    private javax.swing.JLabel followLine5;
    /** 6th line in following help. */
    private javax.swing.JLabel followLine6;
    /** 7th line in following help. */
    private javax.swing.JLabel followLine7;
    /** 8th line in following help. */
    private javax.swing.JLabel followLine8;
    /** 9th line in following help. */
    private javax.swing.JLabel followLine9;
    /** label for list of suggested followers. */
    private javax.swing.JLabel followerLabel;
    /** label for number of followers. */
    private javax.swing.JLabel followersLabel;
    /** label for the actualy number of followers. */
    private javax.swing.JLabel followersLabelContent;
    /** list of suggested users to follow. */
    private javax.swing.JList followersList;
    /** scroll pane to hold list of suggested followers. */
    private javax.swing.JScrollPane followersListScrollPane;
    /** label for number of people user is following. */
    private javax.swing.JLabel followingLabel;
    /** label for the actual number of people user is following. */
    private javax.swing.JLabel followingLabelContent;
    /** menu item to show help window. */
    private javax.swing.JMenuItem getHelpMenuItem;
    /** tabbed pane for help window. */
    private javax.swing.JTabbedPane helpContentTabbedPane;
    /** window for help info. */
    private javax.swing.JFrame helpFrame;
    /** 1st line of main help info. */
    private javax.swing.JLabel helpMainLine1;
    /** 2nd line of main help info. */
    private javax.swing.JLabel helpMainLine2;
    /** 3rd line of main help info. */
    private javax.swing.JLabel helpMainLine3;
    /** 4th line of main help info. */
    private javax.swing.JLabel helpMainLine4;
    /** 5th line of main help info. */
    private javax.swing.JLabel helpMainLine5;
    /** main panel in help window. */
    private javax.swing.JPanel helpMainPanel;
    /** Help Menu. */
    private javax.swing.JMenu helpMenuBar;
    /** button to display home timeline. */
    private javax.swing.JButton homeButton;
    /** main panel for the application. */
    private javax.swing.JPanel mainPanel;
    /** tabbed pane for creating tweets, searching people, 
     * and searching users. */
    private javax.swing.JTabbedPane mainTabPane;
    /** menu bar to hold menus. */
    private javax.swing.JMenuBar menubar;
    /** button to display current user's Tweets. */
    private javax.swing.JButton myTweetsButton;
    /** label for the user's name. */
    private javax.swing.JLabel nameLabel;
    /** label to hold the actual user's name. */
    private javax.swing.JLabel nameLabelContent;
    /** button to create Tweets. */
    private javax.swing.JButton postTweetButton;
    /** label for the profile. */
    private javax.swing.JLabel profileLabel;
    /** panel to hold profile information. */
    private javax.swing.JPanel profilePanel;
    /** menu item to quit application. */
    private javax.swing.JMenuItem quitMenuItem;
    /** menu item to refresh Trending Topics and Suggested
     * Users lists. */
    private javax.swing.JMenuItem refreshMenuItem;
    /** menu item to remove a favorite. */
    private javax.swing.JMenuItem removeFavoritesMenuItem;
    /** button to report a user. */
    private javax.swing.JButton reportButton;
    /** 1st line in reporting help. */
    private javax.swing.JLabel reportLine1;
    /** 2nd line in reporting help. */
    private javax.swing.JLabel reportLine2;
    /** 3rd line in reporting help. */
    private javax.swing.JLabel reportLine3;
    /** 4th line in reporting help. */
    private javax.swing.JLabel reportLine4;
    /** 5th line in reporting help. */
    private javax.swing.JLabel reportLine5;
    /** panel to hold info on reporting users. */
    private javax.swing.JPanel reportUsersHelpContentPanel;
    /** button to retweet. */
    private javax.swing.JButton retweetButton;
    /** panel to hold info on retweeting. */
    private javax.swing.JPanel retweetHelpContentPanel;
    /** 1st line in retweeting help. */
    private javax.swing.JLabel retweetLine1;
    /** 2nd line in retweeting help. */
    private javax.swing.JLabel retweetLine2;
    /** 3rd line in retweeting help. */
    private javax.swing.JLabel retweetLine3;
    /** 4th line in retweeting help. */
    private javax.swing.JLabel retweetLine4;
    /** 5th line in retweeting help. */
    private javax.swing.JLabel retweetLine5;
    /** 6th line in retweeting help. */
    private javax.swing.JLabel retweetLine6;
    /** 7th line in retweeting help. */
    private javax.swing.JLabel retweetLine7;
    /** button to search people. */
    private javax.swing.JButton searchPeopleButton;
    /** label to prompt a user to search people. */
    private javax.swing.JLabel searchPeopleLabel;
    /** panel to hold searching people contents. */
    private javax.swing.JPanel searchPeoplePanel;
    /** text field for user to specify who to search. */
    private javax.swing.JTextField searchPeopleTextField;
    /** prompt for the user to search a topic. */
    private javax.swing.JLabel searchTopicLabel;
    /** text field for searching topics. */
    private javax.swing.JTextField searchTopicTextField;
    /** button to search topics. */
    private javax.swing.JButton searchTopicsButton;
    /** panel to hold help info about searching topics. */
    private javax.swing.JPanel searchTopicsHelpContentPanel;
    /** 1st line in search topics help. */
    private javax.swing.JLabel searchTopicsLine1;
    /** 2nd line in search topics help. */
    private javax.swing.JLabel searchTopicsLine2;
    /** 3rd line in search topics help. */
    private javax.swing.JLabel searchTopicsLine3;
    /** 4th line in search topics help. */
    private javax.swing.JLabel searchTopicsLine4;
    /** 5th line in search topics help. */
    private javax.swing.JLabel searchTopicsLine5;
    /** 6th line in search topics help. */
    private javax.swing.JLabel searchTopicsLine6;
    /** 7th line in search topics help. */
    private javax.swing.JLabel searchTopicsLine7;
    /** 8th line in search topics help. */
    private javax.swing.JLabel searchTopicsLine8;
    /** panel to hold searching topics components. */
    private javax.swing.JPanel searchTopicsPanel;
    /** panel to hold help info on searching users. */
    private javax.swing.JPanel searchUsersHelpContentPanel;
    /** 1st line in search users help. */
    private javax.swing.JLabel searchUsersLine1;
    /** 2nd line in search users help. */
    private javax.swing.JLabel searchUsersLine2;
    /** 3rd line in search users help. */
    private javax.swing.JLabel searchUsersLine3;
    /** 4th line in search users help. */
    private javax.swing.JLabel searchUsersLine4;
    /** 5th line in search users help. */
    private javax.swing.JLabel searchUsersLine5;
    /** 6th line in search users help. */
    private javax.swing.JLabel searchUsersLine6;
    /** menu item to show list of blocked users. */
    private javax.swing.JMenuItem showBlockedUsersMenuItem;
    /** menu item to show list of current users's favorite tweets. */
    private javax.swing.JMenuItem showFavoritesMenuItem;
    /** menu item to show list of selected users's favorite tweets. */
    private javax.swing.JMenuItem showUserFavoritesMenuItem;
    /** password label in sign in window. */
    private javax.swing.JLabel siPasswordLabel;
    /** password text field in sign in window. */
    private javax.swing.JTextField siPasswordTextField;
    /** username label in sign in window. */
    private javax.swing.JLabel siUsernameLabel;
    /** username text field in sign in window. */
    private javax.swing.JTextField siUsernameTextField;
    /** button to sign in. */
    private javax.swing.JButton signInButton;
    /** main panel for sign in window. */
    private javax.swing.JPanel signInMainPanel;
    /** menu item to sign in. */
    private javax.swing.JMenuItem signInMenuItem;
    /** prompt label for signing in. */
    private javax.swing.JLabel signInPromptLabel;
    /** dialog window for signing in. */
    private javax.swing.JDialog signInUNPWDialog;
    /** menu item to sign out. */
    private javax.swing.JMenuItem signOutMenuItem;
    /** button to sign up. */
    private javax.swing.JButton signUpButton;
    /** dialog window for signing up. */
    private javax.swing.JDialog signUpDialog;
    /** main panel of sign up window. */
    private javax.swing.JPanel signUpMainPanel;
    /** menu item to sign up. */
    private javax.swing.JMenuItem signUpMenuItem;
    /** prompt label to sign up. */ 
    private javax.swing.JLabel signUpPromptLabel;
    /** password label in sign up window. */
    private javax.swing.JLabel suPasswordLabel;
    /** password text field in sign up window. */
    private javax.swing.JTextField suPasswordTextField;
    /** username label in sign up window. */
    private javax.swing.JLabel suUsernameLabel;
    /** username text field in sign up window. */
    private javax.swing.JTextField suUsernameTextField;
    /** menu item to switch account. */
    private javax.swing.JMenuItem switchAccountMenuItem;
    /** label for trending topics. */
    private javax.swing.JLabel trendLabel;
    /** panel to hold trending topics and suggested users lists. */
    private javax.swing.JPanel trendsFollowersPanel;
    /** list for trending topics. */
    private javax.swing.JList trendsList;
    /** scroll pane for trending topics. */
    private javax.swing.JScrollPane trendsListScrollPane;
    /** label for actual number of tweets. */
    private javax.swing.JLabel tweetContentLabel;
    /** label for number of tweets. */
    private javax.swing.JLabel tweetLabel;
    /** table to display Tweets. */
    private javax.swing.JTable tweetTable;
    /** scroll pane for Tweet table. */
    private javax.swing.JScrollPane tweetTableScrollPane;
    /** picture of the word Twitter. */
    private javax.swing.JLabel twitterPic;
    /** menu item to unblock users. */
    private javax.swing.JMenuItem unblockUserMenuItem;
    /** label for the username. */
    private javax.swing.JLabel usernameLabel;
    /** 1st line of viewing timelines help. */
    private javax.swing.JLabel viewTimelineLine1;
    /** 10th line of viewing timelines help. */
    private javax.swing.JLabel viewTimelineLine10;
    /** 11th line of viewing timelines help. */
    private javax.swing.JLabel viewTimelineLine11;
    /** 12th line of viewing timelines help. */
    private javax.swing.JLabel viewTimelineLine12;
    /** 2nd line of viewing timelines help. */
    private javax.swing.JLabel viewTimelineLine2;
    /** 3rd line of viewing timelines help. */
    private javax.swing.JLabel viewTimelineLine3;
    /** 4th line of viewing timelines help. */
    private javax.swing.JLabel viewTimelineLine4;
    /** 5th line of viewing timelines help. */
    private javax.swing.JLabel viewTimelineLine5;
    /** 6th line of viewing timelines help. */
    private javax.swing.JLabel viewTimelineLine6;
    /** 7th line of viewing timelines help. */
    private javax.swing.JLabel viewTimelineLine7;
    /** 8th line of viewing timelines help. */
    private javax.swing.JLabel viewTimelineLine8;
    /** 9th line of viewing timelines help. */
    private javax.swing.JLabel viewTimelineLine9;
    /** panel to hold help info on viewing timelines. */
    private javax.swing.JPanel viewTimelinesHelpContentPanel;
    /** engine to interact with the data models. */
    private TwitterEngine engine;
}
