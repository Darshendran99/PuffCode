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


        return view;
    }
    public void onResume(){
        super.onResume();
        // Set title bar
        ((MainActivity) getActivity())
                .setActionBarTitle("Quiz");

    }

}