package com.example.converter;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

int unit;
    public void onSendMessage(View v){

        RadioButton rb1=findViewById(R.id.rbinch);
        RadioButton rb2=findViewById(R.id.rbcentimeter);
        RadioButton rb3=findViewById(R.id.rbmeter);
        EditText editText = findViewById(R.id.txtnumber);
        String number = editText.getText().toString();
        Intent intent = new Intent(this,ShowConvert.class);


       if (rb1.isChecked()==true) {
            unit=1;

        }else if (rb2.isChecked()==true){
            unit=2;

        }else if (rb3.isChecked()==true){
            unit=3;
        }else {
            unit = 4;
        }
        intent.putExtra("number",number);
        intent.putExtra("unit",unit);
        startActivity(intent);
    }
/*
    public void inch(View vv){
        Button btninch=findViewById(R.id.btninch);
        Button btncentimeter=findViewById(R.id.btncentimeter);
        Button btnmeter=findViewById(R.id.btnmeter);
        Button btnkilometer=findViewById(R.id.btnkilometer);
        unit=1;
        btninch.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        btncentimeter.setBackgroundColor(getResources().getColor(android.R.color.white));
        btnmeter.setBackgroundColor(getResources().getColor(android.R.color.white));
        btnkilometer.setBackgroundColor(getResources().getColor(android.R.color.white));

    }
    public void centimeter(View vv){
        Button btninch=findViewById(R.id.btninch);
        Button btncentimeter=findViewById(R.id.btncentimeter);
        Button btnmeter=findViewById(R.id.btnmeter);
        Button btnkilometer=findViewById(R.id.btnkilometer);
        unit=2;
        btninch.setBackgroundColor(getResources().getColor(android.R.color.white));
        btncentimeter.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        btnmeter.setBackgroundColor(getResources().getColor(android.R.color.white));
        btnkilometer.setBackgroundColor(getResources().getColor(android.R.color.white));

    }
    public void meter(View vv){
        Button btninch=findViewById(R.id.btninch);
        Button btncentimeter=findViewById(R.id.btncentimeter);
        Button btnmeter=findViewById(R.id.btnmeter);
        Button btnkilometer=findViewById(R.id.btnkilometer);
        unit=3;
        btninch.setBackgroundColor(getResources().getColor(android.R.color.white));
        btncentimeter.setBackgroundColor(getResources().getColor(android.R.color.white));
        btnmeter.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        btnkilometer.setBackgroundColor(getResources().getColor(android.R.color.white));

    }
    public void kilometer(View vv){
        Button btninch=findViewById(R.id.btninch);
        Button btncentimeter=findViewById(R.id.btncentimeter);
        Button btnmeter=findViewById(R.id.btnmeter);
        Button btnkilometer=findViewById(R.id.btnkilometer);
        unit=4;
        btninch.setBackgroundColor(getResources().getColor(android.R.color.white));
        btncentimeter.setBackgroundColor(getResources().getColor(android.R.color.white));
        btnmeter.setBackgroundColor(getResources().getColor(android.R.color.white));
        btnkilometer.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));

    }
    */
}
