package mum.edu.cs545;

import java.util.Date;

public class FriendlyMatch extends Match {
	
	public FriendlyMatch() {
		super();
	}
	
	public FriendlyMatch(long matchKey, Date date, Date startTime, Stadium stadium, int homeScore, int visitorScore,
			Team visitorTeam, Team homeTeam) {
		super(matchKey, date, startTime, stadium, homeScore, visitorScore, visitorTeam, homeTeam);
	}

	private	AwardType award;

	public AwardType getAward() {
		return award;
	}

	public void setAward(AwardType award) {
		this.award = award;
	}

	@Override
	public String toString() {
		return "FriendlyMatch [award=" + award + "]";
	}
}
