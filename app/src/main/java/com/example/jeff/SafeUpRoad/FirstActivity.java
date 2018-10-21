package com.example.jeff.SafeUpRoad;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        TextView s1 =(TextView) findViewById(R.id.textView1);
        s1.setTypeface(Typeface.createFromAsset(FirstActivity.this.getAssets(),"font/st.ttf"));

        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(FirstActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
}
