package com.e.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myAdapter.MhsViewHolder> {

    private ArrayList<Hewan> dataList;

    public myAdapter(ArrayList<Hewan> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public myAdapter.MhsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item, parent, false);
        return new MhsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapter.MhsViewHolder holder, int position) {
        holder.gambar.setImageResource(dataList.get(position).getImages());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtMakanan.setText(dataList.get(position).getMakanan());
        holder.txtHabitat.setText(dataList.get(position).getHabitat());
    }

    @Override
    public int getItemCount() {
       return (dataList != null) ? dataList.size() : 0;
    }

    public class MhsViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNama, txtMakanan, txtHabitat;
        private ImageView gambar;

        public MhsViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
            txtMakanan = (TextView) itemView.findViewById(R.id.txt_makanan);
            txtHabitat = (TextView) itemView.findViewById(R.id.txt_habitat);
            gambar = (ImageView) itemView.findViewById(R.id.gambar);
        }
    }
}
