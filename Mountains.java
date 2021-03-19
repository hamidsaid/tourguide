package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Mountains extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create a list of words of Mountains found in Tanzania
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.mt_kilimajaro, R.string.kilimajaro_area, R.string.kilimajaro_local));
        words.add(new Word(R.string.mt_oldonyo, R.string.oldonyo_area, R.string.oldonyo_local));
        words.add(new Word(R.string.mt_meru, R.string.meru_area, R.string.meru_local));
        words.add(new Word(R.string.mt_hanang, R.string.hanang_area, R.string.hanang_local));
        words.add(new Word(R.string.mt_rungwe, R.string.rungwe_area, R.string.rungwe_local));

        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);



    }
}
