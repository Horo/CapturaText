package com.ndigitales.android.capturatext;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
}

public void mostrar(View v){
EditText etNom = (EditText)findViewById(R.id.ednom);
EditText etApe = (EditText)findViewById(R.id.edape);
TextView tmostrar = (TextView)findViewById(R.id.tmostrar);
String nom = etNom.getText().toString();
String ape = etApe.getText().toString();
String msj = nom + " " + ape;

Toast.makeText(this, msj, Toast.LENGTH_LONG).show();

tmostrar.setText(msj);
}

@Override
public boolean onCreateOptionsMenu(Menu menu) {
getMenuInflater().inflate(R.menu.activity_main, menu);
return true;
}

}