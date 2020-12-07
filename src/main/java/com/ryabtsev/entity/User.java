package com.ryabtsev.entity;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User extends Human {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "password")
    private String password;
    @Column(name = "username")
    private String username;
    @Column(name = "isBlock")
    private boolean isBlock;

    public User() {
    }

    public User(String name, String surname, String password, String username, boolean isBlock) {
        super(name, surname);
        this.username = username;
        this.isBlock = isBlock;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String mail) {
        this.username = mail;
    }

    public boolean getIsBlock() {
        return isBlock;
    }

    public void setIsBlock(boolean block) {
        isBlock = block;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
