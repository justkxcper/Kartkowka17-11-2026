package com.example.kartkowkakc3pt;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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

        Button plus1 = findViewById(R.id.plusBt1);
        Button plus2 = findViewById(R.id.plusBt2);
        Button plus3 = findViewById(R.id.plusBt3);
        Button minus1 = findViewById(R.id.minusBt1);
        Button minus2 = findViewById(R.id.minusBt2);
        Button minus3 = findViewById(R.id.minusBt3);
        TextView randNum = findViewById(R.id.randNum);
        TextView num1 = findViewById(R.id.num1);
        TextView num2 = findViewById(R.id.num2);
        TextView num3 = findViewById(R.id.num3);
    }
}