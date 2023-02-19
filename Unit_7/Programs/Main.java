 import java.util.ArrayList;

/*
    Farhan Sadeek
    9th February 2023
*/

class Main
{
    public static void main(String[] args)
	{

        String [] usedIDs = {"2024t", "2024ta", "2024tan", "2023", "2023jo", "2023jon"};
                
        UserID student = new UserID ("johns", "2023");

        student.setAvailableUserIDs(usedIDs);
        System.out.println(student.possibleIDs);		
	}
}