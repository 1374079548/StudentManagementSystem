package com.example.sprringbootdemo.model.system;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true) //生成包含父类属性的 equals() 和 hashCode() 方法。
@Accessors(chain = true) //让实体类的 Setter 方法返回当前对象本身，实现 “链式调用”
public class SysOperLog extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 操作状态
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;

    /**
     * 模块标题
     */
    private String title;


    private String method;

    private String ipAddress;

    /**
     * 方法名称
     */
    private String uri;

    /**
     * 操作状态（0：正常，1：异常）
     */
    private String status;

    /**
     * 参数
     */
    private String resParam;

    private String reqParam;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    private String userId;

    private String username;
}
