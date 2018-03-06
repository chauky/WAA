package mum.edu.cs545.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mum.edu.cs545.Team;
import mum.edu.cs545.dao.TeamDao;

@Component
public class TeamService {
	TeamDao teamDao;
	
	@Autowired
	TeamService(TeamDao teamDao){
		this.teamDao = teamDao;
	}
	
	public List<Team> getAll() {
		return teamDao.getAll();
	}
	
	public void Save() {
		teamDao.Create();
	}
	
	public Team getTeam(String teamKey) {
		return teamDao.Retrive(teamKey);
	}
	
	public void Update(String teamKey) {
		teamDao.Update(teamKey);
		
	}
	
	public void Delete(String teamKey) {
		teamDao.Delete(teamKey);
	}

}
