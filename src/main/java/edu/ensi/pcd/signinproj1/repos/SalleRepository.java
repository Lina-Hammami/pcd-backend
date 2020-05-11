package edu.ensi.pcd.signinproj1.repos;

import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.signinproj1.models.Salle;

public interface SalleRepository extends MongoRepository<Salle, String>{
}
