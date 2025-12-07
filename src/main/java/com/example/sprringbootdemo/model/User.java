package com.example.sprringbootdemo.model;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Accessors(chain = true)
public class User {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.UUID)
    private String id;

    @TableField(value = "user_no")
    private String userNo;

    /**
     * 姓名
     */
    private String name;

    @TableField(exist = false)
    private String username;


    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String gender;

    @TableField(exist = false)
    private String genderName;

    /**
     * 生日
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd")
    private Date birthday;

    /**
     * 地址
     */
    private String address;

    private String phone;

    /**
     * 年级
     */
    private String grade;

    @TableField(exist = false)
    private String gradeName;

    @TableField(exist = false)
    private String gradeClassName;

    @TableField(exist = false)
    private String className;
    @TableField(exist = false)
    private String classCount;

    /**
     * 班级
     */
    private String classs;

    private String status;

    @TableField(exist = false)
    private String statusName;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @TableField(value = "create_time",fill= FieldFill.INSERT)
    private LocalDateTime createTime;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @TableField(value = "update_time",fill= FieldFill.UPDATE)
    private LocalDateTime updateTime;


}
