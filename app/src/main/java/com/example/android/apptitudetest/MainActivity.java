package com.example.android.apptitudetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import static android.R.attr.name;

import static com.example.android.apptitudetest.R.id.text;

public class MainActivity extends AppCompatActivity {
    String studentName;
    String StudentMatric;
    Button start;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         start= (Button)findViewById (R.id.buttonClick);

        View linearLayout = (LinearLayout) findViewById(R.id.layout);

        if (linearLayout!=null){
            linearLayout.setAlpha(0);
            linearLayout.animate().alpha(1).setDuration(2000);
        }


    }



    public void click(View view) {

        EditText studentName= (EditText) findViewById (R.id.nameInput);
        EditText studentMatric = (EditText) findViewById(R.id.matricInput);
        String name = studentName.getText ().toString ();
        String matric = studentMatric.getText().toString();

        if (name.isEmpty()&& matric.isEmpty()){
            Toast.makeText(this,"input your Name and Matric to proceed",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }else {

            Intent intent = new Intent(this, sumUpData.class);
            intent.putExtra("StudentName", name);
            intent.putExtra("StudentMatric", matric);
            startActivity(intent);

        }


    }

    }



