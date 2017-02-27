package example.codeclan.com.wordcounter;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class WordCounterTest {

    private WordCounter testSentence;

    @Before
    public void before(){
        String input = "Hello World";
        testSentence = new WordCounter(input);
    }

    @Test
    public void testCanCountWords(){
        assertEquals(2, testSentence.getStringCount());
    }

    @Test
    public void testCanCountADifferentSentence(){
        testSentence.setInput("Hey now hey now");
        assertEquals(4, testSentence.getStringCount());
    }

    @Test
    public void testIfCanCountEachTimeAWordOccurs(){
        testSentence.getWordOccur();
        testSentence.setInput("Hey now hey now");
        testSentence.getWordOccur();
        assertEquals(4, testSentence.getStringCount());

    }

//    @Test
//    public void testLongSentence(){
//        testSentence.getWordOccur();
//        testSentence.setInput("It was the best of times, it was the worst of times it was the age of wisdom it was the age of foolishness, it was the epoch of belief it was the epoch of incredulity");
//        testSentence.getWordOccur();
//        assertEquals(36, testSentence.getStringCount());
//        testSentence.sortByValues;
//    }

}
