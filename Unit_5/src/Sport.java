// import javax.print.attribute.standard.NumberUpSupported;

// Things to keep in mind while creating classes and objects
// You need to set a default value for all constructors
// You need to set a default value even for overloaded constructors


// 
public class Sport{
    private String name;
    private int numberOfAthletes;
    
    public Sport(){
        name = "Default Name";
        numberOfAthletes = 0;
    }

    public Sport(String name){
        this.name = name;
        numberOfAthletes = 0;
    }

    public Sport(int numberOfAthletes){
        name = "Default Name";
        this.numberOfAthletes = numberOfAthletes;
    }

    public Sport(String name, int numberOfAthletes){
        this.name = name;
        this.numberOfAthletes = numberOfAthletes;
    }


    public String getName(){
        return name;
    }

    public int getNumberOfAtheletes(){
        return numberOfAthletes;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAthletes(int numberOfAthletes){
        this.numberOfAthletes = numberOfAthletes;
    }

    public String toString(){
        return "Sport: " + name + "\nNumber of Athletes: " + numberOfAthletes; 
    }

    
}