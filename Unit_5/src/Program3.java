/*
    Farhan Sadeek
    16 November 2022
    count of occurences

*/

class Program3 {
	public static int countString(String str, String toFind){
		int count = 0;
        for(int i = 0; i <= str.length() - toFind.length(); i++){
            if(str.substring(i, i + toFind.length()).equals(toFind)){
                i += toFind.length();
                count++;
            }
        }
        return count;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countString("crazy crayfish crushing craniums", "cra")); //3
		System.out.println(countString("sometimes solutions dont come on time", "me")); //4
	}
}