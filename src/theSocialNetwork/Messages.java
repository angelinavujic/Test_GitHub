package theSocialNetwork;


public class Messages extends MessageFacts {
	
	private String messageText;

	
	
		
	public Messages(String username, String messageText) {
		super(username);
		this.messageText = messageText;
	}

	

	
	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}




	@Override
	public String toString() {
		return 
			this.getUsername() + " -------------- " + this.getPostingTime() +
			"\n\t" + "Message: " + this.getMessageText() + 
			"\n\t" + 
			"\n\t" + "comments:" + this.getComments() + "--------------" + "likes:"
			+ this.getLikes();
	}
	
	

}
