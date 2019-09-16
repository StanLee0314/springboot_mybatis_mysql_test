package com.demo.springdemo.controller;

import com.demo.springdemo.model.User;
import com.demo.springdemo.service.IUserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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
    @ApiOperation(value="获取所有用户详细信息", notes="获取用户详细信息")
    @GetMapping(value = "/users")
     public List<User> listUsers() {
        return userService.listUsers();
    }

    @ApiOperation(value="根据ID获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID",required = true)
    @GetMapping(value = "/users/{id}")
    public User selectUserById(@PathVariable String id) {
        return  userService.getUserById(Integer.parseInt(id));

    }

    @ApiOperation(value="添加用户", notes="添加用户姓名和年龄")
    @ApiImplicitParam(name = "user", value = "用户实体",required = true,dataType = "User")
    @PostMapping(value = "/insert")
    public void addUser(@RequestBody User user) {
        userService.insertUser(user);
    }

    @ApiOperation(value="根据ID删除用户详细信息", notes="根据url的id来删除用户")
    @DeleteMapping(value = "/delete/{id}")
    public void deleteUser( @PathVariable String id) {
        userService.deleteUser(Integer.parseInt(id));
    }


    @ApiOperation(value="更新用户", notes="更新用户姓名和年龄")
    @ApiImplicitParam(name = "user", value = "用户实体",required = true,dataType = "User")
    @PutMapping(value = "/update/{id}")
    public void updateUser(@PathVariable String id,@RequestBody User user) {
        user.setId(Integer.parseInt(id));
        userService.updateUser(user);
    }
}