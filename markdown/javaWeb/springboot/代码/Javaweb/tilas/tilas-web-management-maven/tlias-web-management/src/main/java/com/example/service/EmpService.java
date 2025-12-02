package com.example.service;

import com.example.pojo.Emp;
import com.example.pojo.PageBean;

import java.util.List;

public interface EmpService {
    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */
    PageBean page(Integer page, Integer pageSize);

    /**
     * 批量删除员工
     * @param ids
     */
    void delete(List<Integer> ids);

    /**
     * 新增员工
     * @param emp
     */
    void save(Emp emp);

    /**
     * 根据id查询员工
     * @param id
     * @return
     */
    Emp getByID(Integer id);

    /**
     * 更新员工信息
     * @param emp
     */
    void update(Emp emp);

    Emp login(Emp emp);
}
