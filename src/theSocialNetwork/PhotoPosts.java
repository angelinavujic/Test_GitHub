package theSocialNetwork;



public class PhotoPosts extends MessageFacts{
	
	private String dataName;
	private String headline;
	private String photo;
	
	
	
	
	
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
	public String photo() {
		return photo;
	}
	public void photo(String photo) {
		this.photo = photo;
	}


	@Override
	public String toString() {
		return "new Photo: "
				+ headline 
				+ "\n\t" + photo
				+ "\n\t" + dataName;
	}
	
	
	
	
	

}
