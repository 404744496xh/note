# 1 vector

vector[动态数组](https://so.csdn.net/so/search?q=%E5%8A%A8%E6%80%81%E6%95%B0%E7%BB%84&spm=1001.2101.3001.7020)），定义的

> 注意：**在局部区域中（比如局部函数里面）开vector数组，是在堆空间里面开的。**在局部区域开数组是在栈空间开的，而栈空间比较小，如果开了非常长的数组就会发生爆栈。故局部区域**不可以**开大长度数组，但是可以开大长度vector。


- 头文件

```cpp
#include <vector>
1
```

- 初始化

- 一维初始化

```cpp
vector<int> a; //定义了一个名为a的一维数组,数组存储int类型数据
vector<double> b;//定义了一个名为b的一维数组，数组存储double类型数据
vector<node> c;//定义了一个名为c的一维数组，数组存储结构体类型数据，node是结构体类型
123
```

指定

```cpp
vector<int> v(n);//定义一个长度为n的数组，初始值默认为0，下标范围[0, n - 1]
vector<int> v(n, 1);//v[0]到v[n-1]所有的元素初始值均为1
//注意：指定数组长度之后（指定长度后的数组就相当于正常的数组了）
123
```

初始化中有多个元素

```cpp
vector<int> a{1, 2, 3, 4, 5};//数组a中有五个元素，数组长度就为5
1
```

拷贝初始化

```cpp
vector<int> a(n + 1, 0);
vector<int> b(a);//两个数组中的类型必须相同,a和b都是长度为n+1，初始值都为0的数组
12
```

- 二维初始化

定义第一维固定长度为

```cpp
vector<int> v[5];//定义可变长二维数组
//注意：行不可变（只有5行）, 而列可变,可以在指定行添加元素
//第一维固定长度为5，第二维长度可以改变
123
```

> vector<int> v[5]可以这样理解：长度为5的v数组，数组中存储的是vector<int> 数据类型，而该类型就是数组形式，故v为二维数组。其中每个数组元素均为空，因为没有指定长度，所以第二维可变长。可以进行下述操作：v[1].push_back(2);v[2].push_back(3);12


行列均可变

```cpp
//初始化二维均可变长数组
vector<vector<int>> v;//定义一个行和列均可变的二维数组
12
```

> 应用：可以在v数组里面装多个数组vector<int> t1{1, 2, 3, 4};vector<int> t2{2, 3, 4, 5};v.push_back(t1);v.push_back(t2);v.push_back({3, 4, 5, 6}) *// {3, 4, 5, 6}可以作为vector的初始化,相当于一个无名vector*12345


行列长度均固定 

```cpp
vector<vector<int>> a(n + 1, vector<int>(m + 1, 0));
1
```

c++17或者c++20支持的形式（不常用），与上面相同的初始化

```cpp
vector a(n + 1, vector(m + 1, 0));
1
```

知道了如何定义初始化可变数组，下面就需要知道如何添加，删除，修改数据。

**c指定为数组名称**

| 代码 | 含义 | 
| -- | -- |
| c.front() | 返回第一个数据 | 
| c.back() | 返回数组中的最后一个数据 | 
| c.pop_back() | 删除最后一个数据 | 
| c.push_back(element) | 在尾部加一个数据 | 
| c.size() | 返回实际数据个数（unsigned类型） | 
| c.clear() | 清除元素个数 | 
| c.resize(n, v) | 改变数组大小为n,n个空间数值赋为v，如果没有默认赋值为0 | 
| c.insert(it, x) | 向任意迭代器it插入一个元素x， | 
| 例 | 将-1插入c[2]的位置 | 
| c.erase(first,last) | 删除[first,last)的所有元素， | 
| c.begin() | 返回首元素的迭代器（通俗来说就是地址） | 
| c.end() | 返回最后一个元素后一个位置的迭代器（地址） | 
| c.empty() | 判断是否为空，为空返回真，反之返回假 | 


注意： 

**排序**

使用

> sort()为STL函数，请参考本文最后面STL函数系列。


对所有元素进行排序，如果要对指定区间进行排序，可以对

```cpp
vector<int> a(n + 1);
sort(a.begin() + 1, a.end()); // 对[1, n]区间进行从小到大排序
12
```

- 下标法： 

注意：一维数组的下标是从

- 迭代器法： 

代码如下：

```cpp
vector<int> vi; //定义一个vi数组
vector<int>::iterator it = vi.begin();//声明一个迭代器指向vi的初始位置
12
```

直接和普通数组一样进行访问即可。

```cpp
//添加元素
for(int i = 0; i < 5; i++)
	vi.push_back(i);
	
//下标访问 
for(int i = 0; i < 5; i++)
	cout << vi[i] << " ";
cout << "\n";
12345678
```

类似指针。

```cpp
//迭代器访问
vector<int>::iterator it;   
//相当于声明了一个迭代器类型的变量it
//通俗来说就是声明了一个指针变量

//方式一：
vector<int>::iterator it = vi.begin(); 
for(int i = 0; i < 5; i++)
	cout << *(it + i) << " ";
cout << "\n";

//方式二：
vector<int>::iterator it;
for(it = vi.begin(); it != vi.end();it ++)
	cout << *it << " ";
//vi.end()指向尾元素地址的下一个地址
12345678910111213141516
```

**只能遍历完数组**

**auto**

```cpp
vector<int> v;
v.push_back(12);
v.push_back(241);
for(auto val : v) 
	cout << val << " "; // 12 241
12345
```

> vector注意：vi[i] 和 *(vi.begin() + i) 等价vector和string的STL容器支持*(it + i)的元素访问，其它容器可能也可以支持这种方式访问，但用的不多，可自行尝试。
