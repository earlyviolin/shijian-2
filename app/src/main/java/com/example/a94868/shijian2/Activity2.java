package com.example.a94868.shijian2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button btn2 = (Button)findViewById(R.id.button2);
        final EditText e2 = (EditText)findViewById(R.id.E2) ;

       // final Intent II =  getIntent();
        final Intent xx =  getIntent();
       // final String name = II.getStringExtra("name");
        final String xinxi = xx.getStringExtra("xinxi");
        //final int age = II.getIntExtra("age",00);
        Toast.makeText(Activity2.this,xinxi,Toast.LENGTH_LONG).show();

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //II.putExtra("结果","姓名"+name+"年龄"+age);
                xx.putExtra("xinxi2",e2.getText().toString());
                setResult(0,xx);
                finish();



            }
        });
    }
}
