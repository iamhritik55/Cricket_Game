import java.util.ArrayList;
import java.util.HashMap;

public class ScoreBoard {

    private String scoreBoardId;
    private String matchId;
    private String venue;
    private Team winningTeam;
    private Team lossingTeam;
    private int winningTeamScore, lossingTeamScore;
    //    private HashMap<String,Integer> playerBattingScoreMap;
    //    private HashMap<String,Integer> playerBowlingScoreMap;
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

    public Team getWinningTeam() {
        return winningTeam;
    }

    public Team getLossingTeam() {
        return lossingTeam;
    }

    public void setWinningTeam(Team winningTeam) {
        this.winningTeam = winningTeam;
    }

    public void setLossingTeam(Team lossingTeam) {
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

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void displayScoreBoard() {
        System.out.println(winningTeam.getName() + " has won the match\n");

        ArrayList<Player> winningPlayers = winningTeam.getPlayers();

        System.out.println(winningTeam.getName() + " Batting Stats:\n");
        System.out.println("playerName  score  4s  6s");
        for (int i = 0; i < 5; i++) {
            System.out.println(winningPlayers.get(i).getName() + " " + winningPlayers.get(i).getBattingScore() + " " +
                               winningPlayers.get(i).getTotal4s() + " " + winningPlayers.get(i).getTotal6s());
        }
        System.out.println("\n" + winningTeam.getName() + " Bowling stats: ");
        System.out.println("playerName  ballsDelivered  wickets");
        for (int i = 0; i < 5; i++) {
            System.out.println(
                    winningPlayers.get(i).getName() + " " + winningPlayers.get(i).getTotalBallsDelivered() + " " +
                    winningPlayers.get(i).getBowlingWickets());
        }

        ArrayList<Player> lossingPlayers = lossingTeam.getPlayers();
        System.out.println("\n" + lossingTeam.getName() + " Batting Stats:\n");
        System.out.println("playerName  score  4s  6s");
        for (int i = 0; i < 5; i++) {
            System.out.println(lossingPlayers.get(i).getName() + " " + lossingPlayers.get(i).getBattingScore() + " " +
                               lossingPlayers.get(i).getTotal4s() + " " + lossingPlayers.get(i).getTotal6s());
        }

        System.out.println("\n" + lossingTeam.getName() + " Bowling stats: ");
        System.out.println("playerName  ballsDelivered  wickets");
        for (int i = 0; i < 5; i++) {
            System.out.println(
                    lossingPlayers.get(i).getName() + " " + lossingPlayers.get(i).getTotalBallsDelivered() + " " +
                    lossingPlayers.get(i).getBowlingWickets());
        }

    }
}
