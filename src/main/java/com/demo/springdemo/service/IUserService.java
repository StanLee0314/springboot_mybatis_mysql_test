package com.demo.springdemo.service;

import com.demo.springdemo.model.User;

import java.util.List;

public interface IUserService {
    List<User> selectUsers();
    User selectUserById(int id);
    void addUser(User user);
    void deleteUser(int id);
    void updateUser(User user);
}
