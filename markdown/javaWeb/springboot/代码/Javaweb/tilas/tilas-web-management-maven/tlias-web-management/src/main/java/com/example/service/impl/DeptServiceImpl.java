package com.example.service.impl;

import com.example.anno.MyLog;
import com.example.mapper.DeptMapper;
import com.example.mapper.EmpMapper;
import com.example.pojo.Dept;
import com.example.pojo.DeptLog;
import com.example.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    @Autowired
    private EmpMapper empMapper;

    @Autowired
    private DeptLogServiceImpl deptLogMapper;

    @MyLog
    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }

    @MyLog
    @Transactional(rollbackFor = Exception.class)//spring事务管理
    @Override
    public void delete(Integer id) {
        try {
            deptMapper.delete(id);//根据id删除部门

            empMapper.deleteByDeptId(id);//根据部门id删除员工信息
        } finally {
            DeptLog deptLog = new DeptLog();
            deptLog.setCreateTime(LocalDateTime.now());
            deptLog.setDescription("执行了解散部门的操作，此次解散的部门是"+id+"号部门");
            deptLogMapper.insert(deptLog);
        }
    }

    @Override
    public void add(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.insert(dept);
    }

    @Override
    public void update(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.update(dept);
    }

    @Override
    public Dept getByID(Integer id) {
        return deptMapper.getByID(id);
    }

}
