package com.joshuamccluskey.songr.controller;

import com.joshuamccluskey.songr.model.Album;
import com.joshuamccluskey.songr.model.Song;
import com.joshuamccluskey.songr.repository.AlbumRepository;
import com.joshuamccluskey.songr.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/songs/{albumId}")
    public String songsGenerator(@PathVariable long albumId, Model m ) {
        Album album = albumRepository.findById(albumId);
        m.addAttribute("songs", album.getSongsOnThisAlbum());
        m.addAttribute("albumId", albumId);
        return "songs.html";
    }

    @GetMapping("/album-list/{albumId}")
    public String songsLister(@PathVariable long albumId, Model m ) {
        Album album = albumRepository.findById(albumId);
        m.addAttribute("songs", album.getSongsOnThisAlbum());
        return "song-list.html";
    }

    @PostMapping("/addSong")
    public RedirectView addSong( long albumId, String title, int length, int trackNumber) {
        Album songsOnAlbum = albumRepository.findById(albumId);
        Song songToAdd = new Song(title, length, trackNumber);
        songToAdd.setSongOnAlbum(songsOnAlbum);
        songRepository.save(songToAdd);
        return new RedirectView("/album-list/" + albumId);
    }

}
