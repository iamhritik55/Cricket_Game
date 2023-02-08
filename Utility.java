import java.util.Random;

public class Utility {
    Random decision=new Random();
    public Team toss(Team team1,Team team2){
        int tossWinner=decision.nextInt(2);
        if(tossWinner==0){
            System.out.println(team1.name+" has won the toss, Please enter 1 for batting or 2 for bowling");
            return team1;
        }
        else{
            System.out.println(team2.name+" has won the toss, Please enter 1 for batting or 2 for bowling");
            return team2;
        }
    }

    public void batting(Team team){
        int wickets=0;
        for(int i=0;i<6;i++)
        {
            int ballResult=decision.nextInt(7)+1;
            if(ballResult==7) wickets++;
            if(wickets==10) break;
            team.score+=ballResult;
        }
    }
    public void loading(){
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(500);
                System.out.print(".");
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
        System.out.println("");
    }
}
