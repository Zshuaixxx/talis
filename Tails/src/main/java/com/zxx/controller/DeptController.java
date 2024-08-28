package com.zxx.controller;

import com.zxx.pojo.Dept;
import com.zxx.pojo.Result;
import com.zxx.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /*删除指定部门*/
    @DeleteMapping("/depts/{id}")
    public Result deleteDeptById(@PathVariable Integer id){
        boolean res=deptService.deleteDeptById(id);
        if(res) {
            log.info("删除部门成功");
            return Result.success();
        }
        log.info("删除失败");
        return Result.error("删除失败");
    }

    /*添加部门*/
    @PostMapping("/depts")
    public Result addDept(@RequestBody Dept dept){
        boolean res=deptService.addDept(dept);
        if(res){
            return Result.success();
        }
        return Result.error("添加失败");
    }

    /*根据id查询部门信息*/
    @GetMapping("/depts/getDept")
    public Result selectDeptById(@RequestParam (value = "id",required = false)Integer id){
        return Result.success(deptService.selectDeptById(id));
    }
}
