import java.util.ArrayList;

/*
 
    !! Methods to work with ArrayList 

    int size = returns the size of the arraylist
    boolean add (object parameter) = appends an object to the end and returns true

    void add (index and object parameter) = inserts object to the index, shifts everythin on the right by 1 and increases the size by 1

    E (datatye of the arraylist) get (index paramenter) = returns the element of on the index array
    
    E set (index and object parameter) = replaces the element at the specified index with the object sent as parameter

    E remove (index parameter) = removes the element at the specified index, shifts all the elements on the right by 1 and decreases the size by 1


*/

public class Video72{

    public static void main(String[] args){
        ArrayList <Integer> a1 = new ArrayList<Integer>(); 
        // ArrayList of integer type
        
        a1.add(2); 
        // * Appends an "integer" object to the "end" of the arraylist
        a1.add(0, 1); 
        // * Appends an "integer" object at index "1"

        // * Index starts at 0

        // !! To add object to the arraylist the object has to be the same data type as the arraylist data type

        for(int i = 0; i < a1.size(); i++){
            System.out.print(a1.get(i));
        }


        ArrayList <String> a2 = new ArrayList<String>();
        
        // * Valid 
        a2.add("Farhan");
        a2.add("Josh");
        a2.add("Harsha");
        a2.add(1, "Arjun"); // Adds "Arjun" at index 1

        a2.remove(2); // Removes "Josh" at index 2
        
        // Updaing information
        a2.set(0, "Aditya"); // Swapes "Aditya" at index 0 with "Farhan"
        
        // Accessing information in the array
        System.out.println(a2.get(2)); // Returns the object located in the index 2

    }
}