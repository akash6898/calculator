package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private TextView history;
    private double val1;
    private double val2;
    private String res;
    private String his;
    private String s;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b0 = findViewById(R.id.b0);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3= findViewById(R.id.b3);
        Button b4= findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button add = findViewById(R.id.ba);
        Button sub = findViewById(R.id.bs);
        Button  div = findViewById(R.id.bd);
        Button mul = findViewById(R.id.bm);
        Button equ= findViewById(R.id.be);
        Button del = findViewById(R.id.bdel);
        result=findViewById(R.id.result);
        history = findViewById(R.id.history);
        val1=0;
        val2=0;
        his="";
        res="";
        b0.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {

                        if(check()) {
                            res = res + "0";
                            result.setText(res);
                        }
                    }
                }
        );
        b1.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        if(check()) {
                            res = res + "1";
                            result.setText(res);
                        }
                    }
                }
        );
        b2.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        if(check()) {
                            res = res + "2";
                            result.setText(res);
                        }
                    }
                }
        );
        b3.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        if(check()) {
                            res = res + "3";
                            result.setText(res);
                        }
                    }
                }
        );
        b4.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        if(check()) {
                            res = res + "4";

                            result.setText(res);
                        }

                    }
                }
        );
        b5.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        if(check()) {
                            res = res + "5";
                            result.setText(res);
                        }

                    }
                }
        );
        b6.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        if(check()) {
                            res = res + "6";
                            result.setText(res);
                        }
                    }
                }
        );
        b7.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        if(check()) {
                            res = res + "7";
                            result.setText(res);
                        }
                    }
                }
        );
        b8.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        if(check()) {
                            res = res + "8";
                            result.setText(res);
                        }
                    }
                }
        );
        b9.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        if (check()) {
                            res = res + "9";
                            result.setText(res);
                        }
                    }
                }
        );
        del.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        if(res != ""&&res.length()>0) {
                            res = res.substring(0, res.length() - 1);
                            result.setText(res);
                            System.out.println(res);
                        }
                    }
                }
        );
        del.setOnLongClickListener(
                new Button.OnLongClickListener()
                {
                    public boolean onLongClick(View v)
                    {
                        val1=0;
                        val2=0;
                        his="";
                        res="";
                        result.setText(res);
                        history.setText(his);
                        return true;
                    }
                }
        );
        add.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (res != ""&&res.length()>0) {
                            if (s == null) {
                                val1 = Double.parseDouble(res);
                            } else {
                                val2 = Double.parseDouble(res);
                                calculate();
                            }
                            s = "+";
                            his = his + res + "+";
                            String temp;
                            if(Math.rint(val1) == val1) {

                                temp = Long.toString((long)val1);
                            }
                            else
                            temp = Double.toString(val1);
                            result.setText(temp);
                            res = "";
                            history.setText(his);

                        }
                    }
                }
        );
        sub.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (res != ""&&res.length()>0) {
                            if (s == null) {
                                val1 = Double.parseDouble(res);
                            } else {
                                val2 = Double.parseDouble(res);
                                calculate();
                            }
                            s = "-";
                            his = his + res + "-";
                            String temp;
                            if(Math.rint(val1) == val1) {

                                temp = Long.toString((long)val1);
                            }
                            else
                                temp = Double.toString(val1);
                            result.setText(temp);
                            res = "";
                            history.setText(his);

                        }
                    }
                }
        );
        mul.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (res != ""&&res.length()>0) {
                            if (s == null) {
                                val1 = Double.parseDouble(res);
                            } else {
                                val2 = Double.parseDouble(res);
                                calculate();
                            }
                            s = "*";
                            his = his + res + "*";
                            String temp;
                            if(Math.rint(val1) == val1) {

                                temp = Long.toString((long)val1);
                            }
                            else
                                temp = Double.toString(val1);
                            result.setText(temp);
                            res = "";
                            history.setText(his);

                        }
                    }
                }
        );
        div.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (res != ""&&res.length()>0) {
                            if (s == null) {
                                val1 = Double.parseDouble(res);
                            } else {
                                val2 = Double.parseDouble(res);
                                calculate();
                            }
                            s = "/";
                            his = his + res + "/";
                            String temp;
                            if(Math.rint(val1) == val1) {

                                temp = Long.toString((long)val1);
                            }
                            else
                                temp = Double.toString(val1);
                            result.setText(temp);
                            res="";
                            history.setText(his);

                        }
                    }
                }
        );
        equ.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                            if (res != ""&&res.length()>0){
                                val2 = Double.parseDouble(res);
                                if(s!=null)
                                    calculate();
                                else
                                    val1=val1+val2;

                            }
                            his="";
                            s = null;
                        String temp;
                        if(Math.rint(val1) == val1) {

                            temp = Long.toString((long)val1);
                        }
                        else
                            temp = Double.toString(val1);
                            result.setText(temp);
                            res=temp;
                            history.setText(his);
                    }
                }
        );


    }
    boolean check()
    {
        if(res.length()<12)
            return true;
        return false;
    }
    void calculate()
    {
        switch (s)
        {
            case "+":
                val1=val1+val2;
                break;
            case "-":
                val1=val1-val2;
                break;
            case "*":
                val1=val1*val2;
                break;
            case "/":
                val1=val1/val2;
                break;
        }
    }

}
