package com.example.playwithfactors;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

int score=0;
    EditText input;
    int n,i;
    int randomval1,randomval2;
    private int [] answers;
    private int anspos;

    TextView opt1;
    TextView opt2;
    TextView opt3;
    Button start;
    TextView ans;
    TextView s;










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        input=(EditText) findViewById(R.id.editText1);
        String ch=input.getText().toString();
        opt1=findViewById(R.id.t);
        opt2=findViewById(R.id.t2);
        opt3=findViewById(R.id.t3);
        start=findViewById(R.id.btn);
        ans=findViewById(R.id.textView4);
        s=findViewById(R.id.textView6);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int finalfactor;

                String ch=input.getText().toString();
                n=Integer.valueOf(ch);

                List<Integer> list=new ArrayList<>();

                int b; int count=0; int k=0;
                Random rand=new Random();
                if(n>7||n==4)
                { int i;
                    list.add(1);
                    list.add(n);

                    for( i=2;i<=(int)Math.sqrt(n);i=i+1)
                    {if(n%i==0)
                    {list.add(i);
                    if((n/i)!=i)
                    list.add((int)n/i);}}
                b=rand.nextInt(list.size());
                finalfactor=list.get(b);}
                else finalfactor=1;


                int randomval1=1,randomval2=1;

                if(n==1||n==2||n==3||n==5||n==7)
                {

                randomval1=(int)rand.nextInt(20)+8;
                randomval2=9;}
                else
                {do {
                    int r,f=0;

                    while(f==0)
                    {
                        r=rand.nextInt(n)+1;

                        if(!list.contains(r))
                        {f=1;randomval1=r;break;}
                    }
                    f=0;
                    while(f==0) {
                        r = rand.nextInt(n) + 1;

                        if (!list.contains(r)) {
                            f = 1;
                            randomval2 = r;
                            break;
                        }

                    }
                }while (randomval1==randomval2);}

                int choosingwhichoption=rand.nextInt(4-1)+1;





                if(choosingwhichoption==1)
                {
                    opt1.setText((Integer.toString(finalfactor)));
                    opt2.setText(Integer.toString(randomval2));
                    opt3.setText(Integer.toString(randomval1));
                    opt1.setVisibility(View.VISIBLE);
                    opt2.setVisibility(View.VISIBLE);
                    opt3.setVisibility(View.VISIBLE);

                    opt1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ans.setText("SUCCESS!!! Enter Next number");
                            ans.setTextColor(Color.GREEN);
                            score=score+1;
                            s.setText(String.valueOf(score));
                            input.getText().clear();

                        }
                    });

                    opt2.setOnClickListener((new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ans.setText("OOPS!! try again!"); ans.setTextColor(Color.RED); score=score-1;
                            s.setText(String.valueOf(score));
                            input.getText().clear();
                        }
                    }));

                    opt3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ans.setText("OOOPS!! Try again!"); ans.setTextColor(Color.RED); score=score-1;
                            s.setText(String.valueOf(score));
                            input.getText().clear();
                        }
                    });
                }

                else if(choosingwhichoption==2)
                {
                    opt2.setText((Integer.toString(finalfactor)));
                    opt1.setText(Integer.toString(randomval2));
                    opt3.setText(Integer.toString(randomval1));
                    opt1.setVisibility(View.VISIBLE);
                    opt2.setVisibility(View.VISIBLE);
                    opt3.setVisibility(View.VISIBLE);

                    opt2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ans.setText("SUCCESS!!!Enter Next number"); ans.setTextColor(Color.GREEN);
                            score=score+1;
                            s.setText(String.valueOf(score));
                            input.getText().clear();
                        }
                    });

                    opt1.setOnClickListener((new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ans.setText("OOPS!! Try again!");ans.setTextColor(Color.RED);
                            score=score-1;
                            s.setText(String.valueOf(score));
                            input.getText().clear();
                        }
                    }));

                    opt3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ans.setText("OOOPS!! Try again!");ans.setTextColor(Color.RED);
                            score=score-1;
                            s.setText(String.valueOf(score));
                            input.getText().clear();
                        }
                    });
                }
                else if(choosingwhichoption==3)
                {
                    opt3.setText((Integer.toString(finalfactor)));
                    opt2.setText(Integer.toString(randomval2));
                    opt1.setText(Integer.toString(randomval1));
                    opt1.setVisibility(View.VISIBLE);
                    opt2.setVisibility(View.VISIBLE);
                    opt3.setVisibility(View.VISIBLE);

                    opt3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ans.setText("SUCCESS!!! Enter Next number"); ans.setTextColor(Color.GREEN);
                            score=score+1;
                            s.setText(String.valueOf(score));
                            input.getText().clear();
                        }
                    });

                    opt2.setOnClickListener((new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ans.setText("OOPS!! Try again !");ans.setTextColor(Color.RED);
                            score=score-1;
                            s.setText(String.valueOf(score));
                            input.getText().clear();
                        }
                    }));

                    opt1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ans.setText("OOOPS!! Try again !");ans.setTextColor(Color.RED);
                            score=score-1;
                            s.setText(String.valueOf(score));
                            input.getText().clear();
                        }
                    });
                }













            }
        });








    }
}