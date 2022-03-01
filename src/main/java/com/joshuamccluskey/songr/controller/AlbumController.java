package com.joshuamccluskey.songr.controller;

import com.joshuamccluskey.songr.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.ArrayList;

@Controller
public class AlbumController {

    @GetMapping("albums")
    public String albumsGenerator(Model m, Object album) {
        ArrayList<Object> albumsList = new ArrayList<>();
        Album albumLamar = new Album("DAMN.", "Kendrick Lamar", 14, 3294, "https://coverartarchive.org/release-group/b88655ba-7469-48b8-a296-b9011ab73ef3/front");
        Album albumSimpson = new Album("A Sailor’s Guide to Earth", "Sturgill Simpson", 9, 2334, "https://coverartarchive.org/release-group/4ac57a19-921e-4dca-8a0e-bbdc0a2b5240/front");
        Album albumMac = new Album("Fleetwood Mac", "Fleetwood Mac", 11, 25332, "https://coverartarchive.org/release-group/6b5d9bf1-f496-34b5-9488-7df2533d6208/front");

        albumsList.add(albumLamar);
        albumsList.add(albumSimpson);
        albumsList.add(albumMac);
        m.addAttribute("album", albumLamar);
        m.addAttribute("album2", albumSimpson);
        m.addAttribute("album3", albumMac);

//        for (Object albums : albumsList) {
//            m.addAttribute("album", albums);
//        }
        return "albums.html";

    }
}

