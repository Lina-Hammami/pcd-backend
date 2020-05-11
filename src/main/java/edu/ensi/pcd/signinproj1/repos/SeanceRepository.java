package edu.ensi.pcd.signinproj1.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.signinproj1.models.Seance;

public interface SeanceRepository extends MongoRepository<Seance, String>{
	//Seance findByHoraire_id(String horaire_id);
	//Seance findByClasse_id(String classe_id);
}
