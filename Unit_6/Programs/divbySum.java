public class divbySum {
    
    // div by Sum
    public int divbySum(int [] arr, int n){
        int sum = 0;
        for(int a : arr){
            if(a % n == 0){
                sum += a;  
            }
        }
        return sum ;
    }

    // min program
    public int min (int [] arr){
        int min = Integer.MAX_VALUE;
        for(int a : arr){
            if(a < min){
                min = a;
            }
        }
        return min;
    }

    // min program
    public int max (int [] arr){
        int max = Integer.MIN_VALUE;
        for(int a : arr){
            if(a > max){
                max = a;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        
    }
}