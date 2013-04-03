package controller;

import java.util.Comparator;

import twitter4j.DirectMessage;

public class MessageComparator implements Comparator<DirectMessage>{

	@Override
	public int compare(DirectMessage x, DirectMessage y) {
		return x.getCreatedAt().compareTo(y.getCreatedAt());
	}

	
	



}
