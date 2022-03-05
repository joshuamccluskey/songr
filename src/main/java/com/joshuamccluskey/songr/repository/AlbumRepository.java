package com.joshuamccluskey.songr.repository;

import com.joshuamccluskey.songr.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

// Step 4: Repository interface make sure to put model class and data type of ID.
public interface AlbumRepository extends JpaRepository<Album, Long> {
    //Step 5: ***MAKE SURE NAME IS THE EXACT SAME AS VARIABLE NAME IN CLASS OR IT WON'T WORK***Magic Stuff
    public Album findById(long id);

}
