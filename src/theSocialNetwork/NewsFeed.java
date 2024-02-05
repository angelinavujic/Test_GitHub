package theSocialNetwork;

import java.util.ArrayList;

public class NewsFeed {
	
	private ArrayList<MessageFacts>feedPosts;

	public NewsFeed(ArrayList<MessageFacts> feedPosts) {
		super();
		this.feedPosts = feedPosts;
	}

	
	
	public ArrayList<MessageFacts> getFeedPosts() {
		return feedPosts;
	}

	public void setFeedPosts(ArrayList<MessageFacts> feedPosts) {
		this.feedPosts = feedPosts;
	}
	
	
	
	
	

}
