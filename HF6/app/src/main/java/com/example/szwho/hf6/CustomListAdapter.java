package com.example.szwho.hf6;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomListAdapter extends ArrayAdapter {


    private final Activity context;
    private final Integer[] imageArray;
    private final String[] nameArray;
    private final String[] infoArray;
    private final Double[] vetelArArray;
    private final Double[] eladasiArArray;

    public CustomListAdapter(Activity context,  String[] nameArrayParam, Integer[] imageArrayParam, String[] infoArrayParam, Double[] vetelArArrayParam, Double[] eladasiArArrayParam) {
        super(context, R.layout.listview_row, nameArrayParam);
        this.context = context;
        this.nameArray = nameArrayParam;
        this.imageArray = imageArrayParam;
        this.infoArray = infoArrayParam;
        this.vetelArArray = vetelArArrayParam;
        this.eladasiArArray = eladasiArArrayParam;

    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listview_row2, null,true);

        TextView nameTextField = (TextView) rowView.findViewById(R.id.nameID);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1ID);
        TextView infoTextField = (TextView) rowView.findViewById(R.id.cashID);
        TextView eladasiAr = (TextView) rowView.findViewById(R.id.eladasiArID);
        TextView vetelAr = (TextView) rowView.findViewById(R.id.vetelArID);

        nameTextField.setText(nameArray[position]);
        imageView.setImageResource(imageArray[position]);
        infoTextField.setText(infoArray[position]);
        eladasiAr.setText(Double.toString(eladasiArArray[position]));
        vetelAr.setText(Double.toString(vetelArArray[position]));

        return rowView;
    }
}
