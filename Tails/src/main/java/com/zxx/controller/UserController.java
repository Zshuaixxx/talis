package com.zxx.controller;

import com.zxx.pojo.Emp;
import com.zxx.pojo.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 帅的被人砍
 * @create 2024-08-29 20:13
 */
@RestController
public class UserController {

    /*登录功能*/
    @PostMapping("/login")
    public Result login(Emp emp){
        return Result.success();
    }
}
