// Accessor methods
// returns a value
// known as get method
// no parameters
// must be public

public class Pet{
    private String name;
    private String typeOfPet;
    private int age;
    
    // default constructor 
    public Pet(){
        name = "Default name";
        typeOfPet = "Default type";
        age = 0;
    }   
    
    // overloaded constructor
    public Pet(String name, String typeOfPet, int age){
        this.name = name;
        this.typeOfPet = typeOfPet;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getTypeOfPet(){
        return typeOfPet;
    }

    public int getAge(){
        return age;
    }

}