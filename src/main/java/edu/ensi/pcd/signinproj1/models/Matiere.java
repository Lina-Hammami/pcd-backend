package edu.ensi.pcd.signinproj1.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="matieres")
public class Matiere {
	@Id
	private String id;
	private String nom;
	private String nbrheures;
	private long timestamp;
	
	public Matiere() {
		super();
	}

	public Matiere( String name,String nbh) {
		super();
		this.nom = name;
		this.nbrheures = nbh;
		this.timestamp = System.currentTimeMillis();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String name) {
		this.nom = name;
	}

	public String getNbheures() {
		return nbrheures;
	}

	public void setNbheures(String nbh) {
		this.nbrheures = nbh;
	}
	
	
	
	
}
