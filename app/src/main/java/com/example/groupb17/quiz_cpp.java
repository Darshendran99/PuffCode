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

public class quiz_cpp extends AppCompatActivity {
    //initiate private TextView, Button, Array List and Random
    private TextView questionTxt, questionAttemptedNum;
    private Button optionBtn1, optionBtn2, optionBtn3, optionBtn4;
    private ArrayList<QuizStructure> cppArrayList;
    Random random;
    // Create integer for score, question attempted and variable to store Random
    int currentScore = 1, questionAttempted= 1, currentQuest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_cpp);
        //initialise variables
        questionTxt = findViewById(R.id.questionTxt);
        questionAttemptedNum = findViewById(R.id.questionAttemptedNum);
        optionBtn1 = findViewById(R.id.optBtn1cpp);
        optionBtn2 = findViewById(R.id.optBtn2cpp);
        optionBtn3 = findViewById(R.id.optBtn3cpp);
        optionBtn4 = findViewById(R.id.optBtn4cpp);
        //initialise arraylist and Random
        cppArrayList = new ArrayList<>();
        random = new Random();
        //initialise a new method to get the questions
        getQuizQuestion(cppArrayList);
        //initialise current position with Random and size of array list
        currentQuest = random.nextInt(cppArrayList.size());
        //initialise a new method to set data into viewable
        setDataToViews(currentQuest);
        // perform a click event on option button 1
        optionBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If statement to check if option 1 has the right answer
                if(cppArrayList.get(currentQuest).getAnswer().trim().equals(optionBtn1.getText().toString().trim().toLowerCase())){
                    //increment Score Value by 1 if the answer is option 1
                    currentScore++;
                }
                //Else if option 1 is not the right answer increment question attempt by 1
                questionAttempted++;
                //Randomise the next question from array and call method to set data into viewable
                currentQuest = random.nextInt(cppArrayList.size());
                setDataToViews(currentQuest);
            }
        });
        // perform a click event on option button 2
        optionBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If statement to check if option 2 has the right answer
                if(cppArrayList.get(currentQuest).getAnswer().trim().equals(optionBtn2.getText().toString().trim().toLowerCase())){
                    //increment Score Value by 1 if the answer is option 2
                    currentScore++;
                }
                //Else if option 2 is not the right answer increment question attempt by 1
                questionAttempted++;
                //Randomise the next question from array and call method to set data into viewable
                currentQuest = random.nextInt(cppArrayList.size());
                setDataToViews(currentQuest);
            }
        });
        // perform a click event on option button 3
        optionBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If statement to check if option 3 has the right answer
                if(cppArrayList.get(currentQuest).getAnswer().trim().equals(optionBtn3.getText().toString().trim().toLowerCase())){
                    //increment Score Value by 1 if the answer is option 3
                    currentScore++;
                }
                //Else if option 3 is not the right answer increment question attempt by 1
                questionAttempted++;
                //Randomise the next question from array and call method to set data into viewable
                currentQuest = random.nextInt(cppArrayList.size());
                setDataToViews(currentQuest);
            }
        });
        // perform a click event on option button 4
        optionBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If statement to check if option 4 has the right answer
                if(cppArrayList.get(currentQuest).getAnswer().trim().equals(optionBtn4.getText().toString().trim().toLowerCase())){
                    //increment Score Value by 1 if the answer is option 4
                    currentScore++;
                }
                //Else if option 4 is not the right answer increment question attempt by 1
                questionAttempted++;
                //Randomise the next question from array and call method to set data into viewable
                currentQuest = random.nextInt(cppArrayList.size());
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
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(quiz_cpp.this);
        View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.score_bottom_sheet,(LinearLayout)findViewById(R.id.idLLScore));
        //Create variables as TextView to show score and Buttons to restart and exit quiz
        TextView scoreCpp = bottomSheetView.findViewById(R.id.scoreTxt);
        Button restartQuizBtn = bottomSheetView.findViewById(R.id.restartQuizBtn);
        Button exitQuizBtn = bottomSheetView.findViewById(R.id.exitQuizBtn);
        //Set Score to display current score
        scoreCpp.setText("Your score is \n" +currentScore + "/10");
        // perform a click event on restartQuizBtn
        restartQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Randomise the question from array
                currentQuest = random.nextInt(cppArrayList.size());
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
                Intent exitCppQuiz = new Intent(quiz_cpp.this,MainActivity.class);
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
            questionTxt.setText(cppArrayList.get(currentQuest).getQuestion());
            optionBtn1.setText(cppArrayList.get(currentQuest).getOption1());
            optionBtn2.setText(cppArrayList.get(currentQuest).getOption2());
            optionBtn3.setText(cppArrayList.get(currentQuest).getOption3());
            optionBtn4.setText(cppArrayList.get(currentQuest).getOption4());
        }
    }
    //Create the initialised method as private void to get the questions
    private void getQuizQuestion(ArrayList<QuizStructure> cppArrayList) {
        //add data to arrayList with questions, options and answers
        cppArrayList.add(new QuizStructure("#include<userdefined.h> \n Which of the following is the correct syntax to add the header file in the C++ program?",
                "a. \t #include<userdefined>","b. \t #include \"userdefined.h\"", "c. \t <include> \"userdefined.h\"","d. \t both (a) and (b)",
                "d. \t both (a) and (b)"));
        cppArrayList.add(new QuizStructure("Which of the following is the correct syntax to print the message in C++ language?",
                "a. cout <<\"hello world!\";","b. Cout << Hello world! ;", "c.\tOut <<\"Hello world!;","d.\tNone of the above",
                "a. cout <<\"hello world!\";"));
        cppArrayList.add(new QuizStructure("Which of the following is the correct identifier?",
                "a.\t$var_name","b.\tvar_123", "c.\tvarname@","d.\tNone of the above",
                "b.\tvar_123"));
        cppArrayList.add(new QuizStructure("Which of the following is the address operator?",
                "a.\t @","b.\t #", "c.\t &","d.\t %",
                "c.\t &"));
        cppArrayList.add(new QuizStructure("Which of the following is the correct syntax to read the single character to console in the C++ language?",
                "a.\tRead ch()","b.\tGetline vh()", "c.\tget(ch)","d.\tScanf(ch)",
                "c.\tget(ch)"));
        cppArrayList.add(new QuizStructure("Which of the following comment syntax is correct to create a single-line comment in the C++ program?",
                "a.\t//comment","b.\t/Comment/", "c.\tComment//","d.\tNone of the above",
                "a.\t//comment"));
        cppArrayList.add(new QuizStructure("For inserting a new line in C++ program, which one of the following statements can be used?",
                "a.\t\\n","b.\t\\r", "c.\t\\a","d.\tNone of the above",
                "a.\t\\n"));
        cppArrayList.add(new QuizStructure(" Which one of the following represents the tab?",
                "a.\t\\n","b.\t\\t", "c.\t\\r","d.\tNone of the above",
                "b.\t\\t"));
        cppArrayList.add(new QuizStructure("Which of the following is the correct syntax for declaring the array?",
                "a.\tinit array []","b.\tint array [5];", "c.\tArray[5];","d.\tNone of the above",
                "b.\tint array [5];"));
        cppArrayList.add(new QuizStructure("Which of the following can be considered as the object of an array?",
                "a.\tIndex of an array","b.\telements of the array", "c.\tFunctions of the Array","d.\tAll of the above",
                "b.\telements of the array"));


    }
}