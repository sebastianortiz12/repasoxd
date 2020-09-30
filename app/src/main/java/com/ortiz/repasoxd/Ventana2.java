package com.ortiz.repasoxd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

public class Ventana2 extends AppCompatActivity {
    private RadioButton r1, r2;
    EditText edittext;
    RadioGroup radioGroup;
    Spinner spinner3;
    RatingBar ratingBar;
    Button agregarbtn;
    CheckBox boxelectro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);

        r1 = (RadioButton) findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);
        edittext = findViewById(R.id.edittext);
        radioGroup = findViewById(R.id.radioGroup);
        spinner3 = findViewById(R.id.spinner3);
        ratingBar = findViewById(R.id.ratingBar);
        agregarbtn = findViewById(R.id.agregarbtn);
        boxelectro = findViewById(R.id.boxelectro);

        agregarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String producto = edittext.getText().toString();
                String Garantia = validar();
                String electro = validar2();
                String Stock = spinner3.getSelectedItem().toString();
                float rating = ratingBar.getRating();
                String rank = Float.valueOf(rating).toString();

                List.Objetos.add(new Objeto(producto, Garantia, electro, Stock, rank));

                Toast.makeText(Ventana2.this, "Gracias por registrar su producto", Toast.LENGTH_SHORT).show();
                Intent intento = new Intent (Ventana2.this,MainActivity.class);
                startActivity(intento);

            }
        });


    }

    private String validar() {

        if (r1.isChecked() == true) {
            return "si, deseo garantia";
        }
        if (r2.isChecked() == true) {
            return   "no , deseo garantia";

        }
        return "no se selecciono nada";
    }
    private String validar2(){
        if (boxelectro.isChecked()==true){
            return "Es electrodomestico";
        }
        return "No es Electrodomestico";
    }
}
