public class Match {
    String venue,participant1,participant2;
    Team winnerTeam;
    public Match(String participant1,String participant2){
        this.participant1=participant1;
        this.participant2=participant2;
    }
    public void outcome(){
        System.out.println("The match is won by - " + winnerTeam.name);
    }
}
