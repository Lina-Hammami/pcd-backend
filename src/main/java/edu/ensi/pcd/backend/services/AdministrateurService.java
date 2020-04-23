package edu.ensi.pcd.backend.services;

import java.util.List;

import edu.ensi.pcd.backend.models.Absence;
import edu.ensi.pcd.backend.models.Administrateur;
import edu.ensi.pcd.backend.models.Alerte;
import edu.ensi.pcd.backend.models.Classe;
import edu.ensi.pcd.backend.models.Emploi;
import edu.ensi.pcd.backend.models.Etudiant;
import edu.ensi.pcd.backend.models.Horaire;
import edu.ensi.pcd.backend.models.Matiere;
import edu.ensi.pcd.backend.models.Professeur;
import edu.ensi.pcd.backend.models.Salle;
import edu.ensi.pcd.backend.models.Seance;

public interface AdministrateurService {
	
	Administrateur getAdministrateurByEmail(String email);
	Administrateur saveAdministrateur(Administrateur administrateur) ;
	List<Etudiant> getAllEtudiants() ;
    List<Professeur> getAllProfesseurs();
	List<Classe> getAllClasses();
	List<Matiere> getAllMatieres();
	List<Salle> getAllSalles();
	List<Horaire> getAllHoraires();
	List<Seance> getAllSeances();
	List<Absence> getAllAbsences();
	List<Emploi> getAllEmplois();
	List<Alerte> getAllAlertes();
	Professeur saveProfesseur(Professeur professeur);
	Etudiant saveEtudiant(Etudiant etudiant);
	Classe saveClasse(Classe classe);
	Matiere saveMatiere(Matiere matiere);
	Salle saveSalle(Salle salle);
	Horaire saveHoraire(Horaire horaire);
	Seance saveSeance(Seance seance);
	Emploi saveEmploi(Emploi emploi);
	Absence saveAbsence(Absence absence);
	Alerte saveAlerte(Alerte alerte);
	void deleteProfesseur(Professeur professeur);
	void deleteEtudiant(Etudiant etudiant);
	void deleteSalle(Salle salle);
	void deleteHoraire(Horaire horaire);
	void deleteMatiere(Matiere matiere);

	
	
	

	


}
