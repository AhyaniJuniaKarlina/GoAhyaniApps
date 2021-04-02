package com.example.goahyaniapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_menu);
    }

    public void clickRS(View view) {
        //gambar RS di klik
        Intent i = new Intent(this,RS.class);
        startActivity(i);
    }

    public void clickPolisi(View view) {
        //gambar Polisi di klik
        Intent a = new Intent(this, Polisi.class);
        startActivity(a);
    }

    public void clickSupermasrket(View view) {
        Intent b = new Intent(this, Supermarket.class);
        startActivity(b);
    }

    public void clickSekolah(View view) {
        Intent c = new Intent(this, Sekolah.class);
        startActivity(c);
    }
}