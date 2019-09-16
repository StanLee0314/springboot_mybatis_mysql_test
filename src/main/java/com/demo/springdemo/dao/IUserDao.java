package com.demo.springdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.springdemo.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
/**
 * @author 李宇轩
 */
@Mapper
public interface IUserDao extends BaseMapper<User> {
    /**
     * select all users from database
     * @return List<User>
     */
    List<User> listUsers();

}
