package com.example.macbookpro.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button button1;
    boolean check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(check){
                    check = false;

                    button1.setBackgroundColor(0xffdd6895);
                }
                else{
                    check = true;

                    button1.setBackgroundColor(0xff42aaf4);
                }
            }

        });



    }




}
