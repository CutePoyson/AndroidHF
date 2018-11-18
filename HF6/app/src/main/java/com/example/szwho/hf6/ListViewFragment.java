package com.example.szwho.hf6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewFragment extends Fragment {

    protected static final String FRAG2 = "2";

    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_list_view_fragment, container, false);

        final String[] nameArray = {"EUR", "USD", "GBP", "AUD", "CAD", "CHF", "DKK", "HUF"};
        String[] infoArray = {"Euro",
                "Dolar american",
                "Lira sterlina",
                "Dolar austrian",
                "Dolar canadian",
                "Franc elvetian",
                "Corona daneza",
                "Forint maghiar"};
        Integer[] imageArray = {R.drawable.europaflag,
                R.drawable.usaflag,
                R.drawable.gbflag,
                R.drawable.auflag,
                R.drawable.canadaflag,
                R.drawable.switzerlandflag,
                R.drawable.denmarkflag,
                R.drawable.huflag};
        final Double[] vetelArArray = {4.4100, 3.9750, 6.1250, 2.9600, 3.0950, 4.2300, 0.5850, 0.0136};
        final Double[] eladasiArArray = {4.5500, 4.1450, 6.3550, 3.0600, 3.2650, 4.3300, 0.6150, 0.0146};

        ListView listView = view.findViewById(R.id.currencies);

        CustomListAdapter adapter = new CustomListAdapter(getActivity(),nameArray,imageArray,infoArray,vetelArArray,eladasiArArray);
        listView.setAdapter(adapter);

        final FragmentManager fragmentManager = getFragmentManager();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (fragmentManager.findFragmentByTag(FRAG2) != null) {
                    TextView selectedOption = (TextView) getActivity().findViewById(R.id.selectedOption);
                    selectedOption.setText("You have selected " + nameArray[position] + " worth: " + vetelArArray[position]);
                    Toast.makeText(getActivity().getApplicationContext(),"Landscape mode",Toast.LENGTH_LONG).show();
                } else {

                    Toast.makeText(getActivity().getApplicationContext(),"Portrait mode",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getActivity().getApplicationContext(), PortraitShow.class);
                    intent.putExtra("name",nameArray[position]);
                    intent.putExtra("buy",eladasiArArray[position]);
                    startActivity(intent);
                }
            }
        });
        return view;
    }
}