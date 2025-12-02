package com.example.mapper;

import com.example.pojo.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 员工管理
 */
@Mapper
public interface EmpMapper {
//    /**
//     * 查询总记录数
//     * @return 总记录数
//     */
//    @Select("select count(*) from emp")
//    public Long count();
//
//    /**
//     * 查询员工列表
//     * @param start 起始位置
//     * @param pageSize 每页显示的条数
//     * @return 员工列表
//     */
//    @Select("select * from emp limit #{start},#{pageSize}")
//    public List<Emp> page(Integer start,Integer pageSize);

    @Select("select * from emp")
    public List<Emp> list();


    /**
     * 新增员工
     * @param emp
     */
    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time)  " +
            "values(#{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime})")
    void insert(Emp emp);


    /**
     * 批量删除
     * @param ids
     */
    void delete(List<Integer> ids);

    /**
     * 根据id查询员工
     * @param id
     * @return
     */
    @Select("select * from emp where id = #{id}")
    Emp getById(Integer id);

    /**
     * 更新员工
     * @param emp
     */
    void update(Emp emp);

    /**
     * 根据用户名和密码来查询员工
     * @param emp
     * @return
     */
    @Select("Select * from emp where username = #{username} and password = #{password}")
    Emp getByUserNameAndPassword(Emp emp);

    /**
     * 根据部门id来删除该部门的员工
     * @param deptId
     */
    @Delete("delete from emp where dept_id= #{deptId}")
    void deleteByDeptId(Integer deptId);
}
