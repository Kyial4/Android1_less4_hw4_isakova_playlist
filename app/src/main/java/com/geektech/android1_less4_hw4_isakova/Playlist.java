package com.geektech.android1_less4_hw4_isakova;

public class Playlist {
    private String song, singer;

    public Playlist(String song, String sing) {
        this.song = song;
        this.singer = sing;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
