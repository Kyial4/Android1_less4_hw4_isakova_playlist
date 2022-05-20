package com.geektech.android1_less4_hw4_isakova;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlaylistAdapter extends RecyclerView.Adapter<PlaylistAdapter.PlaylistViewHolder> {
    private ArrayList<Playlist> playlist = new ArrayList<>();

    public PlaylistAdapter(ArrayList<Playlist> playlist) {
        this.playlist = playlist;
    }

    @NonNull
    @Override
    public PlaylistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PlaylistViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_playlist1, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PlaylistViewHolder holder, int position) {
        holder.bind(playlist.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public int getItemCount() {

        return playlist.size();
    }


    static class PlaylistViewHolder extends RecyclerView.ViewHolder {
        private TextView song, singer;

        public PlaylistViewHolder(@NonNull View itemView) {
            super(itemView);
            song = itemView.findViewById(R.id.song);
            singer = itemView.findViewById(R.id.singer);
        }

        public void bind(Playlist playlist) {
            song.setText(playlist.getSong());
            singer.setText(playlist.getSing());
        }
    }
}
