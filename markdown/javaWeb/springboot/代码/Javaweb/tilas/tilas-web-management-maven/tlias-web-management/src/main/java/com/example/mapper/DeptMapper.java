package com.example.mapper;

import com.example.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface DeptMapper {
    /**
     * 查询全部部门数据
     * @return
     */
    @Select("select * from dept")
    List<Dept> list();

    /**
     * 根据id删除部门
     * @param id
     * @return 影响数据条数
     */
    @Delete("delete from dept where id = #{id}")
    int delete(Integer id);

    @Insert("insert into dept(name,create_time,update_time) values(#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);

    @Update("update dept set name= #{name},update_time = #{updateTime} where id = #{id}")
    void update(Dept dept);

    @Select("select * from dept where id = #{id}")
    Dept getByID(Integer id);
}
