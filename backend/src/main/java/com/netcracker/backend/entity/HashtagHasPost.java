package com.netcracker.backend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hashtag_has_post")
public class HashtagHasPost {
    private String hashTag;
    private long idPost;

    public String getHashTag() {
        return hashTag;
    }

    public HashtagHasPost setHashTag(String hashTag) {
        this.hashTag = hashTag;
        return this;
    }

    public long getIdPost() {
        return idPost;
    }

    public HashtagHasPost setIdPost(long idPost) {
        this.idPost = idPost;
        return this;
    }
}
