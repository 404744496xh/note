package com.example.controller;

import com.example.anno.Log;
import com.example.pojo.Dept;
import com.example.pojo.Result;
import com.example.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 *  部门管理Controller
 */
@Slf4j//日志记录
@RestController
public class DeptController {
    //日志记录器
    //private Logger log= LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private DeptService deptService;

    //@RequestMapping(value = "/depts",method = RequestMethod.GET)//指定请求方式为GET
    @GetMapping("/depts")
    public Result list(){
        log.info("查询全部部门数据");
        //调用service的方法查询全部部门数据
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    @Log
    @DeleteMapping("/depts/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除部门数据，id为：{}",id);
        //调用service的方法删除指定id的部门数据
        deptService.delete(id);
        return Result.success();
    }

    @Log
    @PostMapping("/depts")
    public Result add(@RequestBody Dept dept){
        log.info("添加部门数据：{}",dept);
        //调用service的方法添加指定id的部门数据
        deptService.add(dept);
        return Result.success();
    }

    @GetMapping("/depts/{id}")
    public Result getByID(@PathVariable Integer id){
        log.info("获得部门id:{}",id);
        //调用service的方法获得部门id
        Dept dept = deptService.getByID(id);
        return Result.success(dept);
    }

    @Log
    @PutMapping("/depts")
    public Result update(@RequestBody Dept dept){
        log.info("修改部门数据:{}",dept);
        //调用service的方法修改指定id的部门数据
        deptService.update(dept);
        return Result.success();
    }
}
