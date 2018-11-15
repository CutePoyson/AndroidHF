package com.example.szwho.hf5_szocsszabolcs;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.view.ContextMenu.ContextMenuInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private int listItemPressedPos;
    private long listItemPressedId;
    String[] mobileArray = {"Android", "IPhone", "WindowsMobile", "Blackberry",
            "WebOS", "Ubuntu", "Windows7", "Max OS X"};

    List<String> list = new ArrayList<String>(Arrays.asList(mobileArray));

    ListView listView;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list);

        //listView = (ListView) findViewById(R.id.listViewID);
        listView = (ListView) findViewById(R.id.listViewID);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> adapter, View v, int pos, long id) {

                listItemPressedPos = pos;
                listItemPressedId = id;
                return false;
            }
        });
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0, v.getId(), 0, "Piros");
        menu.add(0, v.getId(), 0, "Zöld");
        menu.add(0, v.getId(), 0, "Sárga");
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        View v = listView.getSelectedView();
        if (item.getTitle() == "Piros") {
            ((TextView) listView.getChildAt(listItemPressedPos)).setTextColor(getResources().getColor(R.color.piros));
        } else if (item.getTitle() == "Zöld") {
            ((TextView) listView.getChildAt(listItemPressedPos)).setTextColor(getResources().getColor(R.color.zold));
        } else if (item.getTitle() == "Sárga") {
            ((TextView) listView.getChildAt(listItemPressedPos)).setTextColor(getResources().getColor(R.color.sarga));
        } else {
            return false;
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.torol){

            list.clear();
            adapter.notifyDataSetChanged();;
        }
        else if(id==R.id.rendez){

            Collections.sort(list);
            adapter.notifyDataSetChanged();;
        }
        return super.onOptionsItemSelected(item);
    }
}
