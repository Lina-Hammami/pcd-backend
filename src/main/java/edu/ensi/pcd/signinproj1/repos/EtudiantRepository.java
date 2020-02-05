package edu.ensi.pcd.signinproj1.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import edu.ensi.pcd.signinproj1.models.Etudiant;

public interface EtudiantRepository extends MongoRepository<Etudiant, String>{
	Etudiant findByEmail(String email);
}
