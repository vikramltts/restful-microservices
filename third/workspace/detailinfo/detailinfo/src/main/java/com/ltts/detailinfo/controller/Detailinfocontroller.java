package com.ltts.detailinfo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ltts.detailinfo.model.Team;

@RestController
public class Detailinfocontroller {
	@Autowired
	RestTemplate rt; 
	@RequestMapping("/detail")
	public List<Team> getExternalTeam()
	{
		ResponseEntity<Team[]> response=rt.getForEntity("http://localhost:8080/teams/", Team[].class);
		Team[] teams=response.getBody();
		List<Team> li=Arrays.asList(teams);
		return li;
	}
} 