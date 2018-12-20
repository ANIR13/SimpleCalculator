package com.example.lenovo.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1,b2,b3,b4;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        e1=(EditText)findViewById(R.id.fNumber);
        e2=(EditText)findViewById(R.id.sNumber);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        tv=(TextView)findViewById(R.id.textView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String s1=e1.getText().toString();
               String s2=e2.getText().toString();


                if(s1.equals("") || s2.equals("") ){
                    Toast.makeText(MainActivity.this, "Please enter 2 numbers", Toast.LENGTH_SHORT).show();
                }
                else {
                    int i = Integer.parseInt(s1);
                    int i2 = Integer.parseInt(s2);
                    int r = i + i2;
                    String res = Integer.toString(r);
                    tv.setText(res);

                }
            }
        });




        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();


                if(s1.equals("") || s2.equals("") ){
                    Toast.makeText(MainActivity.this, "Please enter 2 numbers", Toast.LENGTH_SHORT).show();
                }
                else {
                    int i = Integer.parseInt(s1);
                    int i2 = Integer.parseInt(s2);
                    int r = i - i2;
                    String res = Integer.toString(r);
                    tv.setText(res);

                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();


                if(s1.equals("") || s2.equals("") ){
                    Toast.makeText(MainActivity.this, "Please enter 2 numbers", Toast.LENGTH_SHORT).show();
                }
                else {
                    int i = Integer.parseInt(s1);
                    int i2 = Integer.parseInt(s2);
                    int r = i * i2;
                    String res = Integer.toString(r);
                    tv.setText(res);

                }
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();


                if(s1.equals("") || s2.equals("")  ){
                    Toast.makeText(MainActivity.this, "Please enter 2 numbers", Toast.LENGTH_SHORT).show();
                }
                else {

                    double q=Double.parseDouble(s1);
                    double p=Double.parseDouble(s2);

                    double r = q / p;
                    String res = Double.toString(r);
                    tv.setText(res);

                }
            }
        });

    }
}
