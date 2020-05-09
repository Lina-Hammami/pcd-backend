package edu.ensi.pcd.signinproj1.repos;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ensi.pcd.signinproj1.models.ERole;
import edu.ensi.pcd.signinproj1.models.Role;


public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}