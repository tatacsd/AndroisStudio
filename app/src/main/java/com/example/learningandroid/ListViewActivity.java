package com.example.learningandroid;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListViewActivity extends AppCompatActivity {

    // Data fields
    private ListView listView;
    private String[] options = {
            "A",
            "B",
            "C",
            "D",
            "A",
            "B",
            "C",
            "D",
            "A",
            "B",
            "C",
            "D",
            "A",
            "B",
            "C",
            "D",
    };



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Add the content view by creating a new layout activity_listview
        setContentView(R.layout.activity_listview);

        // Get the list view from the view
        listView = findViewById(R.id.listView);

        // Adding a model/ adapter to add the options
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options);
        listView.setAdapter(arrayAdapter);
    }
}
