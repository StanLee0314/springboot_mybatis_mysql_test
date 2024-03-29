package com.demo.springdemo.service.impl;

import com.demo.springdemo.dao.IUserDao;
import com.demo.springdemo.model.User;
import com.demo.springdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Override
    public User getUserById(int id) {
        return userDao.selectById(id);
    }
    @Override
    public void insertUser(User user) {
        userDao.insert(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteById(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateById(user);
    }
}
