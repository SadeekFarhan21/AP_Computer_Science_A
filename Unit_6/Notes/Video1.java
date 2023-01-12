/*

    ! Off by one error --> forget to include the first or last element of the array
*/

//  ! If you get out of the array it's called IndexOutOfBoundsException Error

/* 
    
    * Traversing array means accessing each and every element of the array 
    
    * A Standard for loop is the best way to traverse the array

    * Array's are indexed from 0 to (the number of elements - 1) 
*/

public class Video1 {
    public static void main(String[] args) {
        
        // * For Loop 
        int [] list = new int[5];
        for(int index = 0; index < list.length; index++){

            list[index] = (int) (Math.random() * 10);
        }


        // * While Loop
        int [] arr = new int[5];
        int position = 0;
        while(position < arr.length){
            arr[position] = (int)(Math.random() * 10);
            position++;
        }
    }

/* 
    ? In this program the array of size 5 is storing a random number between 0 to 9 

    Most Common Mistakes in traversing an array

    ! Index Out Bound
    ! Throw off by 1
        In index out of bounds error the index tries to access an element of that is either at an index which is just off by for example (<= arr.length) rather than putting in (< arr.length - 1) and starting at 1 instead of 0
    Or not accessing the last index of the array
    < arr.length - 1
*/  

}