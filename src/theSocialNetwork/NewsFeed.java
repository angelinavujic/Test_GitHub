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
	
	
	public void addToNewsFeed(MessageFacts m) {
		this.feedPosts.add(m);
	}
	
	public void printNewsFeed() {
		for(MessageFacts m : this.feedPosts) {
			System.out.println(m);
	}
	}
		
	
		public void printPostPerName(String username) {
		for(MessageFacts m : this.feedPosts) {
			if(m.getUsername().equals(username)) {
				System.out.println(m);
			}else {
				System.out.println("User not found");
			}
		}
		
	
}
	
	
	
	
	

}
