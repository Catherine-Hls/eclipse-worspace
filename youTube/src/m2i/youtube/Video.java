package m2i.youtube;


public class Video {
	private long id;
	private User user_id;
	private String title;
	private String description;
	private int duration;
	private String publicationdate;
	private String urlvideo;
	private String urlminiature;
	
	
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getPublicationdate() {
		return publicationdate;
	}
	public void setPublicationdate(String publicationdate) {
		this.publicationdate = publicationdate;
	}
	public String getUrlvideo() {
		return urlvideo;
	}
	public void setUrlvideo(String urlvideo) {
		this.urlvideo = urlvideo;
	}
	public String getUrlminiature() {
		return urlminiature;
	}
	public void setUrlminiature(String urlminiature) {
		this.urlminiature = urlminiature;
	}

	

	

}