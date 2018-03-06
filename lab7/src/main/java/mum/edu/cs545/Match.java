package mum.edu.cs545;

import java.util.Date;

public class Match {
	private	long matchKey;
	private	Date date;
	private	Date startTime;
	private	Stadium stadium;
	private	int	homeScore;
	private	int	visitorScore;
	private	Team visitorTeam;
	private	Team homeTeam;
	
	public Match(){
		super();	
	}
	
	public Match(long matchKey, Date date, Date startTime, Stadium stadium, int homeScore, int visitorScore,
			Team visitorTeam, Team homeTeam) {
		this.matchKey = matchKey;
		this.date = date;
		this.startTime = startTime;
		this.stadium = stadium;
		this.homeScore = homeScore;
		this.visitorScore = visitorScore;
		this.visitorTeam = visitorTeam;
		this.homeTeam = homeTeam;
	}
	
	@Override
	public String toString() {
		return "Match [matchKey=" + matchKey + ", date=" + date + ", startTime=" + startTime + ", stadium=" + stadium
				+ ", homeScore=" + homeScore + ", visitorScore=" + visitorScore + ", visitorTeam=" + visitorTeam
				+ ", homeTeam=" + homeTeam + "]";
	}

	public long getMatchKey() {
		return matchKey;
	}
	
	public void setMatchKey(long matchKey) {
		this.matchKey = matchKey;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Stadium getStadium() {
		return stadium;
	}
	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}
	
	public int getHomeScore() {
		return homeScore;
	}
	
	public void setHomeScore(int homeScore) {
		this.homeScore = homeScore;
	}
	
	public int getVisitorScore() {
		return visitorScore;
	}
	
	public void setVisitorScore(int visitorScore) {
		this.visitorScore = visitorScore;
	}
	
	public Team getVisitorTeam() {
		return visitorTeam;
	}
	
	public void setVisitorTeam(Team visitorTeam) {
		this.visitorTeam = visitorTeam;
	}
	
	public Team getHomeTeam() {
		return homeTeam;
	}
	
	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}
	
}
