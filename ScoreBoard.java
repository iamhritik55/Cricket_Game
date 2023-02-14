import java.util.HashMap;

public class ScoreBoard {
    private String scoreBoardId;
    private String matchId;
    private String venue;
    private String winningTeam,lossingTeam;
    private int winningTeamScore,lossingTeamScore;
    private HashMap<String,Integer> playerBattingScoreMap;
    private HashMap<String,Integer> playerBowlingScoreMap;
    private int overs;

    public void setScoreBoardId(String scoreBoardId) {
        this.scoreBoardId = scoreBoardId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

    public String getScoreBoardId() {
        return scoreBoardId;
    }

    public String getMatchId() {
        return matchId;
    }

    public int getOvers() {
        return overs;
    }

    public String getWinningTeam() {
        return winningTeam;
    }

    public String getLossingTeam() {
        return lossingTeam;
    }

    public void setWinningTeam(String winningTeam) {
        this.winningTeam = winningTeam;
    }

    public void setLossingTeam(String lossingTeam) {
        this.lossingTeam = lossingTeam;
    }

    public int getLossingTeamScore() {
        return lossingTeamScore;
    }

    public int getWinningTeamScore() {
        return winningTeamScore;
    }

    public void setLossingTeamScore(int lossingTeamScore) {
        this.lossingTeamScore = lossingTeamScore;
    }

    public void setWinningTeamScore(int winningTeamScore) {
        this.winningTeamScore = winningTeamScore;
    }

    public int getPlayerBattingScore(String playerName) {
        return playerBattingScoreMap.get(playerName);
    }
    public int getPlayerBowlingScore(String playerName) {
        return playerBowlingScoreMap.get(playerName);
    }
    public void setPlayerBattingScoreMap(String playerName,int battingScore){
        playerBattingScoreMap.put(playerName,battingScore);
    }

    public void setPlayerBowlingScoreMap(String playerName,int bowlingScore){
        playerBattingScoreMap.put(playerName,bowlingScore);
    }
    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void displayScoreBoard(){

    }
}
