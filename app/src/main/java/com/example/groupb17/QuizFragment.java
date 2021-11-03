package com.example.groupb17;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class QuizFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);

        //Intent to cpp Quiz
        Button cppQuizBtn = (Button) view.findViewById(R.id.cppQuizBtn);
        cppQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "C++ Quiz Selected", Toast.LENGTH_SHORT).show();
                Intent cppQuizBtn = new Intent(getActivity(),quiz_cpp.class);
                startActivity(cppQuizBtn);
            }
        });
        //Intent to Java Quiz
        Button javaQuizBtn = (Button) view.findViewById(R.id.javaQuizBtn);
        javaQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Java Quiz Selected", Toast.LENGTH_SHORT).show();
                Intent javaQuizBtn = new Intent(getActivity(),quiz_java.class);
                startActivity(javaQuizBtn);
            }
        });
        //Intent to php Quiz
        Button phpQuizBtn = (Button) view.findViewById(R.id.phpQuizBtn);
        phpQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Php Quiz Selected", Toast.LENGTH_SHORT).show();
                Intent phpQuizBtn = new Intent(getActivity(),quiz_php.class);
                startActivity(phpQuizBtn);
            }
        });
        //Intent to Python Quiz
        Button pythonQuizBtn = (Button) view.findViewById(R.id.pythonQuizBtn);
        pythonQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Python Quiz Selected", Toast.LENGTH_SHORT).show();
                Intent pythonQuizBtn = new Intent(getActivity(),quiz_python.class);
                startActivity(pythonQuizBtn);
            }
        });

        return view;
    }
    public void onResume(){
        super.onResume();
        // Set title bar
        ((MainActivity) getActivity())
                .setActionBarTitle("Quiz");

    }

}