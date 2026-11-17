package com.example.kartkowkakc3pt;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Random rand = new Random();
        final int[] iNum1 = {1};
        final int[] iNum2 = {1};
        final int[] iNum3 = {1};


        Button plusBt1 = findViewById(R.id.plusBt1);
        Button plusBt2 = findViewById(R.id.plusBt2);
        Button plusBt3 = findViewById(R.id.plusBt3);
        Button minusBt1 = findViewById(R.id.minusBt1);
        Button minusBt2 = findViewById(R.id.minusBt2);
        Button minusBt3 = findViewById(R.id.minusBt3);
        Button randBt = findViewById(R.id.randBt);
        TextView randNum = findViewById(R.id.randNum);
        TextView num1 = findViewById(R.id.num1);
        TextView num2 = findViewById(R.id.num2);
        TextView num3 = findViewById(R.id.num3);

        plusBt1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        iNum1[0]++;
                        num1.setText(String.valueOf(iNum1[0]));
                    }
                }
        );
        plusBt2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        iNum2[0]++;
                        num2.setText(String.valueOf(iNum2[0]));
                    }
                }
        );
        plusBt3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        iNum3[0]++;
                        num3.setText(String.valueOf(iNum3[0]));
                    }
                }
        );
        randBt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int iRandNum = rand.nextInt(1, 10);
                        randNum.setText(String.valueOf(iRandNum));
                    }
                }
        );
        minusBt1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        iNum1[0]--;
                        num1.setText(String.valueOf(iNum1[0]));
                    }
                }
        );
        minusBt2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        iNum2[0]--;
                        num2.setText(String.valueOf(iNum2[0]));
                    }
                }
        );
        minusBt3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        iNum3[0]--;
                        num3.setText(String.valueOf(iNum3[0]));
                    }
                }
        );



    }
}