package com.zxx.mapper;

import com.zxx.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 帅的被人砍
 * @create 2024-08-28 13:57
 */
@Mapper
public interface DeptMapper {
    /*查询全部部门信息*/
    @Select("select * from dept")
    List<Dept> list();
    
    @Delete("delete from dept where id=#{id}")
    boolean deleteDeptById(Integer id);

    @Insert("insert into dept (name,create_time,update_time) values (#{name},#{createTime},#{updateTime})")
    boolean addDept(Dept dept);

    @Select("select * from dept where id=#{id}")
    Dept selectDeptById(Integer id);

    @Update("update dept set name=#{name},update_time=#{updateTime} where id=#{id}")
    Integer updateDept(Dept dept);
}
