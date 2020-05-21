package edu.ensi.pcd.signinproj1.services;

import java.util.List;
import java.util.Optional;

import edu.ensi.pcd.signinproj1.models.Absence;
import edu.ensi.pcd.signinproj1.models.Classe;
import edu.ensi.pcd.signinproj1.models.Etudiant;
import edu.ensi.pcd.signinproj1.models.Matiere;
import edu.ensi.pcd.signinproj1.models.Professeur;
import edu.ensi.pcd.signinproj1.models.Seance;

public interface ProfService {

	List<Matiere> getAllMatieres();
	List<Classe> getAllClasses();
	Seance saveSeance(Seance s);
	void deleteSeance(String id);
	void deleteAllSeances();//not impl yet

	
	Optional<Professeur> getInfoByUserId(String usrId);
	List<Matiere> getMesMatieresByUserId(String userId);
	List<Classe> getMesClassesByUserId(String userId);
	
	List<Etudiant> getEtudiantsByClasseId(String classId);
	Absence saveAbsence(Absence absence);
	List<Absence> saveManyAbsence(List<Absence> listabsence);
	void deleteAbsence(String absId);

}
