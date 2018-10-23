package com.example.szwho.szocsszabolcs_hf4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        String cashID = getIntent().getStringExtra("kulcs1");
        Double vetelArID = getIntent().getDoubleExtra("kulcs2",0);
        TextView info = (TextView) findViewById(R.id.cashID);
        TextView price = (TextView) findViewById(R.id.vetelArID);
        info.setText(cashID);
        price.setText(vetelArID.toString());


    }

}
