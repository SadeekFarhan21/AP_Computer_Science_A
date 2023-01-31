/* Introduction to ArrayList

    ArrayList : Represent collections of object reference data using ArrayList objects 
    * It is *mutable*
    ! Arrays are static in size
    * ArrayLists are *dynamic* in size (their size can be changed at any time)
    
    Arrays vs ArrayList
    1. Faster vs Slower
    2. Can store only primitive types vs object references
    3. Fixed size vs Dynamic size
    4. Immutable vs Mutable

    !! ArrayList is part of the Collections framework and list subsegment

    Old Method 
    List <DataType> variableName;

    New Method
    ArrayList <DataType> variableName;

    !! ArrayList != primitive data == Wrapper class 
    
    !! Array == primitive data
    
    
*/

import java.util.ArrayList; // newer method of declaring ArrayList
import java.util.List; // older method of declaring list
public class Video71{
    public static void main(String[] args){
        ArrayList <Integer> a1 = new ArrayList<Integer>();

        ArrayList <String> a2 = new ArrayList<String>(5); // ArrayList with 5 initial capacity

        
        ArrayList <Student> a3 = new ArrayList<Student>();

        // (a) boolean values
        ArrayList <Boolean> b = new ArrayList<Boolean>();

        // (b) Turtle Objects
        ArrayList <Turtle> t = new ArrayList<Turtle>();

        // (c) 10 String values
        ArrayList <String> s = new ArrayList<String>(10);
    }

}