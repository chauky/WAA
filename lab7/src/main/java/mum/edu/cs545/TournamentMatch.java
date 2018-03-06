package mum.edu.cs545;

import java.util.Date;

public class TournamentMatch extends Match {
	private	int	homePoints;
	private	int	visitorPoints;
	
	public TournamentMatch() {
		super();
	}
	
	public TournamentMatch(long matchKey, Date date, Date startTime, Stadium stadium, int homeScore, int visitorScore,
			Team visitorTeam, Team homeTeam) {
		super(matchKey, date, startTime, stadium, homeScore, visitorScore, visitorTeam, homeTeam);

	}
	
	@Override
	public String toString() {
		return "TournamentMatch [homePoints=" + homePoints + ", visitorPoints=" + visitorPoints + "]";
	}
	public int getVisitorPoints() {
		return visitorPoints;
	}
	
	public void setVisitorPoints(int visitorPoints) {
		this.visitorPoints = visitorPoints;
	}
}
