package com.example.android.apptitudetest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import static com.example.android.apptitudetest.R.id.question4_choice2;

public class sumUpData extends Activity {
    // radio button
    RadioButton Question1_choice3;
    // check box
    CheckBox question2_choice1;
    CheckBox question2_choice2;
    CheckBox question2_choice3;
    CheckBox question2_choice4;
    //edittext
    EditText question3_answer;
    //radio button

    RadioButton Question4_choice4;
    // radio button
    RadioButton Question5_choice2;
    // radio Button
    RadioButton Question6_choice4;

    // radio Button
    RadioButton Question7_choice3;

    // radio Button
    RadioButton Question8_choice3;
    //edit text
    EditText Question9_answer;
    //edit text

    EditText Question10_answer;




    CharSequence displayResult;
    int answer1_score;
    int answer2_score;
    int answer3_score;
    int answer4_score;
    int answer5_score;
    int answer6_score;
    int answer7_score;
    int answer8_score;
    int answer9_score;
    int answer10_score;
    int final_score;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        this.getWindow ().setSoftInputMode (WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView (R.layout.sumup);



    }

    public void submitAnswer(View view) {

        boolean answer1;
        Question1_choice3 = (RadioButton) findViewById (R.id.Question1_choice3);
        answer1 = Question1_choice3.isChecked ();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }
        boolean answerA_1;
        boolean answerA_2;
        boolean answerA_3;
        boolean answerA_4;
        question2_choice1 = (CheckBox) findViewById (R.id.question2_choice1);
        question2_choice2 = (CheckBox) findViewById (R.id.question2_choice2);
        question2_choice3 = (CheckBox) findViewById (R.id.question2_choice3);
        question2_choice4 = (CheckBox) findViewById (R.id.question2_choice4);
        answerA_1 = question2_choice1.isChecked ();
        answerA_2 = question2_choice2.isChecked ();
        answerA_3 = question2_choice3.isChecked ();
        answerA_4 = question2_choice4.isChecked ();
        if (answerA_1 && !answerA_2 && answerA_3 && !answerA_4) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }
        String question3;
        question3_answer = (EditText) findViewById (R.id.question3_answer);
        question3 = question3_answer.getText ().toString ().toLowerCase ();
        if (question3.equals ("sunlight")) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }

        boolean answer4;
        Question4_choice4 = (RadioButton) findViewById (R.id.question4_choice4);
        answer4 = Question4_choice4.isChecked ();
        if (answer4) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }
        boolean question_5;
        Question5_choice2 = (RadioButton) findViewById (R.id.question5_choice2);
        question_5 = Question5_choice2.isChecked ();
        if (question_5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }
        boolean answer6;
        Question6_choice4 = (RadioButton) findViewById (R.id.question6_choice4);
        answer6 = Question6_choice4.isChecked ();
        if (answer6) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }

        boolean answer7;
        Question7_choice3 = (RadioButton) findViewById (R.id.question7_choice3);
        answer7 = Question7_choice3.isChecked ();
        if (answer7) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }

        boolean answer8;
        Question8_choice3 = (RadioButton) findViewById (R.id.question8_choice3);
        answer8 = Question8_choice3.isChecked ();
        if (answer8) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }

        String answer9;
        Question9_answer = (EditText) findViewById (R.id.quetion9_answer);
        answer9 = Question9_answer.getText ().toString ().toLowerCase ();
        if (answer9.equals ("Dr Folorunsho")) {
            answer9_score = 1;
        } else {
            answer9_score = 0;
        }

        String answer10;
        Question10_answer = (EditText) findViewById (R.id.quetion10_answer);
        answer10 = Question10_answer.getText ().toString ().toLowerCase ();
        if (answer10.equals ("semi permeable")) {
            answer10_score = 1;
        } else {
            answer10_score = 0;
        }
        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score + answer6_score + answer7_score + answer8_score + answer9_score + answer10_score;
        if (final_score == 10) {

            AlertDialog.Builder dialog = new AlertDialog.Builder (this);
            String studentName = getIntent().getStringExtra("StudentName");
            String studentMatric= getIntent().getStringExtra("StudentMatric");
            dialog.setTitle ("Summary of Results");
            dialog.setMessage ("Name: "+studentName + "\n"+ "Matric Number: " + studentMatric +"\n"+
                   "Score: " +"you Score 10 out of 10" +"\n" + "Remarks: "+"congratulations, you did excellently awesome");
            dialog.show ();
        } else {
            String studentName = getIntent().getStringExtra("StudentName");
            String studentMatric= getIntent().getStringExtra("StudentMatric");
            AlertDialog.Builder dialog = new AlertDialog.Builder (this);
            dialog.setTitle ("Summary of Results");
            dialog.setMessage ("Name: "+studentName + "\n"+ "Matric Number: " + studentMatric +"\n"+
                    "Score: " +final_score +" out of 10" +"\n" + "Remarks: "+"Try again for better performance");
            dialog.show ();

        }


    }

}

