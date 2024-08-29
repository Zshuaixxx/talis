package com.zxx.service.impl;

import com.zxx.mapper.EmpMapper;
import com.zxx.pojo.Emp;
import com.zxx.pojo.PageBean;
import com.zxx.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Service;

/**
 * @author 帅的被人砍
 * @create 2024-08-28 14:01
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;
    @Override
    public PageBean<Emp> getEmps(Integer page,Integer pageSize) {
        PageBean<Emp> pageBean=new PageBean<>();
        pageBean.setTotal(empMapper.count());
        pageBean.setRows(empMapper.getEmps((page-1)*pageSize,pageSize));
        return pageBean;
    }
}
