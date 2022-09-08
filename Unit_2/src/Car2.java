public class Car2 {
    public String make;
    public String model;
    public int numberOfDoors;
    public int topSpeed;
    public int price;
    // Main Constructor
    public Car2(){
        make = "";
        model = "";
        numberOfDoors = 0;
        topSpeed = 0;
        price = 0;
    }

    // Secondary 1
    public Car2(String mk, String mdl, int topSpd, int prc){
        make = mk;
        model = mdl;
        numberOfDoors = 0;
        topSpeed = topSpd;
        price = prc;
    }

    // Secondary 2
    public Car2(int numberDoors, int topSpd, int prc){
        make = "unknown";
        model = "unknown";
        numberOfDoors = numberDoors;
        topSpeed = topSpd;
        price = prc;
    }

    // Secondary 3
    public Car2(String mk, String mdl, int numDoors){
        make = mk;
        model = mdl;
        numberOfDoors = numDoors;
        topSpeed = 90;
        price = 0;
    }
}