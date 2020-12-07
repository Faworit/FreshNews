package com.ryabtsev.dao;

import com.ryabtsev.entity.User;

import java.util.List;

public interface UserDao {
    User findById(int id);
    User findByMail(String mail);
    void save(User user);
    void delete(User user);
    void update(User user);
    List<User> findAll();
}
