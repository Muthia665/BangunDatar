package com.example.user.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegi extends AppCompatActivity {

Button btn;
EditText input;
TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        btn=findViewById(R.id.btnHitung);
        input=findViewById(R.id.editText);
        txtHasil=findViewById(R.id.txtHasil);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float sisi = Float.parseFloat(input.getText().toString());
                float hasil = (sisi * sisi);
                txtHasil.setText ("Hasil =" + hasil + "");
            }
        });



    }
}
