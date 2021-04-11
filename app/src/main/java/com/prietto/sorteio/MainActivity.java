package com.prietto.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public  void sortearNumero(View view){

        int numero = new Random().nextInt(59);
        TextView texto = findViewById(R.id.text1);
        if(numero == 0){
            numero += + 1;
            texto.setText("" + numero);
        }else{
            texto.setText("" + numero);
        }


        int numero2 = new Random().nextInt(59);
        TextView texto2 = findViewById(R.id.text2);
        if(numero2 == 0){
            numero2 += +1;
            texto2.setText(""+ numero2);
        }else{
            texto2.setText(""+ numero2);
        }


        int numero3 = new Random().nextInt(59);
        TextView texto3 = findViewById(R.id.text3);
        if(numero3 == 0){
            numero3 += +1;
            texto3.setText(""+ numero3);
        }else{
            texto3.setText(""+ numero3);
        }

        int numero4 = new Random().nextInt(59);
        TextView texto4 = findViewById(R.id.text4);
        if(numero4 == 0){
            numero4 += +1;
            texto4.setText(""+ numero4);
        }else{
            texto4.setText(""+ numero4);
        }

        int numero5 = new Random().nextInt(59);
        TextView texto5 = findViewById(R.id.text5);
        if(numero5 == 0){
            numero5 += +1;
            texto5.setText(""+ numero5);
        }else{
            texto5.setText(""+ numero5);
        }

        int numero6 = new Random().nextInt(59);
        TextView texto6 = findViewById(R.id.text6);
        if(numero6 == 0){
            numero6 += +1;
            texto6.setText(""+ numero6);
        }else{
            texto6.setText(""+ numero6);
        }
    }
}
