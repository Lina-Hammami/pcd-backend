package edu.ensi.pcd.signinproj1.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="alertes")
public class Alerte {

	private String id;
	private String etudiant_id;
	private String matiere_id;
	
	
	public Alerte() {
		super();
	}
	public Alerte(String id, String etudiant_id, String matiere_id) {
		super();
		this.id = id;
		this.etudiant_id = etudiant_id;
		this.matiere_id = matiere_id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEtudiant_id() {
		return etudiant_id;
	}
	public void setEtudiant_id(String etudiant_id) {
		this.etudiant_id = etudiant_id;
	}
	public String getMatiere_id() {
		return matiere_id;
	}
	public void setMatiere_id(String matiere_id) {
		this.matiere_id = matiere_id;
	}
	
}
