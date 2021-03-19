package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.UserDictionary;
import android.widget.ListView;

import java.util.ArrayList;

public class NationalPark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // create a list of words

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.serengeti_np, R.string.Sere_area, R.string.Sere_location, R.drawable.serengeti));
        words.add(new Word(R.string.gombe_np, R.string.gombe_area, R.string.gombe_location, R.drawable.gombe));
        words.add(new Word(R.string.manyara_np, R.string.manyara_area, R.string.manyara_location, R.drawable.manyara_np));
        words.add(new Word(R.string.ngorongoro_np, R.string.ngorongoro_area, R.string.ngorongoro_location, R.drawable.ngorongoro));
        words.add(new Word(R.string.tarangire_np, R.string.tarangire_area, R.string.tarangire_location, R.drawable.tarangire));
        words.add(new Word(R.string.selous_np, R.string.selous_area, R.string.selous_location, R.drawable.selous));
        words.add(new Word(R.string.ruaha_np, R.string.ruaha_area, R.string.ruaha_location, R.drawable.ruaha));
        words.add(new Word(R.string.katavi_np, R.string.katavi_area, R.string.katavi_location, R.drawable.katavi));
        words.add(new Word(R.string.mikumi_np, R.string.mikumi_area, R.string.mikumi_location, R.drawable.mikumi));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
