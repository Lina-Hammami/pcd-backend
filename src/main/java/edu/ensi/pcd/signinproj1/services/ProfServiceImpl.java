package edu.ensi.pcd.signinproj1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ensi.pcd.signinproj1.models.Absence;
import edu.ensi.pcd.signinproj1.models.Classe;
import edu.ensi.pcd.signinproj1.models.Etudiant;
import edu.ensi.pcd.signinproj1.models.Matiere;
import edu.ensi.pcd.signinproj1.models.Professeur;
import edu.ensi.pcd.signinproj1.models.Seance;
import edu.ensi.pcd.signinproj1.repos.AbsenceRepository;
import edu.ensi.pcd.signinproj1.repos.ClasseRepository;
import edu.ensi.pcd.signinproj1.repos.EtudiantRepository;
import edu.ensi.pcd.signinproj1.repos.MatiereRepository;
import edu.ensi.pcd.signinproj1.repos.ProfesseurRepository;
import edu.ensi.pcd.signinproj1.repos.SeanceRepository;

@Service
public class ProfServiceImpl implements  ProfService{
	@Autowired
	private SeanceRepository seanceRepository;
	@Autowired
	private AbsenceRepository absenceRepository;
	@Autowired
	private ClasseRepository classeRepository;
	@Autowired
	private MatiereRepository matiereRepository;
	@Autowired
	private ProfesseurRepository professeurRepository;
	@Autowired
	private EtudiantRepository etudiantRepository;

	@Override
	public List<Matiere> getAllMatieres() {
		return matiereRepository.findAll();
	}

	@Override
	public List<Classe> getAllClasses() {
		return classeRepository.findAll();
	}

	@Override
	public Seance saveSeance(Seance seance) {
		return seanceRepository.save(seance);
	}

	@Override
	public void deleteSeance(String id) {
	    seanceRepository.deleteById(id);
	}

	//-----------------------------
	

	@Override
	public Optional<Professeur> getInfoByUserId(String id) {
		return professeurRepository.findByUserId(id);
	}

	@Override
	public List<Matiere> getMesMatieresByUserId(String userId) {
		return matiereRepository.findAll();   //to fix 
	}

	@Override
	public List<Classe> getMesClassesByUserId(String userId) {
		return classeRepository.findAll();    //tofix  later
	}


	@Override
	public void deleteAllSeances() {
		// TODO Auto-generated method stub
	    //seanceRepository.deleteByUserId();//tofix later

	}

	@Override
	public Absence saveAbsence(Absence absence) {
		return absenceRepository.save(absence);
	}

	@Override
	public void deleteAbsence(String absId) {
	    seanceRepository.deleteById(absId);

	}

	@Override
	public List<Etudiant> getEtudiantsByClasseId(String classId) {
		return etudiantRepository.findAllByClasseId(classId);
	}

	@Override
	public List<Absence> saveManyAbsence(List<Absence> listabsence) {
		return absenceRepository.saveAll(listabsence);
	}

	@Override
	public List<Seance> getSeancesbyProfId(String profId) {
		// TODO Auto-generated method stub
		return seanceRepository.findAllByProfId(profId);
	}

}
