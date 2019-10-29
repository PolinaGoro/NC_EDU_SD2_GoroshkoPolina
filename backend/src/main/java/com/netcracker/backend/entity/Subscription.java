package com.netcracker.backend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subcription")
public class Subscription {
    @Id
    private long idUser;

    private long hisSub;
    private long inHimSub;

    public long getIdUser() {
        return idUser;
    }

    public Subscription setIdUser(long idUser) {
        this.idUser = idUser;
        return this;
    }

    public long getHisSub() {
        return hisSub;
    }

    public Subscription setHisSub(long hisSub) {
        this.hisSub = hisSub;
        return this;
    }

    public long getInHimSub() {
        return inHimSub;
    }

    public Subscription setInHimSub(long inHimSub) {
        this.inHimSub = inHimSub;
        return this;
    }
}
