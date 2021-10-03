package com.example.ejercicioformularios2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cargar(View v) {
        EditText etNombre = (EditText) findViewById(R.id.etNombre);
        EditText etEmail = (EditText) findViewById(R.id.etEmail);
        EditText etMovil = (EditText) findViewById(R.id.etMovil);
        EditText etObservaciones = (EditText) findViewById(R.id.etObservaciones);
        EditText etFecha = (EditText) findViewById(R.id.etFecha);

        TextView datosCargados = (TextView) findViewById(R.id.tvDatosCargados);

        datosCargados.setText(etNombre.getText().append("\n")
                .append(etEmail.getText()).append("\n")
                .append(etMovil.getText()).append("\n")
                .append(etObservaciones.getText()).append("\n")
                .append(etFecha.getText()));

    }
}