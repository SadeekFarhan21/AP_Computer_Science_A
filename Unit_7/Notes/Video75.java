import java.util.ArrayList;

// Search == Looking for an element in an array

// Finding a specific element in an array
// Linear Search is the best method to find an element in an array when we don't have any idea about the array size and the position of the element.


// When you are looking for int we have to use == operator

// When we are looking for a double we have to make sure that it is close enough

// Object instances such as strings, and other object types requires .equals() method to check if they are simliar.


public class Video75 {
    public static void main(String[] args) {
/*
we need to use a standard for loop to find any item in the array. if we find that element then we return the index other wise return -1.

otherwise we can also use the boolean true and false to check if the element in the array. we initialize the boolean to false. and then we find it but it should be converted to true.

! finding an integer in an array
for(int i = 0; i < array.length; i++){
    if(array[i] == element){
        return -1;
    }
}
return -1;


! finding a string in an array
for(int i = 0; i < array.length; i++){
    if(array[i].equals(element)){
        return i;
    }
    return -1; farhan
}

!! We cannot use ==  for objects; but for == it checks if their memory address is the same but for .equals() it checks if their value is the same.

!! For doubles we have to make sure that the precision of the double is close enough.


!! For linear seraches the order doesn't matter at all. We might skip what we are looking for when removing in these cases.


*/


    }    
}
