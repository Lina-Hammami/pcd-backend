package edu.ensi.pcd.signinproj1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ensi.pcd.signinproj1.models.Administrateur;
import edu.ensi.pcd.signinproj1.models.Etudiant;
import edu.ensi.pcd.signinproj1.models.Matiere;
import edu.ensi.pcd.signinproj1.models.Professeur;
import edu.ensi.pcd.signinproj1.repos.AdministrateurRepository;
import edu.ensi.pcd.signinproj1.repos.EtudiantRepository;
import edu.ensi.pcd.signinproj1.repos.MatiereRepository;
import edu.ensi.pcd.signinproj1.repos.ProfesseurRepository;

@Service
public class AdministrateurService {

	@Autowired
	private AdministrateurRepository administrateurRepository;
	@Autowired
	private ProfesseurRepository professeurRepository;
	@Autowired
	private EtudiantRepository etudiantRepository;
	@Autowired
	private MatiereRepository matiereRepository;
	
	// Authentication
	public Administrateur getAdministrateurByEmail(String email) {
		Administrateur admin = administrateurRepository.findByEmail(email);
		if(admin == null) {
			System.out.println("Admin not found");
		}
		return admin;
	}
	
	public Administrateur saveAdministrateur(Administrateur administrateur) {
		administrateurRepository.save(administrateur);
		return administrateur;
	}
	
	// Find ALLs
	public List<Etudiant> getAllEtudiants() {
		return etudiantRepository.findAll();
	}

	public List<Professeur> getAllProfesseurs() {
		return professeurRepository.findAll();
	}

	public List<Matiere> getAllMatieres() {
		return matiereRepository.findAll();
	}
	
	// Add record
	public Professeur saveProfesseur(Professeur professeur) {
		return professeurRepository.save(professeur);
	}

	public Etudiant saveEtudiant(Etudiant etudiant) {
		return etudiantRepository.save(etudiant);
	}

	public Matiere saveMatiere(Matiere matiere) {
		return matiereRepository.save(matiere);
	}

}
