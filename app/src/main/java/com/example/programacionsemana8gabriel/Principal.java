package com.example.programacionsemana8gabriel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
private Spinner tablas;
private TextView ver;
private ImageButton creador;
private String resultado = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        tablas = findViewById(R.id.sptabla);
        ver = findViewById(R.id.txttablas);
        creador = findViewById(R.id.imagecreador);
        String tabla[]={"Seleccione tabla","Tabla del 1","Tabla del 2","Tabla del 3","Tabla del 4","Tabla del 5","Tabla del 6","Tabla del 7","Tabla del 8","Tabla del 9","Tabla del 10"};
        ArrayAdapter adaptadortabla = new ArrayAdapter(this, android.R.layout.simple_spinner_item,tabla);
        tablas.setAdapter(adaptadortabla);

        creador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Principal.this,creador.class);
                startActivity(intent);
                finish();
            }
        });
        tablas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (adapterView.getSelectedItemPosition()){
                    case 0:
                        ver.setText("");
                    break;
                    case 1:
                        resultado = "";
                        for(int j = 1; j<= 10; j++){
                            resultado += (1 + " X " + j + " = " + 1*j +  '\n');
                        }
                        ver.setText(resultado.toString());
                        break;
                    case 2:
                        resultado = "";
                        for(int j = 1; j<= 10; j++){
                            resultado += (2 + " X " + j + " = " + 2*j +  '\n');
                        }
                        ver.setText(resultado.toString());
                        break;
                    case 3:
                        resultado = "";
                        for(int j = 1; j<= 10; j++){
                            resultado += (3 + " X " + j + " = " + 3*j +  '\n');
                        }
                        ver.setText(resultado.toString());
                        break;
                    case 4:
                        resultado = "";
                        for(int j = 1; j<= 10; j++){
                            resultado += (4 + " X " + j + " = " + 4*j +  '\n');
                        }
                        ver.setText(resultado.toString());
                        break;
                    case 5:
                        resultado = "";
                        for(int j = 1; j<= 10; j++){
                            resultado += (5 + " X " + j + " = " + 5*j +  '\n');
                        }
                        ver.setText(resultado.toString());
                        break;
                    case 6:
                        resultado = "";
                        for(int j = 1; j<= 10; j++){
                            resultado += (6 + " X " + j + " = " + 6*j +  '\n');
                        }
                        ver.setText(resultado.toString());
                        break;
                    case 7:
                        resultado = "";
                        for(int j = 1; j<= 10; j++){
                            resultado += (7 + " X " + j + " = " + 7*j +  '\n');
                        }
                        ver.setText(resultado.toString());
                        break;
                    case 8:
                        resultado = "";
                        for(int j = 1; j<= 10; j++){
                            resultado += (8 + " X " + j + " = " + 8*j +  '\n');
                        }
                        ver.setText(resultado.toString());
                        break;
                    case 9:
                        resultado = "";
                        for(int j = 1; j<= 10; j++){
                            resultado += (9 + " X " + j + " = " + 9*j +  '\n');
                        }
                        ver.setText(resultado.toString());
                        break;
                    case 10:
                        resultado = "";
                        for(int j = 1; j<= 10; j++){
                            resultado += (10 + " X " + j + " = " + 10*j +  '\n');
                        }
                        ver.setText(resultado.toString());
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}