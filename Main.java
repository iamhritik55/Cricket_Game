import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Utility utility=new Utility();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Cricket Game, Please Enter the first team's name ");
        Team team1=new Team();
        team1.name=scanner.nextLine();
        System.out.println("Enter second team's name");
        Team team2=new Team();
        team2.name=scanner.nextLine();
        Match match=new Match(team1.name,team2.name);
        System.out.println("Enter venue");
        match.venue=scanner.nextLine();
        System.out.println("Toss Time");
        utility.loading();
        Team tossWinner=utility.toss(team1, team2);
        Team tossLoser;
        if(tossWinner==team1) tossLoser=team2;
        else tossLoser=team1;
        int choice=scanner.nextInt();
        if(choice==1){
            utility.batting(tossWinner);
            System.out.println(tossWinner.name+" scored "+tossWinner.score);
            utility.loading();
            System.out.println("target for "+tossLoser.name+" is "+(tossWinner.score+1));
            utility.batting(tossLoser);
            utility.loading();
            System.out.println(tossLoser.name+" scored "+tossLoser.score);
            if(tossWinner.score>tossLoser.score) {
                match.winnerTeam=tossWinner;
                match.outcome();
            }
            else if(tossWinner.score<tossLoser.score){
                match.winnerTeam=tossLoser;
                match.outcome();
            }
            else System.out.println("Match tied");
        }
        else{
            utility.batting(tossLoser);
            System.out.println(tossLoser.name+" scored "+tossLoser.score);
            utility.loading();
            System.out.println("target for "+tossWinner.name+" is "+(tossLoser.score+1));
            utility.batting(tossWinner);
            utility.loading();
            System.out.println(tossWinner.name+" scored "+tossWinner.score);
            if(tossWinner.score>tossLoser.score) {
                match.winnerTeam=tossWinner;
                match.outcome();
            }
            else if(tossWinner.score<tossLoser.score){
                match.winnerTeam=tossLoser;
                match.outcome();
            }
            else System.out.println("Match tied");
        }

    }
}
