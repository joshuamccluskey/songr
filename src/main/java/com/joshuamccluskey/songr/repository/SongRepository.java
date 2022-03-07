package com.joshuamccluskey.songr.repository;

import com.joshuamccluskey.songr.model.Song;
import com.joshuamccluskey.songr.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
