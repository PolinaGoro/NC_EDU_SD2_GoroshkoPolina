package com.netcracker.backend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "like")
public class Like {
    @Id
    private long idLike;
    private long idComment;
    private long idPost;
    private long idUser;

    public long getIdLike() {
        return idLike;
    }

    public Like setIdLike(long idLike) {
        this.idLike = idLike;
        return this;
    }

    public long getIdComment() {
        return idComment;
    }

    public Like setIdComment(long idComment) {
        this.idComment = idComment;
        return this;
    }

    public long getIdPost() {
        return idPost;
    }

    public Like setIdPost(long idPost) {
        this.idPost = idPost;
        return this;
    }

    public long getIdUser() {
        return idUser;
    }

    public Like setIdUser(long idUser) {
        this.idUser = idUser;
        return this;
    }
}
