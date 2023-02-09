import java.util.ArrayList;

class Main
{

    public static void main(String[] args)
    {
        // 1. Create an array list of strings called 'courses'
        ArrayList <String> courses = new ArrayList <String>();

        // 2. Add the Strings into that ArrayList
        courses.add("English");
        courses.add("Science");
        courses.add("History");
        courses.add("Mathematics");
        courses.add("Technology");

        // 3. Output the 'courses' ArrayList
        System.out.println(courses);

        // 4. Output the size of the ArrayList
        System.out.println(courses.size());
        
        // 5. Add "Phys Ed" to the course courses
        courses.add(2, "Phys Ed");

        // 6. Output the 'courses' ArrayList
        System.out.println(courses);

        // 7. Output the size of the ArrayList
        System.out.println(courses.size());
        
        // 8. Remove the first and the last element of the array
        courses.remove(0); // First element
        String removed = courses.remove(courses.size() - 1); // Last element

        // 9. Output the 'courses' ArrayList
        System.out.println(courses);

        // 10. Output the size of the ArrayList
        System.out.println(courses.size());
        
        // 11. Output the last element that was removed
        System.out.println(removed);

        // 12. Set the "Visual Arts" into index 1
        courses.set(1, "Visual Arts");

        // 13. Output the 'courses' ArrayList again
        System.out.println(courses);

        // 14. Output the size of the ArrayList again
        System.out.println(courses.size());
        
        // 15. Output the first and last element of the array
        System.out.println(courses.get(0));
        System.out.println(courses.get(courses.size() - 1));
    }
}