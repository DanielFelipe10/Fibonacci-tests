package com.example.fibonacci;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button boton;
    private EditText num;

    private TextView mostrar ;

    private int Res;
    Fibonacci fibonacci = new Fibonacci();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = findViewById(R.id.description);
                num = findViewById(R.id.number);
                String cadena = num.getText().toString();
                int numero_f = Integer.parseInt(cadena);

                AlertDialog.Builder resultado = new AlertDialog.Builder(MainActivity.this);
                resultado.setMessage("El Fibonacci de su número es: "+ fibonacci.Calcular(numero_f));
                resultado.setCancelable(false);
                resultado.setNegativeButton("¡Hecho!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.cancel();
                        num.setText("");
                    }
                });
                AlertDialog titulo = resultado.create();
                titulo.setTitle("Resultado");
                titulo.show();
            }
        });
    }
}