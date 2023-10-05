package com.example.destor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText etA,etB,etC;
Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectComponents();
    }

    private void connectComponents() {

        etA= findViewById(R.id.etA);
        etB= findViewById(R.id.etB);
        etC= findViewById(R.id.etC);
        calculate=findViewById(R.id.button);

    }


    public void calculate(View view) {

        String a =etA.getText().toString();
        String b =etB.getText().toString();
        String c =etC.getText().toString();
        if (a.isEmpty() || b.isEmpty() ||  c.isEmpty()   ){Toast.makeText(this,"Check Your data!",Toast.LENGTH_SHORT).show();
            return;
        }

        double f , g ,h ,destor,destor1;
        f   =Double.parseDouble(a);
         g=Double.parseDouble(b);
         h=Double.parseDouble(c);
        if (f==0){
            Toast.makeText(this, "Math.Error",Toast.LENGTH_SHORT).show();
        }
         destor=(-1*g+Math.sqrt(Math.pow(g,2)-4*f*h))/2*f;
        destor1 = (-1*g-Math.sqrt(Math.pow(g,2)-4*f*h))/2*f;

if((Math.pow(g,2)-4*f*h)>0) {
    Toast.makeText(this, "Your first answer is:" + destor, Toast.LENGTH_SHORT).show();
    Toast.makeText(this, "Your second answer is:" + destor1, Toast.LENGTH_SHORT).show();
}
else(Toast.makeText(this,"Math Error!",Toast.LENGTH_SHORT)).show();





    }
}