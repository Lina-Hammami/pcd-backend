package edu.ensi.pcd.signinproj1.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.signinproj1.models.Matiere;

public interface MatiereRepository extends MongoRepository<Matiere, String>{
	Matiere findByName(String name);
}
