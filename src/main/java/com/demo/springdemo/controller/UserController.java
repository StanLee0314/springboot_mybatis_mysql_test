package com.demo.springdemo.controller;

import com.demo.springdemo.model.User;
import com.demo.springdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping(value = "/users/{id}")
    public User selectUserById(@PathVariable String id) {
        return  userService.getUserById(Integer.parseInt(id));

    }

    @RequestMapping(value = "/insert/{id}/{name}/{age}")
    public void addUser(User user,
                        @PathVariable String id,
                        @PathVariable String name,
                        @PathVariable String age) {
        userService.insertUser(user);
    }
    @RequestMapping(value = "/delete/{id}")
    public void deleteUser( @PathVariable String id) {
        userService.deleteUser(Integer.parseInt(id));
    }
    @RequestMapping(value = "/update/{id}/{name}/{age}")
    public void updateUser(User user,
                           @PathVariable String id,
                           @PathVariable String name,
                           @PathVariable String age) {
        userService.updateUser(user);
    }
}