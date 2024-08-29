package com.zxx.service;

import com.zxx.pojo.Emp;
import com.zxx.pojo.PageBean;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 帅的被人砍
 * @create 2024-08-28 14:01
 */

public interface EmpService {

    /*分页查询员工信息*/
    PageBean<Emp> getEmps(Integer page, Integer pageSize);
}
