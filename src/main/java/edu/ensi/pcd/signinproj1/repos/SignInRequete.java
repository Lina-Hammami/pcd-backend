package edu.ensi.pcd.signinproj1.repos;

public class SignInRequete {
	
	private String email;
	private String password;
	
	
	public SignInRequete() {
		super();
	}

	public SignInRequete(String email, String password) {
		super();
		this.email = email;
		this.password = password;
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
	
}
