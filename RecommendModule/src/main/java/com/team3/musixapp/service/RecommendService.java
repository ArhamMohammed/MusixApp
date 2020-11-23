package com.team3.musixapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team3.musixapp.exception.SongAlreadyExistsException;
import com.team3.musixapp.model.Recommend;
import com.team3.musixapp.repository.RecommendRepository;

@Service
public class RecommendService {
	@Autowired
	private RecommendRepository recommendrepository;
	
	public Recommend saveModel(Recommend recommend) throws SongAlreadyExistsException {
		Optional<Recommend> opt=recommendrepository.findByUsernameAndUrl(recommend.getUsername(),recommend.getUrl());
		if(opt.isPresent())
		{
			 throw new SongAlreadyExistsException();
		}
		else
		{
		Recommend savedata=recommendrepository.save(recommend);
		return savedata;
		}

	}

	public List<Recommend> getModelByEmail(String user)throws Exception 
	{

		List<Recommend> list=recommendrepository.findAllByUsername(user);
		return list;
	}


}
