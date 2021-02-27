package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sample_DashBoard extends AppCompatActivity {
    Button btnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample__dash_board);

    btnButton = findViewById(R.id.btnButton);

    btnButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            //Intenting to another activity from this activty using the Intent class Object
            Intent i = new Intent(Sample_DashBoard.this, MainActivity.class);

            startActivity(i);
        }
    });

    }
}