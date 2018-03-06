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
		
		Create(new Team("name","city", "mascot",players,"homeUniform", "visitUniform", null, null));
		Create(new Team("name","city", "mascot",players,"homeUniform", "visitUniform", null, null));
		
	}
	
	public List<Team> getAll() {
		return new ArrayList<Team>(teams.values());
	}

	public void Create(Team team) {
		team.setTeamKey(idCount);
		teams.put(idCount, team);
		idCount++;
	}
	
	
	public Team Retrive(int teamKey) {
		Team result = teams.get(teamKey);

		if (result == null) {
			System.out.print("cannot get team with teamkey");
		}

		return result;
	}
	
	public void Update(int teamKey, Team team) {
		teams.put(teamKey, team);
	}
	
	public void Delete(int teamKey) {
		Team removed = teams.remove(teamKey);
		if (removed == null) {
			System.out.print("Cannot remove team");
		}
	}
}
