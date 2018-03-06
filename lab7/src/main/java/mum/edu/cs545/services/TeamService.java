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
	
	public void Save(Team team) {
		teamDao.Create(team);
	}
	
	public Team getTeam(int teamKey) {
		return teamDao.Retrive(teamKey);
	}
	
	public void Update(int teamKey, Team team) {
		teamDao.Update(teamKey, team);
		
	}
	
	public void Delete(int teamKey) {
		teamDao.Delete(teamKey);
	}

}
