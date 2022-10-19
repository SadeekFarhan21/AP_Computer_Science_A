import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // input is an object that gives access to the methods in Scanner
        Scanner input = new Scanner(System. in);

        String username = "23buss_joshua@dublinstudents.net";
        String password = "23bu3456";
/*
        System.out.print("Username = ");
        String user = input.nextLine();
        System.out.print("Password = ");
        String pass = input.nextLine();

        while (!user.equals(username)  || !password.equals(pass) ) {
            System.out.println("Login Failed!");
            System.out.print("Username = ");
            user = input.nextLine();
            System.out.print("Password = ");
            pass = input.nextLine();
        }
*/
        System.out.println();
        System.out.print("What is your first name? ");
        String first = input.nextLine();

        System.out.println();

        System.out.print(first + ", how old are you? ");
        int age = input.nextInt();

        System.out.println();

        System.out.print(first + ", what is your grade (1-12)? ");
        int grade = input.nextInt();

        if (grade < 1 || grade > 12)
        {
            System.out.println("Invalid Grade!");
            System.out.print(first + ", what is your grade (1-12)? ");
            grade = input.nextInt();
        }

        System.out.println();

        String school = "";
        String college = "";
        double credits = 0;
        String license = "";

        if (grade >= 9)
        {
            System.out.print("What high school? ");
            input.nextLine();
            school = input.nextLine();

            System.out.print ("\nCredits earned? ");
            credits = input.nextDouble();

            // if
            
        }
        else if (grade >= 6)
        {
            System.out.print("What middle school? ");
            input.nextLine();
            school = input.nextLine();
        }        
        else 
        {
            System.out.print("What elementary school? ");
            input.nextLine();
            school = input.nextLine();
        }    
        
        if(grade == 12 && credits >= 20){
            System.out.print("What college do you want to attend? ");
            input.nextLine();
            college = input.nextLine();
        }
/* 
        public static void determineRelationship(Kid one, Kid two){
            if(one == two){
                System.out.println("Same Kid.");
            }

        }
*/
        // System.out.println(college);
        input.close();
    }
    
}

/*        // greater than
        if (grade > 12) {
            System.out.println("Grade cannot be greater than 12");
            System.out.println("Please fix your grade");
        }

        // less than
        if (grade < 1) 
            System.out.println("Grade cannot be less than 1");
        
        int myGrade = 12;

        // equals
        if (myGrade == grade) 
            System.out.println("We are in the same grade");
        
        // not equals
        if (myGrade != grade) 
            System.out.println("We are not in the same grade");
        
        // greater than or equal
        if (age >= 16) 
            System.out.println("You are eligible to receive your driver's license");
        
else if (age == 15) 
            System.out.println(
                "You are eligible to receive your driver's license within the next year"
            ); // less than or equal
        else if (age <= 15) 
            System.out.println(
                "You are not eligible to receive your driver's license right now"
            );
*/