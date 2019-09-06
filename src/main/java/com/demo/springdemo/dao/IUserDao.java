package com.demo.springdemo.dao;

import com.demo.springdemo.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface IUserDao {
    @Select("select * from user")
    List<User> selectUsers();
    @Select("select * from user where id = #{id}")
     User selectUserById(int id);
    @Insert("insert into user(id,name,age) values(#{id},#{name},#{age})")
     void addUser(User user);
    @Delete("delete from user where id = #{id}")
    void deleteUser(int id);
    @Update("update user set name= #{name}, age = #{age} where id=#{id}")
    void updateUser(User user);
}
