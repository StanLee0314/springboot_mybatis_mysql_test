package com.demo.springdemo.dao;

import com.demo.springdemo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface IUserDao {
    List<User> selectUsers();
}
