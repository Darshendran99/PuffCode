package com.example.groupb17;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class LearningFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_learning, container, false);
        //Intent to cpp
        ImageButton cpp = (ImageButton) view.findViewById(R.id.cpp);
        cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "C++ Selected", Toast.LENGTH_SHORT).show();
                Intent cpp = new Intent(getActivity(),cpp_Learn.class);
                startActivity(cpp);
            }
        });
        //Intent to java
        ImageButton javaBtn = (ImageButton) view.findViewById(R.id.javaBtn);
        javaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Java Selected", Toast.LENGTH_SHORT).show();
                Intent javaBtn = new Intent(getActivity(),java_Learn.class);
                startActivity(javaBtn);
            }
        });
        //Intent to PhP
        ImageButton phpBtn = (ImageButton) view.findViewById(R.id.phpBtn);
        phpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "PHP Selected", Toast.LENGTH_SHORT).show();
                Intent phpBtn = new Intent(getActivity(),php_Learn.class);
                startActivity(phpBtn);
            }
        });
        //Intent to Python
        ImageButton pythonBtn = (ImageButton) view.findViewById(R.id.pythonBtn);
        pythonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "PythonSelected", Toast.LENGTH_SHORT).show();
                Intent pythonBtn = new Intent(getActivity(),python_Learn.class);
                startActivity(pythonBtn);
            }
        });
        return view;
    }

    public void onResume(){
        super.onResume();
        // Set title bar
        ((MainActivity) getActivity())
                .setActionBarTitle("Learning");

    }
}