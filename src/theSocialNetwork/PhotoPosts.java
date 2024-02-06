package theSocialNetwork;



public class PhotoPosts extends MessageFacts{
	
	private String dataName;
	private String headline;
	private String photo;
	
	
	
	
	
	public PhotoPosts(String username, String dataName, String headline, String photo) {
		super(username);
		this.dataName = dataName;
		this.headline = headline;
		this.photo = "[photo]";
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
		return "|" + this.getUsername() + " -------------- " + this.getPostingTime() +
				"\n" + 
				"|" + this.getHeadline() +
				"\n" + "           " + this.photo() + 
				"\n" + 
				"|" + this.getDataName() +
				"\n" + "|"+ "comments:" + this.getComments() + "--------------" + "likes:"
				+ this.getLikes() +
				"\n";
		
	}
	
	
	
	
	

}
