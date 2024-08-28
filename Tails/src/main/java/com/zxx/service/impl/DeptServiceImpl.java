package com.zxx.service.impl;

import com.zxx.mapper.DeptMapper;
import com.zxx.pojo.Dept;
import com.zxx.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
