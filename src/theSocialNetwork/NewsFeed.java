package theSocialNetwork;

import java.util.ArrayList;

public class NewsFeed {
	
	private ArrayList<MessageFacts>feedPosts;

	public NewsFeed() {
		super();
		this.feedPosts = new ArrayList<MessageFacts>();
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
	
	public void removeFromNewsFeed(MessageFacts m) {
		this.feedPosts.remove(m);
	}
	
	public void printNewsFeed() {
		for(MessageFacts m : this.feedPosts) {
			System.out.println(m);
	}
}
		
	
		public void printPostPerName(String username) {
		boolean userFound = false;
		for(MessageFacts m : this.feedPosts) {
			if(m.getUsername().equals(username)) {
				System.out.println(m);
				userFound = true;
			}
		}
		if(userFound = false) {
			System.out.println("User not found");
		}
		
	
}
	
	
	
	
	

}
