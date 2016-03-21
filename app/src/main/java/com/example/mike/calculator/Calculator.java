package com.example.mike.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    public void MyPlus(View v) {

        EditText Feld1 = (EditText) findViewById(R.id.z1);
        EditText Feld2 = (EditText) findViewById(R.id.z2);
        EditText Feld3 = (EditText) findViewById(R.id.z3);

        double zahl1 = Double.parseDouble(Feld1.getText().toString());
        double zahl2 = Double.parseDouble(Feld2.getText().toString());

        Feld3.setText(String.valueOf(zahl1 + zahl2));

    }
    public void MyMinus(View v) {

        EditText Feld1 = (EditText) findViewById(R.id.z1);
        EditText Feld2 = (EditText) findViewById(R.id.z2);
        EditText Feld3 = (EditText) findViewById(R.id.z3);

        double zahl1 = Double.parseDouble(Feld1.getText().toString());
        double zahl2 = Double.parseDouble(Feld2.getText().toString());

        Feld3.setText(String.valueOf(zahl1 - zahl2));

    }
    public void MyDivide(View v) {

        EditText Feld1 = (EditText) findViewById(R.id.z1);
        EditText Feld2 = (EditText) findViewById(R.id.z2);
        EditText Feld3 = (EditText) findViewById(R.id.z3);

        double zahl1 = Double.parseDouble(Feld1.getText().toString());
        double zahl2 = Double.parseDouble(Feld2.getText().toString());

        Feld3.setText(String.valueOf(zahl1 / zahl2));

    }
    public void MyMultiply(View v) {

        EditText Feld1 = (EditText) findViewById(R.id.z1);
        EditText Feld2 = (EditText) findViewById(R.id.z2);
        EditText Feld3 = (EditText) findViewById(R.id.z3);

        double zahl1 = Double.parseDouble(Feld1.getText().toString());
        double zahl2 = Double.parseDouble(Feld2.getText().toString());

        Feld3.setText(String.valueOf(zahl1 / zahl2));

    }
}