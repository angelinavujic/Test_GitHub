package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Messages extends MessageFacts {
	
	private String messageText;

	
	public Messages(String username, LocalDate postingTime, ArrayList<String> comments, int likes, String messageText) {
		super(username, postingTime, comments, likes);
		this.messageText = messageText;
		
	}

	
	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
	

}
