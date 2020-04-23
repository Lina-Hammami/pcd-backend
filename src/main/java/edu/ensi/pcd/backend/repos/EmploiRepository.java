package edu.ensi.pcd.backend.repos;

import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.backend.models.Emploi;

public interface EmploiRepository extends MongoRepository<Emploi, String>{
	//Emploi findByProfesseur_id(String professeur_id);
}
