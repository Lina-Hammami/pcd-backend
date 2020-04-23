package edu.ensi.pcd.backend.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.backend.models.Professeur;


public interface ProfesseurRepository extends MongoRepository<Professeur, String>{
	Professeur findByEmail(String email);
}
