package mum.edu.cs545.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import mum.edu.cs545.Match;
import mum.edu.cs545.Player;
import mum.edu.cs545.Team;


@Component
public class TeamDao {
	private static int idCount = 1;
	private Map<Integer, Team> teams = new HashMap<>();
	private List<Player> players= new ArrayList<>();
	private	List<Match> matchesAsHome = new ArrayList<>();
	
	public TeamDao() {
		players.add(new Player("1","Ronaldo",20, "Attacher"));
		players.add(new Player("2","David",22, "Goal Keeper"));
		
//		add(new Team());
//		add(new Team());
	}
	
	public List<Team> getAll() {
		return new ArrayList<Team>(teams.values());
	}
	
	public void add(Team team) {
		team.setTeamKey(idCount);
		teams.put(idCount, team);
		idCount++;
	}

	public void Create() {
		
	}
	
	public Team Retrive(String teamKey) {
		return null;
	}
	
	public void Update(String teamKey) {
		
	}
	
	public void Delete(String teamKey) {
		
	}
}
