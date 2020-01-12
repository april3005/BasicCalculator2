package com.example.basiccalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<String> operations = new ArrayList<>();

    private static final String NUMBERS = "NUMBERS";
    private static final String OPER = "OPER";

    TextView tv_result;

    Integer number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        if (savedInstanceState != null) {
            number = savedInstanceState.getInt("int");
            operations = savedInstanceState.getStringArrayList(OPER);

            Log.e("ol", "onCreate: " + number );

        tv_result.setText(number + "");
     /*       for (int i = 0; i < numbers.size(); i++) {
                tv_result.append(numbers.get(i).toString() + operations.get(i));
            }*/

        }
        initViews();
        Intent intent = getIntent();

        ArrayList<Integer> numbers2 = intent.getIntegerArrayListExtra("numbers");
        ArrayList<String> operations2 = intent.getStringArrayListExtra("operations");

        if (numbers2 != null && operations2 != null) {
            numbers = numbers2;
            operations = operations2;

            for (int i = 0; i < numbers2.size(); i++) {
                tv_result.append(numbers2.get(i).toString() + operations2.get(i));
            }
        }
        Log.d("ololo", PrettyResult.convert(numbers, operations));
    }


    public void initViews() {
        tv_result = findViewById(R.id.tv_result);
    }

    public void onNumberClick(View v) {
        switch (v.getId()) {
            case R.id.btn_one:
                number = 1;
                tv_result.append("1");
                break;
            case R.id.btn_two:
                number = 2;
                tv_result.append("2");
                break;
            case R.id.btn_three:
                number = 3;
                tv_result.append("3");
                break;
            case R.id.btn_four:
                number = 4;
                tv_result.append("4");
                break;
            case R.id.btn_five:
                number = 5;
                tv_result.append("5");
                break;
            case R.id.btn_six:
                number = 6;
                tv_result.append("6");
                break;
            case R.id.btn_seven:
                number = 7;
                tv_result.append("7");
                break;
            case R.id.btn_eight:
                number = 8;
                tv_result.append("8");
                break;
            case R.id.btn_nine:
                number = 9;
                tv_result.append("9");
                break;
            case R.id.btn_zero:
                number = 0;
                tv_result.append("0");
                break;
            case R.id.btn_dot:
                tv_result.append("5");
                break;
            case R.id.btn_equals:
                numbers.add(number);
                Intent intent = new Intent(this, ResultActivity.class);
                intent.putExtra("numbers", numbers);
                intent.putExtra("operations", operations);
                startActivity(intent);
                break;


        }
        Log.e("ol", "num: " + numbers);
    }

    public void onNextClick(View v) {
        numbers.add(number);
        Intent intent = new Intent(this, OperationActivity.class);
        intent.putExtra("numbers", numbers);
        intent.putExtra("operations", operations);
        startActivity(intent);


    }

    public void onClearClick(View view) {
        tv_result.setText("");
        numbers.clear();
        operations.clear();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    /*    outState.putIntegerArrayList(NUMBERS, numbers);*/
        outState.putStringArrayList(OPER, operations);
        outState.putInt("int", number);

        Log.e("ol", "onSaveInstanceState: " + number);
    }
}
