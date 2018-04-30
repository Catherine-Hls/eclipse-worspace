package m2i.youtube;

public class Comment {
	private long id;
	private User user_id;
	private Video video_id;
	private String content;
	private String publicationdate;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public User getUser_id() {
		return user_id;
	}
	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}
	public Video getVideo_id() {
		return video_id;
	}
	public void setVideo_id(Video video_id) {
		this.video_id = video_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPublicationdate() {
		return publicationdate;
	}
	public void setPublicationdate(String publicationdate) {
		this.publicationdate = publicationdate;
	}
	


	
	
	
	
	
}