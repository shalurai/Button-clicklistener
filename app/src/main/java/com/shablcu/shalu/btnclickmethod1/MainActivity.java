package com.shablcu.shalu.btnclickmethod1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button clickbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        clickbtn=(Button)findViewById(R.id.button);

        clickbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Log.d("oops","click btn metrhod 2");

    }
}
