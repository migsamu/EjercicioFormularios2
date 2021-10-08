package com.example.ejercicioformularios2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton tbObservaciones;
    private Switch swObservaciones;
    private CheckBox cbObservaciones;
    private EditText etObservaciones;
    private TextView tvObservaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbObservaciones = (ToggleButton) findViewById(R.id.tbObservaciones);
        swObservaciones = (Switch) findViewById(R.id.swObservaciones);
        cbObservaciones = (CheckBox) findViewById(R.id.cbObservaciones);
        etObservaciones = (EditText) findViewById(R.id.etObservaciones);
        tvObservaciones = (TextView) findViewById(R.id.tvObservaciones);

        tbObservaciones.setTextOn("On");
        tbObservaciones.setTextOff("Off");

        swObservaciones.setTextOff("Off");
        swObservaciones.setTextOn("On");

        swObservaciones.setChecked(false);
        tbObservaciones.setChecked(false);
        cbObservaciones.setChecked(false);

        etObservaciones.setVisibility(View.GONE);
        tvObservaciones.setVisibility(View.GONE);

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

    public void observaciones(View v) {

        if (tbObservaciones.isChecked() || swObservaciones.isChecked() || cbObservaciones.isChecked()) {

            etObservaciones.setVisibility(View.VISIBLE);
            tvObservaciones.setVisibility(View.VISIBLE);
        } else {
            etObservaciones.setVisibility(View.GONE);
            tvObservaciones.setVisibility(View.GONE);
        }
    }
}