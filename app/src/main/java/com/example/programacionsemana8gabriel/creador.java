package com.example.programacionsemana8gabriel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class creador extends AppCompatActivity {
private ImageButton regresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creador);
        regresar = findViewById(R.id.imageregresar);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(creador.this,Principal.class);
                startActivity(intent);
                finish();
            }
        });
    }
}