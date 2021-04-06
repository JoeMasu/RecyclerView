package com.iua.work5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private int [] image={
     R.drawable.budgie,
            R.drawable.crane,
            R.drawable.duck,
            R.drawable.falcon,
            R.drawable.flyingduck,
            R.drawable.flyingstork,
            R.drawable.hummingbird,
            R.drawable.kiwibird,
            R.drawable.parrot,
            R.drawable.singingbird,
            R.drawable.turkey,
            R.drawable.woodpecker

    };
    private String [] Title={
            "budgieTitle",
                    "craneTitle",
                    "duckTilte",
                    "falconTitle",
    "flyingduckTitle",
    "flyingstrokTitle",
    "humminingbirdTitle",
    "kiwibirdTitle",
    "parrotTilte",
    "singingbirdTitle",
    "turkeyTitle",
    "woodpeckerTitle"

    };

    private String [] Description={
    "budgiedescription",
            "cranedescription",
            "duckDescription",
            "falconDescription",
            "flyingduckDescription",
            "flyingstrokDescription",
            "humminingbirdDescription",
            "kiwibirdDescription",
            "parrotDescription",
            "singingbirdDescription",
            "turkeyDescription",
            "woodpeckerDescription"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list1=(ListView) findViewById(R.id.work5id);
        BirdAdapterClass BC = new BirdAdapterClass(getApplicationContext()
        ,Title,Description,image);
        list1.setAdapter(BC);


    }
}
