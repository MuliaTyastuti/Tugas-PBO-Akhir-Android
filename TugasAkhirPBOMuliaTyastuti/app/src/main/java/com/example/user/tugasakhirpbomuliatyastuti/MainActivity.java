package com.example.user.tugasakhirpbomuliatyastuti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public String str="";
    Character op='q';
    float i,num,numtemp;
    EditText showResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showResult=(EditText)findViewById(R.id.result_id);
    }
    public void btn7Clicked(View view) {
        insert(7);
    }

    public void btn1Clicked(View view) {
        insert(1);
    }

    public void btn2Clicked(View view) {
        insert(2);
    }

    public void btn3Clicked(View view) {
        insert(3);
    }

    private void insert(int i) {
        str=str+Integer.toString(i);
        num=Integer.valueOf(str).intValue();
        showResult.setText(str);
    }

    public void btn4Clicked(View view) {
        insert(4);
    }

    public void btn5Clicked(View view) {
        insert(5);
    }

    public void btn6Clicked(View view) {
        insert(6);
    }


    public void btn8Clicked(View view) {
        insert(8);
    }

    public void btn9Clicked(View view) {
        insert(9);
    }

    public void btnplusClicked(View view) {
        perform();
        op='+';
    }

    private void perform() {
        str="";
        calculateNoShow();
        numtemp=num;
    }

    private void calculateNoShow() {
        if(op=='+')
            num=numtemp+num;
        else if (op=='-')
            num=numtemp-num;
        else if (op=='/')
            num=numtemp/num;
        else if (op=='*')
            num=numtemp*num;

    }


    public void btnminusClicked(View view) {
        perform();
        op='-';
    }

    public void btnequalClicked(View view) {
        calculate();
    }

    private void calculate() {
        if(op=='+')
            num=numtemp+num;
        else if (op=='-')
            num=numtemp-num;
        else if (op=='/')
            num=numtemp/num;
        else if (op=='*')
            num=numtemp*num;
        showResult.setText(""+num);

    }

    public void btndivideClicked(View view) {
        perform();
        op='/';
    }

    public void btnmultiClicked(View view) {
        perform();
        op='*';
    }

    public void btnclearClicked(View view) {
        reset();
    }

    private void reset() {
        str="";
        op='q';
        num=0;
        numtemp=0;
        showResult.setText("");

    }
}
