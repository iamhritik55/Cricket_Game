import java.util.ArrayList;
import java.util.Scanner;

public class MatchController {

    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();
        Utility utility = new Utility();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Cricket Game, Please Enter the first team's name ");
        Team team1 = new Team();
        team1.setName(scanner.nextLine());
        ArrayList<Player> players1 = new ArrayList<Player>();
        Player p1 = new Player();
        p1.setName("Rohit Sharma");
        Player p2 = new Player();
        p2.setName("Shubhman Gill");
        Player p3 = new Player();
        p3.setName("Virat Kohli");
        Player p4 = new Player();
        p4.setName("Ravindra Jadeja");
        Player p5 = new Player();
        p5.setName("Siraj");

        players1.add(p1);
        players1.add(p2);
        players1.add(p3);
        players1.add(p4);
        players1.add(p5);
        team1.setPlayers(players1);


        System.out.println("Enter second team's name");
        Team team2 = new Team();
        team2.setName(scanner.nextLine());

        ArrayList<Player> players2 = new ArrayList<Player>();
        Player p11 = new Player();
        p11.setName("David warner");
        Player p21 = new Player();
        p21.setName("Usman Khwaja");
        Player p31 = new Player();
        p31.setName("Marnus Labuschgne");
        Player p41 = new Player();
        p41.setName("Steve Smith");
        Player p51 = new Player();
        p51.setName("Nathan Lyon");

        players2.add(p11);
        players2.add(p21);
        players2.add(p31);
        players2.add(p41);
        players2.add(p51);
        team2.setPlayers(players2);



        System.out.println("Enter venue");
        scoreBoard.setVenue(scanner.nextLine());


        Team tossWinner = utility.toss(team1, team2);
        Team tossLoser;
        if (tossWinner == team1) {
            tossLoser = team2;
        } else {
            tossLoser = team1;
        }
        int choice = scanner.nextInt();
        if (choice == 1) {
            tossWinner.setInning(1);
            tossLoser.setInning(2);
            utility.matching(tossWinner, tossLoser, 0);
            System.out.println(tossWinner.getName() + " scored " + tossWinner.getScore());
            //utility.loading();

            System.out.println("target for " + tossLoser.getName() + " is " + (tossWinner.getScore() + 1)+"\n");
            utility.matching(tossLoser, tossWinner, tossWinner.getScore() + 1);
         //   utility.loading();
            System.out.println(tossLoser.getName() + " scored " + tossLoser.getScore());

        } else {
            tossLoser.setInning(1);
            tossWinner.setInning(2);
            utility.matching(tossLoser, tossWinner, 0);
            System.out.println(tossLoser.getName() + " scored " + tossLoser.getScore());
        //    utility.loading();

            System.out.println("target for " + tossWinner.getName() + " is " + (tossLoser.getScore() + 1)+"\n");

            utility.matching(tossWinner, tossLoser, tossLoser.getScore() + 1);
         //   utility.loading();
            System.out.println(tossWinner.getName() + " scored " + tossWinner.getScore());

        }
        if (tossWinner.getScore() > tossLoser.getScore()) {
            scoreBoard.setWinningTeam(tossWinner);
            scoreBoard.setLossingTeam(tossLoser);
            scoreBoard.setWinningTeamScore(tossWinner.getScore());
            scoreBoard.setLossingTeamScore(tossLoser.getScore());
            scoreBoard.displayScoreBoard();

        } else if (tossWinner.getScore() < tossLoser.getScore()) {
            scoreBoard.setWinningTeam(tossLoser);
            scoreBoard.setLossingTeam(tossWinner);
            scoreBoard.setWinningTeamScore(tossLoser.getScore());
            scoreBoard.setLossingTeamScore(tossWinner.getScore());
            scoreBoard.displayScoreBoard();


        } else {
            System.out.println("Match tied");
        }

    }

}
