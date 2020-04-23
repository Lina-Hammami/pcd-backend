package edu.ensi.pcd.backend.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.backend.models.Matiere;

public interface MatiereRepository extends MongoRepository<Matiere,String> {

}
