package com.semasuka.converter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText myAmount= (EditText) findViewById(R.id.dollarField);


        Double Dollar=Double.parseDouble(myAmount.getText().toString());

        Double Kes= Dollar * 101;


        Toast.makeText(getApplicationContext(),"KES "+ Kes.toString(),Toast.LENGTH_SHORT).show();



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
