package com.example.szwho.szocsszabolcs_hf4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {"EUR","USD","GBP","AUD",
            "CAD","CHF","DKK","HUF"};

    String[] infoArray = {
            "Euro",
            "Dolar Americans",
            "Lira sterlina",
            "Dolar australian",
            "Dolar canadian",
            "Franc elvetian",
            "Coroana daneze",
            "Forint maghiar"
    };

    Integer[] imageArray = {
            R.drawable.europaflag,
            R.drawable.usaflag,
            R.drawable.gbflag,
            R.drawable.auflag,
            R.drawable.canadaflag,
            R.drawable.switzerlandflag,
            R.drawable.denmarkflag,
            R.drawable.huflag

    };

    double[] vetelArArray = {4.4100, 3.9750, 6.1250, 2.9600,
            3.0950, 4.2300, 0.5850, 0.0136};

    double[] eladasiArArray = {4.5500, 4.1450, 6.3550, 3.0600,
            3.2650, 4.3300, 0.6150, 0.0146};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        CustomListAdapter whatever = new CustomListAdapter(this,imageArray, nameArray, infoArray, vetelArArray, eladasiArArray);

        listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(whatever);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Toast!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                String myText = infoArray[position];
                double myText2 = vetelArArray[position];
                intent.putExtra("kulcs1",myText);
                intent.putExtra("kulcs2",myText2);
                startActivity(intent);
            }
        });
    }
}
