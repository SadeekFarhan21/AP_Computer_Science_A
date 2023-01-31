public class Vocab {
    public String[] theVocab = {"time", "food", "dogs", "cats", "healht", "plants", "sports"};
    
    public static boolean findWord(String str){
        String[] theVocab = {"time", "food", "dogs", "cats", "healht", "plants", "sports"};
        for(String s : theVocab){
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
        int size = countNotInVocab(wordArray);
        String[] arr = new String[size];
        int index = 0;
        for(String s: wordArray){
            if(!findWord(s)){
                arr[index] = s;
                index++;
            }
        }
        
        return arr;
    }

    public static void main(String[] args){
        String[] wordArray = {"dogs", "toys", "sun", "plants", "time"};

        System.out.println(countNotInVocab(wordArray));           
    }
}