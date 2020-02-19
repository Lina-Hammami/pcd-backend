package edu.ensi.pcd.signinproj1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.ensi.pcd.signinproj1.models.Absence;
import edu.ensi.pcd.signinproj1.models.Administrateur;
import edu.ensi.pcd.signinproj1.models.Alerte;
import edu.ensi.pcd.signinproj1.models.Classe;
import edu.ensi.pcd.signinproj1.models.Emploi;
import edu.ensi.pcd.signinproj1.models.Etudiant;
import edu.ensi.pcd.signinproj1.models.Horaire;
import edu.ensi.pcd.signinproj1.models.Matiere;
import edu.ensi.pcd.signinproj1.models.Professeur;
import edu.ensi.pcd.signinproj1.models.Salle;
import edu.ensi.pcd.signinproj1.models.Seance;
import edu.ensi.pcd.signinproj1.repos.SignInRequete;
import edu.ensi.pcd.signinproj1.services.AdministrateurService;

@RestController
@CrossOrigin(origins = {"http://localhost:8082","http://localhost:8100", "http://localhost:4200"})
public class AdministrateurController {

	@Autowired
	private AdministrateurService administrateurService;
	
	// Authentication
	@PostMapping("/login")
	public Administrateur signinAdministrateur(@RequestBody SignInRequete signInRequete) {
		return administrateurService.getAdministrateurByEmail(signInRequete.getEmail());
	}
	
	@PostMapping("/register")
	public Administrateur registerAdministrateur(@RequestBody Administrateur administrateur) {
		return administrateurService.saveAdministrateur(administrateur); 
	}
	
	// Get all records
	@GetMapping("/all/etudiants")
	public List<Etudiant> getAllEdudiants(){
		return administrateurService.getAllEtudiants();
	}
	
	@GetMapping("/all/professeurs")
	public List<Professeur> getAllProfesseurs(){
		return administrateurService.getAllProfesseurs();
	}
	
	@GetMapping("/all/matieres")
	public List<Matiere> getAllMatieres(){
		return administrateurService.getAllMatieres();
	}
	
	// Add records
	@PostMapping("/add/professeur")
	public Professeur addProfesseur(@RequestBody Professeur professeur) {
		return administrateurService.saveProfesseur(professeur); 
	}
	@PostMapping("/add/etudiant")
	public Etudiant registerEtudiant(@RequestBody Etudiant etudiant) {
		return administrateurService.saveEtudiant(etudiant); 
	}
	@PostMapping("/add/classe")
	public Classe addClasse(@RequestBody Classe classe) {
		return administrateurService.saveClasse(classe); 
	}
	@PostMapping("/add/matiere")
	public Matiere addMatiere(@RequestBody Matiere matiere) {
		return administrateurService.saveMatiere(matiere); 
	}
	@PostMapping("/add/salle")
	public Salle addSalle(@RequestBody Salle salle) {
		return administrateurService.saveSalle(salle); 
	}
	@PostMapping("/add/horaire")
	public Horaire addHoraire(@RequestBody Horaire matiere) {
		return administrateurService.saveHoraire(matiere); 
	}
	@PostMapping("/add/seance")
	public Seance addSeance(@RequestBody Seance seance) {
		return administrateurService.saveSeance(seance); 
	}
	@PostMapping("/add/emploi")
	public Emploi addEmploi(@RequestBody Emploi emploi) {
		return administrateurService.saveEmploi(emploi); 
	}
	@PostMapping("/add/absence")
	public Absence addAbsence(@RequestBody Absence absence) {
		return administrateurService.saveAbsence(absence); 
	}
	@PostMapping("/add/alerte")
	public Alerte addAlerte(@RequestBody Alerte alerte) {
		return administrateurService.saveAlerte(alerte); 
	}
	
}
