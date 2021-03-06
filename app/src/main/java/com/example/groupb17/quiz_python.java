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

public class quiz_python extends AppCompatActivity {
    //initiate private TextView, Button, Array List and Random
    private TextView questionTxt, questionAttemptedNum;
    private Button optionBtn1, optionBtn2, optionBtn3, optionBtn4;
    private ArrayList<QuizStructure> pythonArrayList;
    Random random;
    // Create integer for score, question attempted and variable to store Random
    int currentScore = 0, questionAttempted= 1, currentQuest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_python);
        //initialise variables
        questionTxt = findViewById(R.id.questionTxt);
        questionAttemptedNum = findViewById(R.id.questionAttemptedNum);
        optionBtn1 = findViewById(R.id.optBtn1Phy);
        optionBtn2 = findViewById(R.id.optBtn2Phy);
        optionBtn3 = findViewById(R.id.optBtn3Phy);
        optionBtn4 = findViewById(R.id.optBtn4Phy);
        //initialise arraylist and Random
        pythonArrayList = new ArrayList<>();
        random = new Random();
        //initialise a new method to get the questions
        getQuizQuestion(pythonArrayList);
        //initialise current position with Random and size of array list
        currentQuest = random.nextInt(pythonArrayList.size());
        //initialise a new method to set data into viewable
        setDataToViews(currentQuest);
        // perform a click event on option button 1
        optionBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If statement to check if option 1 has the right answer
                if(pythonArrayList.get(currentQuest).getAnswer().trim().equals(optionBtn1.getText().toString().trim().toLowerCase())){
                    //increment Score Value by 1 if the answer is option 1
                    currentScore++;
                }else{
                    //Alert Dialog when the answer selected is wrong
                    AlertDialog alertDialog1 = new AlertDialog.Builder(quiz_python.this).create();
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
                currentQuest = random.nextInt(pythonArrayList.size());
                setDataToViews(currentQuest);
            }
        });
        // perform a click event on option button 2
        optionBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If statement to check if option 2 has the right answer
                if(pythonArrayList.get(currentQuest).getAnswer().trim().equals(optionBtn2.getText().toString().trim().toLowerCase())){
                    //increment Score Value by 1 if the answer is option 2
                    currentScore++;
                }else{
                    //Alert Dialog when the answer selected is wrong
                    AlertDialog alertDialog2 = new AlertDialog.Builder(quiz_python.this).create();
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
                currentQuest = random.nextInt(pythonArrayList.size());
                setDataToViews(currentQuest);
            }
        });
        // perform a click event on option button 3
        optionBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If statement to check if option 3 has the right answer
                if(pythonArrayList.get(currentQuest).getAnswer().trim().equals(optionBtn3.getText().toString().trim().toLowerCase())){
                    //increment Score Value by 1 if the answer is option 3
                    currentScore++;
                }else{
                    //Alert Dialog when the answer selected is wrong
                    AlertDialog alertDialog3 = new AlertDialog.Builder(quiz_python.this).create();
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
                currentQuest = random.nextInt(pythonArrayList.size());
                setDataToViews(currentQuest);
            }
        });
        // perform a click event on option button 4
        optionBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If statement to check if option 4 has the right answer
                if(pythonArrayList.get(currentQuest).getAnswer().trim().equals(optionBtn4.getText().toString().trim().toLowerCase())){
                    //increment Score Value by 1 if the answer is option 4
                    currentScore++;
                }else{
                    //Alert Dialog when the answer selected is wrong
                    AlertDialog alertDialog4 = new AlertDialog.Builder(quiz_python.this).create();
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
                currentQuest = random.nextInt(pythonArrayList.size());
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
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(quiz_python.this);
        View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.score_bottom_sheet,(LinearLayout)findViewById(R.id.idLLScore));
        //Create variables as TextView to show score and Buttons to restart and exit quiz
        TextView scorePhy = bottomSheetView.findViewById(R.id.scoreTxt);
        Button restartQuizBtn = bottomSheetView.findViewById(R.id.restartQuizBtn);
        Button exitQuizBtn = bottomSheetView.findViewById(R.id.exitQuizBtn);
        //Set Score to display current score
        scorePhy.setText("Your score is \n" +currentScore + "/10");
        // perform a click event on restartQuizBtn
        restartQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Randomise the question from array
                currentQuest = random.nextInt(pythonArrayList.size());
                //Reset all integers to default value
                setDataToViews(currentQuest);
                questionAttempted = 1;
                currentScore = 0;
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
                currentScore = 0;
                // Intent to Main Activity
                Intent exitCppQuiz = new Intent(quiz_python.this,MainActivity.class);
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

    private void setDataToViews(int currentPos){
        questionAttemptedNum.setText("Questions Attempted : " +questionAttempted + "/10");
        if(questionAttempted == 10){
            showBottomSheet();
        }else{
            questionTxt.setText(pythonArrayList.get(currentPos).getQuestion());
            optionBtn1.setText(pythonArrayList.get(currentPos).getOption1());
            optionBtn2.setText(pythonArrayList.get(currentPos).getOption2());
            optionBtn3.setText(pythonArrayList.get(currentPos).getOption3());
            optionBtn4.setText(pythonArrayList.get(currentPos).getOption4());
        }
    }
    //Create the initialised method as private void to get the questions
    private void getQuizQuestion(ArrayList<QuizStructure> quizStructureArrayList) {
        //add data to arrayList with questions, options and answers
        quizStructureArrayList.add(new QuizStructure("Which one of the following is the correct extension of the Python file?",
                "a.\t.py","b.\t.python", "c.\t.p","d.\tNone of these",
                "a.\t.py"));

        quizStructureArrayList.add(new QuizStructure("Which character is used in Python to make a single line comment?",
                "a.\t/","b.\t//", "c.\t#","d.\t!",
                "c.\t#"));

        quizStructureArrayList.add(new QuizStructure("Which of the following is not a keyword in Python language?",
                "a.\tval","b.\traise", "c.\ttry","d.\twith",
                "a.\tval"));

        quizStructureArrayList.add(new QuizStructure(" Which of the following functions is a built-in function in python language?",
                "a.\tval()","b.\tprint()", "c.\tfactorial()","d.\tNone of these",
                "b.\tprint()"));

        quizStructureArrayList.add(new QuizStructure("The output to execute string.ascii_letters can also be obtained from:?",
                "a.\tcharacter","b.\tascii_lowercase_string.digits", "c.\tlowercase_string.upercase","d.\tascii_lowercase+string.ascii_upercase",
                "d.\tascii_lowercase+string.ascii_upercase"));

        quizStructureArrayList.add(new QuizStructure("What happens when '2' == 2 is executed?",
                "a.\tfalse","b.\tture", "c.\tValueError occurs","d.\tTypeError occurs",
                "a.\tfalse"));

        quizStructureArrayList.add(new QuizStructure("How many control statements python supports?",
                "a.\tfour","b.\tfive", "c.\tthree","d.\tNone of the these",
                "c.\tthree"));

        quizStructureArrayList.add(new QuizStructure("How many keywords present in the python programming language?",
                "32","61", "33","27",
                "33"));

        quizStructureArrayList.add(new QuizStructure("Which of the following arithmetic operators cannot be used with strings in python?",
                "a.\t+","b.\t*", "c.\t-","d.\tAll of the mentioned",
                "c.\t-"));

        quizStructureArrayList.add(new QuizStructure("Which of the following keywords is not reversed keyword in python?",
                "a.\tNone","b.\tclass", "c.\tgoto","d.\tand",
                "c.\tgoto"));
    }

}