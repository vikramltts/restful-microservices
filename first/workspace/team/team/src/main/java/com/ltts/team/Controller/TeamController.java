package com.ltts.team.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.team.Dao.TeamDao;
import com.ltts.team.model.Team;

@RestController
public class TeamController {
	@Autowired
	TeamDao td;
	@RequestMapping("/teams")
	public List<Team> getTeams()
	{
		return td.getAllTeams();
	}
}