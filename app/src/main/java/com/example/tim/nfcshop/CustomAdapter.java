package com.example.tim.nfcshop;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(Context context, String[] foods) {
        super(context, R.layout.custom_row, foods);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.custom_row, parent, false);

        String foodItem = getItem(position);
        TextView foodName = (TextView) customView.findViewById(R.id.foodName);
        TextView foodPrice = (TextView) customView.findViewById(R.id.foodPrice);

        foodName.setText(foodItem);
        foodPrice.setText(Integer.toString(foodItem.length()));//todo: add food price

        return customView;
    }
}
