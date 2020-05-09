package edu.ensi.pcd.backend.repos;

import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.backend.models.Absence;

public interface AbsenceRepository extends MongoRepository<Absence, String>{
	//Absence findBySeanceIdAndDate(String seance_id, Date date);
	//Absence findByEtudiant_idAndDate(String etudiant_id, Date date);
	//Absence findByDate(Date date);
}
