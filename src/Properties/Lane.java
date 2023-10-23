package Properties;
public abstract class Lane {

    private static int length = 100;
    public TouchPad myPad;
    
    public Lane() {
        this.myPad = new TouchPad();
    }
    
    public static void setLength(int length) {
        Lane.length = length;
    }

    public static int getLength() {
        return length;
    }

}
