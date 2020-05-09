package edu.ensi.pcd.backend.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.backend.models.Administrateur;

public interface AdministrateurRepository extends MongoRepository<Administrateur, String>{
	Administrateur findByEmail(String email);
}
