package com.ortiz.repasoxd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;

import java.util.ArrayList;

public class Ventana2 extends AppCompatActivity {
    RadioButton rbsi;
    RadioButton rbno;
    EditText editTextTextPersonName;
    RadioGroup radioGroup;
    Spinner spinner3;
    RatingBar ratingBar;
    Button agregarbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);

        rbsi = findViewById(R.id.rbsi);
        rbno = findViewById(R.id.rbno);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        radioGroup = findViewById(R.id.radioGroup);
        spinner3 = findViewById(R.id.spinner3);
        ratingBar = findViewById(R.id.ratingBar);
        agregarbtn = findViewById(R.id.agregarbtn);
        agregarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Ventana2.this,ListaRegistro.class);
                startActivity(intento);


            }
        });


        }

    }
