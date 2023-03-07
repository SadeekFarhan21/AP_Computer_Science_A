import java.util.ArrayList;
public class Comedian extends Performer {
    private ArrayList <String> jokes = new ArrayList <String> ();
    
    public Comedian(String n, int a){
        // Constructor not shown
    }

    public void writeJokes(){
        System.out.println("Write a joke for me");
    }
}