package edu.ensi.pcd.signinproj1.controllers;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ensi.pcd.signinproj1.models.Absence;
import edu.ensi.pcd.signinproj1.models.Classe;
import edu.ensi.pcd.signinproj1.models.Etudiant;
import edu.ensi.pcd.signinproj1.models.Matiere;
import edu.ensi.pcd.signinproj1.models.Professeur;
import edu.ensi.pcd.signinproj1.models.Seance;
import edu.ensi.pcd.signinproj1.services.ProfService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/prof")
public class ProfController {

	@Autowired
	private ProfService profService;
	

	// emploi page srv
	
	@GetMapping("/all/classes")
	@PreAuthorize("hasRole('PROF')")
	public ResponseEntity<List<Classe>> getAllClasses(){
	 try {
		    List<Classe> classes = new ArrayList<Classe>();
		    profService.getAllClasses().forEach(classes::add);
		    if (classes.isEmpty()) {
		      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		    }
		    return new ResponseEntity<>(classes, HttpStatus.OK);
		  } catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		  }
	}

	@GetMapping("/all/matieres")
	@PreAuthorize("hasRole('PROF')")
	public ResponseEntity<List<Matiere>> getAllMatieres(){
		//return profService.getAllMatieres();
		try {
		    List<Matiere> matieres = new ArrayList<Matiere>();
		    profService.getAllMatieres().forEach(matieres::add);
		    if (matieres.isEmpty()) {
		      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		    }
		    return new ResponseEntity<>(matieres, HttpStatus.OK);
		  } catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		  }
	}


	@GetMapping("/seances/{profId}")
	@PreAuthorize("hasRole('PROF')")
	public ResponseEntity<List<Seance>> getSeancesByProfId(@PathVariable("profId") String profId){
		try {
		    List<Seance> seances = new ArrayList<Seance>();
		    profService.getSeancesbyProfId(profId).forEach(seances::add);
		    if (seances.isEmpty()) {
		      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		    }
		    return new ResponseEntity<>(seances, HttpStatus.OK);
		  } catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		  }
	}
	
	@PostMapping("/add/seance")
	@PreAuthorize("hasRole('PROF')")
	public ResponseEntity<Seance> addOneSeance(@RequestBody Seance s)  {
		//return profService.saveSeance(s);
		 try {
		    Seance seance = profService.saveSeance(s);
		    return new ResponseEntity<>(seance, HttpStatus.CREATED); //tofix : works fine yet 	
		  } catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		  }
	}

	@DeleteMapping("/delete/seance/{id}")
	@PreAuthorize("hasRole('PROF')")
	public  ResponseEntity<HttpStatus> deleteSeanceById(@PathVariable("id") String id) {
		try {
			profService.deleteSeance(id);
		    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		  } catch (Exception e) {
		    return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		  }
	}
		
	
	//--------------profile page srv -----------------------------
	
	@GetMapping("/info/{userId}")
	@PreAuthorize("hasRole('PROF')")
	public ResponseEntity<Professeur> getInfo(@PathVariable("userId") String userId){
		Optional<Professeur> prof =  profService.getInfoByUserId(userId);
		 if (prof.isPresent()) {
		    return new ResponseEntity<>(prof.get(), HttpStatus.OK);
		  } else {
		    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		  }
	}

	@GetMapping("/mes/matieres/{userId}")
	@PreAuthorize("hasRole('PROF')")
	public ResponseEntity<List<Matiere>> getMesMatieres(@PathVariable("userId") String userId){
		//return profService.getMesMatieres(userId);
		try {
		    List<Matiere> matieres = new ArrayList<Matiere>();
		    profService.getMesMatieresByUserId(userId).forEach(matieres::add);//tofix later: matiere mefihech prof entity or id 
		    if (matieres.isEmpty()) {
		      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		    }
		    return new ResponseEntity<>(matieres, HttpStatus.OK);
		  } catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		  }
	}

	@GetMapping("/mes/classes/{userId}")
	@PreAuthorize("hasRole('PROF')")
	public ResponseEntity<List<Classe>> getMesClasses(@PathVariable("userId") String userId){
		//return profService.getMesClasses(userId);
		try {
		    List<Classe> classes = new ArrayList<Classe>();
		    profService.getMesClassesByUserId(userId).forEach(classes::add);//kifkif to fix later 
		    if (classes.isEmpty()) {
		      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		    }
		    return new ResponseEntity<>(classes, HttpStatus.OK);
		  } catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		  }
	}
	
	//-------------- registre page srv -----------------------------

	@GetMapping("/etudiants/{classeId}")
	@PreAuthorize("hasRole('PROF')")
	public ResponseEntity<List<Etudiant>> getEtudiantsbyClassId(@PathVariable("classeId") String classeId) {
		//return profService.getEtudiantsByClasseId(classeId);
		try {
		    List<Etudiant> etudiants = new ArrayList<Etudiant>();
		    profService.getEtudiantsByClasseId(classeId).forEach(etudiants::add);
		    if (etudiants.isEmpty()) {
		      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		    }
		    return new ResponseEntity<>(etudiants, HttpStatus.OK);//success return
		  } catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		  }
	}
	
	@PostMapping("/add/absence/one")
	@PreAuthorize("hasRole('PROF')")
	public ResponseEntity<Absence> addOneAbsence(@RequestBody Absence absence) {
		//return profService.saveAbsence(absence);
		try {
		    Absence _abs = profService.saveAbsence(absence);
		    return new ResponseEntity<>(_abs, HttpStatus.CREATED);
		  } catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		  }
	}
	
	@PostMapping("/add/absence/many")
	@PreAuthorize("hasRole('PROF')")
	public ResponseEntity<List<Absence>> addManyAbsence(@RequestBody List<Absence> listabsence) {
		//return profService.saveManyAbsence(listabsence);
		try {
			List<Absence> _abs = profService.saveManyAbsence(listabsence);
		    return new ResponseEntity<>(_abs, HttpStatus.CREATED);
		  } catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		  }
	}
	
	@DeleteMapping("/delete/absence/{id}")
	@PreAuthorize("hasRole('PROF')")
	public ResponseEntity<HttpStatus> deleteAbsenceById(@PathVariable("id") String absId) {
		//profService.deleteAbsence(absId);
		try {
			profService.deleteAbsence(absId);
		    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		  } catch (Exception e) {
		    return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		  }
	}
	
	//------------ historique srv -------

}
