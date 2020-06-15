package com.example.sport;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class SportAdapter extends RecyclerView.Adapter<SportAdapter.CardViewViewHolder>{
    private ArrayList<Sport> listPlayers;

    public SportAdapter(ArrayList<Sport> list) {
        this.listPlayers = list;
    }

    @Override
    public SportAdapter.CardViewViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list, viewGroup, false);

        return new SportAdapter.CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final SportAdapter.CardViewViewHolder holder, int position) {
        Sport hero = listPlayers.get(position);

        final Bundle bundle = new Bundle();

        Glide.with(holder.itemView.getContext())
                .load(hero.getFoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.img);

        holder.tvjudul.setText(hero.getJudul());
        holder.tvdesk1.setText(hero.getDesk1());
        holder.tvdesk2.setText(hero.getDesk2());

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putString("foto", String.valueOf(listPlayers.get(holder.getAdapterPosition()).getFoto()));
                bundle.putString("judul", String.valueOf(listPlayers.get(holder.getAdapterPosition()).getJudul()));
                bundle.putString("desk1", String.valueOf(listPlayers.get(holder.getAdapterPosition()).getDesk1()));
                bundle.putString("desk2", String.valueOf(listPlayers.get(holder.getAdapterPosition()).getDesk2()));

                Intent intent = new Intent(holder.itemView.getContext(), Main2Activity.class);
                intent.putExtras(bundle);
                holder.itemView.getContext().startActivity(intent);

                Toast.makeText(holder.itemView.getContext(), "Detail " +
                        listPlayers.get(holder.getAdapterPosition()).getJudul(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return listPlayers.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tvjudul, tvdesk1,tvdesk2;

        public CardViewViewHolder(View view) {
            super(view);

            img = itemView.findViewById(R.id.imgbaner);
            tvjudul = itemView.findViewById(R.id.tvjudul);
            tvdesk1 = itemView.findViewById(R.id.tvdesk1);
            tvdesk2 = itemView.findViewById(R.id.tvdesk2);

        }
    }

}
