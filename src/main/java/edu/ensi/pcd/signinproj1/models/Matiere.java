package edu.ensi.pcd.signinproj1.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="matieres")
public class Matiere {
	@Id
	private String id;
	private String name;
	private String nbh;
	
	public Matiere() {
		super();
	}

	public Matiere( String name,String nbh) {
		super();
		this.name = name;
		this.nbh = nbh;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return name;
	}

	public void setNom(String name) {
		this.name = name;
	}

	public String getNbheures() {
		return nbh;
	}

	public void setNbheures(String nbh) {
		this.nbh = nbh;
	}
	
	
	
	
}
