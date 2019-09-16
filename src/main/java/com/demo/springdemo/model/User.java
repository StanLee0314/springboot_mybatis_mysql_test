package com.demo.springdemo.model;
//User类

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author 李宇轩
 */
@Data
@TableName(value = "User")
public class User {

    private int id;
    private int age;
    private String name;
}
