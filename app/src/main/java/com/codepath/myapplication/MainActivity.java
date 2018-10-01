package com.codepath.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView2)).setTextColor(getResources().getColor(R.color.colorPrimary));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.orange));
            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newText = ((EditText)findViewById(R.id.editText)).getText().toString();
                if(TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView2)).setText("Hello from Joey!");
                }
                else{
                    ((TextView) findViewById(R.id.textView2)).setText(newText);
                }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset to originals
                ((TextView)findViewById(R.id.textView2)).setTextColor(getResources().getColor(R.color.black));
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorAccent));
                ((TextView)findViewById(R.id.textView2)).setText("Hello from Joey!");


            }
        });



    }
}
