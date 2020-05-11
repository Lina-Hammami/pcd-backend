package edu.ensi.pcd.signinproj1.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="absences")
public class Absence {

	@Id
	private String id;
	private String seance_id;
	private String etudiant_id;
	private long timestamp;
	
	public Absence() {
		super();
	}
	public Absence(String id, String seance_id) {
		super();
		this.id = id;
		this.seance_id = seance_id;
		this.timestamp = System.currentTimeMillis();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSeance_id() {
		return seance_id;
	}
	public void setSeance_id(String seance_id) {
		this.seance_id = seance_id;
	}
	
}
