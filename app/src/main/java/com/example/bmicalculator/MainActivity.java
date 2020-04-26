package com.example.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    EditText weight,height;
    TextView resulttext;
    String calculation,BMIresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight=findViewById(R.id.weight);
        height=findViewById(R.id.height);
        resulttext=findViewById(R.id.result);


    }

    public void calculateBMI(View view){
        String s1=weight.getText().toString();
        String s2=height.getText().toString();

        float weightValue=Float.parseFloat(s1);
        float heightValue=Float.parseFloat(s2);
        double height_f=heightValue*0.305;
        double bmi=weightValue/(height_f*height_f);

        if (bmi < 16){
            BMIresult="Severely Under Weight";
        }
        else if(bmi < 18.5){
            BMIresult="Under Weight";
        }
        else if(bmi>=18.5 && bmi<=24.9){
            BMIresult="Normal Weight";
        }
        else if(bmi>=25 && bmi<=29.9){
            BMIresult="Overweight";
        }
        else {
            BMIresult="Obese";
        }
        calculation = "Result: "+bmi+"\n"+BMIresult;
        resulttext.setText(calculation);

    }
}
