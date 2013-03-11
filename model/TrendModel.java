package model;

import javax.swing.AbstractListModel;
import twitter4j.Trend;
import twitter4j.Trends;

public class TrendModel extends AbstractListModel{
	
	private Trend[] trends;
	
	public TrendModel(Trends trends)	{
		this.trends = trends.getTrends();
	}
	
	public int getSize() {
		return trends.length;
	}
	
	public String getElementAt(int index) {
		return trends[index].getName();
	}
}
