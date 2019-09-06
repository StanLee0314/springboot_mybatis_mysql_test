package com.demo.springdemo.service.impl;

import com.demo.springdemo.dao.IUserDao;
import com.demo.springdemo.model.User;
import com.demo.springdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    public List<User> selectUsers() {
        return userDao.selectUsers();
    }
}
