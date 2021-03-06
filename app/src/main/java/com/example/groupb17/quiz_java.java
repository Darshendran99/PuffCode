package com.example.groupb17;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Random;

public class quiz_java extends AppCompatActivity {
    //initiate private TextView, Button, Array List and Random
    private TextView questionTxt, questionAttemptedNum;
    private Button optionBtn1, optionBtn2, optionBtn3, optionBtn4;
    private ArrayList<QuizStructure> javaArrayList;
    Random random;
    // Create integer for score, question attempted and variable to store Random
    int currentScore = 1, questionAttempted= 1, currentQuest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_java);
        //initialise variables
        questionTxt = findViewById(R.id.questionTxt);
        questionAttemptedNum = findViewById(R.id.questionAttemptedNum);
        optionBtn1 = findViewById(R.id.optBtn1Java);
        optionBtn2 = findViewById(R.id.optBtn2Java);
        optionBtn3 = findViewById(R.id.optBtn3Java);
        optionBtn4 = findViewById(R.id.optBtn4Java);
        //initialise arraylist and Random
        javaArrayList = new ArrayList<>();
        random = new Random();
        //initialise a new method to get the questions
        getQuizQuestion(javaArrayList);
        //initialise current position with Random and size of array list
        currentQuest = random.nextInt(javaArrayList.size());
        //initialise a new method to set data into viewable
        setDataToViews(currentQuest);
        // perform a click event on option button 1
        optionBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If statement to check if option 1 has the right answer
                if(javaArrayList.get(currentQuest).getAnswer().trim().equals(optionBtn1.getText().toString().trim().toLowerCase())){
                    //increment Score Value by 1 if the answer is option 1
                    currentScore++;


                }else{
                    //Alert Dialog when the answer selected is wrong
                    AlertDialog alertDialog1 = new AlertDialog.Builder(quiz_java.this).create();
                    alertDialog1.setMessage("Wrong Answer");
                    alertDialog1.setButton(AlertDialog.BUTTON_NEUTRAL, "Continue",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog1.show();
                }
                //Else if option 1 is not the right answer increment question attempt by 1
                questionAttempted++;
                //Randomise the next question from array and call method to set data into viewable
                currentQuest = random.nextInt(javaArrayList.size());
                setDataToViews(currentQuest);
            }
        });
        // perform a click event on option button 2
        optionBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If statement to check if option 2 has the right answer
                if(javaArrayList.get(currentQuest).getAnswer().trim().equals(optionBtn2.getText().toString().trim().toLowerCase())){
                    //increment Score Value by 1 if the answer is option 2
                    currentScore++;

                }else{
                    //Alert Dialog when the answer selected is wrong
                    AlertDialog alertDialog2 = new AlertDialog.Builder(quiz_java.this).create();
                    alertDialog2.setMessage("Wrong Aswer");
                    alertDialog2.setButton(AlertDialog.BUTTON_NEUTRAL, "Continue",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog2.show();
                }
                //Else if option 2 is not the right answer increment question attempt by 1
                questionAttempted++;
                //Randomise the next question from array and call method to set data into viewable
                currentQuest = random.nextInt(javaArrayList.size());
                setDataToViews(currentQuest);
            }
        });
        // perform a click event on option button 3
        optionBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If statement to check if option 3 has the right answer
                if(javaArrayList.get(currentQuest).getAnswer().trim().equals(optionBtn3.getText().toString().trim().toLowerCase())){
                    //increment Score Value by 1 if the answer is option 3
                    currentScore++;
                }else{
                    //Alert Dialog when the answer selected is wrong
                    AlertDialog alertDialog3 = new AlertDialog.Builder(quiz_java.this).create();
                    alertDialog3.setMessage("Wrong Answer");
                    alertDialog3.setButton(AlertDialog.BUTTON_NEUTRAL, "Continue",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog3.show();
                }
                //Else if option 3 is not the right answer increment question attempt by 1
                questionAttempted++;
                //Randomise the next question from array and call method to set data into viewable
                currentQuest = random.nextInt(javaArrayList.size());
                setDataToViews(currentQuest);
            }
        });
        // perform a click event on option button 4
        optionBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If statement to check if option 4 has the right answer
                if(javaArrayList.get(currentQuest).getAnswer().trim().equals(optionBtn4.getText().toString().trim().toLowerCase())){
                    //increment Score Value by 1 if the answer is option 4
                    currentScore++;
                }else{
                    //Alert Dialog when the answer selected is wrong
                    AlertDialog alertDialog4 = new AlertDialog.Builder(quiz_java.this).create();
                    alertDialog4.setMessage("WrongAnswer");
                    alertDialog4.setButton(AlertDialog.BUTTON_NEUTRAL, "Continue",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog4.show();
                }
                //Else if option 4 is not the right answer increment question attempt by 1
                questionAttempted++;
                //Randomise the next question from array and call method to set data into viewable
                currentQuest = random.nextInt(javaArrayList.size());
                setDataToViews(currentQuest);
            }
        });
        //Hides the Action Bar for more screen space
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
    // Create a private void method to display bottom sheet xml
    private void showBottomSheet(){
        // Create a BottomSheetDialog and Inflate layout
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(quiz_java.this);
        View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.score_bottom_sheet,(LinearLayout)findViewById(R.id.idLLScore));
        //Create variables as TextView to show score and Buttons to restart and exit quiz
        TextView scoreJava = bottomSheetView.findViewById(R.id.scoreTxt);
        Button restartQuizBtn = bottomSheetView.findViewById(R.id.restartQuizBtn);
        Button exitQuizBtn = bottomSheetView.findViewById(R.id.exitQuizBtn);
        //Set Score to display current score
        scoreJava.setText("Your score is \n" +currentScore + "/10");
        // perform a click event on restartQuizBtn
        restartQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Randomise the question from array
                currentQuest = random.nextInt(javaArrayList.size());
                //Reset all integers to default value
                setDataToViews(currentQuest);
                questionAttempted = 1;
                currentScore = 1;
                //Dismiss bottomSheetDialog
                bottomSheetDialog.dismiss();
            }
        });
        // perform a click event on exitQuizBtn
        exitQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Reset all integers to default value
                setDataToViews(currentQuest);
                questionAttempted = 1;
                currentScore = 1;
                // Intent to Main Activity
                Intent exitCppQuiz = new Intent(quiz_java.this,MainActivity.class);
                startActivity(exitCppQuiz);
                finish();
            }
        });

        //Display bottomSheetDialog
        bottomSheetDialog.setCancelable(false);
        // set bottomSheetDialog to show layout from bottomSheetView.xml
        bottomSheetDialog.setContentView(bottomSheetView);
        //Display bottomSheetView.xml
        bottomSheetDialog.show();

    }
    //Create a private void method to set data into viewable
    private void setDataToViews(int currentQuest){
        //set data to textview and button
        questionAttemptedNum.setText("Questions Attempted : " +questionAttempted + "/10");
        if(questionAttempted == 10){
            //display bottom sheet function
            showBottomSheet();
        }else{
            //Specify data to all TextView questions and Button options
            questionTxt.setText(javaArrayList.get(currentQuest).getQuestion());
            optionBtn1.setText(javaArrayList.get(currentQuest).getOption1());
            optionBtn2.setText(javaArrayList.get(currentQuest).getOption2());
            optionBtn3.setText(javaArrayList.get(currentQuest).getOption3());
            optionBtn4.setText(javaArrayList.get(currentQuest).getOption4());
        }
    }
    //Create the initialised method as private void to get the questions
    private void getQuizQuestion(ArrayList<QuizStructure> quizStructureArrayList) {
        //add data to arrayList with questions, options and answers
        quizStructureArrayList.add(new QuizStructure("What does a comment look like in Java?",
                "//comment","\\comment", "==comment","<!-- comment",
                "//comment"));

        quizStructureArrayList.add(new QuizStructure("public static void main (String [] args) is a:",
                "Program Container","main method", "Statement Block","Sentence",
                "main method"));

        quizStructureArrayList.add(new QuizStructure("All statements must end with:",
                "full stop (.)","comma (,)", "semi colon (;)","exclamation mark (1)",
                "semi colon (;)"));

        quizStructureArrayList.add(new QuizStructure("How many times will this loop run?\n int x = 4;\nwhile(x < 4) {\nx = x + 1;\n}",
                "0","2", "4","6",
                "0"));

        quizStructureArrayList.add(new QuizStructure("Which of the following data types that has only two possible option",
                "byte","boolean", "character","integer",
                "boolean"));

        quizStructureArrayList.add(new QuizStructure("Which of the following is a data type that can store number with decimal point?",
                "int","byte", "short","double",
                "double"));

        quizStructureArrayList.add(new QuizStructure("For paragraph comment, you should use:",
                "/","//", "/*......*/","*/....*/",
                "\"/*......*/"));

        quizStructureArrayList.add(new QuizStructure("Which of the following is NOT a keywords or reserved words in Java?",
                "if","then", "goto","while",
                "goto"));

        quizStructureArrayList.add(new QuizStructure("Which two statements are equivalent?\n" +
                "3/2\n" +
                "3<2\n" +
                "3*4\n" +
                "3<<2",
                "1 and 2","2 and 3", "3 and 4","1 and 4",
                "3 and 4"));

        quizStructureArrayList.add(new QuizStructure("Which is true about a method-local inner class?",
                "it must be marked final.","it can be marked abstract.", "it can be marked public.","it can be marked static",
                "it can be marked abstract."));
    }

}