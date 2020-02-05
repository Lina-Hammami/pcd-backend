package edu.ensi.pcd.signinproj1.models;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="etudiants")
public class Etudiant {
	@Id
	private String id;
	private String email;
	private String classe;
	private String username;
	
	public Etudiant() {
		super();
	}
	public Etudiant(String email,String username) {
		super();
		this.email = email;
		this.username = username;
	}
	
	public Etudiant( String email, String classe,String username) {
		super();
		this.email = email;
		this.classe = classe;
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
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
