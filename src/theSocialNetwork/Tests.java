package theSocialNetwork;

public class Tests {

	public static void main(String[] args) {


		Messages m1 = new Messages("AngelinaV", "Hallooo!");
		
		PhotoPosts p1 = new PhotoPosts("DavidG", "png", "HELP", "[photo]");

		
		NewsFeed n1 = new NewsFeed();
		
		n1.addToNewsFeed(m1);
		n1.addToNewsFeed(p1);
		//n1.printNewsFeed();
		n1.printPostPerName("DavidG");

	}

}
