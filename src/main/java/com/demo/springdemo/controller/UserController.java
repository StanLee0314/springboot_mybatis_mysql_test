package com.demo.springdemo.controller;

import com.demo.springdemo.model.User;
import com.demo.springdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 李宇轩
 */
@RestController
@RequestMapping(value = "/test")
@EnableAutoConfiguration
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/allusers")
    public List<User> getUsers() {
        return userService.selectUsers();
    }

    @RequestMapping(value = "/selectbyid")
    public User selectUserById(String id) {
        return  userService.selectUserById(Integer.parseInt(id));

    }

    @RequestMapping(value = "/adduser")
    public void addUser(User user) {
        userService.addUser(user);
    }
    @RequestMapping(value = "/deleteuserbyid")
    public void deleteUser(String id) {
        userService.deleteUser(Integer.parseInt(id));
    }
    @RequestMapping(value = "/updateuser")
    public void updateUser(User user) {
        userService.updateUser(user);
    }
}