public class Car {
    public String make;
    public String owner;
    public boolean isSports;

    // Blank constructor

    public Car(){
        make = "";
        owner = "";
        isSports = false;
    }

    // Constructors with parameters

    public Car(String make, String owner, boolean isSports){
        this.make = make;
        this.owner = make;
        this.isSports = isSports;
    }

    
}