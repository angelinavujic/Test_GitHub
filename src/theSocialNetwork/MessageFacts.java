package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class MessageFacts {
	private String username;
	private LocalDate postingTime;
	private ArrayList<Comment>comments;
	private int likes;
	
	
	public MessageFacts(String username) {
		super();
		this.username = username;
		this.postingTime = LocalDate.now();
		this.comments = new ArrayList<>();
		this.likes = 0;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public LocalDate getPostingTime() {
		return postingTime;
	}


	public void setPostingTime(LocalDate postingTime) {
		this.postingTime = postingTime;
	}


	
	public ArrayList<Comment> getComments() {
		return comments;
	}


	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}


	public int getLikes() {
		return likes;
	}


	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	
	
	
	
	

}
