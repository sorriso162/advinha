package com.cursoandroid.bruni.advinha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activitySegunda extends AppCompatActivity {
    private Button telaUm;
    private Button telaDois;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        telaUm = (Button) findViewById(R.id.button);
        telaDois = (Button) findViewById(R.id.button2);

        mudarTela(telaUm, telaDois);

    }

    public void mudarTela(Button telaUm, Button telaDois) {
        telaUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activitySegunda.this, MainActivity.class));
                Toast.makeText(getApplicationContext(), "indo para tela 1", Toast.LENGTH_SHORT).show();
            }
        });
        telaDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activitySegunda.this, activityTerceira.class));
                Toast.makeText(getApplicationContext(), "indo para tela 3", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
