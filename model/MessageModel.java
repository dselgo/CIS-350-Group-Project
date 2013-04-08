package model;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import twitter4j.DirectMessage;
import twitter4j.User;

public class MessageModel extends AbstractListModel {
	
	private ArrayList<DirectMessage> messages;
	private User user;
	
	public MessageModel(final ArrayList<DirectMessage> messages, User user) {
		this.messages = messages;
		this.user = user;
	}

	public int getSize() {
		return messages.size();
	}

	public String getElementAt(final int index) {
		return messages.get(index).getText();
	}
	
	public void add(DirectMessage message) {
		messages.add(message);
	}
}
