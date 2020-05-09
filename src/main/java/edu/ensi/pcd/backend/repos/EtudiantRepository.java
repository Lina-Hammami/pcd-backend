package edu.ensi.pcd.backend.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.backend.models.Etudiant;

public interface EtudiantRepository extends MongoRepository<Etudiant, String>{
	Etudiant findByEmail(String email);
}
