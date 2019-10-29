package com.netcracker.backend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "complaint")
public class Complaint {
    @Id
    private long idComplaint;
    private long idPost;
    private String text;
    private String status;
    private long idUser;

    public long getIdComplaint() {
        return idComplaint;
    }

    public Complaint setIdComplaint(long idComplaint) {
        this.idComplaint = idComplaint;
        return this;
    }

    public long getIdPost() {
        return idPost;
    }

    public Complaint setIdPost(long idPost) {
        this.idPost = idPost;
        return this;
    }

    public String getText() {
        return text;
    }

    public Complaint setText(String text) {
        this.text = text;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Complaint setStatus(String status) {
        this.status = status;
        return this;
    }

    public long getIdUser() {
        return idUser;
    }

    public Complaint setIdUser(long idUser) {
        this.idUser = idUser;
        return this;
    }
}
