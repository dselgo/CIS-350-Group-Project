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
 * This class creates the user interface for the Twitter Desktop Application.
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
     * This method is called from within the constructor to initialize all of the
     * elements of the GUI.
     */
    private void initComponents() {
        consumerSecretInputDialog = new javax.swing.JOptionPane("Input");
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
        twitterPic = new javax.swing.JLabel();
        switchAccountButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tweetTable = new JTable(engine.getTable());
        displayTweetText = new javax.swing.JTextArea();
        followButton = new javax.swing.JButton();
        retweetButton = new javax.swing.JButton();
        menubar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        quitMenuItem = new javax.swing.JMenuItem();

        consumerSecretInputDialog.setMessage("Please enter your consumer secret:");
        consumerSecretInputDialog.setMessageType(3);
        consumerSecretInputDialog.setOptionType(2);
        consumerSecretInputDialog.setWantsInput(true);

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
                        .addGap(124, 124, 124)
                        .addComponent(searchPeopleLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPeoplePanelLayout.createSequentialGroup()
                .addGap(0, 109, Short.MAX_VALUE)
                .addComponent(searchPeopleButton)
                .addGap(107, 107, 107))
        );
        searchPeoplePanelLayout.setVerticalGroup(
            searchPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPeoplePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(searchPeopleLabel)
                .addGap(18, 18, 18)
                .addComponent(searchPeopleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchPeopleButton)
                .addContainerGap(75, Short.MAX_VALUE))
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

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, profilePanelLayout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameLabelContent))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, profilePanelLayout.createSequentialGroup()
                        .addComponent(usernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayNameLabelContent))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, profilePanelLayout.createSequentialGroup()
                        .addComponent(followingLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(followingLabelContent))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, profilePanelLayout.createSequentialGroup()
                        .addComponent(followersLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(followersLabelContent))
                    .addComponent(profileLabel, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 8, Short.MAX_VALUE))
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
                .addGap(0, 18, Short.MAX_VALUE))
        );

        twitterPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/twitterimage.jpg"))); // NOI18N

        switchAccountButton.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        switchAccountButton.setText("Switch Account");
        switchAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchAccountButtonActionPerformed(evt);
            }
        });

        tweetTable.setModel(engine.getTable());
        tweetTable.getTableHeader().setReorderingAllowed(false);
        tweetTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tweetTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tweetTable);

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

        retweetButton.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        retweetButton.setText("Retweet");
        retweetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retweetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mainTabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(0, 2, Short.MAX_VALUE)
                                .addComponent(displayTweetText, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(retweetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(followButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(twitterPic)
                                .addComponent(profilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(switchAccountButton))
                        .addContainerGap(13, Short.MAX_VALUE))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(mainTabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(followButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(retweetButton)
                                .addGap(11, 11, 11))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayTweetText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(switchAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twitterPic, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(profilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }
    private static final Logger LOG = Logger.getLogger(Twitter4JGUI.class.getName());

    /*
     * The method asks the user for the four elements of the authorization information when
     * the switchAccount button is pressed. It then calls the switchAccount method in the 
     * TwitterEngine class and updates the current user information in the profilePanel.
     */
    private void switchAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String consumerKey = JOptionPane.showInputDialog("Please enter your consumer key:");
        String consumerSecret = JOptionPane.showInputDialog("Please enter your consumer secret:");
        String accessToken = JOptionPane.showInputDialog("Please enter your access token:");
        String accessTokenSecret = JOptionPane.showInputDialog("Please enter your access token secret:");
        engine.switchAccount(consumerKey, consumerSecret, accessToken, accessTokenSecret);
        updateUserInformation();
    }

    /*
     * This method calls the searchPeople method from the TwitterEngine class when
     * text is entered into the searchPeopleTextField and the user presses "Enter".
     */
    private void searchPeopleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        engine.searchPeople(searchPeopleTextField.getText());
    }

    /*
     * This method calls the updateStatus method from the TwitterEngine class when the
     * updateButton button is pressed.
     */
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        engine.updateStatus(enterTweetTextArea.getText());
    }

    /*
     * This method calls the searchTweets method from the TwitterEngine class when
     * text is entered into the searchTopicTextField and the user presses "Enter".
     */
    private void searchTopicTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        engine.searchTweets(searchTopicTextField.getText());
    }

    /*
     * This method calls the searchTweets method from the TwitterEngine class when the
     * searchTopicButton button is pressed.
     */
    private void searchTopicsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        engine.searchTweets(searchTopicTextField.getText());
    }

    /*
     * This method calls the searchPeople method from the TwitterEngine class when the
     * searchPeopleButton button is pressed.
     */
    private void searchPeopleButtonActionPerformed(java.awt.event.ActionEvent evt) {
        engine.searchPeople(searchPeopleTextField.getText());
    }

    /*
     * This method gets the main text of the Tweet selected in the tweetTable
     */
    private void tweetTableMouseClicked(java.awt.event.MouseEvent evt) {
        int index = tweetTable.getSelectedRow();
        if (index != -1) {
            Tweet t = engine.getTable().get(index);
            displayTweetText.setText(t.getText());
        }
    }

    /*
     * This method quits the application when the menu item is selected. 
     */
    private void quitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    /*
     * This method makes sure a valid Tweet is selected in the table. Then it gets
     * ID of the Tweet and calls the retweet method from the TwitterEngine class.
     */
    private void retweetButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int index = tweetTable.getSelectedRow();
            if (index != -1){
                long sid = engine.getTable().get(index).getId();
                engine.retweet(sid);
            }
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /*
     * This method checks to make sure a valid Tweet is selected in the table. Then
     * it gets the ID of the Tweet and calls the follow method in the TwitterEngine class.
     */
    private void followButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int index = tweetTable.getSelectedRow();
        if (index != -1){
            long id = engine.getTable().get(index).getId();
            engine.followUser(id);
        }
    }
    
    /*
     * Updates the user information in the profilePanel
     */
    private void updateUserInformation(){
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
    public static void main(String args[]) {
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
