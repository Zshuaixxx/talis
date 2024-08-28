package com.zxx.service;

import com.zxx.pojo.Dept;
import com.zxx.pojo.Result;

import java.util.List;

/**
@author 帅的被人砍
@create 2024-08-28 14:00
*/

public interface DeptService {

    /*获取全部部门数据*/
    List<Dept> list();

    /*删除指定部门*/
    boolean deleteDeptById(Integer id);

    /*添加部门*/
    boolean addDept(Dept dept);

    Dept selectDeptById(Integer id);
}
