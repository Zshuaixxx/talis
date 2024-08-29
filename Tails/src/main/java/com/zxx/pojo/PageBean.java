package com.zxx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 帅的被人砍
 * @create 2024-08-29 09:19
 */

/*
*分页查询结果实体类
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageBean<T> {
    private Long total;//总记录数
    private List<T> rows;
}
