package com.cameo.girish_pc.travel360;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class ShowList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list);


        //Array list to store destinations
        ArrayList<String> words = new ArrayList<String>();

        words.add("One degree");
        words.add("One degree");
        words.add("Two degree");
        words.add("Two degree");
        words.add("Three degree");
        words.add("Three degree");
        words.add("Four degree");
        words.add("Four degree");
        words.add("Five degree");
        words.add("Five degree");
        words.add("Six degree");
        words.add("Six degree");
        words.add("Seven degree");
        words.add("Seven degree");
        words.add("Eight degree");
        words.add("Eight degree");
        words.add("Nine degree");
        words.add("Nine degree");
        words.add("Ten degree");
        words.add("Ten degree");


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        GridView listView = (GridView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
