package com.hurk.da569alab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView text1, text2, text3, text4, endText;
    int textView = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView)findViewById(R.id.text1);
        text2 = (TextView)findViewById(R.id.text2);
        text3 = (TextView)findViewById(R.id.text3);
        text4 = (TextView)findViewById(R.id.text4);
        endText = (TextView)findViewById(R.id.endtext);
    }

    public void buttonClick(View view) {

        switch (textView) {
            case 1:
                text1.setVisibility(View.VISIBLE);
                textView = 2;
                break;
            case 2:
                text2.setVisibility(View.VISIBLE);
                textView = 3;
                break;
            case 3:
                text3.setVisibility(View.VISIBLE);
                textView = 4;
                break;
            case 4:
                text4.setVisibility(View.VISIBLE);
                textView = 5;
                break;
            case 5:
                endText.setVisibility(View.VISIBLE);
                textView = 0;
                break;
            default:
                break;
        }
    }
    }
