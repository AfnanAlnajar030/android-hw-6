package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Movie instances
        Movie megaMind = new Movie("Mega Mind", "Mega Mind's voice actor", 15.4, 16, "Kids movie");
        Movie theHangover = new Movie("the Hangeover", "The guy from the Office", 95.4, 18, "Comedy");
    }
}