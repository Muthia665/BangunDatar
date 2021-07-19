package com.example.user.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegipanjang extends AppCompatActivity {

    Button btn;
    EditText inputpj1;
    EditText inputpj2;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);

        btn=findViewById(R.id.btnHitung);
        inputpj1=findViewById(R.id.editTextpj1);
        inputpj2=findViewById(R.id.editTextpj2);
        txtHasil=findViewById(R.id.txtHasil);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float panjang = Float.parseFloat(inputpj1.getText().toString());
                float lebar = Float.parseFloat(inputpj2.getText().toString());
                float hasil = (panjang * lebar);
                txtHasil.setText("Hasil" + hasil + "");
            }
        });
    }
}
