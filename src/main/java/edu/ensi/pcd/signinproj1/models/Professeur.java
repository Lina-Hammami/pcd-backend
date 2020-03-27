package edu.ensi.pcd.signinproj1.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="professeurs")
public class Professeur {
	@Id
	private String id;
	private String nom;
	private String prenom;
	private String username;
	private String email;
	private String grade;
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

	//@Autowired
	private Emploi emploiDuTemps;
	private long timestamp;
	
	public Professeur() {
		super();
	}
	public Professeur(String email,String grade) {
		super();
		this.email = email;
		this.grade = grade;
		this.timestamp = System.currentTimeMillis();
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
	public Emploi getEmploiDuTemps() {
		return emploiDuTemps;
	}
	public void setEmploiDuTemps(Emploi emploiDuTemps) {
		this.emploiDuTemps = emploiDuTemps;
	}
	
	//TO_DO: 
	// *Un prof peut créer/modifier une absence 
	// **Un prof peut créer une alerte (etudiant_id, matiere_id)
	// ***Un prof peut créer/modifier/supprimer une séance 
	// ****Un prof peut créer/modifier/supprimer un seul emploi dans une seule semestre
	
}
