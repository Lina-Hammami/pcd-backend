package edu.ensi.pcd.signinproj1.models;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="horaires")
public class Horaire {
	private String id;
	private long timestamp;

	public Horaire() {
		super();
	}
	
	public Horaire(String id) {
		super();
		this.id = id;
		this.timestamp = System.currentTimeMillis();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
