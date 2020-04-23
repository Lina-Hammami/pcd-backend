package edu.ensi.pcd.backend.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.backend.models.Seance;

public interface SeanceRepository extends MongoRepository<Seance, String>{
	//Seance findByHoraire_id(String horaire_id);
	//Seance findByClasse_id(String classe_id);
}
