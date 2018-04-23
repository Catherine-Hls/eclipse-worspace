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
		User u4 = new User(4, "Ben", "ben@example.com", 0, "4444-44-44", 0);
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		
		Video v1 = new Video(1L, "Titre video1", "Description video1", u1, 111, "date", 50, 35, 0, "urlvideo1", "imgvideo1");
		Video v2 = new Video(2L, "Titre video2", "Description video2", u2, 222, "date", 5, 8, 0, "urlvideo2", "imgvideo2");
		Video v3 = new Video(3L, "Titre video3", "Description video3", u2, 333, "date", 200, 45, 0, "urlvideo3", "imgvideo3");
		Video v4 = new Video(4L, "Titre video4", "Description video4", u3, 444, "date", 3, 0, 1, "urlvideo4", "imgvideo4");
		Video v5 = new Video(5L, "Titre video5", "Description video5", u3, 555, "date", 44, 200, 0, "urlvideo5", "imgvideo5");
		Video v6 = new Video(6L, "Titre video6", "Description video6", u3, 666, "date", 1, 11, 0, "urlvideo6", "imgvideo6");
		Video v7 = new Video(7L, "Titre video7", "Description video7", u3, 777, "date", 10, 40, 0, "urlvideo7", "imgvideo7");
		Video v8 = new Video(8L, "Titre video8", "Description video8", u3, 888, "date", 100, 3, 0, "urlvideo8", "imgvideo8");
		videoList.add(v1);
		videoList.add(v2);
		videoList.add(v3);
		videoList.add(v4);
		videoList.add(v5);
		videoList.add(v6);
		videoList.add(v7);
		videoList.add(v8);
		
		Comment c1 = new Comment(1L, u1, v1, "date", 0, 0);
		Comment c2 = new Comment(2L, u1, v1, "date", 0, 0);
		Comment c3= new Comment(3L, u1, v2, "date", 0, 0);
		Comment c4 = new Comment(4L, u2, v2, "date", 0, 0);
		Comment c5 = new Comment(5L, u2, v3, "date", 0, 0);
		Comment c6 = new Comment(6L, u4, v3, "date", 0, 0);
		Comment c7 = new Comment(7L, u4, v3, "date", 0, 0);
		Comment c8 = new Comment(8L, u4, v4, "date", 0, 0);
		commentList.add(c1);
		commentList.add(c2);
		commentList.add(c3);
		commentList.add(c4);
		commentList.add(c5);
		commentList.add(c6);
		commentList.add(c7);
		commentList.add(c8);
	}
	
	public ArrayList<Video> findTrending() {
		ArrayList<Video> trendingVideos = new ArrayList<Video>();
		for (Video video : videoList) {
			if (video.getVideoViewCount() > 10) {
				trendingVideos.add(video);
			}
		}
		return trendingVideos;
	}
	
	public ArrayList<Video> findRecommended() {
		ArrayList<Video> recommendedVideos = new ArrayList<Video>();
		for (Video video : videoList) {
			if (video.getVideoLikeCount() > 10) {
				recommendedVideos.add(video);
			}
		}
		return recommendedVideos;	
	}
	
	public Video findVideoByID(long ID) {
		Video selectedVideo = null;
		for (Video video : videoList) {
			if (video.getVideoID() == ID) {
				video = selectedVideo;
			}
		}
		return selectedVideo;
		
	}
	
	
}
