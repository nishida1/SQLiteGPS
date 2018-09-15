package com.example.nishida.sqlitegps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private SQLiteDatabase db;
    private ArrayList<AdapterItem> dbitems;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHelper dbHelper = new DBHelper(this);
        db = dbHelper.getWritableDatabase();

        /*
        try{
            dbitems = DBUtil.readDB(dbitems, db);
        } catch (Exception e){
            e.printStackTrace();
        }
        */


        setList();
        locationPermission();
    }

    private void locationPermission() {
        Intent intent = new Intent(getApplication(), LocationPermission.class);
        startActivity(intent);
    }

    //TODO test
    private void setList() {
        ListView lv = (ListView)findViewById(R.id.listItems);
        ArrayList<String> arrayList = new ArrayList<>();

        /*
        for (int i = 0; i < dbitems.size(); i++){
            AdapterItem item = dbitems.get(i);
            arrayList.add(item.text);
        }
        */

        for (int i = 0; i < 10; i++){
            arrayList.add("test");
        }

        adapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrayList);
        lv.setAdapter(adapter);
    }

}
