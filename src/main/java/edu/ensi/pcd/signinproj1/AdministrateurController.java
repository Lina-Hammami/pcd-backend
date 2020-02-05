package edu.ensi.pcd.signinproj1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.ensi.pcd.signinproj1.models.Administrateur;
import edu.ensi.pcd.signinproj1.models.Etudiant;
import edu.ensi.pcd.signinproj1.models.Matiere;
import edu.ensi.pcd.signinproj1.models.Professeur;
import edu.ensi.pcd.signinproj1.repos.SignInRequete;

@RestController
@CrossOrigin(origins = {"http://localhost:8100","http://localhost:8080"})
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
	public Professeur registerProfesseur(@RequestBody Professeur professeur) {
		return administrateurService.saveProfesseur(professeur); 
	}
	@PostMapping("/add/etudiant")
	public Etudiant registerEtudiant(@RequestBody Etudiant etudiant) {
		return administrateurService.saveEtudiant(etudiant); 
	}
	@PostMapping("/add/matiere")
	public Matiere registerMatiere(@RequestBody Matiere matiere) {
		return administrateurService.saveMatiere(matiere); 
	}
	
}
