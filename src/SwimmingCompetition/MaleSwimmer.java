
package SwimmingCompetition;


public class MaleSwimmer extends Swimmer implements Strokes{
    
    private static int maleSwimmer = 0;//to count male swimmers
    private final String dressColor = "Blue";

    public MaleSwimmer(String name,String gender) {
        super(name,gender);
    }

    public String getDressColor() {
        return dressColor;
    }
    
    public static void decMaleSwimmers(){
        --maleSwimmer;
    }

    @Override
    public void ButterflyStroke() {//these are iver rid from stroke interface
        this.setStroke(50);
        }

    @Override
    public void BackStroke() {
        this.setStroke(75);
    }

    @Override
    public void BreastStroke() {
        this.setStroke(100);
    }

    @Override
    public void FreeStyle() {
        this.setStroke(25);
    }
    
    public static int getMaleSwimmer() {
        return maleSwimmer;
    }
    
    
    
}
