package com.elshialabeouf.tatooine.domain;

import javax.persistence.*;

/**
 * Created by admin on 15.11.2016.
 */

@Entity
@Table(name="Artists")
public class Artist {

    @Id
    @Column(name="id")
    @GeneratedValue
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="substyle")
    private String substyle;

    public Long getId() {
        return id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubstyle() {
        return substyle;
    }

    public void setSubstyle(String substyle) {
        this.substyle = substyle;
    }
}
