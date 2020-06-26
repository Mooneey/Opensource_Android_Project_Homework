/* ***********************************
 * 프로그램 명 : MainActivity.java
 * 작성자 : 2016039006 문재식
 * 작성일 : 2020.04.12
 * 프로그램 설명 : Hello_Android
 * ***********************************/


package com.example.user.hello_android;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    EditText text;
    Button button1;
    Button button2;
    RadioGroup rGroup;
    RadioButton radio1, radio2;
    ImageView iView;
    Intent url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        text=(EditText) findViewById(R.id.text);
        rGroup=(RadioGroup)findViewById(R.id.rGroup);
        radio1=(RadioButton)findViewById(R.id.radio1);
        radio2=(RadioButton)findViewById(R.id.radio2);
        iView=(ImageView)findViewById(R.id.iView);
        final int a = 0;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),text.getText().toString(), a).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                url=new Intent(Intent.ACTION_VIEW,Uri.parse(text.getText().toString()));
                startActivity(url);
            }
        });

        radio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iView.setImageResource(R.drawable.bector);
            }
        });
        radio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iView.setImageResource(R.drawable.color);
            }
        });
    }
}
