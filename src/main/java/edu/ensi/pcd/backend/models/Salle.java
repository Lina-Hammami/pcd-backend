package edu.ensi.pcd.backend.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="salles")
public class Salle {
	private String id;

	private String num;
	private String etage;
	private String nombrePlacesPossibles; 
	private String type;
	private String etatDatashow; 
	private long timestamp;
	
	public Salle() {
		super();
	}
	public Salle(String num, String etage, String nombrePlacesPossibles, String type, String etatDatashow) {
		super();
		this.num = num;
		this.etage = etage;
		this.nombrePlacesPossibles = nombrePlacesPossibles;
		this.type = type;
		this.etatDatashow = etatDatashow;
		this.timestamp = System.currentTimeMillis();
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getEtage() {
		return etage;
	}
	public void setEtage(String etage) {
		this.etage = etage;
	}
	public String getNombrePlacesPossibles() {
		return nombrePlacesPossibles;
	}
	public void setNombrePlacesPossibles(String nombrePlacesPossibles) {
		this.nombrePlacesPossibles = nombrePlacesPossibles;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEtatDatashow() {
		return etatDatashow;
	}
	public void setEtatDatashow(String etatDatashow) {
		this.etatDatashow = etatDatashow;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

	
}
