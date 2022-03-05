package com.joshuamccluskey.songr.controller;


import com.joshuamccluskey.songr.repository.AlbumRepository;
import com.joshuamccluskey.songr.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;


import java.util.ArrayList;
import java.util.List;


@Controller
public class AlbumController {
    //Step 6: @Autowired and add your repository instance
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String albumsGenerator(Model m) {
        List<Album> albums = albumRepository.findAll();
        m.addAttribute("albums",albums);
        return "albums.html";
    }

    @PostMapping("/addAlbum")
    public RedirectView addAlbum( String albumTitle, String albumArtist, int songCount, int length, String imgUrl) {
        Album album = new Album( albumTitle, albumArtist, songCount, length, imgUrl );
        albumRepository.save(album);
        return new RedirectView("albums");
    }

//    @PutMapping("editAlbum")
//    public RedirectView editAlbum(long id, String title, String artist, int songCount, int length, String imgUrl)
//    {
//        Album albumToEdit = albumRepository.findById(id).orElseThrow();
//        albumToEdit.setTitle(title);
//        albumToEdit.setArtist(artist);
//        albumToEdit.setSongCount(songCount);
//        albumToEdit.setLength(length);
//        albumToEdit.setImgUrl(imgUrl);
//
//        return new RedirectView("albums");
//    }

//        Reference Album Data:
//        Album albumLamar = new Album("DAMN.", "Kendrick Lamar", 14, 3294, "https://coverartarchive.org/release-group/b88655ba-7469-48b8-a296-b9011ab73ef3/front");
//        Album albumSimpson = new Album("A Sailor’s Guide to Earth", "Sturgill Simpson", 9, 2334, "https://coverartarchive.org/release-group/4ac57a19-921e-4dca-8a0e-bbdc0a2b5240/front");
//        Album albumMac = new Album("Fleetwood Mac", "Fleetwood Mac", 11, 25332, "https://coverartarchive.org/release-group/6b5d9bf1-f496-34b5-9488-7df2533d6208/front");
}

