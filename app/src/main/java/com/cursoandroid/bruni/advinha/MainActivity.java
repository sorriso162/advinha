package com.cursoandroid.bruni.advinha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button telaDois;
    private Button telaTres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        telaDois = (Button) findViewById(R.id.activity2);
        telaTres = (Button) findViewById(R.id.activity3);
        mudarTela(telaDois,telaTres);

    }
    public void  mudarTela( Button telaUm, Button telaDois)
    {
        telaUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              startActivity(new Intent(MainActivity.this, activitySegunda.class));
                Toast.makeText(getApplicationContext(), "indo para tela 2", Toast.LENGTH_SHORT).show();

            }
        });
        telaDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, activityTerceira.class));
                Toast.makeText(getApplicationContext(), "indo para tela 3", Toast.LENGTH_SHORT).show();

            }
        });
    }




}
