package com.example.szwho.hf6;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class PortraitShow extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }
        setContentView(R.layout.show_selected_view);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String info = extras.getString("name");
            Double price = extras.getDouble("buy", 0);
            TextView textView = (TextView)findViewById(R.id.selectedOption);
            textView.setText("You have selected " + info + " worth: " + price.toString());
        }
    }

}
