package Properties;
import SwimmingCompetition.Match;
import SwimmingCompetition.Spectator;
import SwimmingCompetition.Swimmer;
import java.util.ArrayList;

public class ScoreBoard {
    private ArrayList<Swimmer> places;
    private static ArrayList<Spectator> observers = new ArrayList<>();
    private String[] state;
    private String judge;
    public ScoreBoard() {
        this.places = new ArrayList<>();
    }
    
    public void addPlace(Swimmer S){
        places.add(S);
        if (places.size()== Match.getPlayers().size()){
            Match.competitionEnd();
            this.state = new String[this.places.size()];
            if(!observers.isEmpty()){
                this.setState();
                this.setNotify();
            }
            display();
        }
    }
    
    public void setNotify(){
        this.setState();
        for (Spectator spec : observers) {
            spec.getNotify(state);
        }
    }
    
    private void setState(){
        for (int i = 0; i < places.size(); i++) {
            state[i] = (i+1)+" "+places.get(i).GetName()+" "+places.get(i).getGender()+" "+places.get(i).getTime();
        }
    }

    public void setJudge(String judge) {
        this.judge = judge;
    }

    public String getJudge() {
        return judge;
    }

    public ArrayList<Swimmer> getPlaces() {
        return places;
    }

    public static ArrayList<Spectator> getObservers() {
        return observers;
    }
    public static void addObserver(Spectator spec){
        ScoreBoard.observers.add(spec);
    }
    public  void display(){
        for (int i = 0; i < places.size(); i++) {
            System.out.println(i+1 + " " +places.get(i).GetName()+" "+places.get(i).getTime());
        }
    }
    
}
