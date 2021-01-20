package com.example.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<menu> extends AppCompatActivity {
    Button a;
    Button b;
    Button c;
    String s;
    EditText ea;
    EditText eb;
    EditText ec;
    TextView t;
    View i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.button);
        b=findViewById(R.id.button2);
        c=findViewById(R.id.button3);
        ea=findViewById(R.id.editTextTextPersonName2);
        eb=findViewById(R.id.editTextTextPersonName3);
        ec=findViewById(R.id.editTextTextPersonName4);
        t=findViewById(R.id.textView);



        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=ea.getText().toString() + "\n" + eb.getText().toString() + "\n" + ec.getText().toString();
                Toast.makeText(MainActivity.this,s, Toast.LENGTH_SHORT).show();
                }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=ea.getText().toString() + "\n" + eb.getText().toString() + "\n" + ec.getText().toString();
                t.setText(s);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=ea.getText().toString() + "\n" + eb.getText().toString() + "\n" + ec.getText().toString() ;
                Intent second = new Intent(MainActivity.this,MainActivity2.class);
                second.putExtra("abcd",s);
                startActivity(second);
            }
        });

        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sp,menu);

        return super.onCreateOptionsMenu(menu);
    }

    public void surya(MenuItem item) {
        Intent second = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(second);
        Toast.makeText(this, "Bowchikku Bow Bow", Toast.LENGTH_SHORT).show();
    }

    public void akshat(MenuItem item) {
        Toast.makeText(this, "Mudhal mudhalaaga ..", Toast.LENGTH_SHORT).show();
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("ELAE YENLAE")
                .setMessage("ipdi pandreenga")
                .setNegativeButton("Kirukku mental", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(MainActivity.this, "Chithappa sethutaaru", Toast.LENGTH_SHORT).show();
                    }
                })
                .setPositiveButton("Payavula", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent second = new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(second);

                    }
                })
                .show();
    }

    public void web(MenuItem item) {
        Toast.makeText(this, "Pokishamaana ..", Toast.LENGTH_SHORT).show();
        Intent second = new Intent(MainActivity.this,Web.class);
        startActivity(second);

    }
}