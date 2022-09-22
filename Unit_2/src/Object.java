import java.util.Scanner;
import java.lang.Integer;
import java.lang.String;
import java.lang.Double;

public class Object {
    private String name;
    private String age;
    private String grade;

    public Object(String name, String age, String grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public static void main(String [] args){
        /* 
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String grade = input.nextLine();
        String age = input.nextLine();
        Object Farhan = new Object(name, age, grade);
        System.out.println(Farhan.name);
        System.out.println(Farhan.age);
        System.out.println(Farhan.grade);
        input.close();

        Integer i = new Integer(20);
        System.out.println(i.intValue());
        i = new Integer(14);
        System.out.println(i.intValue());
        
        int rn = (int) (Math.random() * 100) + 1;
        System.out.println(rn);
    }
}