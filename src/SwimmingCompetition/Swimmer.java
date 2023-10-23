package SwimmingCompetition;
import Properties.Lane;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Swimmer extends Person implements Runnable{//swimmer is a child class of person class
   
    private final String gender;
    private long time;
    private Lane myLane;
    protected int distance = 0;
    private int Stroke ;
    private static int NoSwimmer = 0;
    

    public Swimmer(String name,String gender) {
        super(name);
        this.gender= gender;
        myLane = new Lane() {};
        ++NoSwimmer;
    }

    public static void decTotalSwimmer() {
        --NoSwimmer;
    }
    
    public String getGender() {
        return gender;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
    
    public Lane getMyLane() {
        return myLane;
    }

    public void Touched(){//when swimmer touch the touchpad he finished the game
        myLane.myPad.isTouched(this.GetName());
    }

    public long getTime() {
        return time;
    }

    public void startTime() {
        time = System.currentTimeMillis();
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void setStroke(int Stroke) {
        this.Stroke = Stroke;
    }
    
    private Random speed = new Random();
    
    @Override
    public void run(){
        while(this.distance<Lane.getLength()){
            ++distance;
            //myLane.setDistance(distance);
            try {
                Thread.sleep(50+speed.nextInt(this.Stroke));
            } catch (InterruptedException ex) {
                Logger.getLogger(MaleSwimmer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (this.distance == Lane.getLength()){
            this.Touched();
        }
    }

    public static int getNoSwimmer() {
        return NoSwimmer;
    }
    
    public void ButterflyStroke(){
        
    }
    public void BackStroke(){
        
    }
    public void BreastStroke(){
        
    }
    public void FreeStyle(){
            }
}
