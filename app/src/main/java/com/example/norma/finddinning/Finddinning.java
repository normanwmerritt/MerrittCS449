package com.example.norma.finddinning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Finddinning extends AppCompatActivity {

    private Button fastfoodbutton;

    public void Displayfastfood(){
        Intent showfastfood  = new Intent(this,Fastfood.class);
        startActivity(showfastfood);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finddinning);


        fastfoodbutton = (Button) findViewById(R.id.fastfoodbutton);
        Button dineinbutton = (Button) findViewById(R.id.dineinbutton);

        fastfoodbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Displayfastfood();


            }
        });


        dineinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });








    }
}
