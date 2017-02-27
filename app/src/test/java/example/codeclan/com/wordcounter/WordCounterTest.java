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
}
