package model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;
import twitter4j.DirectMessage;
import twitter4j.ResponseList;
import twitter4j.User;

public class MessageModel extends AbstractListModel {
	
	private ResponseList<DirectMessage> messages;
	
	public MessageModel(final ResponseList<DirectMessage> messages) {
		this.messages = messages;
	}

	public int getSize() {
		return messages.size();
	}

	public DirectMessage getElementAt(final int index) {
		return messages.get(index);
	}
	
	public void add(DirectMessage message) {
		messages.add(message);
	}
	
	public void add(List<DirectMessage> list)
	{
		for(DirectMessage m: list)
		{
			add(m);
		}
	}
	
	
	/**
	 * Clears ArrayList<DirectMessage> messages so that it contains no values and then
	 * updates the table.
	 */
	public final void clear() {
		if (messages.size() > 0) {
			int size = messages.size();
			messages.clear();
			this.fireIntervalRemoved(this, 0, size - 1);
		}
	}
}
