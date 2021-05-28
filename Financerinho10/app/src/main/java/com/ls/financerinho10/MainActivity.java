package com.ls.financerinho10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {


    private ImageButton bgame, bmentoria, bpontuacao, bturma;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bgame = (ImageButton) findViewById(R.id.bgame);
        bmentoria = (ImageButton) findViewById(R.id.bmentoria);
        bpontuacao = (ImageButton) findViewById(R.id.bpontuacao);
        bturma= (ImageButton) findViewById(R.id.bturma);

        bgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                buttonActivity();
            }
        });

        bmentoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonActivity();
            }
        });

        bpontuacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonActivity();
            }
        });

        bturma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonActivity();
            }
        });





    }


    private void buttonActivity() {

        startActivity(new Intent( MainActivity.this, IntroGame.class));
    }


}