package com.zxx.mapper;

import com.zxx.pojo.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

/**
 * @author 帅的被人砍
 * @create 2024-08-28 13:58
 */
@Mapper
public interface EmpMapper {

    @Select("select count(*) from emp")
    Long count();


    List<Emp> getEmps(Integer start, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end);

    Integer deleteEmps(List<Integer> ids);

    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
            "VALUES(#{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime}) ")
    void addEmp(Emp emp);

    @Select("select * from emp where id=#{id}")
    Emp getEmpById(Integer id);

    void updateEmp(Emp emp);

    @Delete("delete from emp where dept_id=#{id}")
    void deleteEmpsByDeptID(Integer id);
}
