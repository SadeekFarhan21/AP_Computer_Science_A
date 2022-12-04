// private --> access within class
// public --> access outside class
// instance variable --> private
// constructors --> public
// methods --> public / private

public class Daily1_1{
    private String name;
    private int calories;
    public Daily1_1(){
        name = "";
        calories = 0;
    }

    public Daily1_1(String name, int calories){
        this.name = name;
        this.calories = calories;
    }

    public Daily1_1(int c, String s){
        calories = c;
        name = s;
    }

    public int getCalories(){
        return calories;
    }

    public String getName(){
        return name;
    }
    public static void main(String [] args){
        
    }
}