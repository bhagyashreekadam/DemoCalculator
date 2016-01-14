package com.example.synerzip.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button reset;
    TextView helloworld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloworld=(TextView)findViewById(R.id.helloworld);
    }

    public void onButtonClick(View v)
    {
        int n1,n2,sum;
        EditText e1=(EditText)findViewById(R.id.editText);
        EditText e2=(EditText)findViewById(R.id.editText2);
        TextView t1=(TextView)findViewById(R.id.textView);
        n1=Integer.parseInt(e1.getText().toString());
        n2=Integer.parseInt(e2.getText().toString());
        sum=n1+n2;
        t1.setText(Integer.toString(sum));
    }


    public void onResetClick(View v)
    {
       helloworld.setText("Hello world");
    }

}
