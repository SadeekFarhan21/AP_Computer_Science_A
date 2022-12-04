class Program2 {
	
	public static int countVowels(String s){
		int n = 0;
        for(int i = 0; i < s.length(); i++){
            String a = s.substring(i, i + 1);
            if(a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u")){
                n += 1;
            }
        }
        return n;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countVowels("obama")); //3
		System.out.println(countVowels("happy friday! i love weekends")); //9
	}
}