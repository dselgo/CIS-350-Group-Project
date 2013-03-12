/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.logging.Logger;
import javax.swing.*;
import controller.*;
import model.*;



/**
 * This class creates the user interface of the Twitter Desktop Applications
 * @author Morgan Heyboer
 */
public class Twitter4JGUI extends javax.swing.JFrame {

    /**
     * Creates new form Twitter4JGUI
     */
    public Twitter4JGUI() {
        engine = new TwitterEngine();
        initComponents();
    }

    /**
     * This method will initialize all the components for the GUI.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        followersList = new JList(engine.generateSuggestedUsers())
        ;
        menubar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        refreshMenuItem = new javax.swing.JMenuItem();
        quitMenuItem = new javax.swing.JMenuItem();
        helpMenuBar = new javax.swing.JMenu();
        getHelpMenuItem = new javax.swing.JMenuItem();

        switchAccountDialog.setTitle("Switch Account");
        switchAccountDialog.setMinimumSize(new java.awt.Dimension(400, 275));
        switchAccountDialog.setResizable(false);

        switchAccountPromptLabel.setText("Please enter the following information to switch accounts:");

        consumerKeyLabel.setText("Consumer Key:");

        consumerSecretLabel.setText("Consumer Secret:");

        accessTokenLabel.setText("Access Token:");

        accessTokenSecretLabel.setText("Access Token Secret:");

        switchAccountDialogButton.setText("OK");
        switchAccountDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchAccountDialogButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout switchAccountPanelLayout = new javax.swing.GroupLayout(switchAccountPanel);
        switchAccountPanel.setLayout(switchAccountPanelLayout);
        switchAccountPanelLayout.setHorizontalGroup(
            switchAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(switchAccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(switchAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(switchAccountPanelLayout.createSequentialGroup()
                        .addComponent(switchAccountPromptLabel)
                        .addGap(0, 84, Short.MAX_VALUE))
                    .addGroup(switchAccountPanelLayout.createSequentialGroup()
                        .addGroup(switchAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accessTokenSecretLabel)
                            .addComponent(accessTokenLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(consumerSecretLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(consumerKeyLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(switchAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consumerKeyTextField)
                            .addComponent(consumerSecretTextField)
                            .addComponent(accessTokenTextField)
                            .addComponent(accessTokenSecretTextField))))
                .addContainerGap())
            .addGroup(switchAccountPanelLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(switchAccountDialogButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        switchAccountPanelLayout.setVerticalGroup(
            switchAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(switchAccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(switchAccountPromptLabel)
                .addGap(18, 18, 18)
                .addGroup(switchAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consumerKeyLabel)
                    .addComponent(consumerKeyTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(switchAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consumerSecretLabel)
                    .addComponent(consumerSecretTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(switchAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accessTokenLabel)
                    .addComponent(accessTokenTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(switchAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accessTokenSecretLabel)
                    .addComponent(accessTokenSecretTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(switchAccountDialogButton))
        );

        javax.swing.GroupLayout switchAccountDialogLayout = new javax.swing.GroupLayout(switchAccountDialog.getContentPane());
        switchAccountDialog.getContentPane().setLayout(switchAccountDialogLayout);
        switchAccountDialogLayout.setHorizontalGroup(
            switchAccountDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, switchAccountDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(switchAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        switchAccountDialogLayout.setVerticalGroup(
            switchAccountDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, switchAccountDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(switchAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        helpFrame.setTitle("Help");
        helpFrame.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        helpFrame.setResizable(false);

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout closePanelLayout = new javax.swing.GroupLayout(closePanel);
        closePanel.setLayout(closePanelLayout);
        closePanelLayout.setHorizontalGroup(
            closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closePanelLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(closeButton)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        closePanelLayout.setVerticalGroup(
            closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeButton, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        mainHelpPanel.setBackground(new java.awt.Color(0, 240, 240));

        timelineLine1.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        timelineLine1.setText("Click the \"Show My Timeline\" button located in");

        timelineLine2.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        timelineLine2.setText("the middle of the screen. This will display");

        timelineLine3.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        timelineLine3.setText("your timeline in the table at the bottom of the");

        timelineLine4.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        timelineLine4.setText("window. From the table, you can click on any");

        timelineLine5.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        timelineLine5.setText("row and the content of your tweet will appear");

        timelineLine6.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        timelineLine6.setText("in the white area above the table");

        timelineHeading.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        timelineHeading.setForeground(new java.awt.Color(255, 255, 255));
        timelineHeading.setText("How to View Your Timeline");

        searchUserHeading.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        searchUserHeading.setForeground(new java.awt.Color(255, 255, 255));
        searchUserHeading.setText("How to Search For Users");

        searchUserLine1.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        searchUserLine1.setText("First, click on the \"Search People\" tab located");

        searchUserLine2.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        searchUserLine2.setText("near the top of the window. In the white space,");

        searchUserLine3.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        searchUserLine3.setText("type the name of the person you would like to");

        searchUserLine4.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        searchUserLine4.setText("search and hit <Enter> or click the button");

        searchUserLine5.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        searchUserLine5.setText("\"Search People\". A list of users will be displayed");

        searchUserLine6.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        searchUserLine6.setText("in the table at the bottom. ");

        searchTopicHeading.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        searchTopicHeading.setForeground(new java.awt.Color(255, 255, 255));
        searchTopicHeading.setText("How to Search For Topics");

        searchTopicLine1.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        searchTopicLine1.setText("First, click on the \"Search Topics\" tab located");

        searchTopicLine2.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        searchTopicLine2.setText("near the top of the window. In the white space,");

        searchTopicLine3.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        searchTopicLine3.setText("type the topic you would like to search and ");

        searchTopicLine4.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        searchTopicLine4.setText("hit <Enter> or click the button \"Search Topics\".");

        searchTopicLine8.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        searchTopicLine8.setText("topic will be displayed in the table at the");

        searchTopicLine9.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        searchTopicLine9.setText("bottom.");

        retweetHeading.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        retweetHeading.setForeground(new java.awt.Color(255, 255, 255));
        retweetHeading.setText("How to Retweet");

        retweetLine1.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        retweetLine1.setText("First, search for a topic or user to get a list of");

        retweetLine2.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        retweetLine2.setText("Tweets displayed in the table at the bottom of");

        retweetLine3.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        retweetLine3.setText("the window. Click on the Login Name of the ");

        retweetLine4.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        retweetLine4.setText("Tweet to highlight it, then click the \"Retweet\"");

        retweetLine5.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        retweetLine5.setText("button located above the table. The Tweet that");

        retweetLine6.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        retweetLine6.setText("you retweeted will now be displayed in the");

        followHeading.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        followHeading.setForeground(new java.awt.Color(255, 255, 255));
        followHeading.setText("How to Follow Users");

        followLine1.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        followLine1.setText("First, search for a topic or user to get a list of");

        followLine2.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        followLine2.setText("Tweets displayed in the table at the bottom of");

        followLine3.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        followLine3.setText("the window. Click on the Login Name of the a");

        followLine4.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        followLine4.setText("Tweet to highlight it, then click the \"Follow\"");

        followLine5.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        followLine5.setText("button located above the table. You can also");

        followLine6.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        followLine6.setText("click on the name of a user from the Suggested");

        followLine7.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        followLine7.setText("Users list located in the bottom right corner of the");

        followLine8.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        followLine8.setText("window. It will display that user's timeline. You");

        followLine9.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        followLine9.setText("can then click on any Tweet and click the \"Follow\" ");

        followLine10.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        followLine10.setText("button. A window will appear confirming that ");

        followLine11.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        followLine11.setText("you have followed a user.");

        searchTopicLine5.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        searchTopicLine5.setText("You can also click on one of the Trending Topics");

        searchTopicLine6.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        searchTopicLine6.setText("from the list located in the upper right corner");

        searchTopicLine7.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        searchTopicLine7.setText("of the window. A list of Tweets related to that");

        createTweetHeading.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        createTweetHeading.setForeground(new java.awt.Color(255, 255, 255));
        createTweetHeading.setText("How to Create a Tweet");

        createTweetLine1.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        createTweetLine1.setText("Click the \"Compose a Tweet\" tab at the top of the");

        createTweetLine2.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        createTweetLine2.setText("window. Type what you want your Tweet to say");

        createTweetLine3.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        createTweetLine3.setText("in the white space and then hit <Enter> or click");

        createTweetLine4.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        createTweetLine4.setText("the \"Update\" button. You window will appear");

        createTweetLine5.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        createTweetLine5.setText("confirming that you created a new Tweet.");

        retweetLine7.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        retweetLine7.setText("table.");

        javax.swing.GroupLayout mainHelpPanelLayout = new javax.swing.GroupLayout(mainHelpPanel);
        mainHelpPanel.setLayout(mainHelpPanelLayout);
        mainHelpPanelLayout.setHorizontalGroup(
            mainHelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainHelpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainHelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainHelpPanelLayout.setVerticalGroup(
            mainHelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainHelpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createTweetHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createTweetLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createTweetLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createTweetLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createTweetLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createTweetLine5)
                .addGap(18, 18, 18)
                .addComponent(timelineHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timelineLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timelineLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timelineLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timelineLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timelineLine5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timelineLine6)
                .addGap(18, 18, 18)
                .addComponent(searchUserHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchUserLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchUserLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchUserLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchUserLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchUserLine5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchUserLine6)
                .addGap(18, 18, 18)
                .addComponent(searchTopicHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTopicLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTopicLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTopicLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTopicLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTopicLine5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTopicLine6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTopicLine7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTopicLine8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTopicLine9)
                .addGap(18, 18, 18)
                .addComponent(retweetHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retweetLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retweetLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retweetLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retweetLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retweetLine5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retweetLine6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retweetLine7)
                .addGap(18, 18, 18)
                .addComponent(followHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(followLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(followLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(followLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(followLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(followLine5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(followLine6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(followLine7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(followLine8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(followLine9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(followLine10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(followLine11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        helpScrollPane.setViewportView(mainHelpPanel);

        javax.swing.GroupLayout helpFrameLayout = new javax.swing.GroupLayout(helpFrame.getContentPane());
        helpFrame.getContentPane().setLayout(helpFrameLayout);
        helpFrameLayout.setHorizontalGroup(
            helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(helpScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
        );
        helpFrameLayout.setVerticalGroup(
            helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpFrameLayout.createSequentialGroup()
                .addGap(0, 531, Short.MAX_VALUE)
                .addComponent(closePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(helpFrameLayout.createSequentialGroup()
                    .addComponent(helpScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 35, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Twitter Desktop Application");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.selectionBackground"));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 204, 204));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(0, 204, 204));

        mainTabPane.setBackground(new java.awt.Color(0, 204, 204));

        enterTweetLabel.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        enterTweetLabel.setText("Enter your Tweet:");

        enterTweetTextArea.setColumns(20);
        enterTweetTextArea.setLineWrap(true);
        enterTweetTextArea.setRows(5);
        tweetTextArea.setViewportView(enterTweetTextArea);

        updateButton.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createTweetPanelLayout = new javax.swing.GroupLayout(createTweetPanel);
        createTweetPanel.setLayout(createTweetPanelLayout);
        createTweetPanelLayout.setHorizontalGroup(
            createTweetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createTweetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tweetTextArea)
                .addContainerGap())
            .addGroup(createTweetPanelLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createTweetPanelLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(enterTweetLabel)
                .addGap(96, 96, 96))
        );
        createTweetPanelLayout.setVerticalGroup(
            createTweetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createTweetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enterTweetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tweetTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        mainTabPane.addTab("Compose a Tweet", createTweetPanel);

        searchTopicLabel.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        searchTopicLabel.setText("Search for:");

        searchTopicTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTopicTextFieldActionPerformed(evt);
            }
        });

        searchTopicsButton.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        searchTopicsButton.setText("Search Topics");
        searchTopicsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTopicsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchTopicsPanelLayout = new javax.swing.GroupLayout(searchTopicsPanel);
        searchTopicsPanel.setLayout(searchTopicsPanelLayout);
        searchTopicsPanelLayout.setHorizontalGroup(
            searchTopicsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTopicsPanelLayout.createSequentialGroup()
                .addGroup(searchTopicsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            searchTopicsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTopicsPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(searchTopicLabel)
                .addGap(18, 18, 18)
                .addComponent(searchTopicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchTopicsButton)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        mainTabPane.addTab("Search Topics", searchTopicsPanel);

        searchPeopleLabel.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        searchPeopleLabel.setText("Search for:");

        searchPeopleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPeopleTextFieldActionPerformed(evt);
            }
        });

        searchPeopleButton.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        searchPeopleButton.setText("Search People");
        searchPeopleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPeopleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPeoplePanelLayout = new javax.swing.GroupLayout(searchPeoplePanel);
        searchPeoplePanel.setLayout(searchPeoplePanelLayout);
        searchPeoplePanelLayout.setHorizontalGroup(
            searchPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPeoplePanelLayout.createSequentialGroup()
                .addGroup(searchPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            searchPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPeoplePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(searchPeopleLabel)
                .addGap(18, 18, 18)
                .addComponent(searchPeopleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchPeopleButton)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        mainTabPane.addTab("Search People", searchPeoplePanel);

        profilePanel.setBackground(new java.awt.Color(0, 204, 204));

        profileLabel.setFont(new java.awt.Font("Aharoni", 3, 24)); // NOI18N
        profileLabel.setForeground(new java.awt.Color(255, 255, 255));
        profileLabel.setText("PROFILE:");

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name:");

        usernameLabel.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username:");

        followingLabel.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        followingLabel.setForeground(new java.awt.Color(255, 255, 255));
        followingLabel.setText("Following:");

        followersLabel.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        followersLabel.setForeground(new java.awt.Color(255, 255, 255));
        followersLabel.setText("Followers:");

        nameLabelContent.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        nameLabelContent.setForeground(new java.awt.Color(255, 255, 255));
        nameLabelContent.setText(engine.getUserInformation()[0]);

        displayNameLabelContent.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        displayNameLabelContent.setForeground(new java.awt.Color(255, 255, 255));
        displayNameLabelContent.setText(engine.getUserInformation()[1]);

        followingLabelContent.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        followingLabelContent.setForeground(new java.awt.Color(255, 255, 255));
        followingLabelContent.setText(engine.getUserInformation()[2]);

        followersLabelContent.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        followersLabelContent.setForeground(new java.awt.Color(255, 255, 255));
        followersLabelContent.setText(engine.getUserInformation()[3]);

        tweetLabel.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        tweetLabel.setForeground(new java.awt.Color(255, 255, 255));
        tweetLabel.setText("Tweets:");

        tweetContentLabel.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        tweetContentLabel.setForeground(new java.awt.Color(255, 255, 255));
        tweetContentLabel.setText(engine.getUserInformation()[4]);

        timelineButton.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        timelineButton.setText("View My Timeline");
        timelineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timelineButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameLabelContent))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(usernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayNameLabelContent))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(followingLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(followingLabelContent))
                    .addComponent(profileLabel)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(followersLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(followersLabelContent))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(tweetLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tweetContentLabel))
                    .addComponent(timelineButton))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addComponent(profileLabel)
                .addGap(1, 1, 1)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameLabelContent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(displayNameLabelContent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(followingLabel)
                    .addComponent(followingLabelContent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(followersLabel)
                    .addComponent(followersLabelContent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tweetLabel)
                    .addComponent(tweetContentLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timelineButton))
        );

        twitterPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/twitterimage.jpg"))); // NOI18N

        switchAccountButton.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        switchAccountButton.setText("Switch Account");
        switchAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchAccountButtonActionPerformed(evt);
            }
        });

        tweetTable.getTableHeader().setReorderingAllowed(false);
        tweetTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tweetTableMouseClicked(evt);
            }
        });
        tweetTableScrollPane.setViewportView(tweetTable);

        displayTweetText.setColumns(20);
        displayTweetText.setLineWrap(true);
        displayTweetText.setRows(5);

        followButton.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        followButton.setText("Follow");
        followButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                followButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        retweetButton.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        retweetButton.setText("Retweet");
        retweetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retweetButtonActionPerformed(evt);
            }
        });

        trendsFollowersPanel.setBackground(new java.awt.Color(255, 255, 255));
        trendsFollowersPanel.setOpaque(false);

        trendLabel.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        trendLabel.setForeground(new java.awt.Color(255, 255, 255));
        trendLabel.setText("TOP TRENDS");

        followerLabel.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        followerLabel.setForeground(new java.awt.Color(255, 255, 255));
        followerLabel.setText("WHO TO FOLLOW");

        trendsList.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        trendsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trendsListMouseClicked(evt);
            }
        });
        trendsListScrollPane.setViewportView(trendsList);

        followersList.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        followersList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                followersListMouseClicked(evt);
            }
        });
        followersListScrollPane.setViewportView(followersList);

        javax.swing.GroupLayout trendsFollowersPanelLayout = new javax.swing.GroupLayout(trendsFollowersPanel);
        trendsFollowersPanel.setLayout(trendsFollowersPanelLayout);
        trendsFollowersPanelLayout.setHorizontalGroup(
            trendsFollowersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(trendsListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(followersListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(trendsFollowersPanelLayout.createSequentialGroup()
                .addGroup(trendsFollowersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trendLabel)
                    .addComponent(followerLabel))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        trendsFollowersPanelLayout.setVerticalGroup(
            trendsFollowersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trendsFollowersPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(trendLabel)
                .addGap(1, 1, 1)
                .addComponent(trendsListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(followerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(followersListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tweetTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mainTabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(displayTweetText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(retweetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(followButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(twitterPic)
                            .addComponent(profilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trendsFollowersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(switchAccountButton)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(mainTabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(retweetButton))
                                    .addComponent(followButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteButton))
                            .addComponent(displayTweetText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tweetTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(switchAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trendsFollowersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(twitterPic, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(profilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(228, 228, 228)))
                .addGap(761, 761, 761))
        );

        fileMenu.setText("File");

        refreshMenuItem.setText("Refresh");
        refreshMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(refreshMenuItem);

        quitMenuItem.setText("Quit");
        quitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(quitMenuItem);

        menubar.add(fileMenu);

        helpMenuBar.setText("Help");

        getHelpMenuItem.setText("Get Help");
        helpMenuBar.add(getHelpMenuItem);

        menubar.add(helpMenuBar);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private static final Logger LOG = Logger.getLogger(Twitter4JGUI.class.getName());

    /**
     * When the Quit menu item is clicked, the window will close.
     */
    private void quitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitMenuItemActionPerformed

