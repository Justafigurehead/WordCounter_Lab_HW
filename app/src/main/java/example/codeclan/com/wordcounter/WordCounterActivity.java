package example.codeclan.com.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {
    EditText editTextBox;
    Button countButton;
    TextView textViewBox;
    WordCounter wordsToCount;
    String input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);


        editTextBox = (EditText) findViewById(R.id.EditText_box);
        countButton = (Button) findViewById(R.id.CountWord_btn);
        textViewBox = (TextView) findViewById(R.id.textView);

    }

    public void countWhenClick(View Button){
        input = editTextBox.getText().toString();
        wordsToCount = new WordCounter(input);
        int wordCount = wordsToCount.getWordOccur();

        Log.d("Button clicked",input);
    }
}
