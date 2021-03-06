package hello;

public class Video {
	private Integer id;
	private User author;
	private String title;
	private String description;
	private Integer duration;
	private String publicationDate;
	private String urlVideo;
	private String urlMiniature;
	private Comment comment;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
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
	@Override
    public String toString() {
        return "[id: " + id +
                ", author: " + author +
                ", title: " + title +
                ", description: " + description + 
                ", duration: " + duration +
                ", publicationDate: " + publicationDate +
                ", urlVideo: " + urlVideo +
                ", urlMiniature: " + urlMiniature +
                "]";
    }
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public Comment getComment() {
		return comment;
	}
	public void setComment(Comment comment) {
		this.comment = comment;
	}
	public String getTitle() {
		return title;
	}
	
	
	
}
