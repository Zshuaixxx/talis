package com.zxx.controller;

import com.zxx.pojo.Result;
import com.zxx.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 帅的被人砍
 * @create 2024-08-28 13:57
 */

/*
* 用户管理controller
*/
@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    /*分页查询员工信息*/
    @GetMapping("/emps")
    public Result getEmps(@RequestParam (value = "page",required = false,defaultValue = "1") Integer page,
                          @RequestParam (value = "pageSize",required = false,defaultValue = "10") Integer pageSize){
        return Result.success(empService.getEmps(page,pageSize));
    }
}
