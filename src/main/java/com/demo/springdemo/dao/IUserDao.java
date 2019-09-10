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
//    /**
//     * select a user by id
//     * @param id
//     * @return user信息
//     */
//    @Select("select * from user where id = #{id}")
//     User getUserById(int id);
//
//    /**
//     * 添加用户
//     * @param user
//     */
//    @Insert("insert into user(id,name,age) values(#{id},#{name},#{age})")
//     void insertUser(User user);
//
//    /**s
//     * 删除用户
//     * @param id
//     */
//    @Delete("delete from user where id = #{id}")
//    void deleteUser(int id);
//
//    /**
//     * 更新用户
//     * @param user
//     */
//    @Update("update user set name= #{name}, age = #{age} where id=#{id}")
//    void updateUser(User user);
}
