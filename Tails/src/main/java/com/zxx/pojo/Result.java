package com.zxx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 帅的被人砍
 * @create 2024-08-28 17:51
 */

/*
* 返回对象
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code;//响应码，200 表示成功
    private String msg;//响应信息 描述响应结果
    private Object data;//返回的数据

    /*增删改 成功响应*/
    public static Result success(){
        return new Result(200,"成功",null);
    }
    /*查询 成功响应*/
    public static Result success(Object data){
        return new Result(200,"成功",data);
    }
    /*失败响应*/
    public static Result error(String msg){
        return new Result(400,msg,null);
    }
}
