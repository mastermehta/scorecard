package us.com.scorecard.pojo.cricket;

import java.util.List;

import us.com.scorecard.pojo.common.AbstractScoreCard;
import us.com.scorecard.pojo.common.GameType;
import us.com.scorecard.pojo.common.ScoreLine;

public class ScoreCard extends AbstractScoreCard {

	public GameType getGameType() {
		return GameType.CRICKET;
	}

	@Override
	public List<ScoreLine> getScoreLines() {
		// TODO Auto-generated method stub
		return null;
	}

}
