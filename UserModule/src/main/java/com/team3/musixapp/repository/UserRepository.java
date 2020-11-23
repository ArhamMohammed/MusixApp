package com.team3.musixapp.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.team3.musixapp.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{
	User findByEmail(String email);
	User findByEmailAndPassword(String email, String password);
	User getUserById(int id);
}
