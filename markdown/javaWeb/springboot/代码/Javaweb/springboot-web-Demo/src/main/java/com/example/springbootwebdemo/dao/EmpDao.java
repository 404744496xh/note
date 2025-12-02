package com.example.springbootwebdemo.dao;

import com.example.springbootwebdemo.pojo.Emp;
import java.util.List;

public interface EmpDao {
    //获取员工列表数据
    public List<Emp> listEmp();
}
