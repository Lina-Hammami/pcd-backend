package edu.ensi.pcd.signinproj1.models;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="etudiants")
public class Etudiant {
	@Id
	private String userId;
	private String nom;
	private String prenom;
	private String classeId;
	//private String email;
	//private String username;
	//private String password;

	public Etudiant(String userIsd, String classeId) {
		super();
		this.userId = userIsd;
		this.classeId = classeId;
	}


	public Etudiant(String userIsd, String nom, String prenom, String classeId) {
		super();
		this.userId = userIsd;
		this.nom = nom;
		this.prenom = prenom;
		this.classeId = classeId;
	}
	
	public Etudiant(String userIsd, String nom, String prenom, String classeId, List<Absence> absences) {
		super();
		this.userId = userIsd;
		this.nom = nom;
		this.prenom = prenom;
		this.classeId = classeId;
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userIsd) {
		this.userId = userIsd;
	}

	public String getClasseId() {
		return classeId;
	}

	public void setClasseId(String classeId) {
		this.classeId = classeId;
	}

	
	
}
