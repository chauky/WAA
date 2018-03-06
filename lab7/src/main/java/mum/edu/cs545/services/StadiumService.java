package mum.edu.cs545.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mum.edu.cs545.Stadium;
import mum.edu.cs545.Team;
import mum.edu.cs545.dao.StadiumDao;

@Component
public class StadiumService {
	StadiumDao stadiumDao;
	
	@Autowired
	StadiumService(StadiumDao stadiumDao){
		this.stadiumDao = stadiumDao;
	}
	
	public List<Stadium> getAll() {
		return stadiumDao.getAll();
	}
	public void Save() {
		stadiumDao.Create();
	}
	
	public Stadium getStadium(String stadiumKey) {
		return stadiumDao.Retrive(stadiumKey);
	}
	
	public void Update(String stadiumKey) {
		stadiumDao.Update(stadiumKey);
		
	}
	
	public void Delete(String stadiumKey) {
		stadiumDao.Delete(stadiumKey);
	}

}
