package m2i.youtube;


public class Video {
	private int videoID;
	private String videoTitle;
	private String videoDescription;
	private User videoUser;
	private int videoDuration;
	private String videoDateOfuploading;
	private int videoViewCount;
	private int videoLikeCount;
	private int videoDislikeCount;
	private String videoURL;
	private String videoImgURL;
	
	public Video(int videoID, String videoTitle, String videoDescription, User videoUser, String videoDateOfuploading, int videoDuration, int videoNumberOfviews,
			int videoNumberOfLikes, int videoNumberOfDislikes, String videoURL, String videoImgURL) {
		
		this.setVideoID(videoID);
		this.videoTitle = videoTitle;
		this.videoDescription = videoDescription;
		this.setVideoUser(videoUser);
		this.setVideoDuration(videoDuration);
		this.setVideoDateOfuploading(videoDateOfuploading);
		this.videoViewCount = videoNumberOfviews;
		this.videoLikeCount = videoNumberOfLikes;
		this.videoDislikeCount = videoNumberOfDislikes;
		this.videoURL = videoURL;
		this.videoImgURL = videoImgURL;
	}

	public String getVideoTitle() {
		return videoTitle;
	}

	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}

	
		

	

	public int getVideoNumberOfviews() {
		return videoViewCount;
	}

	public void setVideoNumberOfviews(int videoNumberOfviews) {
		this.videoViewCount = videoNumberOfviews;
	}

	public int getVideoNumberOfLikes() {
		return videoLikeCount;
	}

	public void setVideoNumberOfLikes(int videoNumberOfLikes) {
		this.videoLikeCount = videoNumberOfLikes;
	}

	public int getVideoNumberOfDislikes() {
		return videoDislikeCount;
	}

	public void setVideoNumberOfDislikes(int videoNumberOfDislikes) {
		this.videoDislikeCount = videoNumberOfDislikes;
	}

	public String getVideoURL() {
		return videoURL;
	}

	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
	}

	public String getVideoImgURL() {
		return videoImgURL;
	}

	public void setVideoImgURL(String videoImgURL) {
		this.videoImgURL = videoImgURL;
	}

	public int getVideoID() {
		return videoID;
	}

	public void setVideoID(int videoID) {
		this.videoID = videoID;
	}

	public User getVideoUser() {
		return videoUser;
	}

	public void setVideoUser(User videoUser) {
		this.videoUser = videoUser;
	}

	public String getVideoDescription() {
		return videoDescription;
	}

	public void setVideoDescription(String videoDescription) {
		this.videoDescription = videoDescription;
	}

	public int getVideoDuration() {
		return videoDuration;
	}

	public void setVideoDuration(int videoDuration) {
		this.videoDuration = videoDuration;
	}

	public String getVideoDateOfuploading() {
		return videoDateOfuploading;
	}

	public void setVideoDateOfuploading(String videoDateOfuploading2) {
		this.videoDateOfuploading = videoDateOfuploading2;
	}
	
	
	

	

}
