package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText edNumero;
    private TextView tvResultado;
    private Button btnCalcular;
    private Calculadora calculadora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setupButton();
        calculadora = new Calculadora();
    }

    private void setupButton() {
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumarValores();
            }
        });
    }

    private void sumarValores() {
        String temp=String.valueOf(calculadora.add(edNumero.getText().toString()));
        tvResultado.setText(temp);
    }

    private void initWidgets() {
        edNumero = findViewById(R.id.numero);
        tvResultado = findViewById(R.id.resultado);
        btnCalcular = findViewById(R.id.calcular);
    }

}