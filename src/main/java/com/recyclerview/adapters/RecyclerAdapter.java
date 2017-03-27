package com.recyclerview.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.recyclerview.R;
import com.recyclerview.pojos.SingleRow;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<SingleRow> data = new ArrayList<>();

    public RecyclerAdapter(Context context, ArrayList<SingleRow> data) {
        this.context = context;
        this.data = data;

    }

    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.single_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.MyViewHolder holder, int position) {

        holder.header.setText(data.get(position).getHeader());
        holder.subHeaders.setText(data.get(position).getSubHeader());
        holder.imageView.setImageResource(data.get(position).getImages());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView header, subHeaders;
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);

            header = (TextView) itemView.findViewById(R.id.title);
            subHeaders = (TextView) itemView.findViewById(R.id.description);
            imageView = (ImageView) itemView.findViewById(R.id.image);

        }


    }
}
