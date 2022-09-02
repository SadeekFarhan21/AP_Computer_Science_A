import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Make of the car : ");
        String make = inp.next();
        System.out.print("Owner of the car : ");
        String owner = inp.next();
        System.out.print("Sports car : ");
        boolean isSports = inp.nextBoolean();
        System.out.print("Year of manufacture : ");
        int year = inp.nextInt();
        Car car1 = new Car(make, owner, isSports, year);
        System.out.println(car1.owner);
        System.out.println(car1.year);
        System.out.println(car1.isSports);
    }
}