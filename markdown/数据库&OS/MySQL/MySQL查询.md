
先准备测试数据，代码如下：

> \-- 创建数据库
> DROP DATABASE IF EXISTS mydb;
> CREATE DATABASE mydb;
> USE mydb;
>
> \-- 创建student表
> CREATE TABLE student (
> sid CHAR(6),
> sname VARCHAR(50),
> age INT,
> gender VARCHAR(50) DEFAULT 'male'
> );
>
> \-- 向student表插入数据
> INSERT INTO student (sid,sname,age,gender) VALUES ('S\_1001', 'lili', 14, 'male');
> INSERT INTO student (sid,sname,age,gender) VALUES ('S\_1002', 'wang', 15, 'female');
> INSERT INTO student (sid,sname,age,gender) VALUES ('S\_1003', 'tywd', 16, 'male');
> INSERT INTO student (sid,sname,age,gender) VALUES ('S\_1004', 'hfgs', 17, 'female');
> INSERT INTO student (sid,sname,age,gender) VALUES ('S\_1005', 'qwer', 18, 'male');
> INSERT INTO student (sid,sname,age,gender) VALUES ('S\_1006', 'zxsd', 19, 'female');
> INSERT INTO student (sid,sname,age,gender) VALUES ('S\_1007', 'hjop', 16, 'male');
> INSERT INTO student (sid,sname,age,gender) VALUES ('S\_1008', 'tyop', 15, 'female');
> INSERT INTO student (sid,sname,age,gender) VALUES ('S\_1009', 'nhmk', 13, 'male');
> INSERT INTO student (sid,sname,age,gender) VALUES ('S\_1010', 'xdfv', 17, 'female');

## 1.简单查询概述

简单查询即不含where的select语句。在此，我们讲解简单查询中最常用的两种查询：查询所有字段和查询指定字段。

### 2.查询所有字段（方法不唯一只是举例）

> select \* from student;

### 3.查询指定字段（sid、sname）

> select sid,sname from student;

### 4.常数的查询

在SELECT中除了书写列名，还可以书写常数。可以用于标记

> select sid,sname,'2021-03-02' from student;
> 常数的查询日期标记 MySQL命令：

### 5.从查询结果中过滤重复数据

在使用DISTINCT 时需要注意：
在SELECT查询语句中DISTINCT关键字只能用在第一个所查列名之前

>     select distinct gender from student;

### 6.算术运算符（举例加运算符）

在SELECT查询语句中还可以使用加减乘除运算符。

> 查询学生10年后的年龄 MySQL命令：
> select sname,age+10 from student;

## 条件查询

数据库中存有大量数据，我们可根据需求获取指定的数据。此时，我们可在查询语句中通过WHERE子句指定查询条件对查询结果进行过滤。

### 1.使用关系运算符查询

在WHERE中可使用关系运算符进行条件查询，常用的关系运算符如下所示：

| 关系运算符 |  说明  |
| :---: | :--: |
|   =   |  等于  |
|   <>  |  不等于 |
|   !=  |  不等于 |
|   <   |  小于  |
|   <=  | 小于等于 |
|   >   |  大于  |
|   >=  | 大于等于 |

示例：select \* from student where age>=17;

### 2.使用IN关键字查询

IN关键字用于判断某个字段的值是否在指定集合中。如果字段的值恰好在指定的集合中，则将字段所在的记录将査询出来。

> 查询sid为S\_1002和S\_1003的学生信息 MySQL命令：
> select \* from student where sid in ('S\_1002','S\_1003');

### 3.使用BETWEEN AND关键字查询

BETWEEN AND用于判断某个字段的值是否在指定的范围之内。如果字段的值在指定范围内，则将所在的记录将查询出来

> 查询15到18岁的学生信息 MySQL命令：
> select \* from student where age between 15 and 18;

> 查询不是15到18岁的学生信息 MySQL命令：
> select \* from student where age not between 15 and 18;

### 4.使用空值查询

