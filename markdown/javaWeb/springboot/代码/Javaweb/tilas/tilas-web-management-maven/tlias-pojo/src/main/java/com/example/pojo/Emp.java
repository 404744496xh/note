package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {  //员工表
  private long id;  //ID
  private String username;  //用户名
  private String password;  //密码
  private String name;  //姓名
  private long gender;  //性别, 说明: 1 男, 2 女
  private String image;   //图像
  private long job; //职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管, 5 咨询师
  private java.sql.Date entrydate;  //入职时间
  private long deptId;  //部门ID
  private LocalDateTime createTime;  //创建时间
  private LocalDateTime updateTime;  //修改时间
}
