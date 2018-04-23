package m2i.youtube;


public class Video {
	private long videoID;
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
	
	public Video(long videoID, String videoTitle, String videoDescription, User videoUser, int videoDuration,
			String videoDateOfuploading, int videoViewCount, int videoLikeCount, int videoDislikeCount, String videoURL,
			String videoImgURL) {
		super();
		this.videoID = videoID;
		this.videoTitle = videoTitle;
		this.videoDescription = videoDescription;
		this.videoUser = videoUser;
		this.videoDuration = videoDuration;
		this.videoDateOfuploading = videoDateOfuploading;
		this.videoViewCount = videoViewCount;
		this.videoLikeCount = videoLikeCount;
		this.videoDislikeCount = videoDislikeCount;
		this.videoURL = videoURL;
		this.videoImgURL = videoImgURL;
	}
	public long getVideoID() {
		return videoID;
	}
	public void setVideoID(long videoID) {
		this.videoID = videoID;
	}
	public String getVideoTitle() {
		return videoTitle;
	}
	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}
	public String getVideoDescription() {
		return videoDescription;
	}
	public void setVideoDescription(String videoDescription) {
		this.videoDescription = videoDescription;
	}
	public User getVideoUser() {
		return videoUser;
	}
	public void setVideoUser(User videoUser) {
		this.videoUser = videoUser;
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
	public void setVideoDateOfuploading(String videoDateOfuploading) {
		this.videoDateOfuploading = videoDateOfuploading;
	}
	public int getVideoViewCount() {
		return videoViewCount;
	}
	public void setVideoViewCount(int videoViewCount) {
		this.videoViewCount = videoViewCount;
	}
	public int getVideoLikeCount() {
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
	


	
	
	
	

	

}
