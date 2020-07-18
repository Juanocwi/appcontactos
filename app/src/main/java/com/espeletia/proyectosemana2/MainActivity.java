package com.espeletia.proyectosemana2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{
    private TextView fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fecha = findViewById(R.id.txf2);
        String nombreR = "";

//        Bundle cambio =getIntent().getExtras();
//        nombreR =     cambio.getString(getResources().getString(R.string.prnombre));
//        String fechaR =      cambio.getString(getResources().getString(R.string.prfecha));
//        String telefonoR =   cambio.getString(getResources().getString(R.string.prtelefono));
//        String correoR =     cambio.getString(getResources().getString(R.string.prcorreo));
//        String descripcionR =cambio.getString(getResources().getString(R.string.prdescripcion));

//        EditText txN2 =(EditText) findViewById(R.id.txN2);
//        TextView txf2 =(TextView) findViewById(R.id.txf2);
//        EditText edT1 =(EditText) findViewById(R.id.edT1);
//        EditText edE1 =(EditText) findViewById(R.id.edE1);
//        EditText edDC1 =(EditText) findViewById(R.id.edDC1);
//
//        txN2.setText(nombreR);
//        txf2.setText(fechaR);
//        edT1.setText(telefonoR);
//        edE1.setText(correoR);
//        edDC1.setText(descripcionR);

        findViewById(R.id.btf1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuadroFecha();
            }
        });

        findViewById(R.id.btnx2).setOnClickListener(new AdapterView.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre=((EditText) findViewById(R.id.txN2)).getText().toString();
                String date=((TextView) findViewById(R.id.txf2)).getText().toString();
                String tel=((EditText) findViewById(R.id.edT1)).getText().toString();
                String email=((EditText) findViewById(R.id.edE1)).getText().toString();
                String description =((EditText) findViewById(R.id.edDC1)).getText().toString();

                Intent intent =new Intent(MainActivity.this,confirmacion.class);
                intent.putExtra(getResources().getString(R.string.pnombre),nombre);
                intent.putExtra(getResources().getString(R.string.pfecha),date);
                intent.putExtra(getResources().getString(R.string.ptelefono),tel);
                intent.putExtra(getResources().getString(R.string.pcorreo),email);
                intent.putExtra(getResources().getString(R.string.pdescripcion), description);
                startActivity(intent);
                finish();

            }
        });



    }

    private void cuadroFecha(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
        String date=dayOfMonth+"/"+(month+1)+"/"+year;
        fecha.setText(date);
    }

}