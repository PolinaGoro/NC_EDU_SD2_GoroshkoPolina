package com.netcracker.backend.entity;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "post")
public class Post {
    @Id
    private long idPost;
    private long idUser;
    private String text;
    private String photoUrl;
    private String location;

    public long getIdPost() {
        return idPost;
    }

    public Post setIdPost(long idPost) {
        this.idPost = idPost;
        return this;
    }

    public long getIdUser() {
        return idUser;
    }

    public Post setIdUser(long idUser) {
        this.idUser = idUser;
        return this;
    }

    public String getText() {
        return text;
    }

    public Post setText(String text) {
        this.text = text;
        return this;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public Post setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public Post setLocation(String location) {
        this.location = location;
        return this;
    }
}
