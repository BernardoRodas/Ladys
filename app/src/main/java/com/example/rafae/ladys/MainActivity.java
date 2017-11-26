package com.example.rafae.ladys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b1;
    Button b2;
    Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Switch(v.getId()){
            case R.id.b1:
                Intent in1=new Intent(this,SecondActivity.class);
                startActivity(in1);
                break;
            case R.id.b2:
                Intent in2=new Intent(this,ThirdActivity.class);
                startActivity(in2);
                break;
            case R.id.b3:
                Intent in3=new Intent(this,FourthActivity.class);
                startActivity(in3);
                break;

        }

    }
}
