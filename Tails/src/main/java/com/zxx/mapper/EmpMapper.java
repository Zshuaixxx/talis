package com.zxx.mapper;

import com.zxx.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 帅的被人砍
 * @create 2024-08-28 13:58
 */
@Mapper
public interface EmpMapper {

    @Select("select count(*) from emp")
    Long count();

    @Select("select username, name, gender, image, job, entrydate, dept_id, create_time, update_time from emp limit #{start},#{pageSize}")
    List<Emp> getEmps(Integer start, Integer pageSize);
}
