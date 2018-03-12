package com.example.abel.milagecalculator;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.Gravity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickButton = (Button)findViewById(R.id.mpgButton);

        EditText miles = (EditText)findViewById(R.id.mileBox);
        EditText gallons = (EditText)findViewById(R.id.gallonsBox);




            clickButton.setOnClickListener(new View.OnClickListener() {


                public void onClick(View view) {

                   try{
                    //create EditText objects that reference respective boxes
                    EditText miles = (EditText) findViewById(R.id.mileBox);
                    EditText gallons = (EditText) findViewById(R.id.gallonsBox);

                    //obtain string values
                    String milesString = miles.getText().toString();
                    String gallonsString = gallons.getText().toString();

                    //convert string values to double
                    double mileInt = Double.parseDouble(milesString);
                    double gallonInt = Double.parseDouble(gallonsString);

                    //calculate miles per gallon
                    double result = mileInt / gallonInt;

                    // String.format("%.2f", d)
                    //String mpgString = String.valueOf(result) + " mpg";

                    TextView mpgResult = (TextView) findViewById(R.id.result);
                    mpgResult.setText(String.format("%.2f", result) + " miles per gallon");
                }

            //generic exception
            catch (Exception e)
            {

                    TextView errorMessage = (TextView) findViewById(R.id.result);
                    errorMessage.setText("Error: make sure to fill out both boxes");

            }
            }
            });

    }

}
