package edu.ensi.pcd.signinproj1.repos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.signinproj1.models.Etudiant;

public interface EtudiantRepository extends MongoRepository<Etudiant, String>{

	List<Etudiant> findAllByClassId(String classId);
}
