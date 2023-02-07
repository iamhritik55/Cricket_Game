import java.util.Random;

public class Utility {
    public int toss(String team1,String team2){
        Random decision=new Random();
        int firstPlayingTeam=decision.nextInt(2);
        if(firstPlayingTeam==0){
            System.out.println(team1+" has won the toss");
            return firstPlayingTeam;
        }
        else{
            System.out.println(team2+" has won the toss");
            return firstPlayingTeam;
        }
    }

    public void batting(String playingTeam){

    }
}
