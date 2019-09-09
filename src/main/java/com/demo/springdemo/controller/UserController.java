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
@RequestMapping(value = "/usercontroller/api/v1")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/users")
     public List<User> listUsers() {
        return userService.listUsers();
    }

    @RequestMapping(value = "/user")
    public User selectUserById(String id) {
        return  userService.getUserById(Integer.parseInt(id));

    }

    @RequestMapping(value = "/adduser")
    public void addUser(User user) {
        userService.insertUser(user);
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