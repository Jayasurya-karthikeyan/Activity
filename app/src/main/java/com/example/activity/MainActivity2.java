package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView d;
    String g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        d=findViewById(R.id.textView2);

        g=getIntent().getStringExtra("abcd");
        d.setText(g);
    }
}
/// Declare , Initialize , Usage