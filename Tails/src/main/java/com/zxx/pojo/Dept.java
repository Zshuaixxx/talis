package com.zxx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author 帅的被人砍
 * @create 2024-08-28 13:58
 */

/*
* 部门实体类
* */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private  Integer id;//ID
    private String name;//部门名称
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//修改时间
}