在MySQL中，使用 IS NULL关键字判断字段的值是否为空值。请注意：空值NULL不同于0，也不同于空字符串

> 查询sname不为空值的学生信息 MySQL命令：
> select \* from student where sname is not null;

### 5.使用AND关键字查询

在MySQL中可使用AND关键字可以连接两个或者多个查询条件。

> 询年纪大于15且性别为male的学生信息 MySQL命令：
> select \* from student where age>15 and gender='male';

### 6.使用OR关键字查询

在使用SELECT语句查询数据时可使用OR关键字连接多个査询条件。在使用OR关键字时，只要记录满足其中任意一个条件就会被查询出来

> 查询年纪大于15或者性别为male的学生信息 MySQL命令：
> select \* from student where age>15 or gender='male';

### 7.使用LIKE关键字查询

MySQL中可使用LIKE关键字可以判断两个字符串是否相匹配

#### 7.1 普通字符串

> 查询sname中与wang匹配的学生信息 MySQL命令：
> select \* from student where sname like 'wang';

#### 7.2 含有%通配的字符串

%用于匹配任意长度的字符串。例如，字符串“a%”匹配以字符a开始任意长度的字符串

> *   查询学生姓名以li开始的记录 MySQL命令：
> *   select \* from student where sname like 'li%';

#### 7.3 含有\_通配的字符串

下划线通配符只匹配单个字符，如果要匹配多个字符，需要连续使用多个下划线通配符。例如，字符串“ab\_”匹配以字符串“ab”开始长度为3的字符串，如abc、abp等等；字符串“a\_\_d”匹配在字符“a”和“d”之间包含两个字符的字符串，如"abcd"、"atud"等等。

> 查询学生姓名以zx开头且长度为4的记录 MySQL命令：
> select \* from student where sname like 'zx\_\_';

### 8.使用LIMIT限制查询结果的数量

当执行查询数据时可能会返回很多条记录，而用户需要的数据可能只是其中的一条或者几条

> 查询学生表中年纪最小的3位同学 MySQL命令：
> select \* from student order by age asc limit 3;

### 9.使用GROUP BY进行分组查询

GROUP BY 子句可像切蛋糕一样将表中的数据进行分组，再进行查询等操作。换言之，可通俗地理解为：通过GROUP BY将原来的表拆分成了几张小表。

    \-- 创建数据库
    DROP DATABASE IF EXISTS mydb;
    CREATE DATABASE mydb;
    USE mydb;

    \-- 创建员工表
    CREATE TABLE employee (
    id int,
    name varchar(50),
    salary int,
    departmentnumber int
    );

    \-- 向员工表中插入数据
    INSERT INTO employee values(1,'tome',2000,1001);
    INSERT INTO employee values(2,'lucy',9000,1002);
    INSERT INTO employee values(3,'joke',5000,1003);
    INSERT INTO employee values(4,'wang',3000,1004);
    INSERT INTO employee values(5,'chen',3000,1001);
    INSERT INTO employee values(6,'yukt',7000,1002);
    INSERT INTO employee values(7,'rett',6000,1003);
    INSERT INTO employee values(8,'mujk',4000,1004);
    INSERT INTO employee values(9,'poik',3000,1001);

#### 9.1 GROUP BY和聚合函数一起使用

> 统计各部门员工个数 MySQL命令：
> select count(*), departmentnumber from employee group by departmentnumber;
> 统计部门编号大于1001的各部门员工个数 MySQL命令：
> select count(*), departmentnumber from employee where departmentnumber>1001 group by departmentnumber;

#### 9.2 GROUP BY和聚合函数以及HAVING一起使用;

> 统计工资总和大于8000的部门 MySQL命令：
> select sum(salary),departmentnumber from employee group by departmentnumber having sum(salary)>8000;

### 10.使用ORDER BY对查询结果排序

从表中査询出来的数据可能是无序的或者其排列顺序不是我们期望的。为此，我们可以使用ORDER BY对查询结果进行排序
其语法格式如下所示：

