[TOC]

# SQL的分类

1、DDL(Data Definition Language) 数据定义语言，用来操作数据库、表、列等； 常用语句：CREATE、 ALTER、DROP
2、DML(Data Manipulation Language) 数据操作语言，用来操作数据库中表里的数据；常用语句：INSERT、 UPDATE、 DELETE
3、DCL(Data Control Language) 数据控制语言，用来操作访问权限和安全级别； 常用语句：GRANT、DENY
4、DQL(Data Query Language) 数据查询语言，用来查询数据 常用语句：SELECT

# 数据表插入数据（增）

## 1. 为表中所有字段插入数据

> INSERT INTO 表名（字段名1,字段名2,...) VALUES (值 1,值 2,...);

## 2. 为表中指定字段插入数据

> INSERT INTO 表名（字段名1,字段名2,...) VALUES (值 1,值 2,...);

插入数据的方法基本和为表中所有字段插入数据，一样，只是需要插入的字段由你自己指定

## 3. 同时插入多条记录

> INSERT INTO 表名 \[(字段名1,字段名2,...)]VALUES (值 1,值 2,…),(值 1,值 2,…),...;

在该方式中：(字段名1,字段名2,…)是可选的，它用于指定插人的字段名；(值 1,值 2,…),(值 1,值 2,…)表示要插人的记录，该记录可有多条并且每条记录之间用逗号隔开。

> 示例：insert into student (id,name,age,gender) values (2,'lucy',17,'female'),(3,'jack',19,'male'),(4,'tom',18,'male');

# 更新数据（改）

## 1. UPDATE基本语法

> UPDATE 表名 SET 字段名1=值1\[,字段名2 =值2,…] \[WHERE 条件表达式];

## 2. UPDATE更新部分数据

> update student set age=20,gender='female' where name='tom';
> 将name为tom的人的age，gender，更改

## 3. UPDATE更新全部数据

> update student set age=18;

# 删除数据

## 1. DELETE基本语法

> DELETE FROM 表名 \[WHERE 条件表达式];

## 2. DELETE删除部分数据

> delete from student where age=14;

## 3. DELETE删除全部数据

> delete from student;

## 4. TRUNCATE和DETELE的区别

TRUNCATE和DETELE都能实现删除表中的所有数据的功能，但两者也是有区别的：
1、DELETE语句后可跟WHERE子句，可通过指定WHERE子句中的条件表达式只删除满足条件的部分记录；但是，TRUNCATE语句只能用于删除表中的所有记录。
2、使用TRUNCATE语句删除表中的数据后，再次向表中添加记录时自动增加字段的默认初始值重新由1开始；使用DELETE语句删除表中所有记录后，再次向表中添加记录时自动增加字段的值为删除时该字段的最大值加1
3、DELETE语句是DML语句，TRUNCATE语句通常被认为是DDL语句

【truncate比较重要，必须掌握】

    //删除dept_bak表中的数据
    delete from dept_bak; //这种删除数据的方式比较慢。

    mysql> select * from dept_bak;
    Empty set (0.00 sec)

    delete语句删除数据的原理？（delete属于DML语句！！！）
    	表中的数据被删除了，但是这个数据在硬盘上的真实存储空间不会被释放！！！
    	这种删除缺点是：删除效率比较低。
    	这种删除优点是：支持回滚，后悔了可以再恢复数据！！！

    truncate语句删除数据的原理？
    	这种删除效率比较高，表被一次截断，物理删除。
    	这种删除缺点：不支持回滚。
    	这种删除优点：快速。

    用法：truncate table dept_bak; （这种操作属于DDL操作。）

    大表非常大，上亿条记录？？？？
    	删除的时候，使用delete，也许需要执行1个小时才能删除完！效率较低。
    	可以选择使用truncate删除表中的数据。只需要不到1秒钟的时间就删除结束。效率较高。
    	但是使用truncate之前，必须仔细询问客户是否真的要删除，并警告删除之后不可恢复！

    	truncate是删除表中的数据，表还在！

    删除表操作？
    	drop table 表名; // 这不是删除表中的数据，这是把表删除。

# 查找数据

[link](attachments/link)
