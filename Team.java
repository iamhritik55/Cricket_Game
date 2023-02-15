import java.util.ArrayList;

public class Team {

    private String name;
    private String id;
    private int score;
    private int inning;
    ArrayList<Player> players = new ArrayList<Player>();

    public Team() {
        this.score = 0;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getInning() {
        return inning;
    }

    public void setInning(int inning) {
        this.inning = inning;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void display(){
        for(int i=0;i<5;i++)
        {
            System.out.println(this.players.get(i).getName() + " " + this.players.get(i).getBattingScore() + " " +
                    this.players.get(i).getTotal4s() + " " + this.players.get(i).getTotal6s());
        }
        System.out.println("\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(
                    this.players.get(i).getName() + " " + this.players.get(i).getTotalBallsDelivered() + " " +
                            this.players.get(i).getBowlingWickets());
        }
        System.out.println("\n");
        System.out.println("\n");
    }
}