> SELECT 字段名1,字段名2,…
> FROM 表名
> ORDER BY 字段名1 \[ASC 丨 DESC],字段名2 \[ASC | DESC];

在该语法中：字段名1是查询结果排序的依据；参数 ASC表示按照升序排序，DESC表示按照降序排序；默认情况下，按照ASC方式排序。通常情况下，ORDER BY子句位于整个SELECT语句的末尾。

> 查询所有学生并按照年纪大小升序排列 MySQL命令：
> select \* from student order by age asc;

### 11.在SELECT语句中使用关键字DISTINCT去除重复行

SELECT DISTINCT department\_id FROM employees;

## 别名设置

在査询数据时可为表和字段取別名，该别名代替表和字段的原名参与查询操作。
操作的表事先已准备

#### 1.为表取别名

在查询操作时，假若表名很长使用起来就不太方便，此时可为表取一个別名，用该别名来代替表的名称。语法格式如下所示：

> SELECT \* FROM 表名 \[AS] 表的别名 WHERE .... ;

#### 2.为字段取别名

在查询操作时，假若字段名很长使用起来就不太方便，此时可该字段取一个別名，用该别名来代替字段的名称。语法格式如下所示：

> SELECT 字段名1 \[AS] 别名1 , 字段名2 \[AS] 别名2 , ... FROM 表名 WHERE ... ;

    DROP TABLE IF EXISTS student;
    DROP TABLE IF EXISTS class;

    -- 创建班级表
    CREATE TABLE class(
        cid int(4) NOT NULL PRIMARY KEY,
        cname varchar(30) 
    );

    -- 创建学生表
    CREATE TABLE student(
        sid int(8) NOT NULL PRIMARY KEY,
        sname varchar(30),
        classid int(8) NOT NULL
    );

    -- 为学生表添加外键约束
    ALTER TABLE student ADD CONSTRAINT fk_student_classid FOREIGN KEY(classid) REFERENCES class(cid);

    -- 向班级表插入数据
    INSERT INTO class(cid,cname)VALUES(1,'Java');
    INSERT INTO class(cid,cname)VALUES(2,'Python');

    -- 向学生表插入数据
    INSERT INTO student(sid,sname,classid)VALUES(1,'tome',1);
    INSERT INTO student(sid,sname,classid)VALUES(2,'lucy',1);
    INSERT INTO student(sid,sname,classid)VALUES(3,'lili',2);
    INSERT INTO student(sid,sname,classid)VALUES(4,'domi',2);

## 表的关联关系

在实际开发中数据表之间存在着各种关联关系。在此，介绍MySQL中数据表的三种关联关系。
多对一
多对一(亦称为一对多)是数据表中最常见的一种关系。例如：员工与部门之间的关系，一个部门可以有多个员工；而一个员工不能属于多个部门只属于某个部门。在多对一的表关系 中，应将外键建在多的一方否则会造成数据的冗余。
多对多
多对多是数据表中常见的一种关系。例如：学生与老师之间的关系，一个学生可以有多个老师而且一个老师有多个学生。通常情况下，为了实现这种关系需要定义一张中间表(亦称为连接表)该表会存在两个外键分别参照老师表和学生表。
一对一
在开发过程中，一对一的关联关系在数据库中并不常见；因为以这种方式存储的信息通常会放在同一张表中。

### 1.关联查询

查询Java班的所有学生 MySQL命令：

> select \* from student where classid=(select cid from class where cname='Java');

### 2.关于关联关系的删除数据

请从班级表中删除Java班级。在此，请注意：班级表和学生表之间存在关联关系；要删除Java班级，应该先删除学生表中与该班相关联的学生。否则，假若先删除Java班那么学生表中的cid就失去了关联

> 删除Java班 MySQL命令：
> delete from student where classid=(select cid from class where cname='Java');
> delete from class where cname='Java';

## 十四、多表连接查询

### 1.交叉连接查询

