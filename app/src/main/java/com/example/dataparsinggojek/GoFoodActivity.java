package com.example.dataparsinggojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GoFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_food);
        final EditText nama = (EditText) findViewById(R.id.et_nama);
        final EditText pesan = (EditText) findViewById(R.id.et_pesan);
        final EditText alamat = (EditText) findViewById(R.id.et_alamat);
        Button btn = (Button) findViewById(R.id.btnSubmit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(GoFoodActivity.this,ReceivedData.class);
                in.putExtra("nama",nama.getText().toString());
                in.putExtra("pesan",pesan.getText().toString());
                in.putExtra("alamat",alamat.getText().toString());
                startActivity(in);
            }
        });
    }
}
