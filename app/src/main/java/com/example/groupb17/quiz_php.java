package com.example.groupb17;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Random;

public class quiz_php extends AppCompatActivity {
    private TextView questionTxt, questionAttemptedNum;
    private Button optionBtn1, optionBtn2, optionBtn3, optionBtn4;
    private ArrayList<QuizModal> quizModalArrayList;
    Random random;
    int currentScore = 0, questionAttempted= 1, currentPos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_php);
        questionTxt = findViewById(R.id.questionTxt);
        questionAttemptedNum = findViewById(R.id.questionAttemptedNum);
        optionBtn1 = findViewById(R.id.optBtn1Php);
        optionBtn2 = findViewById(R.id.optBtn2Php);
        optionBtn3 = findViewById(R.id.optBtn3Php);
        optionBtn4 = findViewById(R.id.optBtn4Php);
        quizModalArrayList = new ArrayList<>();
        random = new Random();
        getQuizQuestion(quizModalArrayList);
        currentPos = random.nextInt(quizModalArrayList.size());
        setDataToViews(currentPos);

        optionBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().equals(optionBtn1.getText().toString().trim().toLowerCase())){
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);
            }
        });

        optionBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().equals(optionBtn2.getText().toString().trim().toLowerCase())){
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);
            }
        });

        optionBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().equals(optionBtn3.getText().toString().trim().toLowerCase())){
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);
            }
        });

        optionBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().equals(optionBtn4.getText().toString().trim().toLowerCase())){
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);
            }
        });
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    private void showBottomSheet(){

        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(quiz_php.this);
        View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.score_bottom_sheet,(LinearLayout)findViewById(R.id.idLLScore));
        TextView scoreTV = bottomSheetView.findViewById(R.id.idTVscore);
        Button restartQuizBtn = bottomSheetView.findViewById(R.id.idBtnRestart);
        scoreTV.setText("Your score is \n" +currentScore + "/10");
        restartQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);
                questionAttempted = 1;
                currentScore = 0;
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setCancelable(false);
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        Button exitQuizBtn = bottomSheetView.findViewById(R.id.idBtnExit);
        exitQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                questionAttempted = 1;
                currentScore = 0;
                bottomSheetDialog.dismiss();
                Intent exitPhPQuiz = new Intent(quiz_php.this,MainActivity.class);
                startActivity(exitPhPQuiz);
                finish();
            }
        });
    }

    private void setDataToViews(int currentPos){
        questionAttemptedNum.setText("Questions Attempted : " +questionAttempted + "/10");
        if(questionAttempted == 10){
            showBottomSheet();
        }else{
            questionTxt.setText(quizModalArrayList.get(currentPos).getQuestion());
            optionBtn1.setText(quizModalArrayList.get(currentPos).getOption1());
            optionBtn2.setText(quizModalArrayList.get(currentPos).getOption2());
            optionBtn3.setText(quizModalArrayList.get(currentPos).getOption3());
            optionBtn4.setText(quizModalArrayList.get(currentPos).getOption4());
        }
    }

    private void getQuizQuestion(ArrayList<QuizModal> quizModalArrayList) {
        quizModalArrayList.add(new QuizModal("1Php",
                "//comment","\\comment", "==comment","<!-- comment",
                "//comment"));

        quizModalArrayList.add(new QuizModal("2php",
                "Program Container","Main Method", "Statement Block","Sentence",
                "Main Method"));

        quizModalArrayList.add(new QuizModal("3php",
                "full stop (.)","comma (,)", "semi colon (;)","exclamation mark (1)",
                "semi colon (;)"));

        quizModalArrayList.add(new QuizModal("4php",
                "0","2", "4","6",
                "0"));

        quizModalArrayList.add(new QuizModal("5php",
                "byte","boolean", "character","integer",
                "boolean"));

        quizModalArrayList.add(new QuizModal("6php",
                "int","byte", "short","double",
                "double"));

        quizModalArrayList.add(new QuizModal("7php",
                "/","//", "/*......*/","*/....*/",
                "\"/*......*/"));

        quizModalArrayList.add(new QuizModal("8php",
                "if","then", "goto","while",
                "goto"));

        quizModalArrayList.add(new QuizModal("9php",
                "1 and 2","2 and 3", "3 and 4","1 and 4",
                "3 and 4"));

        quizModalArrayList.add(new QuizModal("10php",
                "It must be marked final.","It can be marked abstract.", "It can be marked public.","It can be marked static",
                "It can be marked abstract."));
    }

}