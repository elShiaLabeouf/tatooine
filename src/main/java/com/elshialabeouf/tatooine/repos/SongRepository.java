package com.elshialabeouf.tatooine.repos;

import com.elshialabeouf.tatooine.domain.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 22.11.2016.
 */

@Repository
public interface SongRepository extends CrudRepository<Song, Long> {

    Song findByName(String name);
    Song[] findByArtistName(String artistName);
}
