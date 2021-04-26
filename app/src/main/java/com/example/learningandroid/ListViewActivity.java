package com.example.learningandroid;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListViewActivity extends AppCompatActivity {

    // Data fields
    private ListView listView;
    private String[] options = {
            "Introduction",
            "My Bio App - Relative Layout",
            "My Bio App - Linear Layout",
            "Login Form - Constraint Layout"
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

        // Add an event listener when the item is clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(ListViewActivity.this, options[position], Toast.LENGTH_SHORT).show();

                Intent intent;
                // Adding the options selection
                switch (position){
                    case 0:
                        // go to the selected activity page (the actual -> the selected)
                        intent = new Intent(ListViewActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        // go to the selected activity page (the actual -> the selected)
                        intent = new Intent(ListViewActivity.this, MyBioRelativeLayout.class);
                        startActivity(intent);
                        break;
                    case 2:
                        // go to the selected activity page (the actual -> the selected)
                        intent = new Intent(ListViewActivity.this, MyBioLinearLayout.class);
                        startActivity(intent);
                        break;
                    case 3:
                        // go to the selected activity page (the actual -> the selected)
                        intent = new Intent(ListViewActivity.this, LoginFormActivity.class);
                        startActivity(intent);
                        break;

                }
            }
        });
    }
}
