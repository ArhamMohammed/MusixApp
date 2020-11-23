package com.team3.musixapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.team3.musixapp.model.Recommend;

public interface RecommendRepository  extends MongoRepository<Recommend,Integer>{
	Optional<Recommend> findByUsername(String username);
	List<Recommend> findAllByUsername(String username);
	Optional<Recommend> findByUsernameAndUrl(String username,String url);
}
