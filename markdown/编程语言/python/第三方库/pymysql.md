## 一、pymysql 模块介绍

pymysql 是一个用于 Python 编程的第三方模块，用于连接和操作 MySQL 数据库。它提供了一个简单而强大的接口，使开发者能够轻松地在 Python 程序中执行各种数据库操作，如查询、插入、更新和删除数据等。

pymysql 模块由 Python 实现，它遵循 Python Database API 规范（PEP 249），这使得它与其他数据库 API 兼容，并使得在不同的数据库之间切换变得更加容易。

pymysql 在 Python 开发者社区非常受欢迎，因为它易于使用、功能强大并且具有良好的性能。它提供了许多高级特性，如事务管理、连接池、数据类型转换等，使得开发数据库驱动的应用程序变得更加便捷和高效。

总之，pymysql 模块是一个重要的工具，可帮助 Python 开发者轻松地与 MySQL 数据库进行交互和操作。

# 二、使用步骤

### 2.2 连接数据库及基本操作
```python
import pymysql

conn = pymysql.connect(host='localhost', user='root', password='password', db='mydb', charset='utf8mb4')
cursor = conn.cursor()
```

### 2.3 执行SQL查询
#### 2.3.1 基本查询
```python
cursor.execute('SELECT id, name, age FROM mytable')
results = cursor.fetchall()  # 获取所有结果
for row in results:
    print(f"ID: {row[0]}, Name: {row[1]}, Age: {row[2]}")
```

#### 2.3.2 参数化查询
使用参数化查询可以防止SQL注入：
```python
sql = "SELECT id, name, age FROM mytable WHERE name = %s"
cursor.execute(sql, ('John',))
result = cursor.fetchone()  # 获取单条结果
if result:
    print(f"ID: {result[0]}, Name: {result[1]}, Age: {result[2]}")
```

#### 2.3.3 使用 fetchone() 和 fetchmany()
- `fetchone()` 返回结果集的下一行，如果没有更多行，则返回 `None`。
- `fetchmany(size)` 返回结果集中的下 `size` 行，如果没有足够的行，则返回一个较短的列表。

```python
one_result = cursor.fetchone()  # 获取单条结果
if one_result:
    print(f"ID: {one_result[0]}, Name: {one_result[1]}, Age: {one_result[2]}")

many_results = cursor.fetchmany(2)  # 获取下两条结果
for row in many_results:
    print(f"ID: {row[0]}, Name: {row[1]}, Age: {row[2]}")
```

### 2.4 遍历结果集
如果结果集很大，可以使用循环来逐行处理：
```python
cursor.execute('SELECT id, name, age FROM mytable')
# 使用 fetchone() 逐行处理结果
while True:
    row = cursor.fetchone()
    if row is None:
        break
    print(f"ID: {row[0]}, Name: {row[1]}, Age: {row[2]}")
# 使用 fetchall() 获取所有结果
results = cursor.fetchall()  # 获取所有结果
for row in results:
    print(f"ID: {row[0]}, Name: {row[1]}, Age: {row[2]}")
   

```

### 2.5 插入、更新和删除数据
```python
# 插入数据
cursor.execute("INSERT INTO mytable (name, age) VALUES (%s, %s)", ('Jane', 30))
conn.commit()

# 更新数据
cursor.execute("UPDATE mytable SET age = %s WHERE name = %s", (31, 'Jane'))
conn.commit()

# 删除数据
cursor.execute("DELETE FROM mytable WHERE name = %s", ('Jane',))
conn.commit()
```

### 2.6 错误处理
```python
try:
    cursor.execute("SOME SQL STATEMENT")
    conn.commit()
except pymysql.Error as e:
    print(f"发生错误：{e}")
    conn.rollback()
finally:
    cursor.close()
    conn.close()
```

### 2.7 设置自动提交
如果不想每次手动提交，可以在连接时设置 `autocommit=True`：
```python
conn = pymysql.connect(host='localhost', user='root', password='password', db='mydb', charset='utf8mb4', autocommit=True)
```

这样，每次执行完 SQL 语句后，更改会自动提交，无需调用 `conn.commit()`。



