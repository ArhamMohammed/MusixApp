package com.project.musix.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.musix.model.User;



// Extending the CrudRepository interface which have predefined methods for CRUD operations
@Repository
public interface UserRepository extends CrudRepository<User, String> {
	
	// Defining an extra query for validation purpose
	@Query("select u from User u where u.username= ?1 and u.password= ?2")
	User validate(String username, String password);
	
}