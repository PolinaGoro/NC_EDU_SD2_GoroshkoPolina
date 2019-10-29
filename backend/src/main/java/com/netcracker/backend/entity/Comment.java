package com.netcracker.backend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    private long idComment;
    private String text;
    private Date data;
    private long aidPost;
    private long idUser;

    public long getIdComment() {
        return idComment;
    }

    public Comment setIdComment(long idComment) {
        this.idComment = idComment;
        return this;
    }

    public String getText() {
        return text;
    }

    public Comment setText(String text) {
        this.text = text;
        return this;
    }

    public Date getData() {
        return data;
    }

    public Comment setData(Date data) {
        this.data = data;
        return this;
    }

    public long getAidPost() {
        return aidPost;
    }

    public Comment setAidPost(long aidPost) {
        this.aidPost = aidPost;
        return this;
    }

    public long getIdUser() {
        return idUser;
    }

    public Comment setIdUser(long idUser) {
        this.idUser = idUser;
        return this;
    }
}
