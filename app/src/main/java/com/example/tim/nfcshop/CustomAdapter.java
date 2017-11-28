package com.example.tim.nfcshop;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private List<String> data;

    public CustomAdapter(List<String> data) {
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.custom_row,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.foodName.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView foodName;
        private TextView foodPrice;

        public ViewHolder(View itemView) {
            super(itemView);
            foodName = itemView.findViewById(R.id.foodName);
            foodName.setOnClickListener(selectSender);
            foodPrice = itemView.findViewById(R.id.foodPrice);
            foodPrice.setOnClickListener(deleteSender);
        }

        private View.OnClickListener selectSender = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };

        private View.OnClickListener deleteSender = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.remove(getLayoutPosition());
                notifyItemRemoved(getLayoutPosition());
            }
        };
    }
}
