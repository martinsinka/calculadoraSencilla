package com.example.usuario.practica_2_calculadora;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tvRes;
    private Button btnSuma, btnResta, btnMultiplicar, btnDividir, btnBorrar;
    private double num1, num2,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tvRes = (TextView) findViewById(R.id.tvRes);
        btnSuma = (Button) findViewById(R.id.btnSuma);
        btnResta = (Button) findViewById(R.id.btnResta);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnDividir = (Button) findViewById(R.id.btnDividir);
        btnBorrar = (Button) findViewById(R.id.btnBorrar);

        num1 = 0;
        num2 = 0;
        res = 0;

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(et1.getText().toString());
                num2 = Integer.parseInt(et2.getText().toString());
                res = num1+num2;
                tvRes.setText(res+"");
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(et1.getText().toString());
                num2 = Integer.parseInt(et2.getText().toString());
                res = num1-num2;
                tvRes.setText(res+"");
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(et1.getText().toString());
                num2 = Integer.parseInt(et2.getText().toString());
                res = num1*num2;
                tvRes.setText(res+"");
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(et1.getText().toString());
                num2 = Integer.parseInt(et2.getText().toString());
                res = num1/num2;
                tvRes.setText(res+"");
            }
        });
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("");
                et2.setText("");
                tvRes.setText("");
            }
        });
    }
}
