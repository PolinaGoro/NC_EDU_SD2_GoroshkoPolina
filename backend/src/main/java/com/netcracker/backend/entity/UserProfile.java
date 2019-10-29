package com.netcracker.backend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserProfile {

    @Id
    private long idUser;
    private String nickname;
    private String firstname;
    private String secondname;
    private boolean isAdmin;
    private String aboutYourself;
    private String password;
    private String status;
    private String email;

    public long getIdUser() {
        return idUser;
    }

    public UserProfile setIdUser(long idUser) {
        this.idUser = idUser;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public UserProfile setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public UserProfile setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getSecondname() {
        return secondname;
    }

    public UserProfile setSecondname(String secondname) {
        this.secondname = secondname;
        return this;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public UserProfile setAdmin(boolean admin) {
        isAdmin = admin;
        return this;
    }

    public String getAboutYourself() {
        return aboutYourself;
    }

    public UserProfile setAboutYourself(String aboutYourself) {
        this.aboutYourself = aboutYourself;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserProfile setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UserProfile setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserProfile setEmail(String email) {
        this.email = email;
        return this;
    }

}
