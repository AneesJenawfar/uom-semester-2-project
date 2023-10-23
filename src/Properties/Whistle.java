package Properties;

import SwimmingCompetition.Competition;

public class Whistle {

    public Whistle() {
    }
    
    public void belows(){//this can do only by judge when start the match
        Competition.Matches().get(Competition.totalMatches()).Start();
    }
}
