package com.example.user.bangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 =findViewById(R.id.btnpersegi);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(),persegi.class);
                startActivity(a);
            }
        });

        Button btn2 =findViewById(R.id.btnpersegipanjang);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(),persegipanjang.class);
                startActivity(a);
            }
        });

        Button btn3 =findViewById(R.id.btnsegitiga);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(),segitiga.class);
                startActivity(a);
            }
        });


    }
}
