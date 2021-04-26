package com.example.learningandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Define data
    private TextView txtCounter;
    private Button btnPlus, btnMinus, btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link the buttons to the view
        txtCounter = findViewById(R.id.text_counter);
        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnReset = findViewById(R.id.btn_reset);

//        // Adding function to the buttons
//        btnPlus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int counter = Integer.parseInt(txtCounter.getText().toString());
//                counter++;
//
//                txtCounter.setText(String.valueOf(counter));
//            }
//        });
//
//        btnMinus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int counter = Integer.parseInt(txtCounter.getText().toString());
//                if (counter !=0){
//                    counter--;
//                    txtCounter.setText(String.valueOf(counter));
//                }
//
//            }
//        });
//
//        btnReset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                txtCounter.setText(String.valueOf(0));
//            }
//        });


    }

    /// Adding function to the buttons using methods
    public void plusFunction(View view) {
        int counter = Integer.parseInt(txtCounter.getText().toString());
        counter++;
        txtCounter.setText(String.valueOf(counter));
    }

    public void minusFunction(View view) {
        int counter = Integer.parseInt(txtCounter.getText().toString());
        if (counter !=0){
            counter--;
            txtCounter.setText(String.valueOf(counter));
        }
    }
    public void resetFunction(View view) {
        txtCounter.setText(String.valueOf(0));
    }
}