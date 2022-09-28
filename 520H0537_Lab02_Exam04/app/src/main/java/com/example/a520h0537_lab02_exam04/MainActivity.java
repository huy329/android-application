package com.example.a520h0537_lab02_exam04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private List<Language> languages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Data:
        this.languages = LanguageDataUtils.getLanguages();


        this.spinner = (Spinner) this.findViewById(R.id.spinner_language);

        // Adapter"
        CustomAdapter adapter = new CustomAdapter(MainActivity.this,
                R.layout.spinner_item_layout_resource,
                R.id.textView_item_name,
                R.id.textView_item_percent,
                this.languages);

        this.spinner.setAdapter(adapter);
    }

}