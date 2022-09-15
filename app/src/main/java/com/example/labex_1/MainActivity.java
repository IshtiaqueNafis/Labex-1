package com.example.labex_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText input;
    private TextView result;
    private Button UpperCaseButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UpperCaseButton = findViewById(R.id.upperButtonCase);
        input = findViewById(R.id.textboxInput);
        result = findViewById(R.id.textView);

    }

    public void UppercaseLetter(View view) {

        try {
            Editable textFromInput = input.getText();
            result.setText(textFromInput.toString().toUpperCase());


        }catch (Exception e){

        }
    }
}