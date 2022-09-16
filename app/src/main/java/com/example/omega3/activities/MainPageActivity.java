package com.example.omega3.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.example.omega3.R;

public class MainPageActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        TextView name = findViewById(R.id.titleTextView);

        Intent intent = getIntent();

        if (intent != null) {
            name.setText(intent.getStringExtra("name"));
        }
    }
}
