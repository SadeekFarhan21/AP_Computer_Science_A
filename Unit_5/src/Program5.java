class Program5 {
	
	public static String surround(String s, String search_term) {
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            String x = s.substring(i, i + 1);
            if(x.equals(search_term)){
                String temp = "(" + search_term + ")";
                ans += temp;
            }
            else {
                ans += x;
            }
        }
		return ans;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
		System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
	}
}