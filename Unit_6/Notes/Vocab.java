public class Vocab {
	private static String [] theVocab = {"time", "food", "dogs", "cats", "health", "plants", "sports"};
	public static boolean findWord(String str){
		for(String s: theVocab){
			if(s.equals(str)){
				return true;
			}
		}
		return false;
	}	
	

	public static int countNotInVocab(String[] wordArray){
		int count = 0;
		for(String s: wordArray){
			if(!findWord(s)){
				count++;
			}
		}
		return count;
	}

	public static String[] notInVocab(String[] wordArray){
		String [] arr = new String[countNotInVocab(wordArray)];
		int index = 0;
		for(String s : wordArray){
			if(!findWord(s)){
				arr[index] = s;
				index++;
			}
		}
		return arr;
	}

	public static void main(String[] args){
		String [] wordArray = {"dogs", "toys", "sun", "plants", "time"};
		System.out.print(countNotInVocab(wordArray));
		String [] arr = notInVocab(wordArray);
		for(String a : arr){
			System.out.println(a);
		}
	}
}