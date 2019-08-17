package com.example.dataparsinggojek;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ReceivedData extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_passing);
        TextView t = (TextView) findViewById(R.id.text1);
        TextView u = (TextView) findViewById(R.id.text2);
        TextView v = (TextView) findViewById(R.id.text3);

        Bundle bn = getIntent().getExtras();
        String nama = bn.getString("nama");
        t.setText(nama);
        String alamat = bn.getString("alamat");
        u.setText(alamat);
        String pesan = bn.getString("pesan");
        v.setText(pesan);
    }
}
