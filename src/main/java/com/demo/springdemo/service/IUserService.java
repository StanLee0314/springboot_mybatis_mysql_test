package com.demo.springdemo.service;

import com.demo.springdemo.model.User;

import java.util.List;

/**
 * @author 李宇轩
 */
public interface IUserService {
    /**
     * select all users from database
     * @return List<User> 用户列表
     */
    List<User> listUsers();

    /**
     * select a user by id
     * @param id userid
     * @return user信息
     */
    User  getUserById(int id);

    /**
     * 添加用户
     * @param user
     * user对象
     */
    void insertUser(User user);

    /**s
     * 删除用户
     * @param id 用户id
     */
    void deleteUser(int id);


    /**
     * 更新用户
     * @param user user对象
     * @param id 用户id
     */
    void updateUser(User user);
}
