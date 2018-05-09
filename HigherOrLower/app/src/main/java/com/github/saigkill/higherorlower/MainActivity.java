package com.github.saigkill.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public void checkGuess (View view) {
        int randomNumber;
        EditText guessNumber = findViewById(R.id.guessedNumber);
        String guessedNumberString = guessNumber.getText().toString();
        int guessedNumberInt = Integer.parseInt(guessedNumberString);
        String message = "";
        if (guessedNumberInt > randomNumber) {
            message = "Zu hoch";
        } else if (guessedNumberInt < randomNumber){
            message = "Zu niedrig";
        } else {
            message = "Richtig! Gut gemacht!";
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(21);
        setContentView(R.layout.activity_main);
    }
}
