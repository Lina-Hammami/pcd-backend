package edu.ensi.pcd.signinproj1.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="absences")
public class Absence {

	@Id
	private String id;
	private String matiereId;
	private String etudiantId;
	private String hdebut;
	private String hfin;
	private String etat;
	private Date date;
	
	public Absence() {
		super();
	}
	public Absence(String mid, String eid, String hdebut,String hfin, String etat) {
		super();
		this.matiereId = mid;
		this.etudiantId = eid;
		this.hdebut = hdebut;
		this.hfin = hfin;
		this.date = new Date();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMatiereId() {
		return matiereId;
	}

	public void setMatiereId(String matiereId) {
		this.matiereId = matiereId;
	}

	public String getEtudiantId() {
		return etudiantId;
	}

	public void setEtudiantId(String etudiantId) {
		this.etudiantId = etudiantId;
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
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
