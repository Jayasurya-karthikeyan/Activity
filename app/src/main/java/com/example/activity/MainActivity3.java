package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    ListView listView;
    ArrayList arrayList;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        listView.findViewById(R.id.list);
        arrayList= new ArrayList();
        arrayList.add("Surya");
        arrayList.add("Surya");
        arrayList.add("Surya");
        arrayList.add("Surya");
        arrayList.add("Surya");
        arrayList.add("Surya");
        arrayList.add("Surya");
        arrayList.add("Surya");
        arrayList.add("Surya");
        arrayList.add("Surya");
        arrayList.add("Surya");
        arrayList.add("Surya");
        arrayList.add("Surya");


        arrayAdapter =new ArrayAdapter(MainActivity3.this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);





    }
}