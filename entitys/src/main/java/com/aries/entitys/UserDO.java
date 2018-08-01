package com.aries.entitys;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName("t_user")
@Data
public class UserDO implements Serializable {
    @TableId
    private String id;
    private String name;
    private Integer age;
    @TableLogic
    private Boolean deleted;
}