    /**
     * When the delete button is clicked, the Tweet selected will be deleted.
     * @param evt
     */
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            int index = tweetTable.getSelectedRow();
            if (index != -1){
                long sid = engine.getTable().get(index).getId();
                engine.deleteTweet(sid);
            }
            JOptionPane.showMessageDialog(null, "You have successfully deleted a Tweet.");
        } catch (Exception ex){
            displayError(ex);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    /**
     * When the retweet button is clicked, the selected Tweet is retweeted.
     * @param evt
     */
    private void retweetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retweetButtonActionPerformed
        try {
            int index = tweetTable.getSelectedRow();
            if (index != -1){
                long sid = engine.getTable().get(index).getId();
                engine.retweet(sid);
            }
            JOptionPane.showMessageDialog(null, "You have successfully retweeted.");
        } catch (Exception ex){
            displayError(ex);
        }
    }//GEN-LAST:event_retweetButtonActionPerformed

    /**
     * When the follow button is clicked, the current user is now a follower of the selected user.
     * @param evt
     */
    private void followButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_followButtonActionPerformed
        try{
            int index = tweetTable.getSelectedRow();
            if (index != -1){
                long id = engine.getTable().get(index).getId();
                engine.followUser(id);
            }
            JOptionPane.showMessageDialog(null, "You have successfully followed a new user.");
        } catch (Exception ex){
            displayError(ex);
        }
    }//GEN-LAST:event_followButtonActionPerformed

    /**
     * When a row of the tweetTable is clicked, the text of the Tweet is displayed.
     * @param evt
     */
    private void tweetTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tweetTableMouseClicked
        try{
            int index = tweetTable.getSelectedRow();
            if (index != -1) {
                Tweet t = engine.getTable().get(index);
                displayTweetText.setText(t.getText());
            }
        } catch (Exception ex){
            displayError(ex);
        }
    }//GEN-LAST:event_tweetTableMouseClicked

    /**
     * When the Switch Account button is clicked, a new window appears, asking for information to switch accounts.
     * @param evt
     */
    private void switchAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchAccountButtonActionPerformed
        switchAccountDialog.setVisible(true);
    }//GEN-LAST:event_switchAccountButtonActionPerformed

    /**
     * When the Search Topics button is clicked, the Engine will call the searchTweets method and Tweets related to the search will be displayed.
     * @param evt
     */
    private void searchTopicsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTopicsButtonActionPerformed
        try {
            engine.searchTweets(searchTopicTextField.getText());
        } catch (Exception ex){
            displayError(ex);
        }
    }//GEN-LAST:event_searchTopicsButtonActionPerformed

    /**
     * In this method, the Engine will call the searchTweets method and Tweets related to the search will be displayed.
     * @param evt
     */
    private void searchTopicTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTopicTextFieldActionPerformed
        try{
            engine.searchTweets(searchTopicTextField.getText());
        } catch (Exception ex){
            displayError(ex);
        }
    }//GEN-LAST:event_searchTopicTextFieldActionPerformed

    /**
     * When the update button is clicked, a new Tweet is created.
     * @param evt
     */
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            engine.updateStatus(enterTweetTextArea.getText());
            enterTweetTextArea.setText(null);
            JOptionPane.showMessageDialog(null, "You have successfully created a Tweet.");
        } catch (Exception ex){
            displayError(ex);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    /**
     * In this method, the Engine will call the searchTweets method and Tweets related to the search will be displayed.
     * @param evt
     */
    private void searchPeopleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPeopleTextFieldActionPerformed
        try{
            engine.searchPeople(searchPeopleTextField.getText());
        } catch (Exception ex){
            displayError(ex);
        }
    }//GEN-LAST:event_searchPeopleTextFieldActionPerformed

    /**
     * When the Search People button is clicked, the Engine will call the searchUsers method and the most recent Tweet of all related users will be displayed.
     * @param evt
     */
    private void searchPeopleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPeopleButtonActionPerformed
        try{
            engine.searchPeople(searchPeopleTextField.getText());
        } catch (Exception ex){
            displayError(ex);
        }
    }//GEN-LAST:event_searchPeopleButtonActionPerformed

    /**
     * When the Show My Timeline button is clicked, the current user's timeline is displayed in the table.
     * @param evt
     */
    private void timelineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timelineButtonActionPerformed
        try{
            engine.showTimeLine();
        } catch (Exception ex){
            displayError(ex);
        }
    }//GEN-LAST:event_timelineButtonActionPerformed

    /**
     * When this button is clicked, the information from the text boxes is used to switch the account.
     * @param evt
     */
    private void switchAccountDialogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchAccountDialogButtonActionPerformed
        try{
            String consumerKey = consumerKeyTextField.getText();
            String consumerSecret = consumerSecretTextField.getText();
            String accessToken = accessTokenTextField.getText();
            String accessTokenSecret = accessTokenSecretTextField.getText();
            engine.switchAccount(consumerKey, consumerSecret, accessToken, accessTokenSecret);
            updateUserInformation();
            switchAccountDialog.setVisible(false);
        } catch (Exception ex){
            displayError(ex);
        }
    }//GEN-LAST:event_switchAccountDialogButtonActionPerformed

    /**
     * When a row is clicked in the Trends list, a search of that trend is displayed in the table.
     * @param evt
     */
    private void trendsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trendsListMouseClicked
        try{
            int index = trendsList.getSelectedIndex();
            if (index != -1) {
                engine.searchTweets(engine.getTrends().getElementAt(index));
            }
        } catch (Exception ex){
            displayError(ex);
        }
    }//GEN-LAST:event_trendsListMouseClicked

    /**
     * When a row is clicked in the Suggested Followers list, the timeline of that user is displayed in the table.
     * @param evt
     */
    private void followersListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_followersListMouseClicked
        try{
            int index = followersList.getSelectedIndex();
            if (index != -1) {
                engine.showTimeLine(engine.getUsers().getElementAt(index));
            }
        } catch (Exception ex){
            displayError(ex);
        }
    }//GEN-LAST:event_followersListMouseClicked

    /**
     * When the refresh menu item is clicked, the trending topics and suggested followers lists will be refreshed.
     * @param evt
     */
    private void refreshMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshMenuItemActionPerformed
        try{
            trendsList = new JList(engine.generateTrendingTopics());
            followersList = new JList(engine.generateSuggestedUsers());
        } catch (Exception ex){
            displayError(ex);
        }
    }//GEN-LAST:event_refreshMenuItemActionPerformed

    /**
     * When the close button is clicked, the help window is closed.
     * @param evt
     */
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        helpFrame.setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed
    
    /**
     * This updates the current user's profile information in the GUI.
     */
    private void updateUserInformation(){
        nameLabelContent.setText(engine.getUserInformation()[0]);
        displayNameLabelContent.setText(engine.getUserInformation()[1]);
        followingLabelContent.setText(engine.getUserInformation()[2]);
        followersLabelContent.setText(engine.getUserInformation()[3]);
        tweetContentLabel.setText(engine.getUserInformation()[4]);
    }
    
    /**
     * This method displays an error.
     * @param ex
     */
    private void displayError(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Twitter4J Error", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Twitter4JGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Twitter4JGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Twitter4JGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Twitter4JGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Twitter4JGUI().setVisible(true);
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "An error has occurred.");
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accessTokenLabel;
    private javax.swing.JLabel accessTokenSecretLabel;
    private javax.swing.JTextField accessTokenSecretTextField;
    private javax.swing.JTextField accessTokenTextField;
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel closePanel;
    private javax.swing.JLabel consumerKeyLabel;
    private javax.swing.JTextField consumerKeyTextField;
    private javax.swing.JLabel consumerSecretLabel;
    private javax.swing.JTextField consumerSecretTextField;
    private javax.swing.JLabel createTweetHeading;
    private javax.swing.JLabel createTweetLine1;
    private javax.swing.JLabel createTweetLine2;
    private javax.swing.JLabel createTweetLine3;
    private javax.swing.JLabel createTweetLine4;
    private javax.swing.JLabel createTweetLine5;
    private javax.swing.JPanel createTweetPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel displayNameLabelContent;
    private javax.swing.JTextArea displayTweetText;
    private javax.swing.JLabel enterTweetLabel;
    private javax.swing.JTextArea enterTweetTextArea;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton followButton;
    private javax.swing.JLabel followHeading;
    private javax.swing.JLabel followLine1;
    private javax.swing.JLabel followLine10;
    private javax.swing.JLabel followLine11;
    private javax.swing.JLabel followLine2;
    private javax.swing.JLabel followLine3;
    private javax.swing.JLabel followLine4;
    private javax.swing.JLabel followLine5;
    private javax.swing.JLabel followLine6;
    private javax.swing.JLabel followLine7;
    private javax.swing.JLabel followLine8;
    private javax.swing.JLabel followLine9;
    private javax.swing.JLabel followerLabel;
    private javax.swing.JLabel followersLabel;
    private javax.swing.JLabel followersLabelContent;
    private javax.swing.JList followersList;
    private javax.swing.JScrollPane followersListScrollPane;
    private javax.swing.JLabel followingLabel;
    private javax.swing.JLabel followingLabelContent;
    private javax.swing.JMenuItem getHelpMenuItem;
    private javax.swing.JFrame helpFrame;
    private javax.swing.JMenu helpMenuBar;
    private javax.swing.JScrollPane helpScrollPane;
    private javax.swing.JPanel mainHelpPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTabbedPane mainTabPane;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabelContent;
    private javax.swing.JLabel profileLabel;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JMenuItem quitMenuItem;
    private javax.swing.JMenuItem refreshMenuItem;
    private javax.swing.JButton retweetButton;
    private javax.swing.JLabel retweetHeading;
    private javax.swing.JLabel retweetLine1;
    private javax.swing.JLabel retweetLine2;
    private javax.swing.JLabel retweetLine3;
    private javax.swing.JLabel retweetLine4;
    private javax.swing.JLabel retweetLine5;
    private javax.swing.JLabel retweetLine6;
    private javax.swing.JLabel retweetLine7;
    private javax.swing.JButton searchPeopleButton;
    private javax.swing.JLabel searchPeopleLabel;
    private javax.swing.JPanel searchPeoplePanel;
    private javax.swing.JTextField searchPeopleTextField;
    private javax.swing.JLabel searchTopicHeading;
    private javax.swing.JLabel searchTopicLabel;
    private javax.swing.JLabel searchTopicLine1;
    private javax.swing.JLabel searchTopicLine2;
    private javax.swing.JLabel searchTopicLine3;
    private javax.swing.JLabel searchTopicLine4;
    private javax.swing.JLabel searchTopicLine5;
    private javax.swing.JLabel searchTopicLine6;
    private javax.swing.JLabel searchTopicLine7;
    private javax.swing.JLabel searchTopicLine8;
    private javax.swing.JLabel searchTopicLine9;
    private javax.swing.JTextField searchTopicTextField;
    private javax.swing.JButton searchTopicsButton;
    private javax.swing.JPanel searchTopicsPanel;
    private javax.swing.JLabel searchUserHeading;
    private javax.swing.JLabel searchUserLine1;
    private javax.swing.JLabel searchUserLine2;
    private javax.swing.JLabel searchUserLine3;
    private javax.swing.JLabel searchUserLine4;
    private javax.swing.JLabel searchUserLine5;
    private javax.swing.JLabel searchUserLine6;
    private javax.swing.JButton switchAccountButton;
    private javax.swing.JDialog switchAccountDialog;
    private javax.swing.JButton switchAccountDialogButton;
    private javax.swing.JPanel switchAccountPanel;
    private javax.swing.JLabel switchAccountPromptLabel;
    private javax.swing.JButton timelineButton;
    private javax.swing.JLabel timelineHeading;
    private javax.swing.JLabel timelineLine1;
    private javax.swing.JLabel timelineLine2;
    private javax.swing.JLabel timelineLine3;
    private javax.swing.JLabel timelineLine4;
    private javax.swing.JLabel timelineLine5;
    private javax.swing.JLabel timelineLine6;
    private javax.swing.JLabel trendLabel;
    private javax.swing.JPanel trendsFollowersPanel;
    private javax.swing.JList trendsList;
    private javax.swing.JScrollPane trendsListScrollPane;
    private javax.swing.JLabel tweetContentLabel;
    private javax.swing.JLabel tweetLabel;
    private javax.swing.JTable tweetTable;
    private javax.swing.JScrollPane tweetTableScrollPane;
    private javax.swing.JScrollPane tweetTextArea;
    private javax.swing.JLabel twitterPic;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
    private TwitterEngine engine;
}
