package com.example.rohantaneja.jslovers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count;
    TextView numberTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberTextView = findViewById(R.id.number_text_view);
    }

    public void showToast(View view) {
    Toast.makeText(this, "Hello JSLovers!", Toast.LENGTH_SHORT).show();
    }

    public void increaseCount(View view) {
        count = Integer.parseInt(numberTextView.getText().toString());
        count++;
        numberTextView.setText(String.valueOf(count));
    }

    public void showRandomNumber(View view) {
        Intent launchRandomActivity = new Intent(this, RandomNumberActivity.class);
        launchRandomActivity.putExtra("random_key", count);
        startActivity(launchRandomActivity);
    }
}
