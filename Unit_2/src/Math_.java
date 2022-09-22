public class Math_ {
    public static void main(String [] args){
        
        /*
        Random number formula

        DataType (int / double) variableName = (int -> if casted) Math.random() * (max - min + 1) + min;
        */

        // Random decimal number between 0 and 1
        double a = Math.random();
        System.out.println(a); // Any random number



        // Random number between 12 and 43
        int rn  = (int)(12 + Math.random() * (43 - 12 + 1));
        int randomNumber  = (int)      (12 +  Math.random(             ) * (43  - 12 +  1));
     // dataType variable = (dataType) (min + Math.random(no parameters) * (max - min + 1));
     
     
     // range = max - min + 1;
     // dataType variable = (dataType) (min + Math.random(no parameters) * range);
        System.out.println(randomNumber); // any number between the range
        







        // Absolute Value
        // dataType variableName = (casting if necessary) Math.abs(num1 - num2);
        double abs = Math.abs(2.4 - 10); // |-7.6| = 7.6
        System.out.println(abs);


        // Square Root
        double sqrt = Math.sqrt(17.4);
        System.out.println(sqrt);

        // Power Rule
     // dataType variable = Math.sqrt(base, exp);
        double pow = Math.pow(sqrt, 2.0);
    }
}
