package edu.ensi.pcd.signinproj1.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="seances")
public class Seance {
	@Id
	private String id;
	private String profId;
	private String matiereId;
	private String classeId;
	private String jourId;
	private String hdebut;
	private String hfin;
	private long timestamp;
	
	public Seance() {
		super();
	}
	
	public Seance(String id, String matiereId, String horaire_id, String classeId, String emploi_id) {
		super();
		this.id = id;
		this.matiereId = matiereId;
		//this.horaire_id = horaire_id;
		this.classeId = classeId;
		//this.emploi_id = emploi_id;
		this.timestamp = System.currentTimeMillis();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProfId() {
		return profId;
	}

	public void setProfId(String profId) {
		this.profId = profId;
	}

	public String getMatiereId() {
		return matiereId;
	}

	public void setMatiereId(String matiereId) {
		this.matiereId = matiereId;
	}

	public String getClasseId() {
		return classeId;
	}

	public void setClasseId(String classeId) {
		this.classeId = classeId;
	}

	public String getJourId() {
		return jourId;
	}

	public void setJourId(String jourId) {
		this.jourId = jourId;
	}

	public String getHdebut() {
		return hdebut;
	}

	public void setHdebut(String hdebut) {
		this.hdebut = hdebut;
	}

	public String getHfin() {
		return hfin;
	}

	public void setHfin(String hfin) {
		this.hfin = hfin;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
}
