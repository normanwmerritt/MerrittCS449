package com.example.norma.finddinning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class DineIn extends AppCompatActivity {
    public void Displayfastfoodmap(){
        Intent showfastfoodmap  = new Intent(this,MapsActivityff.class);
        startActivity(showfastfoodmap);
    }
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

        selectionnumber = 0;
        ran = new Random();

        selectionnumber = ran.nextInt(dineinrest.size());


        restname = (TextView)findViewById(R.id.Restname);
        restname.setText(dineinrest.get(selectionnumber));

        Button mapButtons = (Button) findViewById(R.id.mapButtonslow);

        mapButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Displayfastfoodmap();
            }
        });

    }


}
