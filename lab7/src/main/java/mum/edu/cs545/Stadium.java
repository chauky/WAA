package mum.edu.cs545;

import java.util.List;

public class Stadium {
	private	int	stadiumKey; 
	private	String name;
	private	String city;
	private	String state;
	private	List<Match>	matches;
	
	public Stadium() {
		super();
	}
	
	public int getStadiumKey() {
		return stadiumKey;
	}
	
	public void setStadiumKey(int stadiumKey) {
		this.stadiumKey = stadiumKey;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	@Override
	public String toString() {
		return "Stadium [stadiumKey=" + stadiumKey + ", name=" + name + ", city=" + city + ", state=" + state
				+ ", matches=" + matches + "]";
	}

	public Stadium(int stadiumKey, String name, String city, String state, List<Match> matches) {
		super();
		this.stadiumKey = stadiumKey;
		this.name = name;
		this.city = city;
		this.state = state;
		this.matches = matches;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public List<Match> getMatches() {
		return matches;
	}
	
	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}
}
