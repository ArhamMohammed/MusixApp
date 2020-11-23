package com.team3.musixapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.team3.musixapp.model.Recommend;

import com.team3.musixapp.service.RecommendService;

@CrossOrigin
@RestController
@RequestMapping("/recommend")
public class RecommendController {

	@Autowired
	private RecommendService recs;
	
	
	@PostMapping("/recommendSong")
	public ResponseEntity<?> saveSong(@RequestBody Recommend b)
		 {
			ResponseEntity<?> rs = null;
			try {
				Recommend bk = recs.saveModel(b);
				if(bk != null)
					rs = ResponseEntity.
						status(HttpStatus.CREATED).build();
				else
			rs = ResponseEntity.
				status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
			catch(Exception e) {
		rs = ResponseEntity.status(HttpStatus.CONFLICT).build();
			}
			return rs;
		}
	
	@GetMapping("/getrecommendSong/{username}")
	public ResponseEntity<?> getSong(@PathVariable("username") String username)
		throws Exception
	{
		ResponseEntity<?> rs = null;
		try {
			List<Recommend> b = recs.getModelByEmail(username);
			rs = ResponseEntity.status(HttpStatus.OK).body(b);
		}
		catch(Exception e) {
			rs = ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
		return rs;
	}
}
