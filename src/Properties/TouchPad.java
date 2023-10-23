package Properties;

import SwimmingCompetition.Match;
import SwimmingCompetition.Competition;
import SwimmingCompetition.Swimmer;

public class TouchPad {
    
    public void isTouched(String name){//when swimmer finish the game this method willbe called
        for (Swimmer S : Match.getPlayers()) {
            if(S.GetName().equals(name)){
                S.setTime(System.currentTimeMillis()-S.getTime());//to set the time 
                Competition.Matches().get(Competition.totalMatches()).board.addPlace(S);//this will add the swimmer to the score board
            }
        }
    }
}
