package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class PhotoPosts extends MessageFacts{
	
	private String dataName;
	private String headline;
	public PhotoPosts(String username, LocalDate postingTime, ArrayList<String> comments, int likes,
					  String dataName, String headline) {
		super(username, postingTime, comments, likes);
		this.dataName = dataName;
		this.headline = headline;
		
	}
	
	
	public String getDataName() {
		return dataName;
	}
	public void setDataName(String dataName) {
		this.dataName = dataName;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	
	
	
	

}
