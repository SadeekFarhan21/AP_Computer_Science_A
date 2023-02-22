package Unit_8;

public class Video2 {
    public static void main(String[] args){
        String [][] grid = {
            {"A", "B", "C", "D", "E"},
            {"F", "G", "H", "row", "col"},
            {"K", "L", "M", "N", "O"},
            {"P", "Q", "R", "S", "T"},
            {"U", "V", "W", "X", "Y"}
        };
        
        // * Nested Loops --> Rectangular 2D Array
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                System.out.print(grid[row][col]+ " ") ;
            }
        }   
        System.out.println();
        
        
        // ! For Each Loop
        for(String[] gridx : grid){
            for(String x : gridx){
                System.out.print(x + " ");
            }
        }

        System.out.println();
        // ! Printing row-major order
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                System.out.print(grid[row][col] + " ");
            }
        }

        System.out.println();

        // ! Printing column-major order
        for(int col = 0; col < grid[0].length; col++){
            for(int row = 0; row < grid.length; row++){
                System.out.print(grid[row][col] + " ");
            }
        }

    }
    
    // Searching for a value in the 2D array

    public static boolean search(String [][] chart, String name){
        for(int row = 0; row < chart.length; row++){
            for(int col = 0; col < chart[row].length; col++){
                if(chart[row][col].equals(name)){
                        return true;
                }
            }
        }
        return false;
    }

    // For Each Loop
    public static boolean search1(String [][] chart, String name){
        for(String[] list : chart){
            for(String word : list){
                if(word.equals(name)){
                    return true;
                }
            }
        }
        return false;
    }

    public static double percentTrue(boolean [][] matrix){
        double total = matrix.length * matrix[0].length;
        double count = 0;
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                if(matrix[row][col]){
                    count += 1;
                }
            }
        }
        return count / total;
    }


    

}
