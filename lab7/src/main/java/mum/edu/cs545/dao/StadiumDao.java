package mum.edu.cs545.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import mum.edu.cs545.Stadium;
import mum.edu.cs545.Team;

@Component
public class StadiumDao {
	private static int idCount = 1;
	private Map<Integer, Stadium> stadiums = new HashMap<>();
	
	public List<Stadium> getAll() {
		return new ArrayList<Stadium>(stadiums.values());
	}
	
	public void Create() {
		
	}
	
	public Stadium Retrive(String stadiumKey) {
		return null;
	}
	
	public void Update(String stadiumKey) {
		
	}
	
	public void Delete(String stadiumKey) {
		
	}
}
