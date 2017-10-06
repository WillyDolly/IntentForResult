package com.thanhtam.intentadv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Manhinh2 extends AppCompatActivity {
    Button btnConfirm;
    EditText edtTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh2);
        btnConfirm = (Button)findViewById(R.id.buttonConfirm);
        edtTen = (EditText) findViewById(R.id.editTextTen);

        Intent intent = getIntent();
        String ten = intent.getStringExtra("ten");
        edtTen.setText(ten);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten2 = edtTen.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("Data",ten2);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
