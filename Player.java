public class Player {

    private String name;
    private String id;
    private String teamId;
    private int battingScore,bowlingWickets,bowlingOvers;
    //    HashMap<Integer, Integer> scores = new HashMap<Integer, Integer>(); //stores score of each match
    private int total4s, total6s, totalMatchesPlayed;

    public void setBowlingOvers(int bowlingOvers) {
        this.bowlingOvers = bowlingOvers;
    }

    public int getBowlingOvers() {
        return bowlingOvers;
    }

    public void setBowlingWickets(int bowlingWickets) {
        this.bowlingWickets = bowlingWickets;
    }

    public int getBowlingWickets() {
        return bowlingWickets;
    }

    public Player() {
        this.total4s = 0;
        this.total6s = 0;
        this.totalMatchesPlayed = 0;
    }

    public int getBattingScore() {
        return battingScore;
    }

    public void setBattingScore(int battingScore) {
        this.battingScore = battingScore;
    }

    public int getTotal4s() {
        return total4s;
    }

    public void setTotal4s(int total4s) {
        this.total4s = total4s;
    }

    public int getTotal6s() {
        return total6s;
    }

    public void setTotal6s(int total6s) {
        this.total6s = total6s;
    }

    public int getTotalMatchesPlayed() {
        return totalMatchesPlayed;
    }

    public void setTotalMatchesPlayed(int totalMatchesPlayed) {
        this.totalMatchesPlayed = totalMatchesPlayed;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }
}
