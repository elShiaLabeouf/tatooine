package com.elshialabeouf.tatooine.domain;

import javax.persistence.*;


/**
 * Created by admin on 01.11.2016.
 */

@Entity
@Table(name="Accounts")
public class Account {
    @Id
    @Column(name="id")
    @GeneratedValue
    private Long id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="email")
    private String email;

    public Long getId(){
        return id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }


}
