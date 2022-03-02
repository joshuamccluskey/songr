package com.joshuamccluskey.songr.repository;

import com.joshuamccluskey.songr.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {

    public Album findByTitle(String title);
}
