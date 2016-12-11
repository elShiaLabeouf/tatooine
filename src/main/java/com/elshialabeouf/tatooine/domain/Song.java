package com.elshialabeouf.tatooine.domain;

import javax.persistence.*;

/**
 * Created by admin on 15.11.2016.
 */

@Entity
@Table(name="Songs")
public class Song {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="artist")
    private Long artist_id;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(Long artist_id) {
        this.artist_id = artist_id;
    }
}
