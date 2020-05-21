package edu.ensi.pcd.signinproj1.models;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="professeurs")
public class Professeur {
	@Id
	private String id;
	@DBRef
	private User user;
	private String userId;
	private String nom;
	private String prenom;
	private String departement;
	@DBRef
	private List<Seance> seances;
	private long timestamp;

	public Professeur() {
		super();
	}
	public Professeur(String nom, String prenom, String userId,String departement) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.userId = userId;
		this.departement = departement;
		this.setTimestamp(System.currentTimeMillis());
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
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public List<Seance> getSeances() {
		return seances;
	}
	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	//TO_DO: 
	// *Un prof peut créer/modifier une absence 
	// **Un prof peut créer une alerte (etudiant_id, matiere_id)
	// ***Un prof peut créer/modifier/supprimer une séance 
	// ****Un prof peut créer/modifier/supprimer un seul emploi dans une seule semestre
	
}
