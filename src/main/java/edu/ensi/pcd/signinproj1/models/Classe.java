package edu.ensi.pcd.signinproj1.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="classes")
public class Classe {
	@Id
	private String id;
	private List<Etudiant> listEtudiants;
	
	
	public Classe() {
		super();
	}
	public Classe(String id, List<Etudiant> listEtudiants) {
		super();
		this.id = id;
		this.listEtudiants = listEtudiants;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Etudiant> getListEtudiants() {
		return listEtudiants;
	}
	public void setListEtudiants(List<Etudiant> listEtudiants) {
		this.listEtudiants = listEtudiants;
	}
	
	

}
