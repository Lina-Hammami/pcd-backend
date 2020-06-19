package edu.ensi.pcd.signinproj1.repos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.signinproj1.models.Seance;

public interface SeanceRepository extends MongoRepository<Seance, String>{

	List<Seance> findAllByProfId(String profId);
}
