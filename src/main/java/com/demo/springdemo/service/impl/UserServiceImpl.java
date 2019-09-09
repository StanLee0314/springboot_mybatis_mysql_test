package com.demo.springdemo.service.impl;

import com.demo.springdemo.dao.IUserDao;
import com.demo.springdemo.model.User;
import com.demo.springdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李宇轩
 */
@SuppressWarnings("ALL")
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public List<User> selectUsers() {
        return userDao.selectUsers();
    }

    @Override
    public User selectUserById(int id) {
        return userDao.selectUserById(id);
    }
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
