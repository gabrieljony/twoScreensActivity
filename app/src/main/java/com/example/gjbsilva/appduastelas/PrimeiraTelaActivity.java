package com.example.gjbsilva.appduastelas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class PrimeiraTelaActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edt1;
    private Button btn1;
    private TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primeira_tela);
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
        edt1 = (EditText)findViewById(R.id.edt1);
        btn1 = (Button)findViewById(R.id.btn1);
        txt1 = (TextView)findViewById(R.id.txt1);

        btn1.setOnClickListener(this);

        /*Bundle bundle2 = getIntent().getExtras();//vai pegar o valor digitado na 2 tela do activity
        //verificar se o parametro que passou na 2 tela da classe Intent ela existe
        if(bundle2.containsKey("VALOR2")) {//se contem a chave chamada VALOR
            String valor2 = bundle2.getString("VALOR2");//ira recuperar o valor que foi digitado que é uma String
            txt1.setText(valor2);//irá exibir o valor digitado na 1 activity na caixa de texto da 2 tela
        }*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_primeira_tela, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        i.setClass(this, SegundaTelaActivity.class);
        i.putExtra("VALOR", txt1.getText().toString() + " - " + edt1.getText().toString());
        startActivity(i);

    }
}
