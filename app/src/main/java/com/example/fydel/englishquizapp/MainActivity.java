package com.example.fydel.englishquizapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.Button;


import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    int score = 0;
    int lenght = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submitScore(View view) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        RadioButton ab = (RadioButton) findViewById(R.id.Ab);
        boolean correctA = ab.isChecked();

        RadioButton ba = (RadioButton) findViewById(R.id.Ba);
        boolean correctB = ba.isChecked();

        RadioButton cd = (RadioButton) findViewById(R.id.Cd);
        boolean correctC = cd.isChecked();

        RadioButton da = (RadioButton) findViewById(R.id.Da);
        boolean correctD = da.isChecked();


        RadioButton ea = (RadioButton) findViewById(R.id.Ea);
        boolean correctE = ea.isChecked();

        RadioButton fa = (RadioButton) findViewById(R.id.Fa);
        boolean correctF = fa.isChecked();

        RadioButton ga = (RadioButton) findViewById(R.id.Ga);
        boolean correctG = ga.isChecked();

        RadioButton hd = (RadioButton) findViewById(R.id.Hd);
        boolean correctH = hd.isChecked();

        RadioButton ic = (RadioButton) findViewById(R.id.Ic);
        boolean correctI = ic.isChecked();

        CheckBox ja = (CheckBox) findViewById(R.id.Ja);
        boolean correctJ = ja.isChecked();

        CheckBox jd = (CheckBox) findViewById(R.id.Jd);
        boolean correctK = jd.isChecked();

        int mainScore = calculateScore(correctA, correctB, correctC, correctD, correctE, correctF, correctG, correctH, correctI, correctJ, correctK);


        String totalScore = Integer.toString(mainScore);

        Toast.makeText(getApplicationContext(), "Thank you for taking this quiz " + name + "! You got " + mainScore + " of 11 questions right.", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "Thank you for taking this quiz " + name + "! You got " + mainScore + " of 11 questions right.", Toast.LENGTH_LONG).show();
    }

    private int calculateScore(boolean ACorrect, boolean BCorrect, boolean CCorrect, boolean DCorrect, boolean ECorrect, boolean FCorrect, boolean GCorrect, boolean HCorrect, boolean ICorrect, boolean JCorrect, boolean KCorrect) {
        int quizScore = 0;

        if (ACorrect) {
            quizScore = quizScore + 1;
        }
        if (BCorrect) {
            quizScore = quizScore + 1;
        }
        if (CCorrect) {
            quizScore = quizScore + 1;
        }
        if (DCorrect) {
            quizScore = quizScore + 1;
        }
        if (ECorrect) {
            quizScore = quizScore + 1;
        }
        if (FCorrect) {
            quizScore = quizScore + 1;
        }
        if (GCorrect) {
            quizScore = quizScore + 1;
        }
        if (HCorrect) {
            quizScore = quizScore + 1;
        }
        if (ICorrect) {
            quizScore = quizScore + 1;
        }
        if (JCorrect) {
            quizScore = quizScore + 1;
        }
        if (KCorrect) {
            quizScore = quizScore + 1;
        }
        return score + quizScore;
    }


}
