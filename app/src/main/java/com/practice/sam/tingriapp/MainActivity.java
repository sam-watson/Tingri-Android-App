package com.practice.sam.tingriapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayMessage() {
        TextView tingriText = (TextView) findViewById(R.id.tingri_text);
        String[] tingriStringArray = getResources().getStringArray(R.array.tingri);

        Random rand = new Random();
        int selection = rand.nextInt(tingriStringArray.length);
        String tingriString = tingriStringArray[selection];

        tingriText.setText(tingriString);
    }

    public void newMessage(View view) {
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
        displayMessage();

    }
}
