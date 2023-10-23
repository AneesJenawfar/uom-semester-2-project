package SwimmingCompetition;

import Properties.Pavilion;
import Properties.ScoreBoard;
import java.util.ArrayList;

public class Competition {//this is the main class
    private static final ArrayList<Match> matches = new ArrayList<>();//this store all matches in the competition
    private static final  ArrayList<Person> people = new ArrayList<>();//this strore all people in the simulation
    private static final ArrayList<Swimmer> swimmers = new ArrayList<>();//this store all swimmers in simulation
    private static int totalMatches = -1;

    public static void newMatch(){//to create a new match
        ++totalMatches;
        Match comp = new Match();
        Competition.matches.add(comp);   
    }
    
    public static ArrayList<Person> getPeople() {
        return people;
    }

    public static int totalMatches() {
        return totalMatches;
    }

    public static ArrayList<Swimmer> getSwimmers() {
        return swimmers;
    }

    public static ArrayList<Match> Matches() {
        return matches;
    }
    
    public static void createSwimmer(String name,String gender){
        SupportingStaff.addSwimmer(name, gender);
    }
    
    public static void createJudge(String name){
        if (Competition.checkString(name)){
            Judge jud = new Judge(name);
            people.add(jud);
        }else{
            System.out.println("Incorrect Input.");
        }
    }
    
    public static void createSupportingStaff(String name){
        if (Competition.checkString(name)){
            SupportingStaff staff = new SupportingStaff(name);
            people.add(staff);
        }else{
            System.out.println("Incorrect Input.");
        }
    }
    
    public static void createSpectator(String name){
        if (Competition.checkString(name)){
            if (Spectator.getTotalSpec()<Pavilion.getTotalSeat()){
                Spectator spect = new Spectator(name);
                ScoreBoard.addObserver(spect);
                people.add(spect);
            }else{
                System.out.println("No Seats Available.");
            }
        }else{
            System.out.println("Incorrect Input.");
        }
    }
    
    public static boolean checkString(String word){//to check the inputs whether are those empty
        return !"".equals(word);
    }

}
