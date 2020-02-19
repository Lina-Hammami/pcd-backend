package edu.ensi.pcd.signinproj1.repos;

import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.signinproj1.models.Emploi;

public interface EmploiRepository extends MongoRepository<Emploi, String>{
	//Emploi findByProfesseur_id(String professeur_id);
}
