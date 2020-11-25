package com.example.meuapp;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("SegundaActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("SegundaActivity","onPause");
    }
}
