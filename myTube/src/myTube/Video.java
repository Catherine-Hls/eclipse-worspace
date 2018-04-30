package myTube;


public class Video {
	private long id;
	private User user;
	private String title;
	private String description;
	private int duration;
	private String publicationDate;
	private String urlVideo;
	private String urlMiniature;
	
	/*private int videoViewCount;
	private int videoLikeCount;
	private int videoDislikeCount;*/
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getUrlVideo() {
		return urlVideo;
	}

	public void setUrlVideo(String urlVideo) {
		this.urlVideo = urlVideo;
	}

	public String getUrlMiniature() {
		return urlMiniature;
	}

	public void setUrlMiniature(String urlMiniature) {
		this.urlMiniature = urlMiniature;
	}

/*	public int getVideoLikeCount() {
		return videoLikeCount;
	}

	public void setVideoLikeCount(int videoLikeCount) {
		this.videoLikeCount = videoLikeCount;
	}

	public int getVideoDislikeCount() {
		return videoDislikeCount;
	}

	public void setVideoDislikeCount(int videoDislikeCount) {
		this.videoDislikeCount = videoDislikeCount;
	}
	

	public int getVideoViewCount() {
		return videoViewCount;
	}

	public void setVideoViewCount(int videoViewCount) {
		this.videoViewCount = videoViewCount;
	}*/

	

}