
package Properties;

import SwimmingCompetition.Competition;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Serialize {//this class only for the serialization ofthe matches
    private static ArrayList<Scores> scores ;//this will store the score for serialize
    
    
    public static void Write(Scores S){//srealize method
        if(Serialize.isEmpty()){
            scores = new ArrayList<>();
            Serialize.scores.add(S);
        }else{
            Serialize.scores.add(S);
        }
        try {
            
            FileOutputStream fileOut;
            fileOut = new FileOutputStream("score.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(scores);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in score.txt file");
        } catch (IOException i) {
        }
    }
    
    public static ArrayList<Scores> Read(){//this method will read the srealize objects
        try {
            FileInputStream fileIn = new FileInputStream("score.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Serialize.scores = (ArrayList<Scores>) in.readObject();
            in.close();
            fileIn.close();
        }catch(java.io.StreamCorruptedException e){
            try {
                Serialize.clear();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        }
        return scores;
    }
    
    public static boolean isEmpty(){//to check the serialized fille is empty or not
        File file = new File("score.txt");
        return file.length()==0;
    }
    public static void clear() throws FileNotFoundException{//to clear the seralize file
        File file = new File("score.txt");
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print("");
        }
    }
}
