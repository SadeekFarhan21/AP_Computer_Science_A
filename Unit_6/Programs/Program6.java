class Program6
{
    public static String maxVowels(String[] words)
	{
		int max = Integer.MIN_VALUE;
        String ans = words[0];
        for(int i = 0; i < words.length; i++){
            if(countVowels(words[i]) > max){
                max = countVowels(words[i]);
                ans = words[i];
            }
            else if(countVowels(words[i]) == max && words[i].length() < ans.length()){
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
		String[] arr = {"physics","computer science","calculus","literature"};
		System.out.println(maxVowels(arr));
	}
}