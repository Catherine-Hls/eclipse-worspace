 package m2i.youtube;

public class User {
	private long userID;
	private String userPseudo;
	private String userEmail;
	private int userVideoCount;
	private String userDateOfRegistration;
	private int userCommentCount;
	
	public User(long userID, String userPseudo, String userEmail, int userVideoCount, String userDateOfRegistration,
			int userCommentCount) {
		super();
		this.userID = userID;
		this.userPseudo = userPseudo;
		this.userEmail = userEmail;
		this.userVideoCount = userVideoCount;
		this.userDateOfRegistration = userDateOfRegistration;
		this.userCommentCount = userCommentCount;
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getUserPseudo() {
		return userPseudo;
	}

	public void setUserPseudo(String userPseudo) {
		this.userPseudo = userPseudo;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getUserVideoCount() {
		return userVideoCount;
	}

	public void setUserVideoCount(int userVideoCount) {
		this.userVideoCount = userVideoCount;
	}

	public String getUserDateOfRegistration() {
		return userDateOfRegistration;
	}

	public void setUserDateOfRegistration(String userDateOfRegistration) {
		this.userDateOfRegistration = userDateOfRegistration;
	}

	public int getUserCommentCount() {
		return userCommentCount;
	}

	public void setUserCommentCount(int userCommentCount) {
		this.userCommentCount = userCommentCount;
	}
	
	
	
	
}