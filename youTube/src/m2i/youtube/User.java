package m2i.youtube;

public class User {
	private Integer id;
	private String username;
	private String password;
	private String email;
	private String registrationdate;
	private String urlavatar;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "[id: " + id +
				", username: " + username +
				", password: " + password +
				", email: " + email + "]";
	}
	public String getRegistrationdate() {
		return registrationdate;
	}
	public void setRegistrationdate(String registrationdate) {
		this.registrationdate = registrationdate;
	}
	public String getUrlavatar() {
		return urlavatar;
	}
	public void setUrlavatar(String urlavatar) {
		this.urlavatar = urlavatar;
	}
	
	
	
}
