package com.example.myapplication17_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_details);super.onCreate(savedInstanceState);

        Bundle bundle = getIntent().getExtras();
        studentAdapter delieveredstudentAdapter = (studentAdapter) bundle.getSerializable("studentAdapter");

        TextView textView = findViewById(R.id.textView5);
        TextView textView1 = findViewById(R.id.textView6);
        ImageView imageView = findViewById(R.id.imageView3);

        studentAdapter NameTextView,setText(delieveredstudentAdapter.getstudentAdapterName());
        studentAdapter TextView,setText(delieveredstudentAdapter.getstudenAdapterName());
        studentAdapter ImageView,setText(delieveredstudentAdapter.getView(studentAdapter));

        



    }
}