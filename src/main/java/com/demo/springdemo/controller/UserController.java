package com.demo.springdemo.controller;

import com.demo.springdemo.model.User;
import com.demo.springdemo.service.IUserService;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 李宇轩
 */
@RestController
@RequestMapping(value = "/usercontroller/api/v1")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping(value = "/users")
     public List<User> listUsers() {
        return userService.listUsers();
    }

    @GetMapping(value = "/users/{id}")
    public User selectUserById(@PathVariable String id) {
        return  userService.getUserById(Integer.parseInt(id));

    }

    @PutMapping(value = "/insert")
    public void addUser(User user) {
        userService.insertUser(user);
    }
    @DeleteMapping(value = "/delete/{id}")
    public void deleteUser( @PathVariable String id) {
        userService.deleteUser(Integer.parseInt(id));
    }
    @PostMapping(value = "/update/{id}")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }
}