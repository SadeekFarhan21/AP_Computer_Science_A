import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner inp = new Scanner(System.in);
        String make = inp.next();
        String owner = inp.next();
        boolean isSports = inp.nextBoolean();
        Car car1 = new Car(make, owner, isSports);
        System.out.println(car1.owner);
    }
}
