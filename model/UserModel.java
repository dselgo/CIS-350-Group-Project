package model;

import javax.swing.AbstractListModel;
import twitter4j.ResponseList;
import twitter4j.User;

public class UserModel extends AbstractListModel{
	
	private ResponseList<User> users;
	
	public UserModel(ResponseList<User> users) {
		this.users = users;
	}
	
	public int getSize() {
		return users.size();
	}
	
	public User getElementAt(int index) {
		return users.get(index);
	}
}
