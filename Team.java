import java.util.ArrayList;

public class Team {

    private String name;
    private String id;
    private int score;
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
}

