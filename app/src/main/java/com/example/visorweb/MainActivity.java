package com.example.visorweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private WebView vista;

    private Button irados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    vista=(WebView) findViewById(R.id.wVisor);
irados=(Button)findViewById(R.id.btnpasar);

irados.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent pantados=new Intent(getApplicationContext(), Pantalla2.class);
        startActivity(pantados);

    }
});

        String url="https://estudiantes.ugb.edu.sv/Login?ReturnUrl=%2F";

        final WebSettings ajustesVisorWeb = vista.getSettings();
        ajustesVisorWeb.setJavaScriptEnabled(true);
        ajustesVisorWeb.setLoadsImagesAutomatically(true);
        ajustesVisorWeb.setSupportZoom(true);
        ajustesVisorWeb.setBuiltInZoomControls(true);

        vista.loadUrl(url);

    }




}