package com.example.visorweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;

public class Pantalla2 extends AppCompatActivity {

    private RadioButton Mascu, Feme;
    private Button elboton;
private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);


    Mascu=(RadioButton) findViewById(R.id.rbdMas);
    Feme=(RadioButton) findViewById(R.id.rbdFem);
    elboton=(Button) findViewById(R.id.btnAccion);
texto=(TextView)findViewById(R.id.textView2);

    elboton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            long date = System.currentTimeMillis();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss yyyy/MM/d");
            String dateString = sdf.format(date);
            texto.setText("DatWIF: " + dateString);






            if(Mascu.isChecked()==true){
                Toast.makeText(getApplicationContext(), "seleccionaste Masculino",Toast.LENGTH_LONG).show();
            }
            if(Feme.isChecked()==true){
                Toast.makeText(getApplicationContext(), "seleccionaste Femenino",Toast.LENGTH_LONG).show();
            }
        }
    });


    }
}