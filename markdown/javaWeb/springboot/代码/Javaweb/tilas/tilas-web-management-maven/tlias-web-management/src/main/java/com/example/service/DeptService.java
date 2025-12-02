package com.example.service;

import com.example.pojo.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 查询全部部门数据
     * @return
     */
    List<Dept> list();

    /**
     * 根据id删除部门
     * @param id
     * @return 影响数据条数
     */
    void delete(Integer id);

    /**
     * 添加部门
     * @param dept
     * @return
     */
    void add(Dept dept);

    void update(Dept dept);

    Dept getByID(Integer id);
}
