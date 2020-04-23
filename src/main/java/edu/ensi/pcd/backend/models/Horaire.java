package edu.ensi.pcd.backend.models;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="horaires")
public class Horaire {
	private String id;
	private String debut;
	private String fin;
	private long timestamp;

	public Horaire() {
		super();
	}
	
	public Horaire(String id,String debut, String fin) {
		super();
		this.id = id;
		this.debut=debut;
		this.fin=fin;
		this.timestamp = System.currentTimeMillis();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDebut() {
		return debut;
	}

	public void setDebut(String debut) {
		this.debut = debut;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}
	
}
