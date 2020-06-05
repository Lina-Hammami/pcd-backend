package edu.ensi.pcd.signinproj1.repos;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.signinproj1.models.Professeur;


public interface ProfesseurRepository extends MongoRepository<Professeur, String>{
	Professeur findByUserId(String userId);
}