交叉连接返回的结果是被连接的两个表中所有数据行的笛卡儿积；比如：集合A={a,b}，集合B={0,1,2}，则集合A和B的笛卡尔积为{(a,0),(a,1),(a,2),(b,0),(b,1),(b,2)}。所以，交叉连接也被称为笛卡尔连接，其语法格式如下：

> SELECT \* FROM 表1 CROSS JOIN 表2;
> 在该语法中：CROSS JOIN用于连接两个要查询的表，通过该语句可以查询两个表中所有的数据组合。
> 由于这个交叉连接查询在实际运用中没有任何意义，所以只做为了解即可

### 2.内连接查询

内连接(Inner Join)又称简单连接或自然连接，是一种非常常见的连接查询。内连接使用比较运算符对两个表中的数据进行比较并列出与连接条件匹配的数据行，组合成新的 记录。也就是说在内连接查询中只有满足条件的记录才能出现在查询结果中。其语法格式如下：

> SELECT 查询字段1,查询字段2, ... FROM 表1 \[INNER] JOIN 表2 ON 表1.关系字段=表2.关系字段
> 在该语法中：INNER JOIN用于连接两个表，ON来指定连接条件；其中INNER可以省略。

### 3.外连接查询

在使用内连接查询时我们发现：返回的结果只包含符合查询条件和连接条件的数据。但是，有时还需要在返回查询结果中不仅包含符合条件的数据，而且还包括左表、右表或两个表中的所有数据，此时我们就需要使用外连接查询。外连接又分为左(外)连接和右(外)连接。其语法格式如下：

> SELECT 查询字段1,查询字段2, ... FROM 表1 LEFT | RIGHT \[OUTER] JOIN 表2 ON 表1.关系字段=表2.关系字段 WHERE 条件

其中，关键字左边的表被称为左表，关键字右边的表被称为右表；OUTER可以省略。

在使用左(外)连接和右(外)连接查询时，查询结果是不一致的，具体如下：

1、LEFT \[OUTER] JOIN 左(外)连接：返回包括左表中的所有记录和右表中符合连接条件的记录。如果左表的某条记录在右表中不存在则在右表中显示为空。
2、RIGHT \[OUTER] JOIN 右(外)连接：返回包括右表中的所有记录和左表中符合连接条件的记录。如果右表的某条记录在左表中没有匹配，则左表将返回空值。

## 子查询

子查询是指一个查询语句嵌套在另一个查询语句内部的查询；该查询语句可以嵌套在一个 SELECT、SELECT…INTO、INSERT…INTO等语句中。在执行查询时，首先会执行子查询中的语句，再将返回的结果作为外层查询的过滤条件。在子査询中通常可以使用比较运算符和IN、EXISTS、ANY、ALL等关键字。

### 1.带比较运算符的子查询

比较运算符前面我们提到过得，就是>、<、=、>=、<=、!=等

查询张三同学所在班级的信息 MySQL命令：

> select \* from class where cid=(select classid from student where sname='张三');

### 2.带EXISTS关键字的子查询

EXISTS关键字后面的参数可以是任意一个子查询， 它不产生任何数据只返回TRUE或FALSE。当返回值为TRUE时外层查询才会 执行

假如王五同学在学生表中则从班级表查询所有班级信息 MySQL命令：

> select \* from class where exists (select \* from student where sname='王五');

### 3.带ANY关键字的子查询

ANY关键字表示满足其中任意一个条件就返回一个结果作为外层查询条件。

查询比任一学生所属班级号还大的班级编号 MySQL命令：

> select \* from class where cid > any (select classid from student);

### 4.带ALL关键字的子查询

ALL关键字与ANY有点类似，只不过带ALL关键字的子査询返回的结果需同时满足所有内层査询条件。

查询比所有学生所属班级号还大的班级编号 MySQL命令：

> select \* from class where cid > all (select classid from student);

## 查询语句的书写顺序和执行顺序

查询语句的书写顺序
select ===> from ===> where ===> group by ===> having ===> order by ===> limit
查询语句的执行顺序
from ===> where ===> group by ===> having ===> select ===> order by ===> limi
