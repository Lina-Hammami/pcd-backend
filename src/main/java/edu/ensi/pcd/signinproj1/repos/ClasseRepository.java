package edu.ensi.pcd.signinproj1.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.signinproj1.models.Classe;

public interface ClasseRepository extends MongoRepository<Classe, String>{
}
