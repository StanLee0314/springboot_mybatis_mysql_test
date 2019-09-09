package com.demo.springdemo.service;

import com.demo.springdemo.model.User;

import java.util.List;

/**
 * @author 李宇轩
 */
public interface IUserService {
    /**
     * select all users from database
     * @return List<User>
     */
    List<User> selectUsers();

    /**
     * select a user by id
     * @param id
     * userid
     * @return user信息
     */
    User selectUserById(int id);

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    /**s
     * 删除用户
     * @param id
     */
    void deleteUser(int id);


    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);
}
