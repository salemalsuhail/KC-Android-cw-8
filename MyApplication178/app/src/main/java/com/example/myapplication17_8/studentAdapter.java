package com.example.myapplication17_8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class studentAdapter extends ArrayAdapter  {
        List<Student> studentList;
    public studentAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
         studentList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list , parent, false);

        Student student = studentList.get(position);

        TextView textView = view.findViewById(R.id.textView5);
        TextView textView1 = view.findViewById(R.id.textView6);
        ImageView imageView = view.findViewById(R.id.imageView3);

        imageView.setImageResource(student.getStudentPhoto());

        return view;

    }
}
