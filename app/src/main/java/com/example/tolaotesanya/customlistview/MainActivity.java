package com.example.tolaotesanya.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView mlistView;

    int[] images = {R.drawable.image1,
                    R.drawable.image2,
                    R.drawable.image3,
                    R.drawable.image4};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlistView = findViewById(R.id.listview);

    }
}
