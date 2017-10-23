package com.example.norma.finddinning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class Finddinning extends AppCompatActivity {

    private Button fastfoodbutton;

    public void Displayfastfood(){
        Intent showfastfood  = new Intent(this,Fastfood.class);
        startActivity(showfastfood);
    }

    public void Displaydinein(){
        Intent showdinein = new Intent(this, DineIn.class);
        startActivity(showdinein);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finddinning);


        fastfoodbutton = (Button) findViewById(R.id.fastfoodbutton);
        Button dineinbutton = (Button) findViewById(R.id.dineinbutton);
        Button eitherbutton = (Button) findViewById(R.id.eitherbutton);


        fastfoodbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Displayfastfood();


            }
        });


        dineinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Displaydinein();

            }
        });

        eitherbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random ran = new Random();
                int sel = ran.nextInt(2);
                if (sel == 0){Displaydinein();}
                if (sel == 1){Displayfastfood();}



            }
        });








    }
}