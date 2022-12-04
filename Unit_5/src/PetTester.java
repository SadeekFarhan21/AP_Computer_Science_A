import java.util.*;
public class PetTester {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Pet p = new Pet("Abu", "cat", 14);        
        System.out.println(p.getName());
        System.out.println(p.getTypeOfPet());
        System.out.println(p.getAge());
        input.close();
    }
}
