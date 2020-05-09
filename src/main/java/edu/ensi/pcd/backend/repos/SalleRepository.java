package edu.ensi.pcd.backend.repos;

import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.backend.models.Salle;

public interface SalleRepository extends MongoRepository<Salle, String>{
}
