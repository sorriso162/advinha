package com.cursoandroid.bruni.advinha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activityTerceira extends AppCompatActivity {

    private Button telaUm;
    private Button telaDois;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);

        telaUm = (Button) findViewById(R.id.activit1);
        telaDois = (Button) findViewById(R.id.activit2);
        mudarTela(telaUm, telaDois);
    }

    public void mudarTela(Button telaUm, Button telaDois) {
        telaUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activityTerceira.this, MainActivity.class));
                Toast.makeText(getApplicationContext(), "indo para tela 1", Toast.LENGTH_SHORT).show();
            }
        });
        telaDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activityTerceira.this,activitySegunda.class ));
                Toast.makeText(getApplicationContext(), "indo para tela 2", Toast.LENGTH_SHORT).show();

            }
        });
    }
}