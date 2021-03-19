package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Lakes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create a list of words to be displayed on the screen inflated by word adapter

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.victoria_lake, R.string.victoria_area, R.string.victoria_bouderingnations, R.drawable.victoria));
        words.add(new Word(R.string.tanganyika_lake, R.string.tanganyika_area, R.string.tanganyika_bn, R.drawable.tanganyika));
        words.add(new Word(R.string.nyasa_lake, R.string.nyasa_area, R.string.nyasa_bn, R.drawable.nyasa));
        words.add(new Word(R.string.rukwa_lake, R.string.rukwa_area, R.string.rukwa_bn, R.drawable.rukwa));
        words.add(new Word(R.string.natron_lake, R.string.natron_area, R.string.natron_bn, R.drawable.natron));
        words.add(new Word(R.string.manyara_lake, R.string.manyaralake_area, R.string.manyara_bn, R.drawable.manyara));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);





    }
}
