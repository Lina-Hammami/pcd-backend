package edu.ensi.pcd.signinproj1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ensi.pcd.signinproj1.models.Absence;
import edu.ensi.pcd.signinproj1.repos.AbsenceRepository;
@Service
public class EtudiantServiceImpl implements EtudiantService {
	@Autowired
	private AbsenceRepository absenceRepository;



	@Override
	public List<Absence> getSesAbsences(String id) {
		return absenceRepository.findSesAbsences(id);
	}

}
