package com.zxx.service.impl;

import com.zxx.mapper.DeptMapper;
import com.zxx.pojo.Dept;
import com.zxx.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
@author 帅的被人砍
@create 2024-08-28 14:01
*/
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }

    @Override
    public boolean deleteDeptById(Integer id) {
        return deptMapper.deleteDeptById(id);
    }

    @Override
    public boolean addDept(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept selectDeptById(Integer id) {
        return deptMapper.selectDeptById(id);
    }
}
