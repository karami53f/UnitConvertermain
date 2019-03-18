package com.example.converter;

import android.content.Intent;
import android.renderscript.Double2;
import android.renderscript.Double4;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShowConvert extends AppCompatActivity {

    public static final String EXTRA_MESSAGE="message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_convert);
        Bundle bundle = getIntent().getExtras();

        TextView tvinch=(TextView) findViewById(R.id.tvinch);
        TextView tvcentimeter=findViewById(R.id.tvcentimeter);
        TextView tvmeter=findViewById(R.id.tvmeter);
        TextView tvkilometer=findViewById(R.id.tvkilometer);
        //text views
        String number = bundle.getString("number");
        int unit=bundle.getInt("unit");
        if (unit==1){
             tvinch.setText(String.valueOf(Double.parseDouble(number)));
             tvcentimeter.setText(String.valueOf((Double.parseDouble(number))*(2.54)));
             tvmeter.setText(String.valueOf(Double.parseDouble(number)*(0.0254)));
             tvkilometer.setText(String.valueOf(Double.parseDouble(number)*(0.00002)));
    }else if(unit==2){
            tvinch.setText(String.valueOf(Double.parseDouble(number)/(2.54)));
            tvcentimeter.setText(String.valueOf(Double.parseDouble(number)));
            tvmeter.setText(String.valueOf(Double.parseDouble(number)/(100.0)));
            tvkilometer.setText(String.valueOf(Double.parseDouble(number)/(100000.0)));
        }else if(unit==3){
            tvinch.setText(String.valueOf(Double.parseDouble(number)/(0.0254)));
            tvcentimeter.setText(String.valueOf(Double.parseDouble(number)*(100.0)));
            tvmeter.setText(String.valueOf(Double.parseDouble(number)));
            tvkilometer.setText(String.valueOf(Double.parseDouble(number)/(1000.0)));
        }else {
            tvinch.setText(String.valueOf(Double.parseDouble(number)/(0.00002)));
            tvcentimeter.setText(String.valueOf(Double.parseDouble(number)*100000));
            tvmeter.setText(String.valueOf(Double.parseDouble(number)*(1000.0)));
            tvkilometer.setText(String.valueOf(Double.parseDouble(number)));
        }


    }
    public void back(View b){
        Intent back=new Intent(this,MainActivity.class);
        startActivity(back);
    }


}
