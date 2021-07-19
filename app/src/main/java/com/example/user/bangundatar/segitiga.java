package com.example.user.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segitiga extends AppCompatActivity {

    Button btn;
    EditText inputa;
    EditText inputt;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

    btn=findViewById(R.id.btnHitung);
    inputa=findViewById(R.id.editText1);
    inputt=findViewById(R.id.editText2);
    txtHasil=findViewById(R.id.txtHasil);

    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            float alas = Float.parseFloat(inputa.getText().toString());
            float tinggi= Float.parseFloat(inputt.getText().toString());
            float hasil = (alas * tinggi)/2;
            txtHasil.setText("Hasil" + hasil + "");
        }
    });
    }
}
