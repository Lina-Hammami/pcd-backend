package edu.ensi.pcd.signinproj1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import edu.ensi.pcd.signinproj1.repos.AbsenceRepository;
import edu.ensi.pcd.signinproj1.repos.AdministrateurRepository;
import edu.ensi.pcd.signinproj1.repos.AlerteRepository;
import edu.ensi.pcd.signinproj1.repos.ClasseRepository;
import edu.ensi.pcd.signinproj1.repos.EmploiRepository;
import edu.ensi.pcd.signinproj1.repos.EtudiantRepository;
import edu.ensi.pcd.signinproj1.repos.HoraireRepository;
import edu.ensi.pcd.signinproj1.repos.MatiereRepository;
import edu.ensi.pcd.signinproj1.repos.ProfesseurRepository;
import edu.ensi.pcd.signinproj1.repos.SalleRepository;
import edu.ensi.pcd.signinproj1.repos.SeanceRepository;

@Service
public class AdministrateurServiceImpl implements AdministrateurService {

	@Autowired
	private AdministrateurRepository administrateurRepository;
	@Autowired
	private ProfesseurRepository professeurRepository;
	@Autowired
	private EtudiantRepository etudiantRepository;
	@Autowired
	private ClasseRepository classeRepository;
	@Autowired
	private MatiereRepository matiereRepository;
	@Autowired
	private SalleRepository salleRepository;
	@Autowired
	private HoraireRepository horaireRepository;
	@Autowired
	private SeanceRepository seanceRepository;
	@Autowired
	private AbsenceRepository absenceRepository;
	@Autowired
	private EmploiRepository emploiRepository;
	@Autowired
	private AlerteRepository alerteRepository;

	
	/************************************************* consultations ***************************************************/

	/* UC:
	 * un administrateur peut se connecter via l'application web 
	 * */
	public Administrateur getAdministrateurByEmail(String email) {
		Administrateur admin = administrateurRepository.findByEmail(email);
		if(admin == null) {
			System.out.println("Admin not found");
		}
		return admin;
	}
	
	/*
	 * Tst:
	 * pour créer un administrateur 
	 * */
	public Administrateur saveAdministrateur(Administrateur administrateur) {
		administrateurRepository.save(administrateur);
		return administrateur;
	}
	
	/**
	 * UC:
	 * un administrateur peut consulter tout les étudiants
	 * */
	public List<Etudiant> getAllEtudiants() {
		return etudiantRepository.findAll();
	}

	/**
	 * UC:
	 * un administrateur peut consulter tout les professeurs
	 * */
	public List<Professeur> getAllProfesseurs() {
		return professeurRepository.findAll();
	}
	
	/**
	 * UC:
	 * un administrateur peut consulter toutes les classes
	 * */
	public List<Classe> getAllClasses() {
		return classeRepository.findAll();
	}
	
	/**
	 * UC:
	 * un administrateur peut consulter toutes les matieres
	 * */
   public List<Matiere> getAllMatieres() {
		return matiereRepository.findAll();
	}
	
	/**
	 * UC:
	 * un administrateur peut consulter toutes les salles
	 * */
	public List<Salle> getAllSalles() {
		return salleRepository.findAll();
	}

	/**
	 * UC:
	 * un administrateur peut consulter toutes les horaires
	 * */
	public List<Horaire> getAllHoraires() {
		return horaireRepository.findAll();
	}
	
	/**
	 * Tst:
	 * consulter les seances
	 * */
	public List<Seance> getAllSeances() {
		return seanceRepository.findAll();
	}
	
	/**
	 * Tst:
	 * consulter les absences
	 * */
	public List<Absence> getAllAbsences() {
		return absenceRepository.findAll();
	}
	
	/**
	 * Tst:
	 * consulter les emplois
	 * */
	public List<Emploi> getAllEmplois() {
		return emploiRepository.findAll();
	}
	

	/**
	 * Tst:
	 * consulter les alerte
	 * */
	public List<Alerte> getAllAlertes() {
		return alerteRepository.findAll();
	}
	
	/************************************************* créations ***************************************************/

	/**
	 * UC:
	 * un administrateur peut ajouter un professeur
	 * */
	public Professeur saveProfesseur(Professeur professeur) {
		return professeurRepository.save(professeur);
	}
	
	/**
	 * UC:
	 * un administrateur peut ajouter un étudiant
	 * */
	public Etudiant saveEtudiant(Etudiant etudiant) {
		return etudiantRepository.save(etudiant);
	}
	
	/**
	 * UC:
	 * un administrateur peut ajouter une classe
	 * */
	public Classe saveClasse(Classe classe) {
		return classeRepository.save(classe);
	}

	/**
	 * UC:
	 * un administrateur peut ajouter une matière
	 * */
	public Matiere saveMatiere(Matiere matiere) {
		return matiereRepository.save(matiere);
	}
	
	
	/**
	 * UC:
	 * un administrateur peut ajouter une matière
	 * */
	public Salle saveSalle(Salle salle) {
		return salleRepository.save(salle);
	}
	
	/**
	 * UC:
	 * un administrateur peut ajouter une matière
	 * */
	public Horaire saveHoraire(Horaire horaire) {
		return horaireRepository.save(horaire);
	}
	
	/**
	 * UC:
	 * un administrateur peut ajouter une seance
	 * */
	public Seance saveSeance(Seance seance) {
		return seanceRepository.save(seance);
	}
	
	/**
	 * UC:
	 * un administrateur peut ajouter une emploi
	 * */
	public Emploi saveEmploi(Emploi emploi) {
		return emploiRepository.save(emploi);
	}
	
	/**
	 * UC:
	 * un administrateur peut ajouter une absence
	 * */
	public Absence saveAbsence(Absence absence) {
		return absenceRepository.save(absence);
	}
	
	/**
	 * UC:
	 * un administrateur peut ajouter une alerte
	 * */
	public Alerte saveAlerte(Alerte alerte) {
		return alerteRepository.save(alerte);
	}

	
	public void deleteProfesseur(Professeur professeur) {
		professeurRepository.delete(professeur);
		
	}

	@Override
	public void deleteEtudiant(Etudiant etudiant) {
		etudiantRepository.delete(etudiant);
		
	}


	@Override
	public void deleteSalle(Salle salle) {
		salleRepository.delete(salle);
	}

	@Override
	public void deleteHoraire(Horaire horaire) {
		horaireRepository.delete(horaire);		
	}

	@Override
	public void deleteMatiere(Matiere matiere) {
		matiereRepository.delete(matiere);
		
	}



}
