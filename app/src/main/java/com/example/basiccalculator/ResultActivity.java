package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    TextView resultv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        initViews();
        Intent intent = getIntent();

        ArrayList<Integer> numbers = intent.getIntegerArrayListExtra("numbers");
        ArrayList<String> operations = intent.getStringArrayListExtra("operations");



        Integer result = numbers.get(0);
        for (int i = 0; i < numbers.size() -1 ; i++) {
            switch (operations.get(i)){
                case "+":
                    result += numbers.get(i + 1);
                    break;
                case "-":
                    result -= numbers.get(i + 1);
                    break;
                case "*":
                    result *= numbers.get(i + 1);
                    break;
                case "/":
                    result /= numbers.get(i + 1);
                    break;
            }

            resultv.setText(PrettyResult.convert(numbers,operations) + "=" + result.toString());
            Log.d("ololo", PrettyResult.convert(numbers, operations) + "=" + result.toString());

        }


    }

    private void initViews() {
        resultv = findViewById(R.id.result);
    }

    public void onShareClick(View view) {
        String textMessage = resultv.getText().toString();
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, textMessage);
        sendIntent.setType("text/plain");

        if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(sendIntent);
        }

    }
}
