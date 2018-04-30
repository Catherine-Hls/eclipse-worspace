package hello;

public class Comment {
	private Integer id;
	private User user_id;
	private Video video_id;
	private String content;
	private String publicationDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	public Video getVideo_id() {
		return video_id;
	}
	public void setVideo_id(Video video_id) {
		this.video_id = video_id;
	}
	public User getUser_id() {
		return user_id;
	}
	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}
	
	
	
}
