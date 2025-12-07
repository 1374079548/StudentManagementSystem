package com.example.sprringbootdemo.model.system;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true) //生成包含父类属性的 equals() 和 hashCode() 方法。
@Accessors(chain = true) //让实体类的 Setter 方法返回当前对象本身，实现 “链式调用”
public class SysOperLog extends Model {
    private static final long serialVersionUID = 1L;

}
