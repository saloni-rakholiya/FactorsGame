package com.example.playwithfactors;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
private Button button;

@Override
    protected void onCreate(Bundle savedInstanceState)
{
    super.onCreate(savedInstanceState);
    setContentView(R.layout.content_main2);
            button=(Button)findViewById(R.id.button);


            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openactivity();
                }
            });
} public void openactivity()
    {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
