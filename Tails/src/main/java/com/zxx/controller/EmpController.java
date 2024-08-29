package com.zxx.controller;

import com.zxx.pojo.Result;
import com.zxx.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


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
                          @RequestParam (value = "pageSize",required = false,defaultValue = "10") Integer pageSize,
                          String name, Short gender,
                          @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                          @DateTimeFormat(pattern = "yyyy-MM-dd")LocalDate end){
        return Result.success(empService.getEmps(page,pageSize,name,gender,begin,end));
    }

    /*删除员工  支持批量删除*/
    @DeleteMapping("/deleteEmps")
    public Result deleteEmps(@RequestBody List<Integer> ids){
        Integer ans=empService.deleteEmps(ids);
        if(ans>0){
            return Result.success(ans);
        }
        return Result.error("删除失败");
    }
}
