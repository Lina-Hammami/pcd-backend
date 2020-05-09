package edu.ensi.pcd.backend.repos;

import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.backend.models.Horaire;

public interface HoraireRepository extends MongoRepository<Horaire, String>{
}
