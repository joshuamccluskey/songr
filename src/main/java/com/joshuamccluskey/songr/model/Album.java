package com.joshuamccluskey.songr.model;


import javax.persistence.*;
import java.util.List;

// Step 1: Add @Enitity to your model class
@Entity
public class Album {
    //Step 3: Default constructor
    public Album()
    {

    }
    //Step 2: Add an ID for a unique identifier for our database
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long id;
    @Column(columnDefinition = "text")
    String title;
    String artist;
    int songCount;
    int length;
    String imgUrl;



    @OneToMany(mappedBy = "songOnAlbum", cascade = CascadeType.ALL)
    @OrderBy("trackNumber")
    List<Song> songsOnThisAlbum;


    public Album(String title, String artist, int songCount, int length, String imgUrl) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imgUrl = imgUrl;
    }

    public List<Song> getSongsOnThisAlbum() {
        return songsOnThisAlbum;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
