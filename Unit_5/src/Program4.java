class Program4 {
	
	public static String censorLetter (String s, String ch){
        String ans = "";
		for(int i = 0; i < s.length(); i++){
            String x = s.substring(i, i + 1);
            if(x.equals(ch)){
                ans += "*";
            }
            else {
                ans += x;
            }
        }
        return ans;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(censorLetter("computer science","e")); //"comput*r sci*nc*"
		System.out.println(censorLetter("trick or treat","t")); //"*rick or *rea*"
	}
}