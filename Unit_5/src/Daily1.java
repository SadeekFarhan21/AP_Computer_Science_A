// private --> access within class
// public --> access outside class
// instance variable --> private
// constructors --> public
// methods --> public / private

public class Daily1{
    private String name;
    private int calories;
    public Daily1(){ // default constructor
        name = "";
        calories = 0;
    }

    public Daily1(String name, int calories){ // overloaded constructor 
        this.name = name;
        this.calories = calories;
    }

    public Daily1(int c, String s){ // overloaded constructor
        calories = c;
        name = s;
    }

    public int getCalories(){
        // accessor method
        return calories;
    }

    public String getName(){
        // accessor method
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void setCalories(int calories){
        this.calories = calories;
    }
    public static void main(String [] args){
        
    }
}