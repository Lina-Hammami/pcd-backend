package edu.ensi.pcd.signinproj1.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="salles")
public class Salle {
	private String id;
	private String etage;
	private String surface; // ou nb_places posssibles 
	private String nb_prises;
	private String datashow; //etat du datashow, j'ai vu que c'est un peut important en terme du gain du temps
	private String recommondation; // ken famma probleme mte3 7aja mkassra wla mahlouka, wla ay remarque okhra :p 
	private long timestamp;
	
	public Salle() {
		super();
	}
	public Salle(String id, String etage, String surface, String nb_prises, String datashow, String recommondation) {
		super();
		this.id = id;
		this.etage = etage;
		this.surface = surface;
		this.nb_prises = nb_prises;
		this.datashow = datashow;
		this.recommondation = recommondation;
		this.timestamp = System.currentTimeMillis();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEtage() {
		return etage;
	}
	public void setEtage(String etage) {
		this.etage = etage;
	}
	public String getSurface() {
		return surface;
	}
	public void setSurface(String surface) {
		this.surface = surface;
	}
	public String getNb_prises() {
		return nb_prises;
	}
	public void setNb_prises(String nb_prises) {
		this.nb_prises = nb_prises;
	}
	public String getDatashow() {
		return datashow;
	}
	public void setDatashow(String datashow) {
		this.datashow = datashow;
	}
	public String getRecommondation() {
		return recommondation;
	}
	public void setRecommondation(String recommondation) {
		this.recommondation = recommondation;
	}
	
}
