package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept { //部门表
  private long id;  //主键ID
  private String name;  //部门名称
  private LocalDateTime createTime; //创建时间
  private LocalDateTime updateTime; //修改时间
}
