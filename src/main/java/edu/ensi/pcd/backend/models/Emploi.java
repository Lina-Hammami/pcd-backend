package edu.ensi.pcd.backend.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="emplois")
public class Emploi {
	@Id
	private String id;
	private String proffesseur_id;
	private long timestamp;
	
	private List<Seance> seance_id;
	
	public Emploi() {
		super();
	}
	public Emploi(String id, String proffesseur_id, List<Seance> seance_id) {
		super();
		this.id = id;
		this.proffesseur_id = proffesseur_id;
		this.seance_id = seance_id;
		this.timestamp = System.currentTimeMillis();
		}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProffesseur_id() {
		return proffesseur_id;
	}
	public void setProffesseur_id(String proffesseur_id) {
		this.proffesseur_id = proffesseur_id;
	}
	public List<Seance> getSeance_id() {
		return seance_id;
	}
	public void setSeance_id(List<Seance> seance_id) {
		this.seance_id = seance_id;
	}
	
}
