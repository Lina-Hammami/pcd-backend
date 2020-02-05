package edu.ensi.pcd.signinproj1.models;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="administrateurs")
public class Administrateur {
	@Id
	private String id;
	@NotNull(message="l'email est obligatoir")
	private String email;
	@NotNull(message="mot de passe est obligatoir")
	private String password;
	@NotNull(message="donner le nom de l'administrateur")
	private String username;
	
	public Administrateur() {
		super();
	}
	public Administrateur(@NotNull(message = "l'email est obligatoir") String email,
			@NotNull(message = "mot de passe est obligatoir") String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public Administrateur( @NotNull(message = "l'email est obligatoir") String email,
			@NotNull(message = "mot de passe est obligatoir") String password,
			@NotNull(message = "donner le nom de l'administrateur") String username) {
		super();
		this.email = email;
		this.password = password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
