package com.example.szwho.hf2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{

    final String TAG = "States";
    Button btnMain, btnActTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button b2 = (Button)findViewById(R.id.btnMain);
        Button b1 = (Button)findViewById(R.id.btnActTwo);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMain = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intentMain);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
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
    public void onClick(View view) {

        Intent b1 = new Intent(this, MainActivity.class);
        startActivity(b1);

        Intent b2 = new Intent(this, Main2Activity.class);
        startActivity(b2);

    }
}