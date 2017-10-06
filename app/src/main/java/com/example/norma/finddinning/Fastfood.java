package com.example.norma.finddinning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class Fastfood extends AppCompatActivity {


    public void Displayfastfoodmap(){
        Intent showfastfoodmap  = new Intent(this,MapsActivityff.class);
        startActivity(showfastfoodmap);
    }
    private Button mapButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fastfood);
        Intent intent = getIntent();

        ArrayList<String> fastfoodrests = new ArrayList<String>();


        fastfoodrests.add("McDonald's");
        fastfoodrests.add("Chick-fil-A");
        fastfoodrests.add("Baja");
        fastfoodrests.add("Burger King");
        fastfoodrests.add("Taco Bell");
        fastfoodrests.add("Sonic Drive-In");
        fastfoodrests.add("Subway");
        fastfoodrests.add("Wendy's");
        fastfoodrests.add("Popeyes");
        fastfoodrests.add("KFC");
        fastfoodrests.add("Culver's");



        int selectionnumber = 0;
        Random ran = new Random();
        selectionnumber = ran.nextInt(fastfoodrests.size());


        TextView restname = (TextView)findViewById(R.id.Restname);
        restname.setText(fastfoodrests.get(selectionnumber));

        mapButton = (Button) findViewById(R.id.Mapfastbutton);

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Displayfastfoodmap();
            }
        });

        //fastfoodrests.get(selectionnumber);








    }
}
