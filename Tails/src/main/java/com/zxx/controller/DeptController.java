package com.zxx.controller;

import com.zxx.pojo.Result;
import com.zxx.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 帅的被人砍
 * @create 2024-08-28 13:56
 */

/*
* 部门管理controller
*/
@Slf4j
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    /*查询全部部门*/
    @GetMapping("/depts")
    public Result list(){
        log.info("查询全部部门信息");
        return Result.success(deptService.list());
    }
}
