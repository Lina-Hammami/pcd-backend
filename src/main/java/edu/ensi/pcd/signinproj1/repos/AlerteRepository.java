package edu.ensi.pcd.signinproj1.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.signinproj1.models.Alerte;


public interface AlerteRepository extends MongoRepository<Alerte, String>{
	//Alerte findByEtudiant_id(String etudiant_id);
	//Alerte findByMatiere_id(String matiere_id);
}
