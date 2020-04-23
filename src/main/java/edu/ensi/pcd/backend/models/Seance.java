package edu.ensi.pcd.backend.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="seances")
public class Seance {
	@Id
	private String id;
	private String matiere_id;
	private String horaire_id;
	private String classe_id;
	private String emploi_id;
	private long timestamp;
	
	public Seance() {
		super();
	}
	
	public Seance(String id, String matiere_id, String horaire_id, String classe_id, String emploi_id) {
		super();
		this.id = id;
		this.matiere_id = matiere_id;
		this.horaire_id = horaire_id;
		this.classe_id = classe_id;
		this.emploi_id = emploi_id;
		this.timestamp = System.currentTimeMillis();
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMatiere_id() {
		return matiere_id;
	}
	public void setMatiere_id(String matiere_id) {
		this.matiere_id = matiere_id;
	}
	public String getHoraire_id() {
		return horaire_id;
	}
	public void setHoraire_id(String horaire_id) {
		this.horaire_id = horaire_id;
	}
	public String getClasse_id() {
		return classe_id;
	}
	public void setClasse_id(String classe_id) {
		this.classe_id = classe_id;
	}
	public String getEmploi_id() {
		return emploi_id;
	}
	public void setEmploi_id(String emploi_id) {
		this.emploi_id = emploi_id;
	}

}
