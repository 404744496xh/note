
package com.example.service.impl;

import com.example.mapper.EmpMapper;
import com.example.pojo.Emp;
import com.example.pojo.PageBean;
import com.example.service.EmpService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public PageBean page(Integer page, Integer pageSize) {
//        //1.获取总记录数
//        Long count=empMapper.count();
//
//        //2.获取查询结果列表
//        Integer start=(page-1)*pageSize;
//        List<Emp> empList = empMapper.page(start,pageSize);
//
//        //3.将分页查询的结果封装到PageBean对象中
//        PageBean pageBean= new PageBean(count,empList);
//        return pageBean;

        //1.设置分页参数
        PageHelper.startPage(page,pageSize);

        //2.执行查询操作
        List<Emp> empList = empMapper.list();
        Page<Emp> p=(Page<Emp>)empList;

        //3.将分页查询的结果封装到PageBean对象中
        PageBean pageBean= new PageBean(p.getTotal(),p.getResult() );
        return pageBean;
    }

    @Override
    public void delete(List<Integer> ids) {
        empMapper.delete(ids);
    }

    @Override
    public void save(Emp emp) {
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.insert(emp);
    }

    @Override
    public Emp getByID(Integer id) {
        return empMapper.getById(id);
    }

    @Override
    public void update(Emp emp) {
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.update(emp);
    }

    @Override
    public Emp login(Emp emp) {
        return empMapper.getByUserNameAndPassword(emp);
    }
}
