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
	
	public void Create(Stadium stadium) {
		stadium.setStadiumKey(idCount);
		stadiums.put(idCount, stadium);
		idCount++;
	}
	
	public Stadium Retrive(int stadiumKey) {
		Stadium result = stadiums.get(stadiumKey);

		if (result == null) {
			System.out.print("cannot get stadium with stadiumKey");
		}

		return result;
	}
	
	public void Update(int stadiumKey,Stadium stadium) {
		stadiums.put(stadiumKey, stadium);
	}
	
	public void Delete(int stadiumKey) {
		Stadium removed = stadiums.remove(stadiumKey);
		if (removed == null) {
			System.out.print("Cannot remove stadium");
		}
	}
}
