package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class MessageFacts {
	private String username;
	private LocalDate postingTime;
	private ArrayList<String>comments;
	private int likes;
	
	
	public MessageFacts(String username, LocalDate postingTime, ArrayList<String> comments, int likes) {
		super();
		this.username = username;
		this.postingTime = postingTime;
		this.comments = comments;
		this.likes = likes;
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


	public ArrayList<String> getComments() {
		return comments;
	}


	public void setComments(ArrayList<String> comments) {
		this.comments = comments;
	}


	public int getLikes() {
		return likes;
	}


	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	
	
	
	
	

}
