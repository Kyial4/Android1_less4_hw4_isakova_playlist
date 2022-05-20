package com.geektech.android1_less4_hw4_isakova;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondFragment extends Fragment  implements onItemClick {
    private RecyclerView recyclerView;
    private ArrayList<Playlist> playlist;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.container_playlist);
        loadData();
        PlaylistAdapter adapter=new PlaylistAdapter(playlist, this);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        playlist=new ArrayList<>();
        playlist.add(new Playlist("Artik and Asti","Чувства"));
        playlist.add(new Playlist("Artik and Asti","Под гипнозом"));
        playlist.add(new Playlist("Дима Билан","Эта была любовь"));
        playlist.add(new Playlist("Hamai &Navai","Раз, два, три кавычки"));
        playlist.add(new Playlist("Ирина Дубцова","Под дождем"));
        playlist.add(new Playlist("Ed Sheeran","Photograh"));
        playlist.add(new Playlist("Artik and Asti","Чувства"));
        playlist.add(new Playlist("Artik and Asti","Под гипнозом"));
        playlist.add(new Playlist("Дима Билан","Эта была любовь"));
        playlist.add(new Playlist("Hamai &Navai","Раз, два, три кавычки"));
        playlist.add(new Playlist("Ирина Дубцова","Под дождем"));
        playlist.add(new Playlist("Ed Sheeran","Photograh"));

    }



    @Override
    public void onClick(Playlist playlist) {
        Intent intent=new Intent(requireActivity(),SecondActivity.class);
        intent.putExtra("text",playlist.getSong());
        startActivity(intent);
        Toast.makeText(getActivity(), "UPS  ",
                Toast.LENGTH_LONG).show();
    }
}