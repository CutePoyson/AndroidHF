package com.example.szwho.hf2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    final String TAG = "States";
    Button btnMain, btnThirdAct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button b2 = (Button) findViewById(R.id.btnMain);
        Button b3 = (Button) findViewById(R.id.btnThirdAct);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMain = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intentMain);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(intent);
            }
        });


        Log.d(TAG, "ActivityTwo: onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityTwo: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityTwo: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityTwo: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityTwo: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityTwo: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityTwo: onDestroy()");
    }

    @Override
    public void onClick(View v) {
        Intent b2 = new Intent(this, MainActivity.class);
        startActivity(b2);

        Intent b3 = new Intent(this, Main3Activity.class);
        startActivity(b3);

    }

    public void startMainActivity(View v) {
        this.finish();
    }
}