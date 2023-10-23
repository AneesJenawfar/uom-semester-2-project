package SwimmingCompetition;

import Properties.Lane;
import Properties.Pavilion;
import Properties.ScoreBoard;
import java.util.ArrayList;


public class Match{
    public static Object lock1 = new Object();//this lock will maintain the score board to update
    private static ArrayList<Swimmer> players ;
    public ScoreBoard board;
    private static boolean matchEnd = false;
    
    
    public Match() {
        Match.players = new ArrayList<>();
        this.board = new ScoreBoard();//board object are createtd here
    }

    public static ArrayList<Swimmer> getPlayers() {
        return players;
    }
    
    public static void addPlayer(Swimmer swmr){
        Match.players.add(swmr);
    }

    public static boolean isCompetitionEnd() {//to check the competition is over
        return matchEnd;
    }
    
    public static void competitionEnd(){
        synchronized(lock1){
            Match.matchEnd = true;
            lock1.notify();
        }
    }
    
    public void reset(){//when competition over this will reset the players distance
        for (Swimmer player : players) {
            player.setDistance(0);
        }
    }
    
    public static void competitionStart(){
        Match.matchEnd = false;
    }
    
    public  void Start(){
        Match.competitionStart();
        for (Swimmer S : players) {
            new Thread(S).start();
            S.startTime();
        }
    }
    
    public static void setTotalSeats(int n){//to set total seats
        Pavilion.setTotalSeat(n);
    }
    
    public void setLaneLength(int l){//to set length of the lanes
        Lane.setLength(l);
    }

    public void setJudge(String judge) {//this will update the judger who judge the current match
        Competition.Matches().get(Competition.totalMatches()).board.setJudge(judge);
    }
    
    public void displayTotal(){//to display the total people
       int total = Competition.getPeople().size();
        System.out.println(total);
    }

    
}
