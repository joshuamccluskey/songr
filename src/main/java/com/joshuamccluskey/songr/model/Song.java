package com.joshuamccluskey.songr.model;

import javax.persistence.*;

@Entity
public class Song  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    int length;
    int trackNumber;

    @ManyToOne
    Album songOnAlbum;

    public  Song() {

    }

    public Song(String title, int length, int trackNumber) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Album getSongOnAlbum() {
        return songOnAlbum;
    }

    public void setSongOnAlbum(Album songOnAlbum) {
        this.songOnAlbum = songOnAlbum;
    }


}
