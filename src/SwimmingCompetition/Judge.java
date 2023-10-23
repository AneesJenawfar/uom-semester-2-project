package SwimmingCompetition;
import Properties.Whistle;
public class Judge extends Person{//judge is a child class of person class
    private final Whistle whistle;
   
    private static int numOfJudge = 0;//to count the judges

    public Judge(String name) {
        super(name);
        this.whistle = new Whistle();
        ++numOfJudge;
    }

    @Override
    public void getStart(){//to start the competition
        Competition.Matches().get(Competition.totalMatches()).setJudge(this.GetName());
        this.whistle.belows();
    }

    public static void decTotalJudeges(){
        --numOfJudge;
    }
    
    public static int getNumOfJudge() {
        return numOfJudge;
    }
    
}
