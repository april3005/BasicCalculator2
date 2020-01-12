package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class OperationActivity extends AppCompatActivity {
    /*Button plus, minus, multiplication, divide;
    String operation;*/

    TextView tv_operations;
    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<String> operations = new ArrayList<>();

    String operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation);
        initviews();
        numbers = new ArrayList<>();
        operations = new ArrayList<>();

        Intent intent = getIntent();
            ArrayList<Integer> numbers2 = intent.getIntegerArrayListExtra("numbers");
            ArrayList<String> operations2 = intent.getStringArrayListExtra("operations");

            if (numbers2 != null){
                numbers = numbers2;
            }

            if (operations2 != null){
                operations = operations2;
            }


        Log.d("ololo", numbers.toString());
        Log.d("ololo", operations.toString());
        Log.d("ololo", PrettyResult.convert(numbers, operations));
        }

    private void initviews() {
        tv_operations = findViewById(R.id.tv_operations);
    }









        /*plus = findViewById(R.id.btn_addition);
        minus = findViewById(R.id.btn_subtraction);
        divide = findViewById(R.id.btn_division);
        multiplication = findViewById(R.id.btn_multiplication);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_subtraction:
                        operation = minus.getText().toString();
                        intent.putExtra("key", operation);
                        finish();
                        break;
                    case R.id.btn_addition:
                        operation = plus.getText().toString();
                        finish();
                        break;
                    case R.id.btn_multiplication:
                        operation = multiplication.getText().toString();
                        intent.putExtra("key", operation);
                        finish();
                        break;
                    case R.id.btn_division:
                        operation = divide.getText().toString();
                        intent.putExtra("key", operation);
                        finish();
                        break;
                }
            }
        };
        plus.setOnClickListener(listener);
        minus.setOnClickListener(listener);
        multiplication.setOnClickListener(listener);
        divide.setOnClickListener(listener);*/



    public void onOperationClick(View v){
        switch (v.getId()){
            case R.id.btn_addition:
                operation = "+";
                tv_operations.append("+");
                break;
            case R.id.btn_substraction:
                operation = "-";
                tv_operations.append("-");
                break;
            case R.id.btn_multiplication:
                operation = "*";
                tv_operations.append("*");
                break;
            case R.id.btn_division:
                operation = "/";
                tv_operations.append("/");
                break;
        }
    }
    public void onNextClick (View v) {
        operations.add(operation);
        Intent intent = new Intent(this, NumbersActivity.class);
        intent.putExtra("numbers", numbers);
        intent.putExtra("operations", operations);
        startActivity(intent);
    }
}

