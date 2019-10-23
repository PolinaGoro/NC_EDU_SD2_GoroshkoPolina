package com.netcracker.polina.bebackend.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class User {
    public User(){
        User user = new User("", "")
                .setIdUser(2)
                .setEmail("");
    }
    public User(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    private int idUser;
    private String nickname;
    private String firstname;
    private String secondname;
    private boolean isAdmin;
    private String aboutYourself;

    public int getIdUser() {
        return idUser;
    }

    public User setIdUser(int idUser) {
        this.idUser = idUser;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public User setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public User setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getSecondname() {
        return secondname;
    }

    public User setSecondname(String secondname) {
        this.secondname = secondname;
        return this;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public User setAdmin(boolean admin) {
        isAdmin = admin;
        return this;
    }

    public String getAboutYourself() {
        return aboutYourself;
    }

    public User setAboutYourself(String aboutYourself) {
        this.aboutYourself = aboutYourself;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public User setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    private String password;
    private String status;
    private String email;

}
