package edu.ensi.pcd.signinproj1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ensi.pcd.signinproj1.response.MessageResponse;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}
	
	@GetMapping("/user")
	@PreAuthorize("hasRole('USER') or hasRole('PROF') or hasRole('ADMIN') or hasRole('ETUDIANT')")
	public String userAccess() {
		return "User Content.";
	}

	@GetMapping("/etudiant")
	@PreAuthorize("hasRole('ETUDIANT')")
	public String moderatorAccess() {
		return "Etudiant Board.";
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return "Admin Board.";
	}
	@GetMapping("/prof")
	@PreAuthorize("hasRole('PROF')")
	public String profAccess() {
		return "Prof Board.";
	}

}