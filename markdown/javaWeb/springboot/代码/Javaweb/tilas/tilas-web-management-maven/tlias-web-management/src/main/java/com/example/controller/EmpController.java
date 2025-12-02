package com.example.controller;

import com.example.anno.Log;
import com.example.pojo.Emp;
import com.example.pojo.PageBean;
import com.example.pojo.Result;
import com.example.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 员工管理
 */
@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {
    @Autowired
    private EmpService empService;

    //分页查询
    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize){
        log.info("分页查询员工信息,参数：{},{}",page,pageSize);
        //调用service分页查询
        PageBean pageBean=empService.page(page,pageSize);
        return Result.success(pageBean);
    }

    //批量删除
    @Log
    @DeleteMapping("/{ids}")
    public Result Delete(@PathVariable List<Integer> ids){
        log.info("批量删除员工信息,参数：{}",ids);
        //调用service批量删除
        empService.delete(ids);
        return Result.success();
    }

    //
    @Log
    @PostMapping
    public Result save (@RequestBody Emp emp){
        log.info("保存员工信息,参数：{}",emp);
        empService.save(emp);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getByID( @PathVariable Integer id){
        log.info("根据id查询员工信息,参数：{}",id);
        Emp emp=empService.getByID(id);
        return Result.success(emp);
    }

    @Log
    @PutMapping()
    public Result update(@RequestBody Emp emp){
        log.info("修改员工信息,参数：{}",emp);
        empService.update(emp);
        return Result.success();
    }


}
