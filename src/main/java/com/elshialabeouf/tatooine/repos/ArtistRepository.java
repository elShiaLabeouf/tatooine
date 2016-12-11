package com.elshialabeouf.tatooine.repos;

import com.elshialabeouf.tatooine.domain.Artist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 22.11.2016.
 */
@Repository
public interface ArtistRepository extends CrudRepository<Artist, Long>{
    Artist findByName(String name);
    Artist[] findBySubstyle(String substyle);
}
