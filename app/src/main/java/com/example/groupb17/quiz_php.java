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

public class quiz_php extends AppCompatActivity {
    //initiate private TextView, Button, Array List and Random
    private TextView questionTxt, questionAttemptedNum;
    private Button optionBtn1, optionBtn2, optionBtn3, optionBtn4;
    private ArrayList<QuizStructure> phpArrayList;
    Random random;
    // Create integer for score, question attempted and variable to store Random
    int currentScore = 0, questionAttempted= 1, currentQuest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_php);
        //initialise variables
        questionTxt = findViewById(R.id.questionTxt);
        questionAttemptedNum = findViewById(R.id.questionAttemptedNum);
        optionBtn1 = findViewById(R.id.optBtn1Php);
        optionBtn2 = findViewById(R.id.optBtn2Php);
        optionBtn3 = findViewById(R.id.optBtn3Php);
        optionBtn4 = findViewById(R.id.optBtn4Php);
        //initialise arraylist and Random
        phpArrayList = new ArrayList<>();
        random = new Random();
        //initialise a new method to get the questions
        getQuizQuestion(phpArrayList);
        //initialise current position with Random and size of array list
        currentQuest = random.nextInt(phpArrayList.size());
        //initialise a new method to set data into viewable
        setDataToViews(currentQuest);
        // perform a click event on option button 1
        optionBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If statement to check if option 1 has the right answer
                if(phpArrayList.get(currentQuest).getAnswer().trim().equals(optionBtn1.getText().toString().trim().toLowerCase())){
                    //increment Score Value by 1 if the answer is option 1
                    currentScore++;
                }else{
                    //Alert Dialog when the answer selected is wrong
                    AlertDialog alertDialog1 = new AlertDialog.Builder(quiz_php.this).create();
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
                currentQuest = random.nextInt(phpArrayList.size());
                setDataToViews(currentQuest);
            }
        });
        // perform a click event on option button 2
        optionBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If statement to check if option 2 has the right answer
                if(phpArrayList.get(currentQuest).getAnswer().trim().equals(optionBtn2.getText().toString().trim().toLowerCase())){
                    //increment Score Value by 1 if the answer is option 2
                    currentScore++;
                }else{
                    //Alert Dialog when the answer selected is wrong
                    AlertDialog alertDialog2 = new AlertDialog.Builder(quiz_php.this).create();
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
                currentQuest = random.nextInt(phpArrayList.size());
                setDataToViews(currentQuest);
            }
        });
        // perform a click event on option button 3
        optionBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If statement to check if option 3 has the right answer
                if(phpArrayList.get(currentQuest).getAnswer().trim().equals(optionBtn3.getText().toString().trim().toLowerCase())){
                    //increment Score Value by 1 if the answer is option 3
                    currentScore++;
                }else{
                    //Alert Dialog when the answer selected is wrong
                    AlertDialog alertDialog3 = new AlertDialog.Builder(quiz_php.this).create();
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
                currentQuest = random.nextInt(phpArrayList.size());
                setDataToViews(currentQuest);
            }
        });
        // perform a click event on option button 4
        optionBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If statement to check if option 4 has the right answer
                if(phpArrayList.get(currentQuest).getAnswer().trim().equals(optionBtn4.getText().toString().trim().toLowerCase())){
                    //increment Score Value by 1 if the answer is option 4
                    currentScore++;
                }else{
                    //Alert Dialog when the answer selected is wrong
                    AlertDialog alertDialog4 = new AlertDialog.Builder(quiz_php.this).create();
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
                currentQuest = random.nextInt(phpArrayList.size());
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
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(quiz_php.this);
        View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.score_bottom_sheet,(LinearLayout)findViewById(R.id.idLLScore));
        //Create variables as TextView to show score and Buttons to restart and exit quiz
        TextView scorePhP = bottomSheetView.findViewById(R.id.scoreTxt);
        Button restartQuizBtn = bottomSheetView.findViewById(R.id.restartQuizBtn);
        Button exitQuizBtn = bottomSheetView.findViewById(R.id.exitQuizBtn);
        //Set Score to display current score
        scorePhP.setText("Your score is \n" +currentScore + "/10");
        // perform a click event on restartQuizBtn
        restartQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Randomise the question from array
                currentQuest = random.nextInt(phpArrayList.size());
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
                Intent exitCppQuiz = new Intent(quiz_php.this,MainActivity.class);
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
            questionTxt.setText(phpArrayList.get(currentQuest).getQuestion());
            optionBtn1.setText(phpArrayList.get(currentQuest).getOption1());
            optionBtn2.setText(phpArrayList.get(currentQuest).getOption2());
            optionBtn3.setText(phpArrayList.get(currentQuest).getOption3());
            optionBtn4.setText(phpArrayList.get(currentQuest).getOption4());
        }
    }
    //Create the initialised method as private void to get the questions
    private void getQuizQuestion(ArrayList<QuizStructure> quizStructureArrayList) {
        //add data to arrayList with questions, options and answers
        quizStructureArrayList.add(new QuizStructure("PHP stands for ",
                "a.\thypertext preprocessor","b.\tPretext Hypertext Preprocessor", "c.\tPersonal Home Processor","d.\tNone of the above",
                "a.\thypertext preprocessor"));

        quizStructureArrayList.add(new QuizStructure("Variable name in PHP starts with -",
                "a.\t! (Exclamation)","b.\t$ (dollar)", "c.\t& (Ampersand)","d.\t# (Hash)",
                "b.\t$ (dollar)"));

        quizStructureArrayList.add(new QuizStructure("Which of the following is the default file extension of PHPNext",
                "a.\t.php","b.\t.hphp", "c.\t.xml","d.\t.html",
                "a.\t.php"));

        quizStructureArrayList.add(new QuizStructure("Which of the following is not a variable scope in PHP?",
                "a.\textern","b.\tlocal", "c.\tstatic","d.\tglobal",
                "a.\textern"));

        quizStructureArrayList.add(new QuizStructure("Which of the following is correct to add a comment in php?",
                "a.\t& …… &","b.\t// ……", "c.\t/* …… */","d.\tboth (b) and (c)",
                "d.\tboth (b) and (c)"));

        quizStructureArrayList.add(new QuizStructure("Which of the following is used to display the output in PHP?",
                "a.\techo","b.\twrite", "c.\tprint","d.\tboth (a) and (c)",
                "d.\tboth (a) and (c)"));

        quizStructureArrayList.add(new QuizStructure("Which of the following is the use of strlen() function in PHP?",
                "a.\tThe strlen() function returns the type of string","b.\tthe strlen() function returns the length of string", "c.\tThe strlen() function returns the value of string/","d.\tThe strlen() function returns both value and type of string",
                "b.\tthe strlen() function returns the length of string"));

        quizStructureArrayList.add(new QuizStructure("Which of the following is used for concatenation in PHP?",
                "a.\t+ (plus)","b.\t* (Asterisk)", "c.\t. (dot)","d.\tappend()",
                "c.\t. (dot)"));

        quizStructureArrayList.add(new QuizStructure("Which of the following starts with __ (double underscore) in PHP?",
                "a.\tInbuilt constants","b.\tUser-defined constants", "c.\tmagic constants","d.\tDefault constants",
                "c.\tMagic constants"));

        quizStructureArrayList.add(new QuizStructure("Which of the following is the correct way to create a function in PHP?",
                "a.\tCreate myFunction()","b.\tNew_function myFunction()", "c.\tfunction myfunction()","d.\tNone of the above",
                "c.\tfunction myfunction()"));
    }

}