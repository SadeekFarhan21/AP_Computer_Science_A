/* 

Array Creation and Access

What is an array ?
Array is a data structure used to implement a collection (list) of primitive or object reference types


Array Vocabulary
An element is a single value in an array
The index of an element is the position of the element in the array
  - In Java, the first element of an array is at index zero (0)

The length of an array is the number of elements in the array
 - length is a public final data member of an array
  -- length is public, we can access it in any class
  -- length is final, we cannot change an arrays; length after it has been created
 - In Java, the last element of an array list is at length list.length - 1   


*/

import java.util.*;
public class One{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] listOne = new int[5];
        
// When array is created the new keyword initializes the values of all the indices to be 0 if the data type is int
// To initialize the value of an element of an array we write the name of the array and then inside squre brackets include the index in which the element woudl be put in and then set that equal to a value according to the relevant data type
        
        listOne[2] = 33;  
        listOne[3] = listOne[2] * 3;
        listOne[5] = 13;   

// listOne doesn't have an index 5 in it. So it would cause an IndexOutOfBoundsException
// When we print the array we get the hexadecimal representation of the memory address of the array

// An array can also hold reference data

// Creating an array of objects doesn't create the objects inside the array rather it sets the value of the elements to null


/* Elements of an array are initialized with a specific value based on the type of the elements

 - Elements of type int are initialized to 0
 - Elements of a reference type are initialized to the reference value of null
 - Elements of type of double are initialized to 0.0
 - Elements of type of boolean are initialized to
 false
*/ 

        double[] listThree = new double[4];
        boolean [] listFour = new boolean[4];
        double [] grades = {70.5, 88.2, 93.7, 98.7};
// Insted of using the indices we are using the curly brackets to initialize the values of tha array
        String [] petNames = {"Ember", "Phoenix", "Kally"};
        input.close();
    }
}

