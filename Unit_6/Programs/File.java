public class File {
    
    public static void addOneToEverything1(int[] numbers){
        for(int j = 0; j < numbers.length; j++){
            numbers[j]++;
            System.out.print(numbers[j]);
        }
        System.out.println();
    }

    public static void addOneToEverything2(int[] numbers){
        for(int num : numbers){
            num++;
            System.out.print(num);
        }
        System.out.println();
    }

    public static void main(String[] args){
        int [] arr1 = {1, 2, 3, 4};
        int [] arr2 = {1, 2, 3, 4};
        
        addOneToEverything1(arr1);
        addOneToEverything2(arr2);
    }

}