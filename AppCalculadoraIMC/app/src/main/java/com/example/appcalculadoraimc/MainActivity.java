package com.example.appcalculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPeso;
    private EditText editAltura;
    private TextView texResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        texResultado = findViewById(R.id.textResultado);

    }

    public void calcularImc(View view){

    double peso = Double.parseDouble(editPeso.getText().toString());
    double altura = Double.parseDouble(editAltura.getText().toString());

    double imc = peso/(altura*altura);



    if(imc >= 18.5 && imc <= 24.99){

        texResultado.setText("Peso normal, IMC = "+imc);

    }else if (imc >= 25 && imc <= 29.99){

        texResultado.setText("Acima do peso, IMC = "+imc);

    }else if (imc >= 30 && imc <= 34.99){

        texResultado.setText("Obesidade I, IMC = "+imc);
;
    }else if (imc >= 35 && imc <= 34.99){

        texResultado.setText("Obesidade II (severa), IMC = "+imc);

    }else if (imc >40){texResultado.setText("Obesidade III (morbida), IMC = "+imc);

    }










    }
}