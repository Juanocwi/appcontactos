package com.espeletia.proyectosemana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.TextView;

public class confirmacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        Bundle parametros =getIntent().getExtras();

        String nombre =     parametros.getString(getResources().getString(R.string.pnombre));
        String fecha =      parametros.getString(getResources().getString(R.string.pfecha));
        String telefono =   parametros.getString(getResources().getString(R.string.ptelefono));
        String correo =     parametros.getString(getResources().getString(R.string.pcorreo));
        String descripcion =parametros.getString(getResources().getString(R.string.pdescripcion));

        TextView txCDN1 =(TextView) findViewById(R.id.txCDN1);
        TextView txCDF1 =(TextView) findViewById(R.id.txCDF1);
        TextView txCDT1 =(TextView) findViewById(R.id.txCDT1);
        TextView txCDE1 =(TextView) findViewById(R.id.txCDE1);
        TextView txCDD1 =(TextView) findViewById(R.id.txCDD1);

        txCDN1.setText(nombre);
        txCDF1.setText(fecha);
        txCDT1.setText(telefono);
        txCDE1.setText(correo);
        txCDD1.setText(descripcion);

        findViewById(R.id.btCDE).setOnClickListener(new AdapterView.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}