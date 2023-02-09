import java.util.ArrayList;
class Program2
{   
    public static void removeEverything(ArrayList <String> wordList){
        ArrayList <String> newWordList = new ArrayList<String>();

        for(int i = 0; i < wordList.size(); i += 2){
            newWordList.add(wordList.get(i));
        }
        
        // System.out.println(newWordList);
        
        wordList.clear();
        wordList.addAll(newWordList);
        wordList = newWordList;
    }

	public static void main(String[] args)
	{
		ArrayList <String> wordList = new ArrayList <String> ();
        wordList.add("Monday");
        wordList.add("Tuesday");
        wordList.add("Wednesday");
        wordList.add("Thursday");
        wordList.add("Friday");
        wordList.add("Saturday");
        removeEverything(wordList);
        System.out.println(wordList);
	}
	//create your method below
	
}