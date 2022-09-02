public class Car {
    public String make;
    public String owner;
    public boolean isSports;
    public int year;

    // Blank constructor

    public Car(){
        make = "";
        owner = "";
        isSports = false;
        year = Integer.MIN_VALUE;
    }

    // Constructors with parameters

    public Car(String make, String owner, boolean isSports, int year){
        this.make = make;
        this.owner = make;
        this.isSports = isSports;
    }

    
}