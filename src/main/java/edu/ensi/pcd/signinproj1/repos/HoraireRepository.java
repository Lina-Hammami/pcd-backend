package edu.ensi.pcd.signinproj1.repos;

import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.signinproj1.models.Horaire;

public interface HoraireRepository extends MongoRepository<Horaire, String>{
}
