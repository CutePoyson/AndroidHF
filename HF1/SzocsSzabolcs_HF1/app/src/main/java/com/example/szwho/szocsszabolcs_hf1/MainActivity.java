package com.example.szwho.szocsszabolcs_hf1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText number1, number2;
    Button sum,subtract,divide,multiply,clear;

    float result_num;
    float num1;
    float num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.result);
        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);

        sum = (Button)findViewById(R.id.sum);
        subtract = (Button)findViewById(R.id.subtract);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);
        clear = (Button)findViewById(R.id.clear);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(" ");
                number1.setText(" ");
                number2.setText(" ");
            }
        });

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Float.parseFloat(number1.getText().toString());
                num2 = Float.parseFloat(number2.getText().toString());
                result_num = num1 + num2;
                result.setText(String.valueOf(result_num));


            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Float.parseFloat(number1.getText().toString());
                num2 = Float.parseFloat(number2.getText().toString());
                result_num = num1 - num2;
                result.setText(String.valueOf(result_num));


            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Float.parseFloat(number1.getText().toString());
                num2 = Float.parseFloat(number2.getText().toString());
                result_num = num1 * num2;
                result.setText(String.valueOf(result_num));


            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Float.parseFloat(number1.getText().toString());
                num2 = Float.parseFloat(number2.getText().toString());
                result_num = num1 / num2;
                result.setText(String.valueOf(result_num));


            }
        });
    }
}
