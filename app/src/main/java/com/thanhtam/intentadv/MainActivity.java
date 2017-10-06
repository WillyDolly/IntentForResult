package com.thanhtam.intentadv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtTen;
    Button btnChange;
    int REQUEST_CODE = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTen = (TextView)findViewById(R.id.textViewTen);
        btnChange = (Button)findViewById(R.id.buttonChange);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Manhinh2.class);
                intent.putExtra("ten", txtTen.getText().toString());
                startActivityForResult(intent, REQUEST_CODE);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK){
            String ten = data.getStringExtra("Data");
            txtTen.setText(ten);
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}

