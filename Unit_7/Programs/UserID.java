import java.util.ArrayList;
public class UserID
{

// The list of possible user names, based on a user’s last name and grad year and initialized by the constructor.

    public ArrayList<String> possibleIDs = new ArrayList<String>();
    /** 
    * Precondition: lastName and gradYear have length greater than 0
    */

    public UserID(String lastName, String gradYear)
    { 
        for(int i = 0; i < lastName.length(); i++){
            String name = gradYear + lastName.substring(0, i + 1);    
            possibleIDs.add(name); 
        }
    }

    /** Returns true if arr contains name, and false otherwise. */

    public boolean isUsed(String name, String[] arr)
    {
        for(String a : arr){
            if(a.equals(name)){
                return true;
            }
        }
        return false;
    }

 

    /** Removes strings from possibleNames that are found in usedNames as described in part (b).
    */

    public void setAvailableUserIDs(String[] usedNames){ 
        /*
        for(int i = possibleIDs.size() - 1; i >= 0; i--){
            if(isUsed(possibleIDs.get(i), usedNames)){
                possibleIDs.remove(i);
            }
        }
        */
        for(String a : possibleIDs){
            if(isUsed(a, usedNames)){
                possibleIDs.remove(a);
            }   
        }

    }

}