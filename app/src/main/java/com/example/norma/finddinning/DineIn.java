package com.example.norma.finddinning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class DineIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        Intent intent = getIntent();

        ArrayList<String> dineinrest = new ArrayList<String>();

        dineinrest.add("Gates Bar-B-Q");
        dineinrest.add("The Cheesecake Factory");
        dineinrest.add("Fogo de Chao");
        dineinrest.add("Pizza 51");
        dineinrest.add("IHOP");


        int selectionnumber = 0;
        Random ran = new Random();
        selectionnumber = ran.nextInt(dineinrest.size());


        TextView restname = (TextView)findViewById(R.id.Restname);
        restname.setText(dineinrest.get(selectionnumber));

    }
}
