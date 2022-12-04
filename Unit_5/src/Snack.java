// import java.util.Scanner;
public class Snack {
    private String name;
    private int calories;
    
    // public -> allows from outside classes
    // private -> restricts from out outside class aka allows only from the given class
    
    // classes -> public
    // instance variables -> private
    // Constructors -> public
    // Access to the behavior -> public / private
    // methods -> public / private

    
    /* 
    public access modifiers :
    -> no restriction on access
    -> other classes can access

    For AP CS-A
    -> classes are public 
    -> constructors are public
    

    private access modifiers :
    -> restriction on access
    -> only access in given class

    For AP CS-A
    -> instance variables would be private 
    */ 
    
    // default constructor
    public Snack(){
        name = "";
        calories = 0;
    }

    // overloaded constructor
    public Snack(String n, int c){
        name = n;
        calories = c;
    }

    // Accessor methods 
    public String getName(){
        return name;
    }

    public int getCalories(){
        return calories;
    }

    // Mutator methods 
    public void setName(String s){
        name = s;
    }

    public void setCalories(int c){
        calories = c;
    }

    public boolean canEat(){
        return (calories < 150);
    }
}