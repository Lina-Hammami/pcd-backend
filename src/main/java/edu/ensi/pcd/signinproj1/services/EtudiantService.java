package edu.ensi.pcd.signinproj1.services;

import java.util.List;

import edu.ensi.pcd.signinproj1.models.Absence;

public interface EtudiantService {
	List<Absence> getSesAbsences(String id);

}
