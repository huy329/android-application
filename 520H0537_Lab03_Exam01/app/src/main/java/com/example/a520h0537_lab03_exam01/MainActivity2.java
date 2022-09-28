package com.example.a520h0537_lab03_exam01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    TextView input;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView);
        input = findViewById(R.id.input);
        button = findViewById(R.id.button);

        Intent intent = getIntent();
        String gmailGet = intent.getStringExtra("gmail");
        textView.setText("Xin chào, " + gmailGet + ". Vui lòng nhập tên");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultReturnActivityOne = new Intent();
                resultReturnActivityOne.putExtra("name", input.getText().toString());
                setResult(RESULT_OK, resultReturnActivityOne);
                finish();
            }
        });
    }
}