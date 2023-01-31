public class maxVowel {
    public static String maxVowels(String[] words)
	{
		int count = countVowels(words[0]);
		int length = words[0].length();
		String ans = "";
		for(int i = 0; i < words.length; i++){
			if(countVowels(words[i]) > count){
				count = countVowels(words[i]);
				ans = words[i];
			}
			else if(countVowels(words[i]) == count && words[i].length() <= length){
				length = words[i].length();
				ans = words[i];
			}
		}	
		return ans;
	}


    	public static int countVowels(String s)
	    {
        	int count = 0;
		    for(int i = 0; i < s.length(); i++){
                if(isVowel(s.substring(i, i + 1))){
                    count++;
                }
		    }
		    return count;
	    }

    	public static boolean isVowel(String ch)
	{
		return ch.equals("a") ||
			   ch.equals("e") ||
			   ch.equals("i") ||
			   ch.equals("o") ||
			   ch.equals("u");
	}

	public static void main(String[] args) 
	{
		String[] arr = {"physicsaaaaaab","computer science","calculus","literature"};
		System.out.println(maxVowels(arr));
	}
}
