 package test;

public class UserOld {
	private long id;
	private String username;
	private String email;
	private String password;
	private String urlAvatar;
	private String registrationDate;
	
	//private int userCommentCount;
	//private int userVideoCount;
	
	
	public UserOld(long id, String username, String email, String password, String urlAvatar,
			String registrationDate) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.urlAvatar = urlAvatar;
		this.registrationDate = registrationDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrlAvatar() {
		return urlAvatar;
	}

	public void setUrlAvatar(String urlAvatar) {
		this.urlAvatar = urlAvatar;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	/*public int getUserVideoCount() {
		return userVideoCount;
	}

	public void setUserVideoCount(int userVideoCount) {
		this.userVideoCount = userVideoCount;
	}*/
	
	
	
}