[](https://blog.csdn.net/qq_50285142/article/details/114026148)

映射类似于函数的对应关系，每个

> 比如说：学习 对应 看书，学习 是键，看书 是值。学习->看书玩耍 对应 打游戏，玩耍 是键，打游戏 是值。玩耍->打游戏


```cpp
//头文件
#include<map>
//初始化定义
map<string,string> mp;
map<string,int> mp;
map<int,node> mp;//node是结构体类型
123456
```

> map特性：map会按照键的顺序从小到大自动排序，键的类型必须可以比较大小


| 代码 | 含义 | 
| -- | -- |
| mp.find(key) | 返回键为key的映射的迭代器 $O(logN) $ 注意：用find函数来定位数据出现位置，它返回一个迭代器。当数据存在时，返回数据所在位置的迭代器，数据不存在时，返回 | 
| mp.erase(it) | 删除迭代器对应的键和值 | 
| mp.erase(key) | 根据映射的键删除键和值 | 
| mp.erase(first,last) | 删除左闭右开区间迭代器对应的键和值 | 
| mp.size() | 返回映射的对数$ O(1)$ | 
| mp.clear() | 清空map中的所有元素 | 
| mp.insert() | 插入元素，插入时要构造键值对 | 
| mp.empty() | 如果map为空，返回true，否则返回false | 
| mp.begin() | 返回指向map第一个元素的迭代器（地址） | 
| mp.end() | 返回指向map尾部的迭代器（最后一个元素的 | 
| mp.rbegin() | 返回指向map最后一个元素的迭代器（地址） | 
| mp.rend() | 返回指向map第一个元素前面(上一个）的逆向迭代器（地址） | 
| mp.count(key) | 查看元素是否存在，因为map中键是唯一的，所以存在返回1，不存在返回0 | 
| mp.lower_bound() | 返回一个迭代器，指向键值>= | 
| mp.upper_bound() | 返回一个迭代器，指向键值> key的第一个元素 | 


**下面说明部分函数方法的注意点**

> 注意：查找元素是否存在时，可以使用①mp.find() ② mp.count() ③ mp[key]但是第三种情况，如果不存在对应的key时，会自动创建一个键值对（产生一个额外的键值对空间）所以为了不增加额外的空间负担，最好使用前两种方法


- mp.begin()

mp.end()

**用于正向遍历map**

```cpp
map<int,int> mp;
mp[1] = 2;
mp[2] = 3;
mp[3] = 4;
auto it = mp.begin();
while(it != mp.end()) {
	cout << it->first << " " << it->second << "\n";
	it ++;
}
123456789
```

**结果：**

```
1 2
2 3
3 4
123
```

- mp.rbegin()

mp.rend()

**用于逆向遍历map**

```cpp
map<int,int> mp;
mp[1] = 2;
mp[2] = 3;
mp[3] = 4;
auto it = mp.rbegin();
while(it != mp.rend()) {
	cout << it->first << " " << it->second << "\n";
	it ++;
}
123456789
```

**结果：**

```
3 4
2 3
1 2
123
```

二分查找

> map的二分查找以第一个元素（即键为准），对**键**进行二分查找返回值为map迭代器类型


```cpp
#include<bits/stdc++.h>
using namespace std;

int main() {
	map<int, int> m{{1, 2}, {2, 2}, {1, 2}, {8, 2}, {6, 2}};//有序
	map<int, int>::iterator it1 = m.lower_bound(2);
	cout << it1->first << "\n";//it1->first=2
	map<int, int>::iterator it2 = m.upper_bound(2);
	cout << it2->first << "\n";//it2->first=6
	return 0;
}

123456789101112
```

```cpp
//先声明
map<string,string> mp;
12
```

- 方式一：

```cpp
mp["学习"] = "看书";
mp["玩耍"] = "打游戏";
12
```

- 方式二：插入元素构造键值对

```cpp
mp.insert(make_pair("vegetable","蔬菜"));
1
```

- 方式三：

```cpp
mp.insert(pair<string,string>("fruit","水果"));
1
```

- 方式四:

```cpp
mp.insert({"hahaha","wawawa"});
1
```

(大部分情况用于访问单个元素)

```cpp
mp["菜哇菜"] = "强哇强";
cout << mp["菜哇菜"] << "\n";//只是简写的一个例子，程序并不完整
12
```

- 方式一：迭代器访问

```cpp
map<string,string>::iterator it;
for(it = mp.begin(); it != mp.end(); it++) {
	//      键                 值 
	// it是结构体指针访问所以要用 -> 访问
	cout << it->first << " " << it->second << "\n";
	//*it是结构体变量 访问要用 . 访问
	//cout<<(*it).first<<" "<<(*it).second;
}
12345678
```

- 方式二：智能指针访问

```cpp
for(auto i : mp)
cout << i.first << " " << i.second << endl;//键，值
12
```

- 方式三：对指定单个元素访问

```cpp
map<char,int>::iterator it = mp.find('a');
cout << it -> first << " " <<  it->second << "\n";
12
```

- 方式四：c++17特性才具有

```cpp
for(auto [x, y] : mp)
	cout << x << " " << y << "\n";
//x,y对应键和值
123
```

这里就不单开一个大目录讲unordered_map了，直接在map里面讲了。

**map**

**unordered_map**

**map**

- 优点：内部用红黑树实现，内部元素具有有序性，查询删除等操作复杂度为

O ( l o g N ) O(logN)

- 缺点：占用空间，红黑树里每个节点需要保存父子节点和红黑性质等信息，空间占用较大。

**unordered_map**

- 优点：内部用哈希表实现，查找速度非常快（适用于大量的查询操作）。

- 缺点：建立哈希表比较耗时。

> 两者方法函数基本一样，差别不大。注意：随着内部元素越来越多，两种容器的插入删除查询操作的时间都会逐渐变大，效率逐渐变低。使用[]查找元素时，如果元素不存在，两种容器**都是**创建一个空的元素；如果存在，会正常索引对应的值。所以如果查询过多的不存在的元素值，容器内部会创建大量的空的键值对，后续查询创建删除效率会**大大降低**。查询容器内部元素的最优方法是：先判断存在与否，再索引对应值（适用于这两种容器）*// 以 map 为例*map<int, int> mp;int x = 999999999;if(mp.count(x)) *// 此处判断是否存在x这个键*    cout << mp[x] << "\n";   *// 只有存在才会索引对应的值，避免不存在x时多余空元素的创建*12345


另外：

> 还有一种映射：multimap键可以重复，即一个键对应多个值，如要了解，可以自行搜索。


[](javascript:;)

![](images/WEBRESOURCE10b5bf51439a3bcf35fce353983f5d32stickPicture.png)