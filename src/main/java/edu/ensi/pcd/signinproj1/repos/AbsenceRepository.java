package edu.ensi.pcd.signinproj1.repos;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import edu.ensi.pcd.signinproj1.models.Absence;

public interface AbsenceRepository extends MongoRepository<Absence, String>{
	 //
	//Absence findBySeanceIdAndDate(String seance_id, Date date);
	//Absence findByEtudiant_idAndDate(String etudiant_id, Date date);
	//Absence findByDate(Date date);
	@Query("select a from Absence where a.etudiant_id=?1" )
	List<Absence> findSesAbsences(String id);

}
