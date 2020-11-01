package com.codwaves.simplecalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button badd;
    Button bsub;
    Button bmul;
    Button bde;
    EditText firstnumber,secondnumber;
    TextView answer;
    String num1,num2;
    Double number1,number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        badd=findViewById(R.id.buttonadd);
        firstnumber=findViewById(R.id.editText);
        secondnumber=findViewById(R.id.editText2);
        answer=findViewById(R.id.textView3);
        bsub=findViewById(R.id.button8);
        bde=findViewById(R.id.buttonde);
        bmul=findViewById(R.id.buttonmul);

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = firstnumber.getText().toString();
                num2 = secondnumber.getText().toString();

                try {
                    number1 = Double.parseDouble(num1);
                    number2 = Double.parseDouble(num2);
                    answer.setText((number1 + number2) + "");
                } catch (Exception e) {
                    answer.setText("error");
                }
            }
        }
        );
        bsub.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num1 = firstnumber.getText().toString();
                                        num2 = secondnumber.getText().toString();

                                        try {
                                            number1 = Double.parseDouble(num1);
                                            number2 = Double.parseDouble(num2);
                                            answer.setText((number1 - number2) + "");
                                        } catch (Exception e) {
                                            answer.setText("error");
                                        }
                                    }
                                }

        );

        bmul.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num1 = firstnumber.getText().toString();
                                        num2 = secondnumber.getText().toString();

                                        try {
                                            number1 = Double.parseDouble(num1);
                                            number2 = Double.parseDouble(num2);
                                            answer.setText((number1 * number2) + "");
                                        } catch (Exception e) {
                                            answer.setText("error");
                                        }
                                    }
                                }

        );
        bde.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num1 = firstnumber.getText().toString();
                                        num2 = secondnumber.getText().toString();

                                        try {
                                            number1 = Double.parseDouble(num1);
                                            number2 = Double.parseDouble(num2);
                                            answer.setText((number1 / number2) + "");
                                        } catch (Exception e) {
                                            answer.setText("error");
                                        }
                                    }
                                }

         );


    }
    }