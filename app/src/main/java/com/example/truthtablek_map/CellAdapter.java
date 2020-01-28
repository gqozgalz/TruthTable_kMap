package com.example.truthtablek_map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CellAdapter extends RecyclerView.Adapter <CellAdapter.ViewHolder> {
    ArrayList<String>arr;
    Context context;

    public CellAdapter(ArrayList<String> arr, Context context) {
        this.arr = arr;
        this.context = context;
    }

    @NonNull
    @Override
    public CellAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CellAdapter.ViewHolder holder, int position) {
        holder.textView.setText(arr.get(position));
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.cell);
        }
    }
}
