package com.example.learningandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Define data
    private TextView txtCounter;
    private Button btnPlus, btnMinus, btnReset, btnHideShow;
    private ImageView ivAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link the buttons to the view
        txtCounter = findViewById(R.id.text_counter);
        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnReset = findViewById(R.id.btn_reset);
        btnHideShow = findViewById(R.id.btn_hide_show);
        ivAvatar = findViewById(R.id.iv_avatar);

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


        // Adding function to the buttons by implementing the class with the view on click
        // Line 10 and 105
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnReset.setOnClickListener(this);

        btnHideShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ivAvatar.getVisibility() == View.GONE){
                    ivAvatar.setVisibility(View.VISIBLE);
                } else {
                    ivAvatar.setVisibility(View.GONE);
                }
            }
        });

    }

    /// Adding function to the buttons using methods
//    public void plusFunction(View view) {
//        int counter = Integer.parseInt(txtCounter.getText().toString());
//        counter++;
//        txtCounter.setText(String.valueOf(counter));
//    }
//
//    public void minusFunction(View view) {
//        int counter = Integer.parseInt(txtCounter.getText().toString());
//        if (counter !=0){
//            counter--;
//            txtCounter.setText(String.valueOf(counter));
//        }
//    }
//    public void resetFunction(View view) {
//        txtCounter.setText(String.valueOf(0));
//    }

    // Adding a function to all buttons
//    public void operation(View view) {
//        int id = view.getId();
//        int counter = Integer.parseInt(txtCounter.getText().toString());
//
//        switch (id){
//            case R.id.btn_plus:
//                counter++;
//                txtCounter.setText(String.valueOf(counter));
//                break;
//            case R.id.btn_minus:
//                if(counter != 0){
//                    counter--;
//                    txtCounter.setText(String.valueOf(counter));
//                }
//                break;
//            case R.id.btn_reset:
//                txtCounter.setText(String.valueOf(0));
//                break;
//        }
//    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        int counter = Integer.parseInt(txtCounter.getText().toString());

        switch (id) {
            case R.id.btn_plus:
                counter++;
                txtCounter.setText(String.valueOf(counter));
                Toast.makeText(this, "Plus Button is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_minus:
                if (counter != 0) {
                    counter--;
                    txtCounter.setText(String.valueOf(counter));
                }
                Toast.makeText(this, "Minus Button is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_reset:
                txtCounter.setText(String.valueOf(0));
                Toast.makeText(this, "Reset Button is clicked", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}