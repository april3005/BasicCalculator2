package com.example.basiccalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*Button zero, one, two, three, four, five, six, seven, eight, nine, plus, minus, multiplication, division, equals, clear, dot , oper;
    TextView resultTV;
    String rawOperand = "";
    Double firstOperand;
    Double secondOperand;
    String operation;
    Double result;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* resultTV = findViewById(R.id.btn_result);
        zero = findViewById(R.id.btn_zero);
        one = findViewById(R.id.btn_one);
        two = findViewById(R.id.btn_two);
        three = findViewById(R.id.btn_three);
        four = findViewById(R.id.btn_four);
        five = findViewById(R.id.btn_five);
        six = findViewById(R.id.btn_six);
        seven = findViewById(R.id.btn_seven);
        eight = findViewById(R.id.btn_eight);
        nine = findViewById(R.id.btn_nine);
        plus = findViewById(R.id.btn_plus);
        minus = findViewById(R.id.btn_minus);
        multiplication = findViewById(R.id.btn_multiplication);
        division = findViewById(R.id.btn_division);
        equals = findViewById(R.id.btn_equals);
        clear = findViewById(R.id.btn_clear);
        dot = findViewById(R.id.btn_dot);

        next = findViewById(R.id.btn_next);
    }


    public void onNumberClick(View v){
        switch (v.getId()){
            case R.id.btn_one:
            enterNumber("1");
            break;

            case R.id.btn_two:
                enterNumber("2");
                break;

            case R.id.btn_three:
                enterNumber("3");
                break;

            case R.id.btn_four:
                enterNumber("4");
                break;

            case R.id.btn_five:
                enterNumber("5");
                break;

            case R.id.btn_six:
                enterNumber("6");
                break;

            case R.id.btn_seven:
                enterNumber("7");
                break;

            case R.id.btn_eight:
                enterNumber("8");
                break;

            case R.id.btn_nine:
                enterNumber("9");
                break;

            case R.id.btn_dot:
                enterNumber(".");
                break;

            case R.id.btn_zero:
                enterNumber("0");
                break;
            default:
                break;

            case R.id.btn_clear:
                resultTV.setText(" ");
                break;

        }
    }

    public void enterNumber(String number){
        resultTV.append(number);
        rawOperand += number;
    }

    public void onOperationClick(View v) {
        try {if (firstOperand == null) {
            firstOperand = Double.parseDouble(rawOperand);

        } else {
            secondOperand = Double.parseDouble(rawOperand);
        }
            rawOperand = "";

        } catch(Exception error){
            error.printStackTrace();
        }

        switch (v.getId()) {
            case R.id.btn_equals:
                if (operation != null) {
                    switch (operation) {
                        case "+":
                            result = firstOperand + secondOperand;
                            resultTV.append("=" + result);
                            break;

                        case "*":
                            result = firstOperand * secondOperand;
                            resultTV.append("=" + result);
                            break;

                        case "-":
                            result = firstOperand - secondOperand;
                            resultTV.append("=" + result);
                            break;

                        case "/":
                            result = firstOperand / secondOperand;
                            resultTV.append("=" + result);
                            break;
                    }
                }
            default:
                break;
        }


    }

    public void saveOperation (){
        Intent intent = getIntent();
        String s = intent.getStringExtra("key");
        enterOperation(s);
    }
    public void enterOperation(String operation){
        resultTV.append(operation);
        this.operation = operation;

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putDouble("key", firstOperand);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState!= null) {
            firstOperand = savedInstanceState.getDouble("key");
            Log.d("TAG", "onCreate: " + firstOperand);
            resultTV.append(firstOperand.toString());
        }
    }*/
    }
}