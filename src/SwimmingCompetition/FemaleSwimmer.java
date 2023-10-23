package SwimmingCompetition;


public class FemaleSwimmer extends Swimmer implements Strokes {
    
    private static int femaleSwimmer = 0;//to count the female swimmers
    private final String dressColor = "Red";
    
    public FemaleSwimmer(String name,String gender) {
        super(name,gender);
    }

    public String getDressColor() {
        return dressColor;
    }
    
    public static void decFemaleSwimmer(){
        --femaleSwimmer;
    }
    
    @Override
    public void ButterflyStroke() {//these are over ridden from stroke interface
        this.setStroke(75);
        }

    @Override
    public void BackStroke() {
        this.setStroke(100);
    }

    @Override
    public void BreastStroke() {
        this.setStroke(110);
    }

    @Override
    public void FreeStyle() {
        this.setStroke(50);
    }
    
    public static int getFemaleSwimmer() {
        return femaleSwimmer;
    }

}
