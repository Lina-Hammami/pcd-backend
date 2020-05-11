package edu.ensi.pcd.signinproj1.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.signinproj1.models.Administrateur;

public interface AdministrateurRepository extends MongoRepository<Administrateur, String>{
	Administrateur findByEmail(String email);
}
