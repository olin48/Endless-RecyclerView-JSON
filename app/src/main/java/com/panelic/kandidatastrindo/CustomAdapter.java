package com.panelic.kandidatastrindo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Sholihin on 25/12/2016.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{

    private Context context;
    private List<MyData> my_data;
    public CustomAdapter(Context context, List<MyData> my_data) {
        this.context = context;
        this.my_data = my_data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);

        return new ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textJudul.setText(my_data.get(position).getJudul());
        holder.textTanggal.setText(my_data.get(position).getTanggal());
        String html = my_data.get(position).getIsi();
        holder.textIsi.setText(html);
        Glide.with(context).load(my_data.get(position).getImage_link()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return my_data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textJudul;
        public TextView textTanggal;
        public ImageView imageView;
        public TextView textIsi;

        public ViewHolder(View itemView){
            super(itemView);
            textIsi =(TextView) itemView.findViewById(R.id.isiTextView);
            textJudul =(TextView) itemView.findViewById(R.id.judulTextView);
            textTanggal =(TextView) itemView.findViewById(R.id.tanggalTextView);
            imageView =(ImageView) itemView.findViewById(R.id.image);
        }
    }
}
