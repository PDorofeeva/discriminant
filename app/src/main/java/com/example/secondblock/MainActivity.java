package com.example.secondblock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private Button btn;
    private TextView tv;
    private TextView tv2;
    private EditText edA, edB, edC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        tv = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);
        edA = findViewById(R.id.First);
        edB = findViewById(R.id.Second);
        edC = findViewById(R.id.Third);

        // R - class resources
        btn.setOnClickListener(view -> {
            //counter++;
           //tv.setText(Integer.toString(counter));
           String a_str = edA.getText().toString();
           String b_str = edB.getText().toString();
           String c_str = edC.getText().toString();
           int a = Integer.parseInt(a_str);
           int b = Integer.parseInt(b_str);
           int c = Integer.parseInt(c_str);
           double discr = Math.pow(b, 2) - 4*a*c;
           if(discr<0)
           {
               tv.setText("Нет корней");
               tv2.setText(" ");
           }
           else if(discr == 0)
           {
               double x1 = -b;
               x1/=2*a;
               tv.setText(Double.toString(x1));
               tv2.setText(" ");
           }
           else
           {
               double x1 = (-b+Math.sqrt(discr));
               x1 /= 2*a;
               double x2 = (-b-Math.sqrt(discr));
               x2 /= 2*a;
               tv.setText(Double.toString(x1));
               tv2.setText(Double.toString(x2));
           }
        });
    }
}