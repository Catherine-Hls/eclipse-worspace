package m2i.youtube;

import java.util.ArrayList;

public class RepositoryVideo {
	private ArrayList<User> userList;
	private ArrayList<Video> videoList;
	private ArrayList<Comment> commentList;
	
	public RepositoryVideo() {
		userList = new ArrayList<User>();
		videoList = new ArrayList<Video>();
		commentList = new ArrayList<Comment>();
		User u1 = new User(1, "Tom", "tom@example.com", 0, "1111-11-11", 0);
		User u2 = new User(2, "Mark", "mark@example.com", 0, "2222-22-22", 0);
		User u3 = new User(3, "John", "john@example.com", 0, "3333-33-33", 0);
		User u4 = new User(3, "Ben", "ben@example.com", 0, "4444-44-44", 0);
		userList.add(u1);
	}
	
	
	
	
	
	
}
