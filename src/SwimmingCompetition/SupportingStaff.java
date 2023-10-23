package SwimmingCompetition;

import Properties.Scores;
import Properties.Serialize;

public class SupportingStaff extends Person { //supporting staff is a child class of person class
    
    private static int totalStaff = 0;//to count the supporting staff

    public SupportingStaff(String name) {//this class is add swimmers tothe simulation and serialize the metches
        super(name);
        ++totalStaff;
    }
    
    public static void serialize(int noMatch) {//this wiil serialize the current match
        int no = noMatch + 1;
        String judge = Competition.Matches().get(noMatch).board.getJudge();
        String[] players = new String[Competition.Matches().get(noMatch).board.getPlaces().size()];
        String[] Genders = new String[Competition.Matches().get(noMatch).board.getPlaces().size()];
        long[] time = new long[Competition.Matches().get(noMatch).board.getPlaces().size()];
        for (int j = 0; j < Competition.Matches().get(noMatch).board.getPlaces().size(); j++) {
            players[j] = Competition.Matches().get(noMatch).board.getPlaces().get(j).GetName();
            Genders[j] = Competition.Matches().get(noMatch).board.getPlaces().get(j).getGender();
            time[j] = Competition.Matches().get(noMatch).board.getPlaces().get(j).getTime();
        }
        Scores score = new Scores(no, judge, players, Genders, time);
        Serialize.Write(score);
    }

    public static int getTotalStaff() {
        return totalStaff;
    }
    
    public static void addSwimmer(String name,String gender){//to add swimmers
        if(Competition.checkString(name)||Competition.checkString(gender)){
            if(gender.equalsIgnoreCase("Male")){
                Swimmer swmr = new MaleSwimmer(name,gender);
                Competition.getSwimmers().add(swmr);//add to the arraylist
            }
            else if(gender.equalsIgnoreCase("Female")){
                Swimmer swmr = new FemaleSwimmer(name,gender);
                Competition.getSwimmers().add(swmr);//add to the arraylist
            }     
        }else{
            System.out.println("Incorrect Input.");
        }
    }
    
    
}
