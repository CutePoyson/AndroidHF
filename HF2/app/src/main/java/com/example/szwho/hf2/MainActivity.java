package com.example.szwho.hf2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "States: ";
    Button btnActTwo;

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.btnActTwo);
        //b1.setOnClickListener(this);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b1 = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(b1);
            }
        });

        Log.d(TAG, "MainActivity: onCreate()");
    }

    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity: onStart()");
    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity: onResume()");
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainActivity: onPause()");
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity: onStop()");
    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity: onDestroy()");
    }

    @Override
    public void onClick(View v) {
        Intent b1 = new Intent(this, Main2Activity.class);
        startActivity(b1);
    }
}
