public class Match {
    String venue,winnerTeam,participant1,participant2;
    public Match(String venue,String participant1,String participant2){
        this.venue=venue;
        this.participant1=participant1;
        this.participant2=participant2;
    }
    public void outcome(){
        System.out.println("The match is won by - " + winnerTeam);
    }
}
