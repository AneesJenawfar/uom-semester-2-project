package Properties;

public abstract class Pavilion {//pavilioan is an abstract class
    
    private int seatNo;
    private static int totalSeat = 47;

    public Pavilion(int seatNo) {
        this.seatNo = seatNo;
    }

    public static void setTotalSeat(int totalSeat) {
        Pavilion.totalSeat = totalSeat;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public static int getTotalSeat() {
        return totalSeat;
    }
}