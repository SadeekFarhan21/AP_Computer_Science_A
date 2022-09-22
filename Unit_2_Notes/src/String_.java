public class String_{
    public static void main(String [] args){
        // Compare To returns how far is the first from the second towards the positive direction
        // if 0 then both are equal
        // if negative then the second one is later than the first one chronologically
        // if positive then the first one is later than the second one chronologically
        // CompareTo = Comparable String - Actual String
        // S(19) - F(6) = 13 ; Second one is ahead means positive
        // F(6) - S(19) = -13; First one is ahead means negative
        // F(6) - F(6)  = 0  ; Both are equal means zero
        String b = "Farhan";
        String c = "Shravan";
        String d = "Farhan";
        System.out.println(b.compareTo(c)); // -13
        System.out.println(c.compareTo(b)); // 13
        System.out.println(d.compareTo(b)); // 0
        




        // Substring

        String lightBulb = "Don't brake light bulbs";
        String batteries = "Don't burn batteries";

        // variableName.methodName(parameters);
        // lightbulb.substring(start, end) --> start is inclusive; end is exlcusive
        System.out.println(lightBulb.substring(1, 6)); 
        // Output : on't
        
        
        // batteries.substring(start); --> has starting point but no ending point aka goes to the end of string
        System.out.println(batteries.substring(6));
        // Output : burn batteries


        
        
        
        // Length --> Only Tricky ones
        String a = "\n";
        System.out.println(a.length()); // 1

        String v = "\t";
        System.out.println(v.length()); // 1

        String x = "\"\\Who's there?\\\""; // \\ --> length is 1; \" --> length is 1; ** BE CAREFUL
        System.out.println(x);
        System.out.println(x.length()); // 
        // Length any escape sequence is "1" not "2"
        
    }
}