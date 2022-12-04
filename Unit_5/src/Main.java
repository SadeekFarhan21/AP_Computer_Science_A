import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String snackName = input.nextLine();
        int snackCalories = input.nextInt();
        Daily1_1 snack1 = new Daily1_1(); // default constructor
        Daily1_1 snack2 = new Daily1_1(snackName, snackCalories); // overloaded constructor 1
        Daily1_1 snack3 = new Daily1_1(snackCalories, snackName); // overloaded constructor 2
        System.out.print(snack1.getName());
        System.out.print(snack1.getCalories());
        System.out.print(snack2.getName());
        System.out.print(snack2.getCalories());
        System.out.print(snack3.getName());
        System.out.print(snack3.getCalories()); 
        input.close();
    }
}
