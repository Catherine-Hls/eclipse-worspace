package m2i.youtube;

import java.util.Date;

public class Comment {
	private int commentID;
	private User commentUser;
	private Video id;
	private Date commentDate;
	private int commentLikeCount;
	private int commentDislikeCount;
	
	public Comment(int commentID, User commentUser, Video id, Date commentDate, int commentNumberOfLike,
			int commentNumberOfDislike) {
		
		this.commentID = commentID;
		this.commentUser = commentUser;
		this.id = id;
		this.commentDate = commentDate;
		this.commentLikeCount = commentNumberOfLike;
		this.commentDislikeCount = commentNumberOfDislike;
	}
	public int getCommentID() {
		return commentID;
	}
	public void setCommentID(int commentID) {
		this.commentID = commentID;
	}
	public User getCommentUser() {
		return commentUser;
	}
	public void setCommentUser(User commentUser) {
		this.commentUser = commentUser;
	}
	public Video getId() {
		return id;
	}
	public void setId(Video id) {
		this.id = id;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public int getCommentNumberOfLike() {
		return commentLikeCount;
	}
	public void setCommentNumberOfLike(int commentNumberOfLike) {
		this.commentLikeCount = commentNumberOfLike;
	}
	public int getCommentNumberOfDislike() {
		return commentDislikeCount;
	}
	public void setCommentNumberOfDislike(int commentNumberOfDislike) {
		this.commentDislikeCount = commentNumberOfDislike;
	}
	

}
