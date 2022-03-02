package com.joshuamccluskey.songr.controller;

import com.joshuamccluskey.songr.model.Album;
import com.joshuamccluskey.songr.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.ArrayList;

@Controller
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("albums")
    public String albumsGenerator(Model m, Object album) {
        ArrayList<Object> albumsList = new ArrayList<>();
        Album albumLamar = new Album("DAMN.", "Kendrick Lamar", 14, 3294, "https://coverartarchive.org/release-group/b88655ba-7469-48b8-a296-b9011ab73ef3/front");
        Album albumSimpson = new Album("A Sailor’s Guide to Earth", "Sturgill Simpson", 9, 2334, "https://coverartarchive.org/release-group/4ac57a19-921e-4dca-8a0e-bbdc0a2b5240/front");
        Album albumMac = new Album("Fleetwood Mac", "Fleetwood Mac", 11, 25332, "https://coverartarchive.org/release-group/6b5d9bf1-f496-34b5-9488-7df2533d6208/front");

        albumsList.add(albumLamar);
        albumsList.add(albumSimpson);
        albumsList.add(albumMac);
        m.addAttribute("album1", albumLamar);
        m.addAttribute("album2", albumSimpson);
        m.addAttribute("album3", albumMac);

//    for (Object eachAlbum : albumsList) {
//        int counter = 1;
//        m.addAttribute("album"+counter, eachAlbum);
//        counter++;
//    }
        return "albums.html";

    }
}

