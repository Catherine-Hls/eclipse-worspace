package m2i.youtube;

public class Comment {
	private long commentID;
	private User commentUser;
	private Video VideoID;
	private String commentDate;
	private int commentLikeCount;
	private int commentDislikeCount;
	
	public Comment(long commentID, User commentUser, Video VideoID, String commentDate, int commentLikeCount,
			int commentDislikeCount) {
		super();
		this.commentID = commentID;
		this.commentUser = commentUser;
		this.VideoID = VideoID;
		this.commentDate = commentDate;
		this.commentLikeCount = commentLikeCount;
		this.commentDislikeCount = commentDislikeCount;
	}

	public long getCommentID() {
		return commentID;
	}

	public void setCommentID(long commentID) {
		this.commentID = commentID;
	}

	public User getCommentUser() {
		return commentUser;
	}

	public void setCommentUser(User commentUser) {
		this.commentUser = commentUser;
	}

	public Video getVideoID() {
		return VideoID;
	}

	public void setVideoID(Video VideoID) {
		this.VideoID = VideoID;
	}

	public String getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}

	public int getCommentLikeCount() {
		return commentLikeCount;
	}

	public void setCommentLikeCount(int commentLikeCount) {
		this.commentLikeCount = commentLikeCount;
	}

	public int getCommentDislikeCount() {
		return commentDislikeCount;
	}

	public void setCommentDislikeCount(int commentDislikeCount) {
		this.commentDislikeCount = commentDislikeCount;
	}
	
	
	
	
	
}