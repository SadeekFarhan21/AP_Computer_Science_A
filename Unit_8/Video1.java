package Unit_8;
public class Video1 {
    // initialize a two dimensional array
    // datatype variableName = new datatype[row][column];
    public static void main(String[] args){
        // 2D Array of integers
        int row = 2;
        int column = 4;
        int twoDimensionalArray [][] = new int[row][column];


        // Alternative method of creating a two dimensional array

        int TwoDimensionalArray [][]= {
            {1, 2, 3}, 
            {4, 5, 6},
            {7, 8, 9}
        };
        // size of two dimensional array
        
        // size of row
        System.out.println(TwoDimensionalArray.length);

        // size of column
        System.out.println(TwoDimensionalArray[0].length);
        

        // Accessing elements of the array
        
        int Row = 1;
        int Column = 2;
        
        System.out.println(TwoDimensionalArray[Row][Column]);
    }
}