package com.example.a520h0537_tienphuhuy_lab1_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox android;
    CheckBox ios;
    CheckBox windows;
    CheckBox rim;
    Button button;
    TextView i1;
    TextView i2;
    TextView i3;
    TextView i4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android = findViewById(R.id.android);
        ios = findViewById(R.id.ios);
        windows = findViewById(R.id.windows);
        rim = findViewById(R.id.rim);
        button = findViewById(R.id.button);
        i1 = findViewById(R.id.i1);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        i4 = findViewById(R.id.i4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(android.isChecked()) {
                    i1.setText("Android: True");
                } else {
                    i1.setText("Android: False");
                }

                if(ios.isChecked()) {
                    i2.setText("iOS: True");
                } else {
                    i2.setText("iOS: False");
                }

                if(windows.isChecked()) {
                    i3.setText("Windows: True");
                } else {
                    i3.setText("Windows: False");
                }

                if(rim.isChecked()) {
                    i4.setText("RIM: True");
                } else {
                    i4.setText("RIM: False");
                }
            }
        });
    }
}