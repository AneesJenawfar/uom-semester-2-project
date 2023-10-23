
package Properties;

import java.io.Serializable;


public class Scores implements Serializable{//this class will store the scores to serialize
    private final int no;
    
    private final String Judge;
    private final String[] players;
    private final String[] genders;
    private final long[] time;//once thiese details are created never can be chaged

    public Scores(int no, String Judge, String[] players, String[] genders, long[] time) {
        this.no = no;
        this.Judge = Judge;
        this.players = players;
        this.genders = genders;
        this.time = time;
        
    }

    public int getNo() {
        return no;
    }

    public String getJudge() {
        return Judge;
    }

    public String[] getPlayers() {
        return players;
    }

    public String[] getGenders() {
        return genders;
    }

    public long[] getTime() {
        return time;
    }
    
    
}
