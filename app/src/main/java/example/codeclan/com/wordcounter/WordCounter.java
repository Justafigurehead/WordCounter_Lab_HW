package example.codeclan.com.wordcounter;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCounter {

    private String input;

    public WordCounter(String input){
        this.input = input;
    }


    public int getStringCount(){
        int total = 0;
        String[] words = input.split(" ");
        for( String word : words){
            total++;
        }
        return total;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void getWordOccur() {
        // got help from: http://stackoverflow.com/questions/38751130/how-do-i-count-the-occurrences-of-each-word-in-each-of-sentences-stored-in-array

        Map<String, Integer> wordCount = new LinkedHashMap<String, Integer>();

        String[] words = input.split(" "); //splitting the sentence input into an array of words
        for (String word : words) {  //searching through for loop to get word in words...
               Integer count = wordCount.get(word); //set a count that allows for the wordCount of each word we get.
                if (count == null) { //Count == null if wordCount is empty so as it starts empty count == null which we need to set to 0 to begin counting the first added word? (DOUBLE CHECK)
                count = 0;
            }
                wordCount.put(word, count + 1 ); // we are inserting each word and count (+ 1) into the hash and then printing out of the key & value to screen.
            }
         System.out.println(wordCount.entrySet()); // we aren't returning anything here but we are printing to the screen.
        }
    }

