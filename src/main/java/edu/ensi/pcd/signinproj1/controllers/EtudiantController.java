package edu.ensi.pcd.signinproj1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.ensi.pcd.signinproj1.models.Absence;
import edu.ensi.pcd.signinproj1.services.EtudiantService;

@RestController
@CrossOrigin(origins = {"http://localhost:8080","http://localhost:8086", "http://localhost:4200"})
public class EtudiantController {
	@Autowired
	private EtudiantService etudiantService;
	
	 @RequestMapping(path = "/etudiant/sesAbsences", method = RequestMethod.GET)
     public List<Absence> consulterSesAbsences(@RequestBody String id){
			return etudiantService.getSesAbsences(id);
					

	 }
	

	

	
	
}
