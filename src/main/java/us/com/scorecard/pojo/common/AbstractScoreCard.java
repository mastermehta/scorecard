package us.com.scorecard.pojo.common;

import java.util.List;

public abstract class AbstractScoreCard implements IScoreCard {
	//All common score card related routines will go here
	// like 
	public abstract List<ScoreLine> getScoreLines();
}
