package com.example.a520h0537_lab03_exam04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        show("--Start--");
    }

    @Override
    protected void onResume() {
        super.onResume();
        show("--Resume--");
    }

    @Override
    protected void onPause() {
        super.onPause();
        show("--Pause--");
    }

    @Override
    protected void onStop() {
        super.onStop();
        show("--Stop--");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        show("--Destroy--");
    }

    protected void show(String message) {
        Log.e(TAG, message);
    }
}