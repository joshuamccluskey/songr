package com.joshuamccluskey.songr.controller;


import org.junit.jupiter.api.Test;
import com.joshuamccluskey.songr.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static org.junit.jupiter.api.Assertions.assertTrue;


class AlbumControllerTest {
    Model m;

//    @Test
//    void test_albumsGenerator(Model m, Object Album) {
//        AlbumController cut = new AlbumController();
//        Album albumLamar = new Album("DAMN.", "Kendrick Lamar", 14, 3294, "https://coverartarchive.org/release-group/b88655ba-7469-48b8-a296-b9011ab73ef3/front");
//        cut.albumsGenerator(m, albumLamar);
//        assertTrue(true, "Yo look at albumsGenerator()");
//
//    }
}