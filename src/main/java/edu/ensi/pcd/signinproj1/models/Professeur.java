package edu.ensi.pcd.signinproj1.models;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="professeurs")
public class Professeur {
	@Id
	private String id;
	private String email;
	private String grade;
	private String username;
	
	public Professeur() {
		super();
	}
	public Professeur(String email,String grade) {
		super();
		this.email = email;
		this.grade = grade;
	}
	
	public Professeur( String email,String grade,String username) {
		super();
		this.email = email;
		this.grade = grade;
		this.username = username;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
