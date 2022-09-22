public class String_{
    public static void main(String [] args){
        // Compare To returns how far is the first from the second towards the positive direction
        // if 0 then equals
        // if negative then the second one is later than the first one chronologically
        // CompareTo = Comparable String - Actual String
        // S(19) - F(6) = 13 ; Second one is ahead means positive
        // F(6) - S(19) = -13; First one is ahead means negative
        // F(6) - F(6)  = 0  ; Both are equal means zero
        String b = "Farhan";
        String c = "Shravan";
        String d = "Farhan";
        System.out.println(b.compareTo(c));
        System.out.println(c.compareTo(b));
        System.out.println(d.compareTo(b));
        
        input.close();
    }
}