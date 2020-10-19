package com.example.list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] cities = {"Seattle",
                "Bothell",
                "Kirkland",
                "Bellevue",
                "Lynnwood",
                "Renton",
                "Redmond",
                "Spokane",
                "Vancouver",
                "Tacoma",
                "Olympia",
                "Bellingham",
                "Arlington",
                "Everett",
                "Woodinville",
                "Monroe",
                "New Castle",
                "Ballard",
                "Lacey"};
    }
}