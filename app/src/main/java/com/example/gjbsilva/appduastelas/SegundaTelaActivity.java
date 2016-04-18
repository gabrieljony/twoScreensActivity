package com.example.gjbsilva.appduastelas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class SegundaTelaActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edt2;
    private Button btn2;
    private TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_tela);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        edt2 = (EditText)findViewById(R.id.edt2);
        btn2 = (Button)findViewById(R.id.btn2);
        txt2 = (TextView)findViewById(R.id.txt2);

        btn2.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();//vai pegar o valor digitado na 1 tela do activity
        //verificar se o parametro que passou na 1 tela da classe Intent ela existe
        if(bundle.containsKey("VALOR")){//se contem a chave chamada VALOR
            String valor = bundle.getString("VALOR");//ira recuperar o valor que foi digitado que é uma String
            txt2.setText(valor);//irá exibir o valor digitado na 1 activity na caixa de texto da 2 tela
        }
    }

    @Override
    public void onClick(View v) {
        /*Intent i = new Intent();
        i.setClass(this, PrimeiraTelaActivity.class);
        i.putExtra("VALOR2", edt2.getText().toString());
        startActivity(i);*/
        finish();
    }
}
