package us.com.scorecard.pojo.common;

import java.util.Date;
import java.util.List;

public abstract class Game implements IGame {
	private String gameName;
	private Date gameDate;
	private String gameLocation;
	private List<Team> teams;
	
	public abstract String getGameName();

	public abstract IGame getGame();

}
