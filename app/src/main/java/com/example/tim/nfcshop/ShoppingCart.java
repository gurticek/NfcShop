package com.example.tim.nfcshop;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;



public class ShoppingCart extends Activity{
    List shoppingCart = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] foods ={"Káva", "Cappuchino", "Hot-dog", "Minerálna voda", "Bageta"};
        ListAdapter adapter = new CustomAdapter(getApplicationContext(),foods);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String food = String.valueOf(adapterView.getItemAtPosition(i));//todo: adding items to shopping cart
                        Toast.makeText(getApplicationContext(), food, Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
