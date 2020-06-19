package edu.ensi.pcd.signinproj1.repos;

import java.util.List;

import edu.ensi.pcd.signinproj1.models.Matiere;

//@Repository
public interface MatiereRepositoryCustom {
	List<Matiere> mesMatieresParProfesseurId();
}
