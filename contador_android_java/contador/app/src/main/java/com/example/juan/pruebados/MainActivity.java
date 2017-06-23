package com.example.juan.pruebados;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador=0;

        // este codigo era del icono de mensaje flotante

       /* Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        TextView mitexto=new TextView(this);
        mitexto.setText("hola como estan jajajjaja");
        setContentView(mitexto); //vista que visualizara la actividad activity*/
    }

    public void incrementacontador(View vista){
        contador++;
        mostrarresultado();
    }
    public void restacontador(View vista){
        contador--;
        mostrarresultado();
    }
    public void resetearcontador(View vista){
        contador=0;
        mostrarresultado();
    }
    public void mostrarresultado(){
        TextView textoresultado=(TextView) findViewById(R.id.contadortexto);
        textoresultado.setText("" + contador);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    }*/
}
