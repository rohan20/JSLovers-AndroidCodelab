package com.example.rohantaneja.jslovers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RandomNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_number);

        int count = getIntent().getIntExtra("random_key", 766);
        TextView numberTextView = findViewById(R.id.random_number_text_view);

        numberTextView.setText(String.valueOf(count));
    }
}
