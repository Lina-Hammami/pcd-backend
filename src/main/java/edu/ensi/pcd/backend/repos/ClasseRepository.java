package edu.ensi.pcd.backend.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.backend.models.Classe;

public interface ClasseRepository extends MongoRepository<Classe, String>{
}
