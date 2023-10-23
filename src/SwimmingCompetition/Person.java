package SwimmingCompetition;

public abstract class Person{//this is an abstract class and the perent class
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }

    public void getStart(){//these are over ridden in some child class
    }
    public int getSetaNo(){
        return 0;    
    }
}
