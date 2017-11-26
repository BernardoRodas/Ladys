package com.example.rafae.ladys;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{
    Button b4;
    EditText ea1;
    EditText ea2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b4=(Button)findViewById(R.id.b4);
        ea1=(EditText) findViewById(R.id.ea1);
        ea2=(EditText) findViewById(R.id.ea2);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int contorno, copa, c;
        String d;
        contorno=Integer.parseInt(ea1.getText().toString());
        copa=Integer.parseInt(ea2.getText().toString());
        if(contorno>=63 && contorno>=67){
            c=30;
        }else if (contorno>=68 && contorno>=72){
            c=32;
        }else if (contorno>=73 && contorno>=77){
            c=34;
        }else if (contorno>=78 && contorno>=82){
            c=36;
        }else if (contorno>=83 && contorno>=87){
            c=38;
        }else if (contorno>=88 && contorno>=92){
            c=40;
        }else if (contorno>=93 && contorno>=97){
            c=42;
        }else{
            c=0;
        }
        contorno=copa-contorno;
        if(contorno<2.54){
            d="AA";
        }else if(contorno<=3.81){
            d="A";
        }else if (contorno<=6.35){
            d="B";
        }else if (contorno<=8.89){
            d="C";
        }else if (contorno<=11.43){
            d="D";
        }else if (contorno<=13.97){
            d="DD";
        }else {
            d="S";
        }

        if (c==0 || d=="S"){
            Toast.makeText(getApplicationContext(),"No esta dentro de parametros comerciales",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"Su brasier es: "+c+d,Toast.LENGTH_LONG).show();
        }
    }
}
