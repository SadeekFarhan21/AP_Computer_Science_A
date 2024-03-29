import java.util.ArrayList;
/*
 * Traversing meaning acessing all elments of a specific data structure
 */
public class Video73 {
    public static void main(String[] args){
        int sum = 0; // Initial variable with the length of the Strings inside the ArrayList
        ArrayList <String> list = new ArrayList<String>(); // Creating a new ArrayList

        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("PHP");
        list.add("C#");
        list.add("C");
        list.add("C++");
        list.add("Java");

        for(int i = 0; i < list.size(); i++){
            sum += list.get(i).length(); // Increasing the sum depending on the length of a specific String inside the ArrayList
            // .get(i) will return a specific String inside the ArrayList
            // .get(i) accesses the i-the element of the ArrayList and using the i-th element of the ArrayList we get the length of the String

        }

        // Possible Loop conditions of the traversal of ArrayList
        // int i = 0; i < list.size(); i++
        // int i = 1; i <= list.size() -1; i++;
        // int i = arr.size() - 1; i >= 0; i--;
        // int i = arr.size() - 1; i > -1; i--; 
        // These are the possible loop conditions of the traversal of ArrayList
        System.out.println(sum);

        // We have an ArrayList of Doubles named grades and we want to remove all the grades that are less than 70
        ArrayList<Double> grades = new ArrayList<Double>();
        grades.add(70.0);
        grades.add(90.0);
        grades.add(82.0);
        grades.add(90.0);
        grades.add(90.0);
        grades.add(80.0);
        grades.add(70.0);
        grades.add(60.0);
        grades.add(50.0);
        grades.add(40.0);
        grades.add(30.0);

        System.out.println(grades);
        // Flawed Method
        for(int i = 0; i < grades.size(); i++){
            if(grades.get(i) <= 70.0){

                grades.remove(i);
                // i--;
            }
        }
        System.out.println(grades);
        // Accurate Method
        // This method starts the loop from the last element of the ArrayList
        for(int i = grades.size() - 1; i >= 0; i--){
            if(grades.get(i) < 70){
                grades.remove(i);
            }
        }
        System.out.println(grades);

        // ! Video 2
        // Enhanced For Loops for ArrayLists
        // for=each loop iterates through all the elements of the ArrayList

        // It uses first-to-last order and will visit each and every element of the ArrayList

        // Easier to use than traditional for loop



        // Don't need to keep track of the number of indices

        /*
         for(data type variable : nameOfArrayList){

         }

         */

        ArrayList <String> roster = new ArrayList<String>();
        
        int total = 0;

        roster.add("John");
        roster.add("Mary");
        roster.add("Mike");
        roster.add("John");
        roster.add("Mary");
        roster.add("Mike");
        roster.add("John");
        roster.add("Mary");
        roster.add("Mike");
        roster.add("John");
        roster.add("Mary");
        roster.add("John");


        for(String name : roster){
            total += name.length();
        }
        System.out.println(total);

        // Grades higher than 70

        for(Double grade : grades){
            if(grade > 70){
                System.out.println(grade);
            }
        }

        // Enhanced For Loops doesn't update or change the actual ArrayList
        

        // ! Common mistakes
        // ! Forget import statement
        // ! Use primitive data type
        

        // Swap consecutive elements

        ArrayList <Double> myList = new ArrayList<Double>();

        myList.add(1.0);
        myList.add(2.0);
        myList.add(3.0);
        myList.add(4.0);
        myList.add(5.0);
        myList.add(6.0);
        myList.add(7.0);
        myList.add(8.0);
        myList.add(9.0);
        myList.add(10.0);
        myList.add(11.0);
        myList.add(12.0);


        /*
        for(int i = myList.size(); i > 1; i--){
            // Double removed = myList.get(i-1);
            myList.set(i-1, myList.get(i-2));
        }
         */
        System.out.println(myList);

    
        for(int i = 0; i < myList.size(); i += 2){

            myList.set(i + 1, myList.get(i));
        }
    }
}
