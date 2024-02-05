package theSocialNetwork;



public class PhotoPosts extends MessageFacts{
	
	private String dataName;
	private String headline;
	
	
	
	
	
	public PhotoPosts(String username, String dataName, String headline) {
		super(username);
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


	@Override
	public String toString() {
		return "new Photo: "
				+ headline 
				+ "\n\t" + dataName;
	}
	
	
	
	
	

}
