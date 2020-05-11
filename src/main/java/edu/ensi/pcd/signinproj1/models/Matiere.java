package edu.ensi.pcd.signinproj1.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="matieres")
public class Matiere {
	@Id
	private String id;
	private String nom;
	private String nombreHeures;
	private String description;
	private String niveau;
	
;
	private long timestamp;
	
	public Matiere() {
		super();
	}

	public Matiere(String nom,String nbh,String desc,String niveau) {
		super();
		this.nom = nom;
		this.nombreHeures=nbh;
		this.description=desc;
		this.niveau=niveau;
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

	public String getNombreHeures() {
		return nombreHeures;
	}

	public void setNombreHeures(String nombreHeures) {
		this.nombreHeures = nombreHeures;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}


	
	
	
}
