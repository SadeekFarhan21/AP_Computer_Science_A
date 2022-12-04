import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        /* 
        Scanner input = new Scanner(System.in);
        String snackName = input.nextLine();
        int snackCalories = input.nextInt();
        Daily1 snack1 = new Daily1(); // default constructor
        Daily1 snack2 = new Daily1(snackName, snackCalories); // overloaded constructor 1
        Daily1 snack3 = new Daily1(snackCalories, snackName); // overloaded constructor 2
        System.out.print(snack1.getName());
        System.out.print(snack1.getCalories());
        System.out.print(snack2.getName());
        System.out.print(snack2.getCalories());
        System.out.print(snack3.getName());
        System.out.print(snack3.getCalories()); 
    
        Sport Lacrosse = new Sport(); // default constructor
        System.out.println(Lacrosse.getName());
        System.out.println(Lacrosse.getNumberOfAtheletes());

        Sport Soccer = new Sport("Lacrosee"); // overloaded constructor
        System.out.println(Soccer.getName()); // only name
        System.out.println(Soccer.getNumberOfAtheletes());

        Sport Football = new Sport(10000); // overloaded constructor
        System.out.println(Football.getName());
        System.out.println(Football.getNumberOfAtheletes());

        
        Sport Baseball = new Sport("Baseball", 1000); // overloaded constructor
        System.out.println(Baseball.getName());
        System.out.println(Baseball.getNumberOfAtheletes());
        
        */
        Cow bessie = new Cow("holstein", "moo");
        System.out.println(bessie.getSound());

        System.out.println(bessie.getType());
        bessie.milkCow();
        System.out.println(bessie.getNumMilking());
        bessie.milkCow();
        bessie.milkCow();
        System.out.println(bessie.getNumMilking());
        // input.close();
    }
}
