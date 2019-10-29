package com.netcracker.backend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hashtag")
public class Hashtag {
    @Id
    private String text;
    private long idPost;

    public String getText() {
        return text;
    }

    public Hashtag setText(String text) {
        this.text = text;
        return this;
    }

    public long getIdPost() {
        return idPost;
    }

    public Hashtag setIdPost(long idPost) {
        this.idPost = idPost;
        return this;
    }
}
