package SwimmingCompetition;
import Properties.Pavilion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Spectator extends Person{ //spectator is a child class of person class
    
    private Pavilion mySeat; //reference from pavilion class
    private static int totalSpec = 1;
    private String[] State;//this will br updated to observers(spectators)
    private static ArrayList<Integer> seats = new ArrayList<>(Arrays.asList(0));
    private Random seat = new Random();
    
    public Spectator(String name) {
        super(name);
        int n = 1;
        while (seats.contains(n)){
            n = seat.nextInt(47);
        }
        seats.add(n);
        ++totalSpec;
        this.mySeat = new Pavilion(n) {};
    }
    public void getNotify(String[] score){
        System.out.println("Observer "+this.GetName()+" wathches the ScoreBoard.");
        this.State = score;
    }
    
    public static int getTotalSpec() {
        return totalSpec;
    }
    
    @Override
    public int getSetaNo(){
        return mySeat.getSeatNo();
    }
}
