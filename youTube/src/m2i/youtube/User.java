 package m2i.youtube;

public class User {
	private int userID;
	private String userPseudo;
	private String userEmail;
	private int userVideoCount;
	private String userDateOfRegistration;
	private int userCommentCount;
	
	public User(int userID, String userPseudo, String userEmail, int userNumbeOfVideo, String userDateOfRegistration,
			int userNumberOfComment) {
		
		super();
		this.userPseudo = userPseudo;
		this.userEmail = userEmail;
		this.userVideoCount = userNumbeOfVideo;
		this.userDateOfRegistration = userDateOfRegistration;
		this.userCommentCount = userNumberOfComment;
	}
	
	
	public String getUserPseudo() {
		return userPseudo;
	}
	public void setUserPseudo(String userPseudo) {
		this.userPseudo = userPseudo;
	}
	public String getuEmail() {
		return userEmail;
	}
	public void setuEmail(String uEmail) {
		this.userEmail = uEmail;
	}
	public int getUserNumbeOfVideo() {
		return userVideoCount;
	}
	public void setUserNumbeOfVideo(int userNumbeOfVideo) {
		this.userVideoCount = userNumbeOfVideo;
	}
	public String getUserDateOfRegistration() {
		return userDateOfRegistration;
	}
	public void setUserDateOfRegistration(String userDateOfRegistration) {
		this.userDateOfRegistration = userDateOfRegistration;
	}
	public int getUserNumberOfComment() {
		return userCommentCount;
	}
	public void setUserNumberOfComment(int userNumberOfComment) {
		this.userCommentCount = userNumberOfComment;
	}


	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	
	
	
	

}
