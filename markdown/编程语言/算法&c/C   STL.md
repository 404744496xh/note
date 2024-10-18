## <font style="color:rgb(79, 79, 79);">1 vector</font>
### <font style="color:rgb(79, 79, 79);">1.1 介绍</font>
`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">vector</font>`<font style="color:rgb(77, 77, 77);">为可变长数组（</font>[<font style="color:rgb(77, 77, 77);">动态数组</font>](https://so.csdn.net/so/search?q=%E5%8A%A8%E6%80%81%E6%95%B0%E7%BB%84&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">），定义的</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">vector</font>`<font style="color:rgb(77, 77, 77);">数组可以随时添加数值和删除元素。</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">注意：</font>**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">在局部区域中（比如局部函数里面）开vector数组，是在堆空间里面开的。</font>**

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">在局部区域开数组是在栈空间开的，而栈空间比较小，如果开了非常长的数组就会发生爆栈。</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">故局部区域</font>**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">不可以</font>**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">开大长度数组，但是可以开大长度</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">vector</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">。</font>

+ <font style="color:rgba(0, 0, 0, 0.75);">头文件：</font>

```plain
#include <vector>
```

+ <font style="color:rgb(77, 77, 77);">一维初始化：</font>

```plain
vector<int> a; //定义了一个名为a的一维数组,数组存储int类型数据
vector<double> b;//定义了一个名为b的一维数组，数组存储double类型数据
vector<node> c;//定义了一个名为c的一维数组，数组存储结构体类型数据，node是结构体类型
```

<font style="color:rgb(77, 77, 77);">指定</font>**<font style="color:rgb(77, 77, 77);">长度</font>**<font style="color:rgb(77, 77, 77);">和</font>**<font style="color:rgb(77, 77, 77);">初始值</font>**<font style="color:rgb(77, 77, 77);">的初始化</font>

```plain
vector<int> v(n);// 定义一个长度为n的数组，初始值默认为0，下标范围[0, n - 1]
vector<int> v(n, 1);// v[0] 到 v[n - 1]所有的元素初始值均为1
//注意：指定数组长度之后（指定长度后的数组就相当于正常的数组了）
```

<font style="color:rgb(77, 77, 77);">初始化中有多个元素</font>

```plain
vector<int> a{1, 2, 3, 4, 5};//数组a中有五个元素，数组长度就为5
```

<font style="color:rgb(77, 77, 77);">拷贝初始化</font>

```plain
vector<int> a(n + 1, 0);
vector<int> b(a); // 两个数组中的类型必须相同,a和b都是长度为n+1，初始值都为0的数组
vector<int> c = a; // 也是拷贝初始化,c和a是完全一样的数组
```

+ <font style="color:rgb(77, 77, 77);">二维初始化  
</font><font style="color:rgb(77, 77, 77);">定义第一维固定长度为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">5</font>`<font style="color:rgb(77, 77, 77);">，第二维可变化的二维数组</font>

```plain
vector<int> v[5];//定义可变长二维数组
//注意：行不可变（只有5行）, 而列可变,可以在指定行添加元素
//第一维固定长度为5，第二维长度可以改变
```

`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">vector<int> v[5]</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">可以这样理解：长度为5的v数组，数组中存储的是</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">vector<int></font><font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);"> </font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">数据类型，而该类型就是数组形式，故</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">v</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">为二维数组。其中每个数组元素均为空，因为没有指定长度，所以第二维可变长。可以进行下述操作：</font>

```plain
v[1].push_back(2);
v[2].push_back(3);
```

<font style="color:rgb(77, 77, 77);">行列均可变</font>

```plain
//初始化二维均可变长数组
vector<vector<int>> v;//定义一个行和列均可变的二维数组
```

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">应用：可以在</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">v</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">数组里面装多个数组</font>

```plain
vector<int> t1{1, 2, 3, 4};
vector<int> t2{2, 3, 4, 5};
v.push_back(t1);
v.push_back(t2);
v.push_back({3, 4, 5, 6}) // {3, 4, 5, 6}可以作为vector的初始化,相当于一个无名vector
```

<font style="color:rgb(77, 77, 77);">行列长度均固定</font><font style="color:rgb(77, 77, 77);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">n + 1</font>`<font style="color:rgb(77, 77, 77);">行</font><font style="color:rgb(77, 77, 77);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">m + 1</font>`<font style="color:rgb(77, 77, 77);">列初始值为0</font>

```plain
vector<vector<int>> a(n + 1, vector<int>(m + 1, 0));
```

<font style="color:rgb(77, 77, 77);">c++17或者c++20支持的形式（不常用），与上面相同的初始化</font>

```plain
vector a(n + 1, vector(m + 1, 0));
```

### <font style="color:rgb(79, 79, 79);">1.2 方法函数</font>
<font style="color:rgb(77, 77, 77);">知道了如何定义初始化可变数组，下面就需要知道如何添加，删除，修改数据。</font>

**<font style="color:rgb(77, 77, 77);">c指定为数组名称</font>**<font style="color:rgb(77, 77, 77);">，含义中会注明算法复杂度。</font>

| **<font style="color:rgb(79, 79, 79);">代码</font>** | **<font style="color:rgb(79, 79, 79);">含义</font>** |
| :---: | :---: |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">c.front()</font>` | <font style="color:rgb(79, 79, 79);">返回第一个数据</font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">c.back()</font>` | <font style="color:rgb(79, 79, 79);">返回数组中的最后一个数据</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">c.pop_back()</font>` | <font style="color:rgb(79, 79, 79);">删除最后一个数据</font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">c.push_back(element)</font>` | <font style="color:rgb(79, 79, 79);">在尾部加一个数据</font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">c.size()</font>` | <font style="color:rgb(79, 79, 79);">返回实际数据个数（unsigned类型）</font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">c.clear()</font>` | <font style="color:rgb(79, 79, 79);">清除元素个数</font><font style="color:rgb(79, 79, 79);">O ( N ) O(N)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font>_<font style="color:rgb(79, 79, 79);">N</font>_<font style="color:rgb(79, 79, 79);">)</font><font style="color:rgb(79, 79, 79);">，N为元素个数</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">c.resize(n, v)</font>` | <font style="color:rgb(79, 79, 79);">改变数组大小为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">n</font>`<br/><font style="color:rgb(79, 79, 79);">,</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">n</font>`<br/><font style="color:rgb(79, 79, 79);">个空间数值赋为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">v</font>`<br/><font style="color:rgb(79, 79, 79);">，如果没有默认赋值为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">0</font>` |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">c.insert(it, x)</font>` | <font style="color:rgb(79, 79, 79);">向任意迭代器</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">it</font>`<br/><font style="color:rgb(79, 79, 79);">插入一个元素</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">x</font>`<br/><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">，</font><font style="color:rgb(79, 79, 79);">O ( N ) O(N)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font>_<font style="color:rgb(79, 79, 79);">N</font>_<font style="color:rgb(79, 79, 79);">)</font> |
| <font style="color:rgb(79, 79, 79);">例：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">c.insert(c.begin() + 2,-1)</font>` | <font style="color:rgb(79, 79, 79);">将</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">-1</font>`<br/><font style="color:rgb(79, 79, 79);">插入</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">c[2]</font>`<br/><font style="color:rgb(79, 79, 79);">的位置</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">c.erase(first,last)</font>` | <font style="color:rgb(79, 79, 79);">删除</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">[first,last)</font>`<br/><font style="color:rgb(79, 79, 79);">的所有元素，</font><font style="color:rgb(79, 79, 79);">O ( N ) O(N)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font>_<font style="color:rgb(79, 79, 79);">N</font>_<font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">c.begin()</font>` | <font style="color:rgb(79, 79, 79);">返回首元素的迭代器（通俗来说就是地址）</font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">c.end()</font>` | <font style="color:rgb(79, 79, 79);">返回最后一个元素后一个位置的迭代器（地址）</font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">c.empty()</font>` | <font style="color:rgb(79, 79, 79);">判断是否为空，为空返回真，反之返回假</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |


<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">注意：</font>

+ `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">end()</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">返回的是最后一个元素的后一个位置的地址，不是最后一个元素的地址，</font>**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">所有STL容器均是如此</font>**
+ <font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">使用</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">vi.resize(n, v)</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">函数时，若</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">vi</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">之前指定过大小为</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">pre</font>`
    - `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">pre > n</font>`<font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);"> </font><font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);">：即数组大小变小了，数组会保存前</font><font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">n</font>`<font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);"> </font><font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);">个元素，前</font><font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">n</font>`<font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);"> </font><font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);">个元素值为原来的值，不是都为</font><font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">v</font>`
    - `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">pre < n</font>`<font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);"> </font><font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);">：即数组大小变大了，数组会在后面插入</font><font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">n - pre</font>`<font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);"> </font><font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);">个值为</font><font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">v</font>`<font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);"> </font><font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);">的元素</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">也就是说，这个初始值</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">v</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">只对新插入的元素生效。</font>

```plain
#include<bits/stdc++.h>
using namespace std;
void out(vector<int> &a) { for (auto &x: a) cout << x << " "; cout << "\n"; }
int main() {
	vector<int> a(5, 1);
	out(a); // 1 1 1 1 1
	a.resize(10, 2);
	out(a); // 1 1 1 1 1 2 2 2 2 2
	a.resize(3, 3);
	out(a); // 1 1 1
	return 0;
}
```

**<font style="color:rgb(77, 77, 77);">排序</font>**

<font style="color:rgb(77, 77, 77);">使用</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">sort</font>`<font style="color:rgb(77, 77, 77);">排序要：</font><font style="color:rgb(77, 77, 77);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">sort(c.begin(), c.end());</font>`

`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">sort()</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">为STL函数，请参考本文最后面STL函数系列。</font>

<font style="color:rgb(77, 77, 77);">对所有元素进行排序，如果要对指定区间进行排序，可以对</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">sort()</font>`<font style="color:rgb(77, 77, 77);">里面的参数进行加减改动。</font>

```plain
vector<int> a(n + 1);
sort(a.begin() + 1, a.end()); // 对[1, n]区间进行从小到大排序
```

### <font style="color:rgb(79, 79, 79);">1.3 访问</font>
<font style="color:rgb(77, 77, 77);">共三种方法：</font>

+ **<font style="color:rgba(0, 0, 0, 0.75);">下标法</font>**<font style="color:rgba(0, 0, 0, 0.75);"> </font><font style="color:rgba(0, 0, 0, 0.75);">： 和普通数组一样</font>

<font style="color:rgb(77, 77, 77);">注意：一维数组的下标是从</font><font style="color:rgb(77, 77, 77);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">0</font>`<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">到</font><font style="color:rgb(77, 77, 77);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">v.size()-1</font>`<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">，访问之外的数会出现越界错误</font>

+ **<font style="color:rgba(0, 0, 0, 0.75);">迭代器法</font>**<font style="color:rgba(0, 0, 0, 0.75);"> </font><font style="color:rgba(0, 0, 0, 0.75);">： 类似指针一样的访问 ，首先需要声明迭代器变量，和声明指针变量一样，可以根据代码进行理解（附有注释）。</font>

```plain
vector<int> vi; //定义一个vi数组
vector<int>::iterator it = vi.begin();//声明一个迭代器指向vi的初始位置
```

+ **<font style="color:rgba(0, 0, 0, 0.75);">使用auto</font>**<font style="color:rgba(0, 0, 0, 0.75);"> </font><font style="color:rgba(0, 0, 0, 0.75);">：非常简便，但是会访问数组的所有元素（特别注意0位置元素也会访问到）</font>

#### <font style="color:rgb(79, 79, 79);">1.3.1 下标访问</font>
<font style="color:rgb(77, 77, 77);">直接和普通数组一样进行访问即可。</font>

```plain
//添加元素
for(int i = 0; i < 5; i++)
	vi.push_back(i);
	
//下标访问 
for(int i = 0; i < 5; i++)
	cout << vi[i] << " ";
cout << "\n";
```

#### <font style="color:rgb(79, 79, 79);">1.3.2 迭代器访问</font>
<font style="color:rgb(77, 77, 77);">类似指针，迭代器就是充当指针的作用。</font>

```plain
vector<int> vi{1, 2, 3, 4, 5};
//迭代器访问
vector<int>::iterator it;   
// 相当于声明了一个迭代器类型的变量it
// 通俗来说就是声明了一个指针变量
```

+ <font style="color:rgba(0, 0, 0, 0.75);">方式一：</font>

```plain
vector<int>::iterator it = vi.begin(); 
for(int i = 0; i < 5; i++)
	cout << *(it + i) << " ";
cout << "\n";
```

+ <font style="color:rgba(0, 0, 0, 0.75);">方式二</font>

```plain
vector<int>::iterator it;
for(it = vi.begin(); it != vi.end();it ++)
	cout << *it << " ";
//vi.end()指向尾元素地址的下一个地址

// 或者
auto it = vi.begin();
while (it != vi.end()) {
    cout << *it << "\n";
    it++;
}
```

#### <font style="color:rgb(79, 79, 79);">1.3.3 智能指针</font>
**<font style="color:rgb(77, 77, 77);">只能遍历完数组</font>**<font style="color:rgb(77, 77, 77);">，如果要指定的内容进行遍历，需要另选方法。</font>

`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">auto</font>`<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">能够自动识别并获取类型。</font>

```plain
// 1. 输入
vector<int> a(n);
for (auto &x: a) {
    cin >> x; // 可以进行输入，注意加引用
}
// 2. 输出
vector<int> v;
v.push_back(12);
v.push_back(241);
for(auto val : v) {
	cout << val << " "; // 12 241
}

```

`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">vector</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">注意：</font>

+ `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">vi[i]</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">和</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">*(vi.begin() + i)</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">等价，与指针类似。</font>
+ `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">vector</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">和</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">string</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">的</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">STL</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">容器支持</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">*(it + i)</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">的元素访问，其它容器可能也可以支持这种方式访问，但</font>

## <font style="color:rgb(79, 79, 79);">2 stack</font>
### <font style="color:rgb(79, 79, 79);">2.1 介绍</font>
<font style="color:rgb(77, 77, 77);">栈为</font>[<font style="color:rgb(77, 77, 77);">数据结构</font>](https://so.csdn.net/so/search?q=%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">的一种，是STL中实现的一个先进后出，后进先出的容器。</font>

```plain
//头文件需要添加
#include<stack>

//声明
stack<int> s;
stack<string> s;
stack<node> s;//node是结构体类型
```

### <font style="color:rgb(79, 79, 79);">2.2 方法函数</font>
| **<font style="color:rgb(79, 79, 79);">代码</font>** | **<font style="color:rgb(79, 79, 79);">含义</font>** |
| :---: | :---: |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.push(ele)</font>` | <font style="color:rgb(79, 79, 79);">元素</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">ele</font>`<br/><font style="color:rgb(79, 79, 79);">入栈，增加元素</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.pop()</font>` | <font style="color:rgb(79, 79, 79);">移除栈顶元素</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.top()</font>` | <font style="color:rgb(79, 79, 79);">取得栈顶元素（但不删除）</font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.empty()</font>` | <font style="color:rgb(79, 79, 79);">检测栈内是否为空，空为真</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.size()</font>` | <font style="color:rgb(79, 79, 79);">返回栈内元素的个数</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |


### <font style="color:rgb(79, 79, 79);">2.3 栈遍历</font>
#### <font style="color:rgb(79, 79, 79);">2.3.1 栈遍历</font>
<font style="color:rgb(77, 77, 77);">栈只能对栈顶元素进行操作，如果想要进行遍历，只能将栈中元素一个个取出来存在数组中</font>

```plain
stack<int> st;
for (int i = 0; i < 10; ++i) st.push(i);
while (!st.empty()) {
    int tp = st.top(); // 栈顶元素
    st.pop();
}
```

#### <font style="color:rgb(79, 79, 79);">2.3.2 数组模拟栈进行遍历</font>
<font style="color:rgb(77, 77, 77);">通过一个</font>**<font style="color:rgb(77, 77, 77);">数组</font>**<font style="color:rgb(77, 77, 77);">对栈进行模拟，一个存放下标的变量</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">top</font>`<font style="color:rgb(77, 77, 77);">模拟指向栈顶的指针。</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">一般来说单调栈和单调队列写法均可使用额外变量</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">tt</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">或</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">hh</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">来进行模拟</font>

**<font style="color:rgb(77, 77, 77);">特点：</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">比</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">STL</font>`<font style="color:rgb(77, 77, 77);">的</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">stack</font>`<font style="color:rgb(77, 77, 77);">速度更快，遍历元素方便</font>

```plain
int s[100]; // 栈 从左至右为栈底到栈顶
int tt = -1; // tt 代表栈顶指针,初始栈内无元素，tt为-1

for(int i = 0; i <= 5; ++i) {
	//入栈 
	s[++tt] = i;
}
// 出栈
int top_element = s[tt--]; 

//入栈操作示意
//  0  1  2  3  4  5  
//                tt
//出栈后示意
//  0  1  2  3  4 
//              tt
```

## <font style="color:rgb(79, 79, 79);">3 queue</font>
### <font style="color:rgb(79, 79, 79);">3.1 介绍</font>
<font style="color:rgb(77, 77, 77);">队列是一种先进先出的</font>[<font style="color:rgb(77, 77, 77);">数据结构</font>](https://so.csdn.net/so/search?q=%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">。</font>

```plain
//头文件
#include<queue>
//定义初始化
queue<int> q;
```

### <font style="color:rgb(79, 79, 79);">3.2 方法函数</font>
| **<font style="color:rgb(79, 79, 79);">代码</font>** | **<font style="color:rgb(79, 79, 79);">含义</font>** |
| :---: | :---: |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">q.front()</font>` | <font style="color:rgb(79, 79, 79);">返回队首元素</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">q.back()</font>` | <font style="color:rgb(79, 79, 79);">返回队尾元素</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">q.push(element)</font>` | <font style="color:rgb(79, 79, 79);">尾部添加一个元素</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">element</font>`<br/><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">进队</font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">q.pop()</font>` | <font style="color:rgb(79, 79, 79);">删除第一个元素 出队</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">q.size()</font>` | <font style="color:rgb(79, 79, 79);">返回队列中元素个数，返回值类型</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">unsigned int</font>`<br/><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">q.empty()</font>` | <font style="color:rgb(79, 79, 79);">判断是否为空，队列为空，返回</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">true</font>`<br/><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |


### <font style="color:rgb(79, 79, 79);">3.3 队列模拟</font>
<font style="color:rgb(77, 77, 77);">使用</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">q[]</font>`<font style="color:rgb(77, 77, 77);">数组模拟队列</font>

`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">hh</font>`<font style="color:rgb(77, 77, 77);">表示队首元素的下标，</font>[<font style="color:rgb(77, 77, 77);">初始值</font>](https://so.csdn.net/so/search?q=%E5%88%9D%E5%A7%8B%E5%80%BC&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">0</font>`

`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">tt</font>`<font style="color:rgb(77, 77, 77);">表示队尾元素的下标，初始值为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">-1</font>`<font style="color:rgb(77, 77, 77);">，表示刚</font>**<font style="color:rgb(77, 77, 77);">开始队列为空</font>**

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">一般来说</font>[<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">单调栈</font>](https://so.csdn.net/so/search?q=%E5%8D%95%E8%B0%83%E6%A0%88&spm=1001.2101.3001.7020)<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">和单调队列写法均可使用额外变量</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">tt</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">或</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">hh</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">来进行模拟</font>

```plain
#include<bits/stdc++.h>
using namespace std;
const int N = 1e5 + 5;
int q[N];

int main() {
	int hh = 0,tt = -1;
//	入队 
	q[++tt] = 1;
	q[++tt] = 2; 
//	将所有元素出队 
	while(hh <= tt) {
		int t = q[hh++];
		printf("%d ",t);
	}
	return 0;
 } 
```

### <font style="color:rgb(79, 79, 79);">3.4 队列模拟例题</font>
<font style="color:rgb(77, 77, 77);">题目链接：</font><font style="color:rgb(77, 77, 77);"> </font>[<font style="color:rgb(77, 77, 77);">https://atcoder.jp/contests/abc247/tasks/abc247_d</font>](https://atcoder.jp/contests/abc247/tasks/abc247_d)

```plain
#include<bits/stdc++.h>
using namespace std;

using ll = long long ;
using pii = pair<int, int>;
const int N = 250005, mod = 998244353;

int q[N], num[N];

void solve() {
	int qq, hh = 0, tt = -1;
	cin >> qq;
	while(qq--) {
		int op;
		cin >> op;
		int x, c;
		if(op == 1) {
			cin >> x >> c;
			q[++tt] = c;
			num[tt] = x;
		} else {
			cin >> c;
			ll res = 0;
			while(c) {
				if(q[hh] > c) {
					q[hh] -= c;
					res += 1ll * c * num[hh];
					break;
				} else {
					res += 1ll * q[hh] * num[hh];
					c -= q[hh++];
				}
			}
			cout << res << "\n";
		}
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);

	int t;
	// cin >> t;
	t = 1;
	while(t--)
		solve();
	return 0;
}
```

## <font style="color:rgb(79, 79, 79);">4 </font>[<font style="color:rgb(79, 79, 79);">deque</font>](https://so.csdn.net/so/search?q=deque&spm=1001.2101.3001.7020)
### <font style="color:rgb(79, 79, 79);">4.1 介绍</font>
<font style="color:rgb(77, 77, 77);">首尾都可插入和删除的队列为</font>[<font style="color:rgb(77, 77, 77);">双端队列</font>](https://so.csdn.net/so/search?q=%E5%8F%8C%E7%AB%AF%E9%98%9F%E5%88%97&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">。</font>

```plain
//添加头文件
#include<deque>
//初始化定义
deque<int> dq;
```

### <font style="color:rgb(79, 79, 79);">4.2 方法函数</font>
<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">注意双端队列的常数比较大。</font>

| **<font style="color:rgb(79, 79, 79);">代码</font>** | **<font style="color:rgb(79, 79, 79);">含义</font>** |
| :---: | :---: |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">push_back(x)/push_front(x)</font>` | <font style="color:rgb(79, 79, 79);">把</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">x</font>`<br/><font style="color:rgb(79, 79, 79);">插入队尾后 / 队首</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">back()/front()</font>` | <font style="color:rgb(79, 79, 79);">返回队尾 / 队首元素</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">pop_back() / pop_front()</font>` | <font style="color:rgb(79, 79, 79);">删除队尾 / 队首元素</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">erase(iterator it)</font>` | <font style="color:rgb(79, 79, 79);">删除双端队列中的某一个元素</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">erase(iterator first,iterator last)</font>` | <font style="color:rgb(79, 79, 79);">删除双端队列中</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">[first,last)</font>`<br/><font style="color:rgb(79, 79, 79);">中的元素</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">empty()</font>` | <font style="color:rgb(79, 79, 79);">判断deque是否空</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">size()</font>` | <font style="color:rgb(79, 79, 79);">返回deque的元素数量</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">clear()</font>` | <font style="color:rgb(79, 79, 79);">清空deque</font> |


### <font style="color:rgb(79, 79, 79);">4.3 注意点</font>
<font style="color:rgb(77, 77, 77);">deque可以进行排序</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">双端队列排序一般不用，感觉毫无用处，使用其他</font>[<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">STL</font>](https://so.csdn.net/so/search?q=STL&spm=1001.2101.3001.7020)<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">依然可以实现相同功能</font>

```plain
//从小到大
sort(q.begin(), q.end())
//从大到小排序
sort(q.begin(), q.end(), greater<int>());//deque里面的类型需要是int型
sort(q.begin(), q.end(), greater());//高版本C++才可以用
```

## <font style="color:rgb(79, 79, 79);">5. priority_queue</font>
### <font style="color:rgb(79, 79, 79);">5.1 介绍</font>
[<font style="color:rgb(77, 77, 77);">优先队列</font>](https://so.csdn.net/so/search?q=%E4%BC%98%E5%85%88%E9%98%9F%E5%88%97&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">是在正常队列的基础上加了优先级，保证每次的队首元素都是优先级最大的。</font>

<font style="color:rgb(77, 77, 77);">可以实现每次从优先队列中取出的元素都是队列中</font>**<font style="color:rgb(77, 77, 77);">优先级最大</font>**<font style="color:rgb(77, 77, 77);">的一个。</font>

<font style="color:rgb(77, 77, 77);">它的底层是通过</font>**<font style="color:rgb(77, 77, 77);">堆</font>**<font style="color:rgb(77, 77, 77);">来实现的。</font>

```plain
//头文件
#include<queue>
//初始化定义
priority_queue<int> q;
```

### <font style="color:rgb(79, 79, 79);">5.2 函数方法</font>
| **<font style="color:rgb(79, 79, 79);">代码</font>** | **<font style="color:rgb(79, 79, 79);">含义</font>** |
| :---: | :---: |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">q.top()</font>` | <font style="color:rgb(79, 79, 79);">访问队首元素</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">q.push()</font>` | <font style="color:rgb(79, 79, 79);">入队</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( l o g N ) O(logN)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font>_<font style="color:rgb(79, 79, 79);">l</font>__<font style="color:rgb(79, 79, 79);">o</font>__<font style="color:rgb(79, 79, 79);">g</font>__<font style="color:rgb(79, 79, 79);">N</font>_<font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">q.pop()</font>` | <font style="color:rgb(79, 79, 79);">堆顶（队首）元素出队</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( l o g N ) O(logN)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font>_<font style="color:rgb(79, 79, 79);">l</font>__<font style="color:rgb(79, 79, 79);">o</font>__<font style="color:rgb(79, 79, 79);">g</font>__<font style="color:rgb(79, 79, 79);">N</font>_<font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">q.size()</font>` | <font style="color:rgb(79, 79, 79);">队列元素个数</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">q.empty()</font>` | <font style="color:rgb(79, 79, 79);">是否为空</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| **<font style="color:rgb(79, 79, 79);">注意</font>**<font style="color:rgb(79, 79, 79);">没有</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">clear()</font>`<br/><font style="color:rgb(79, 79, 79);">！</font> | <font style="color:rgb(79, 79, 79);">不提供该方法</font> |
| <font style="color:rgb(79, 79, 79);">优先队列只能通过</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">top()</font>`<br/><font style="color:rgb(79, 79, 79);">访问队首元素（优先级最高的元素）</font> | |


### <font style="color:rgb(79, 79, 79);">5.3 设置优先级</font>
#### <font style="color:rgb(79, 79, 79);">5.3.1 基本</font>[<font style="color:rgb(79, 79, 79);">数据类型</font>](https://so.csdn.net/so/search?q=%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B&spm=1001.2101.3001.7020)<font style="color:rgb(79, 79, 79);">的优先级</font>
```plain
priority_queue<int> pq; // 默认大根堆, 即每次取出的元素是队列中的最大值
priority_queue<int, vector<int>, greater<int>> q; // 小根堆, 每次取出的元素是队列中的最小值
```

<font style="color:rgb(77, 77, 77);">参数解释：</font>

+ <font style="color:rgb(77, 77, 77);">第一个参数：就是优先队列中存储的数据类型</font>
+ <font style="color:rgb(77, 77, 77);">第二个参数：</font>

`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">vector<int></font>`<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">是用来承载底层</font>[<font style="color:rgb(77, 77, 77);">数据结构</font>](https://so.csdn.net/so/search?q=%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">堆的容器，若优先队列中存放的是</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">double</font>`<font style="color:rgb(77, 77, 77);">型数据，就要填</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">vector< double ></font>`<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">总之存的是什么类型的数据，就相应的填写对应类型。同时也要改动第三个参数里面的对应类型。</font>**

+ <font style="color:rgb(77, 77, 77);">第三个参数：  
</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">less<int></font>`<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">表示数字大的优先级大，堆顶为最大的数字  
</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">greater<int></font>`<font style="color:rgb(77, 77, 77);">表示数字小的优先级大，堆顶为最小的数字  
</font>**<font style="color:rgb(77, 77, 77);">int代表的是数据类型，也要填优先队列中存储的数据类型</font>**

---

<font style="color:rgb(77, 77, 77);">下面介绍基础数据类型优先级设置的写法：</font>

1. <font style="color:rgba(0, 0, 0, 0.75);">基础写法（非常常用）：</font>

```plain
priority_queue<int> q1; // 默认大根堆, 即每次取出的元素是队列中的最大值
priority_queue<int, vector<int>, less<int> > q2; // 大根堆, 每次取出的元素是队列中的最大值，同第一行

priority_queue<int, vector<int>, greater<int> > q3; // 小根堆, 每次取出的元素是队列中的最小值
```

1. <font style="color:rgba(0, 0, 0, 0.75);">自定义排序（不常见，主要是写着麻烦）：</font>

<font style="color:rgb(77, 77, 77);">下面的代码比较长，基础类型优先级写着太麻烦，用第一种即可。</font>

```plain
struct cmp1 {
	bool operator()(int x, int y) {
		return x > y;
	}
};
struct cmp2 {
	bool operator()(const int x, const int y) {
		return x < y;
	}
};
priority_queue<int, vector<int>, cmp1> q1; // 小根堆
priority_queue<int, vector<int>, cmp2> q2; // 大根堆
```

#### <font style="color:rgb(79, 79, 79);">5.3.2 高级数据类型(结构体)优先级</font>
<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">即优先队列中存储结构体类型，必须要设置优先级，即结构体的比较运算（因为优先队列的堆中要比较大小，才能将对应最大或者最小元素移到堆顶）。</font>

<font style="color:rgb(77, 77, 77);">优先级设置可以定义在</font>**<font style="color:rgb(77, 77, 77);">结构体内</font>**<font style="color:rgb(77, 77, 77);">进行小于号重载，也可以定义在</font>**<font style="color:rgb(77, 77, 77);">结构体外</font>**<font style="color:rgb(77, 77, 77);">。</font>

```plain
//要排序的结构体（存储在优先队列里面的）
struct Point {
	int x, y;
};
```

+ **<font style="color:rgba(0, 0, 0, 0.75);">版本一：自定义全局比较规则</font>**

```plain
//定义的比较结构体
//注意：cmp是个结构体 
struct cmp {//自定义堆的排序规则 
	bool operator()(const Point& a,const Point& b) {
		return a.x < b.x;
	}
};

//初始化定义， 
priority_queue<Point, vector<Point>, cmp> q; // x大的在堆顶
```

+ **<font style="color:rgba(0, 0, 0, 0.75);">版本二：直接在结构体里面写</font>**

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">因为是在结构体内部自定义的规则，一旦需要比较结构体，自动调用结构体内部重载运算符规则。</font>

<font style="color:rgb(77, 77, 77);">结构体内部有两种方式：</font>

**<font style="color:rgb(77, 77, 77);">方式一</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">：</font>

```plain
struct node {
	int x, y;
	friend bool operator < (Point a, Point b) {//为两个结构体参数，结构体调用一定要写上friend
		return a.x < b.x;//按x从小到大排，x大的在堆顶
	}
};
```

**<font style="color:rgb(77, 77, 77);">方式二</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">：（推荐此种）</font>

```plain
struct node {
    int x, y;
    bool operator < (const Point &a) const {//直接传入一个参数，不必要写friend
        return x < a.x;//按x升序排列，x大的在堆顶
    }
};
```

<font style="color:rgb(77, 77, 77);">优先队列的定义</font>

```plain
priority_queue<Point> q;
```

**<font style="color:rgb(77, 77, 77);">注意：</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">优先队列自定义排序规则和</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">sort()</font>`<font style="color:rgb(77, 77, 77);">函数定义</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">cmp</font>`<font style="color:rgb(77, 77, 77);">函数很相似，但是最后返回的情况是</font>**<font style="color:rgb(77, 77, 77);">相反</font>**<font style="color:rgb(77, 77, 77);">的。即相同的符号，最后定义的排列顺序是完全相反的。  
</font><font style="color:rgb(77, 77, 77);">所以只需要记住</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">sort</font>`<font style="color:rgb(77, 77, 77);">的排序规则和优先队列的排序规则是相反的就可以了。</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">当理解了堆的原理就会发现，堆调整时比较顺序是孩子和父亲节点进行比较，如果是</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">></font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">，那么孩子节点要大于父亲节点，堆顶自然是最小值。</font>

### <font style="color:rgb(79, 79, 79);">5.4 存储特殊类型的优先级</font>
#### <font style="color:rgb(79, 79, 79);">5.4.1 存储pair类型</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">排序规则：  
</font><font style="color:rgba(0, 0, 0, 0.75);">默认先对</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">pair</font>`<font style="color:rgba(0, 0, 0, 0.75);">的</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">first</font>`<font style="color:rgba(0, 0, 0, 0.75);">进行降序排序，然后再对</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">second</font>`<font style="color:rgba(0, 0, 0, 0.75);">降序排序  
</font><font style="color:rgba(0, 0, 0, 0.75);">对</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">first</font>`<font style="color:rgba(0, 0, 0, 0.75);">先排序，大的排在前面，如果</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">first</font>`<font style="color:rgba(0, 0, 0, 0.75);">元素相同，再对</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">second</font>`<font style="color:rgba(0, 0, 0, 0.75);">元素排序，保持大的在前面。</font>

`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">pair</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">请参考下文</font>

```plain
#include<bits/stdc++.h>
using namespace std;
int main() {
    priority_queue<pair<int, int> >q;
	q.push({7, 8});
	q.push({7, 9});
	q.push(make_pair(8, 7));
    while(!q.empty()) {
        cout << q.top().first << " " << q.top().second << "\n";
        q.pop();
    }
    return 0;
}
```

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">结果：  
</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">8 7  
</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">7 9  
</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">7 8</font>

## <font style="color:rgb(79, 79, 79);">6. map</font>
### <font style="color:rgb(79, 79, 79);">6.1 介绍</font>
<font style="color:rgb(77, 77, 77);">映射类似于函数的对应关系，每个</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">x</font>`<font style="color:rgb(77, 77, 77);">对应一个</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">y</font>`<font style="color:rgb(77, 77, 77);">，而</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">map</font>`<font style="color:rgb(77, 77, 77);">是每个键对应一个值。会python的朋友学习后就会知道这和python的字典非常类似。</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">比如说：学习 对应 看书，学习 是键，看书 是值。  
</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">学习->看书  
</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">玩耍 对应 打游戏，玩耍 是键，打游戏 是值。  
</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">玩耍->打游戏</font>

```plain
//头文件
#include<map>
//初始化定义
map<string, string> mp;
map<string, int> mp;
map<int, node> mp;//node是结构体类型
```

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">map特性：map会按照键的顺序从小到大自动排序，键的类型必须可以</font>[<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">比较大小</font>](https://so.csdn.net/so/search?q=%E6%AF%94%E8%BE%83%E5%A4%A7%E5%B0%8F&spm=1001.2101.3001.7020)

### <font style="color:rgb(79, 79, 79);">6.2 函数方法</font>
#### <font style="color:rgb(79, 79, 79);">6.2.1 函数方法</font>
| **<font style="color:rgb(79, 79, 79);">代码</font>** | **<font style="color:rgb(79, 79, 79);">含义</font>** |
| :---: | :---: |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.find(key)</font>` | <font style="color:rgb(79, 79, 79);">返回键为key的映射的迭代器 $O(logN) $ 注意：用find函数来定位数据出现位置，它返回一个迭代器。当数据存在时，返回数据所在位置的迭代器，数据不存在时，返回</font><font style="color:rgb(79, 79, 79);">m p . e n d ( ) mp.end()</font>_<font style="color:rgb(79, 79, 79);">m</font>__<font style="color:rgb(79, 79, 79);">p</font>_<font style="color:rgb(79, 79, 79);">.</font>_<font style="color:rgb(79, 79, 79);">e</font>__<font style="color:rgb(79, 79, 79);">n</font>__<font style="color:rgb(79, 79, 79);">d</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.erase(it)</font>` | <font style="color:rgb(79, 79, 79);">删除迭代器对应的键和值</font><font style="color:rgb(79, 79, 79);">O ( l o g N ) O(logN)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font>_<font style="color:rgb(79, 79, 79);">l</font>__<font style="color:rgb(79, 79, 79);">o</font>__<font style="color:rgb(79, 79, 79);">g</font>__<font style="color:rgb(79, 79, 79);">N</font>_<font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.erase(key)</font>` | <font style="color:rgb(79, 79, 79);">根据映射的键删除键和值</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( l o g N ) O(logN)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font>_<font style="color:rgb(79, 79, 79);">l</font>__<font style="color:rgb(79, 79, 79);">o</font>__<font style="color:rgb(79, 79, 79);">g</font>__<font style="color:rgb(79, 79, 79);">N</font>_<font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.erase(first,last)</font>` | <font style="color:rgb(79, 79, 79);">删除左闭右开区间迭代器对应的键和值</font><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">O ( l a s t − f i r s t ) O(last-first)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font>_<font style="color:rgb(79, 79, 79);">l</font>__<font style="color:rgb(79, 79, 79);">a</font>__<font style="color:rgb(79, 79, 79);">s</font>__<font style="color:rgb(79, 79, 79);">t</font>_<font style="color:rgb(79, 79, 79);">−</font>_<font style="color:rgb(79, 79, 79);">f</font>__<font style="color:rgb(79, 79, 79);">i</font>__<font style="color:rgb(79, 79, 79);">rs</font>__<font style="color:rgb(79, 79, 79);">t</font>_<font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.size()</font>` | <font style="color:rgb(79, 79, 79);">返回映射的对数$ O(1)$</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.clear()</font>` | <font style="color:rgb(79, 79, 79);">清空map中的所有元素</font><font style="color:rgb(79, 79, 79);">O ( N ) O(N)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font>_<font style="color:rgb(79, 79, 79);">N</font>_<font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.insert()</font>` | <font style="color:rgb(79, 79, 79);">插入元素，插入时要构造键值对</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.empty()</font>` | <font style="color:rgb(79, 79, 79);">如果map为空，返回true，否则返回false</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.begin()</font>` | <font style="color:rgb(79, 79, 79);">返回指向map第一个元素的迭代器（地址）</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.end()</font>` | <font style="color:rgb(79, 79, 79);">返回指向map尾部的迭代器（最后一个元素的</font>**<font style="color:rgb(79, 79, 79);">下一个</font>**<font style="color:rgb(79, 79, 79);">地址）</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.rbegin()</font>` | <font style="color:rgb(79, 79, 79);">返回指向map最后一个元素的迭代器（地址）</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.rend()</font>` | <font style="color:rgb(79, 79, 79);">返回指向map第一个元素前面(上一个）的逆向迭代器（地址）</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.count(key)</font>` | <font style="color:rgb(79, 79, 79);">查看元素是否存在，因为map中键是唯一的，所以存在返回1，不存在返回0</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.lower_bound()</font>` | <font style="color:rgb(79, 79, 79);">返回一个迭代器，指向键值>=</font><font style="color:rgb(79, 79, 79);"> </font>**<font style="color:rgb(79, 79, 79);">key</font>**<font style="color:rgb(79, 79, 79);">的第一个元素</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.upper_bound()</font>` | <font style="color:rgb(79, 79, 79);">返回一个迭代器，指向键值> key的第一个元素</font> |


#### <font style="color:rgb(79, 79, 79);">6.2.2 注意点</font>
**<font style="color:rgb(77, 77, 77);">下面说明部分函数方法的注意点</font>**

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">注意：  
</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">查找元素</font>[<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">是否存在</font>](https://so.csdn.net/so/search?q=%E6%98%AF%E5%90%A6%E5%AD%98%E5%9C%A8&spm=1001.2101.3001.7020)<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">时，可以使用  
</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">①</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.find()</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">②</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.count()</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">③</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp[key]</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">  
</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">但是第三种情况，如果不存在对应的</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">key</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">时，会自动创建一个</font>[<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">键值对</font>](https://so.csdn.net/so/search?q=%E9%94%AE%E5%80%BC%E5%AF%B9&spm=1001.2101.3001.7020)<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">（产生一个额外的键值对空间）  
</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">所以为了不增加额外的空间负担，最好使用前两种方法</font>

#### <font style="color:rgb(79, 79, 79);">6.2.3 迭代器进行正反向遍历</font>
+ `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.begin()</font>`<font style="color:rgba(0, 0, 0, 0.75);">和</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.end()</font>`<font style="color:rgba(0, 0, 0, 0.75);">用法：</font>

**<font style="color:rgb(77, 77, 77);">用于正向遍历map</font>**

```plain
map<int,int> mp;
mp[1] = 2;
mp[2] = 3;
mp[3] = 4;
auto it = mp.begin();
while(it != mp.end()) {
	cout << it->first << " " << it->second << "\n";
	it ++;
}
```

**<font style="color:rgb(77, 77, 77);">结果：</font>**

```plain
1 2
2 3
3 4
```

+ `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.rbegin()</font>`<font style="color:rgba(0, 0, 0, 0.75);">和</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">mp.rend()</font>`

**<font style="color:rgb(77, 77, 77);">用于逆向遍历map</font>**

```plain
map<int,int> mp;
mp[1] = 2;
mp[2] = 3;
mp[3] = 4;
auto it = mp.rbegin();
while(it != mp.rend()) {
	cout << it->first << " " << it->second << "\n";
	it ++;
}
```

**<font style="color:rgb(77, 77, 77);">结果：</font>**

```plain
3 4
2 3
1 2
```

#### <font style="color:rgb(79, 79, 79);">6.2.4 二分查找</font>
<font style="color:rgb(77, 77, 77);">二分查找</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">lower_bound() upper_bound()</font>`

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">map的二分查找以第一个元素（即键为准），对</font>**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">键</font>**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">进行二分查找  
</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">返回值为map迭代器类型</font>

```plain
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
```

### <font style="color:rgb(79, 79, 79);">6.3 添加元素</font>
```plain
//先声明
map<string, string> mp;
```

+ **<font style="color:rgba(0, 0, 0, 0.75);">方式一：</font>**

```plain
mp["学习"] = "看书";
mp["玩耍"] = "打游戏";
```

+ **<font style="color:rgba(0, 0, 0, 0.75);">方式二：插入元素构造键值对</font>**

```plain
mp.insert(make_pair("vegetable","蔬菜"));
```

+ **<font style="color:rgba(0, 0, 0, 0.75);">方式三：</font>**

```plain
mp.insert(pair<string,string>("fruit","水果"));
```

+ **<font style="color:rgba(0, 0, 0, 0.75);">方式四:</font>**

```plain
mp.insert({"hahaha","wawawa"});
```

### <font style="color:rgb(79, 79, 79);">6.4 访问元素</font>
#### <font style="color:rgb(79, 79, 79);">6.4.1 下标访问</font>
<font style="color:rgb(77, 77, 77);">(大部分情况用于访问单个元素)</font>

```plain
mp["菜哇菜"] = "强哇强";
cout << mp["菜哇菜"] << "\n";//只是简写的一个例子，程序并不完整
```

#### <font style="color:rgb(79, 79, 79);">6.4.2 遍历访问</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">方式一：迭代器访问</font>

```plain
map<string,string>::iterator it;
for(it = mp.begin(); it != mp.end(); it++) {
	//      键                 值 
	// it是结构体指针访问所以要用 -> 访问
	cout << it->first << " " << it->second << "\n";
	//*it是结构体变量 访问要用 . 访问
	//cout<<(*it).first<<" "<<(*it).second;
}
```

+ <font style="color:rgba(0, 0, 0, 0.75);">方式二：智能指针访问</font>

```plain
for(auto i : mp)
cout << i.first << " " << i.second << endl;//键，值
```

+ <font style="color:rgba(0, 0, 0, 0.75);">方式三：对指定单个元素访问</font>

```plain
map<char,int>::iterator it = mp.find('a');
cout << it -> first << " " <<  it->second << "\n";
```

+ <font style="color:rgba(0, 0, 0, 0.75);">方式四：c++17特性才具有</font>

```plain
for(auto [x, y] : mp)
	cout << x << " " << y << "\n";
//x,y对应键和值
```

### <font style="color:rgb(79, 79, 79);">6.5 与unordered_map的比较</font>
<font style="color:rgb(77, 77, 77);">这里就不单开一个大目录讲unordered_map了，直接在map里面讲了。</font>

#### <font style="color:rgb(79, 79, 79);">6.5.1 内部实现原理</font>
**<font style="color:rgb(77, 77, 77);">map</font>**<font style="color:rgb(77, 77, 77);">：内部用</font>**<font style="color:rgb(77, 77, 77);">红黑树</font>**<font style="color:rgb(77, 77, 77);">实现，具有</font>**<font style="color:rgb(77, 77, 77);">自动排序</font>**<font style="color:rgb(77, 77, 77);">（按键从小到大）功能。</font>

**<font style="color:rgb(77, 77, 77);">unordered_map</font>**<font style="color:rgb(77, 77, 77);">：内部用</font>**<font style="color:rgb(77, 77, 77);">哈希表</font>**<font style="color:rgb(77, 77, 77);">实现，内部元素无序杂乱。</font>

#### <font style="color:rgb(79, 79, 79);">6.5.2 效率比较</font>
**<font style="color:rgb(77, 77, 77);">map</font>**<font style="color:rgb(77, 77, 77);">：</font>

+ <font style="color:rgb(77, 77, 77);">优点：内部用红黑树实现，内部元素具有有序性，查询删除等操作复杂度为</font><font style="color:rgb(77, 77, 77);">O ( l o g N ) O(logN)</font>_<font style="color:rgb(77, 77, 77);">O</font>_<font style="color:rgb(77, 77, 77);">(</font>_<font style="color:rgb(77, 77, 77);">l</font>__<font style="color:rgb(77, 77, 77);">o</font>__<font style="color:rgb(77, 77, 77);">g</font>__<font style="color:rgb(77, 77, 77);">N</font>_<font style="color:rgb(77, 77, 77);">)</font>
+ <font style="color:rgb(77, 77, 77);">缺点：占用空间，红黑树里每个节点需要保存父子节点和红黑性质等信息，空间占用较大。</font>

**<font style="color:rgb(77, 77, 77);">unordered_map</font>**<font style="color:rgb(77, 77, 77);">：</font>

+ <font style="color:rgba(0, 0, 0, 0.75);">优点：内部用哈希表实现，查找速度非常快（适用于大量的查询操作）。</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">缺点：建立哈希表比较耗时。</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">两者方法函数基本一样，差别不大。</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">注意：</font>

+ <font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">随着内部元素越来越多，两种容器的插入删除查询操作的时间都会逐渐变大，效率逐渐变低。</font>
+ <font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">使用</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">[]</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">查找元素时，如果元素不存在，两种容器</font>**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">都是</font>**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">创建一个空的元素；如果存在，会正常索引对应的值。所以如果查询过多的不存在的元素值，容器内部会创建大量的空的键值对，后续查询创建删除效率会</font>**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">大大降低</font>**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">。</font>
+ <font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">查询容器内部元素的最优方法是：先判断存在与否，再索引对应值（适用于这两种容器）</font>

```plain
// 以 map 为例
map<int, int> mp;
int x = 999999999;
if(mp.count(x)) // 此处判断是否存在x这个键
    cout << mp[x] << "\n";   // 只有存在才会索引对应的值，避免不存在x时多余空元素的创建
```

<font style="color:rgb(77, 77, 77);">另外：</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">还有一种映射：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">multimap</font>`

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">键可以重复，即一个键对应多个值，如要了解，可以自行搜索。</font>

## <font style="color:rgb(79, 79, 79);">7 set</font>
### <font style="color:rgb(79, 79, 79);">7.1 介绍</font>
[<font style="color:rgb(77, 77, 77);">set容器</font>](https://so.csdn.net/so/search?q=set%E5%AE%B9%E5%99%A8&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">中的元素不会重复，当插入集合中已有的元素时，并不会插入进去，而且set容器里的元素自动从小到大排序。</font>

<font style="color:rgb(77, 77, 77);">即：set里面的元素</font>**<font style="color:rgb(77, 77, 77);">不重复 且有序</font>**

```plain
//头文件
#include<set>
//初始化定义
set<int> s;
```

### <font style="color:rgb(79, 79, 79);">7.2 函数方法</font>
| **<font style="color:rgb(79, 79, 79);">代码</font>** | **<font style="color:rgb(79, 79, 79);">含义</font>** |
| :---: | :---: |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.begin()</font>` | <font style="color:rgb(79, 79, 79);">返回set容器的第一个元素的地址（迭代器）</font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.end()</font>` | <font style="color:rgb(79, 79, 79);">返回set容器的最后一个元素的下一个地址（迭代器）</font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.rbegin()</font>` | <font style="color:rgb(79, 79, 79);">返回逆序迭代器，指向容器元素最后一个位置</font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.rend()</font>` | <font style="color:rgb(79, 79, 79);">返回逆序迭代器，指向容器第一个元素前面的位置</font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.clear()</font>` | <font style="color:rgb(79, 79, 79);">删除set容器中的所有的元素</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.empty()</font>` | <font style="color:rgb(79, 79, 79);">判断set容器是否为空</font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.insert()</font>` | <font style="color:rgb(79, 79, 79);">插入一个元素</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.size()</font>` | <font style="color:rgb(79, 79, 79);">返回当前set容器中的元素个数</font><font style="color:rgb(79, 79, 79);">O ( 1 ) O(1)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font><font style="color:rgb(79, 79, 79);">1</font><font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">erase(iterator)</font>` | <font style="color:rgb(79, 79, 79);">删除定位器iterator指向的值</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">erase(first,second）</font>` | <font style="color:rgb(79, 79, 79);">删除定位器first和second之间的值</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">erase(key_value)</font>` | <font style="color:rgb(79, 79, 79);">删除键值key_value的值</font> |
| <font style="color:rgb(79, 79, 79);">查找</font> | |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.find(element)</font>` | <font style="color:rgb(79, 79, 79);">查找set中的某一元素，有则返回该元素对应的迭代器，无则返回结束迭代器</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.count(element)</font>` | <font style="color:rgb(79, 79, 79);">查找set中的元素出现的个数，由于set中元素唯一，此函数相当于查询element是否出现</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.lower_bound(k)</font>` | <font style="color:rgb(79, 79, 79);">返回大于等于k的第一个元素的迭代器</font><font style="color:rgb(79, 79, 79);">O ( l o g N ) O(logN)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font>_<font style="color:rgb(79, 79, 79);">l</font>__<font style="color:rgb(79, 79, 79);">o</font>__<font style="color:rgb(79, 79, 79);">g</font>__<font style="color:rgb(79, 79, 79);">N</font>_<font style="color:rgb(79, 79, 79);">)</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.upper_bound(k)</font>` | <font style="color:rgb(79, 79, 79);">返回大于k的第一个元素的迭代器</font><font style="color:rgb(79, 79, 79);">O ( l o g N ) O(logN)</font>_<font style="color:rgb(79, 79, 79);">O</font>_<font style="color:rgb(79, 79, 79);">(</font>_<font style="color:rgb(79, 79, 79);">l</font>__<font style="color:rgb(79, 79, 79);">o</font>__<font style="color:rgb(79, 79, 79);">g</font>__<font style="color:rgb(79, 79, 79);">N</font>_<font style="color:rgb(79, 79, 79);">)</font> |


---

### <font style="color:rgb(79, 79, 79);">7.3 访问</font>
+ **<font style="color:rgba(0, 0, 0, 0.75);">迭代器访问</font>**

```plain
for(set<int>::iterator it = s.begin(); it != s.end(); it++)
	cout << *it << " ";
```

+ **<font style="color:rgba(0, 0, 0, 0.75);">智能指针</font>**

```plain
for(auto i : s)
	cout << i << endl;
```

+ **<font style="color:rgba(0, 0, 0, 0.75);">访问最后一个元素</font>**

```plain
//第一种
cout << *s.rbegin() << endl;
```

```plain
//第二种
set<int>::iterator iter = s.end();
iter--;
cout << (*iter) << endl; //打印2;
```

```plain
//第三种
cout << *(--s.end()) << endl;
```

---

### <font style="color:rgb(79, 79, 79);">7.4 重载<运算符</font>
+ **<font style="color:rgba(0, 0, 0, 0.75);">基础数据类型</font>**

<font style="color:rgb(77, 77, 77);">方式一：改变set排序规则，set中默认使用</font>[<font style="color:rgb(77, 77, 77);">less</font>](https://so.csdn.net/so/search?q=less&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">比较器，即从小到大排序。（常用）</font>

```plain
set<int> s1; // 默认从小到大排序
set<int, greater<int> > s2; // 从大到小排序
```

<font style="color:rgb(77, 77, 77);">方式二：重载运算符。（很麻烦，不太常用，没必要）</font>

```plain
//重载 < 运算符
struct cmp {
    bool operator () (const int& u, const int& v) const {
       // return + 返回条件
       return u > v;
    }
};
set<int, cmp> s; 

for(int i = 1; i <= 10; i++)
    s.insert(i);
for(auto i : s)
    cout << i << " ";
// 10 9 8 7 6 5 4 3 2 1
```

<font style="color:rgb(77, 77, 77);">方式三：初始化时使用匿名函数定义比较规则</font>

```plain
set<int, function<bool(int, int)>> s([&](int i, int j){
    return i > j; // 从大到小
});
for(int i = 1; i <= 10; i++)
    s.insert(i);
for(auto x : s)
    cout << x << " ";
```

+ **<font style="color:rgba(0, 0, 0, 0.75);">高级数据类型（结构体）</font>**

<font style="color:rgb(77, 77, 77);">直接重载结构体运算符即可，让结构体可以比较。</font>

```plain
struct Point {
	int x, y;
	bool operator < (const Point &p) const {
		// 按照点的横坐标从小到大排序,如果横坐标相同,纵坐标从小到大
		if(x == p.x)
			return y < p.y;
		return x < p.x;
	}
};

set<Point> s;
for(int i = 1; i <= 5; i++) {
    int x, y;
    cin >> x >> y;
    s.insert({x, y});
}	
/* 输入
5 4
5 2
3 7
3 5
4 8
*/

for(auto i : s)
    cout << i.x << " " << i.y << "\n";
/* 输出
3 5
3 7
4 8
5 2
5 4
*/
```

### <font style="color:rgb(79, 79, 79);">7.5 其它set</font>
`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">multiset</font>`<font style="color:rgb(77, 77, 77);">:元素可以重复，且元素有序</font>

`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">unordered_set</font>`<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">：元素无序且只能出现一次</font>

`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">unordered_multiset</font>`<font style="color:rgb(77, 77, 77);"> ： 元素无序可以出现多次</font>

## <font style="color:rgb(79, 79, 79);">8 pair</font>
### <font style="color:rgb(79, 79, 79);">8.1 介绍</font>
<font style="color:rgb(77, 77, 77);">pair只含有两个元素，可以看作是只有两个元素的</font>[<font style="color:rgb(77, 77, 77);">结构体</font>](https://so.csdn.net/so/search?q=%E7%BB%93%E6%9E%84%E4%BD%93&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">。</font>

**<font style="color:rgb(77, 77, 77);">应用：</font>**

+ <font style="color:rgba(0, 0, 0, 0.75);">代替二元结构体</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">作为map键值对进行插入（代码如下）</font>

```plain
map<string, int> mp;
mp.insert(pair<string, int>("xingmaqi",1));
// mp.insert(make_pair("xingmaqi", 1));
// mp.insert({"xingmaqi", 1});
```

[<font style="color:rgb(77, 77, 77);">初始化操作</font>](https://so.csdn.net/so/search?q=%E5%88%9D%E5%A7%8B%E5%8C%96%E6%93%8D%E4%BD%9C&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">和赋值操作</font>

```plain
//头文件
#include<utility>

//1.初始化定义
pair<string, int> p("wangyaqi",1);//带初始值的
pair<string, int> p;//不带初始值的

//2.赋值
p = {"wang", 18};
p = make_pair("wang", 18);
p = pair<string, int>("wang", 18);
```

### <font style="color:rgb(79, 79, 79);">8.2 访问</font>
```plain
//定义结构体数组
pair<int,int> p[20];
for(int i = 0; i < 20; i++) {
	//和结构体类似，first代表第一个元素，second代表第二个元素
	cout << p[i].first << " " << p[i].second;
}
```

---

## <font style="color:rgb(79, 79, 79);">9 string</font>
### <font style="color:rgb(79, 79, 79);">9.1 介绍</font>
<font style="color:rgb(77, 77, 77);">string是一个字符串类，和</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">char</font>`<font style="color:rgb(77, 77, 77);">型字符串类似。</font>

<font style="color:rgb(77, 77, 77);">可以把string理解为一个</font>[<font style="color:rgb(77, 77, 77);">字符串类型</font>](https://so.csdn.net/so/search?q=%E5%AD%97%E7%AC%A6%E4%B8%B2%E7%B1%BB%E5%9E%8B&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">，像int一样可以定义</font>

### <font style="color:rgb(79, 79, 79);">9.2 初始化及定义</font>
```plain
//头文件
#include<string>

//1.
string str1; //生成空字符串

//2.
string str2("123456789"); //生成"1234456789"的复制品 

//3.
string str3("12345", 0, 3);//结果为"123" ，从0位置开始，长度为3

//4.
string str4("123456", 5); //结果为"12345" ，长度为5

//5.
string str5(5, '2'); //结果为"22222" ,构造5个字符'2'连接而成的字符串

//6.
string str6(str2, 2); //结果为"3456789"，截取第三个元素（2对应第三位）到最后
```

**<font style="color:rgb(77, 77, 77);">简单使用</font>**

+ <font style="color:rgba(0, 0, 0, 0.75);">访问单个字符：</font>

```plain
#include<iostream>
#include<string>
using namespace std;
int main() {
	string s = "xing ma qi!!!";
	for(int i = 0; i < s.size(); i++)
		cout << s[i] << " ";
	return 0;
}
```

+ <font style="color:rgba(0, 0, 0, 0.75);">string数组使用：</font>

```plain
#include<iostream>
#include<string>
using namespace std;
int main() {
	string s[10];
	for(int i = 1; i < 10; i++) {
		s[i] = "loading...  " ;
		cout << s[i] << i << "\n";
	} 
	return 0;
}
```

<font style="color:rgb(77, 77, 77);">结果：</font>

```plain
loading...  1
loading...  2
loading...  3
loading...  4
loading...  5
loading...  6
loading...  7
loading...  8
loading...  9
```

### <font style="color:rgb(79, 79, 79);">9.3 string 特性</font>
+ <font style="color:rgb(77, 77, 77);">支持</font>**<font style="color:rgb(77, 77, 77);">比较</font>**<font style="color:rgb(77, 77, 77);">运算符  
</font><font style="color:rgb(77, 77, 77);">string字符串支持常见的比较</font>[<font style="color:rgb(77, 77, 77);">操作符</font>](https://so.csdn.net/so/search?q=%E6%93%8D%E4%BD%9C%E7%AC%A6&spm=1001.2101.3001.7020)`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">（>,>=,<,<=,==,!=）</font>`<font style="color:rgb(77, 77, 77);">，支持</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">string</font>`<font style="color:rgb(77, 77, 77);">与</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">C-string</font>`<font style="color:rgb(77, 77, 77);">的比较（如</font><font style="color:rgb(77, 77, 77);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">str < "hello"</font>`<font style="color:rgb(77, 77, 77);">）。  
</font><font style="color:rgb(77, 77, 77);">在使用</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">>,>=,<,<=</font>`<font style="color:rgb(77, 77, 77);">这些操作符的时候是根据“当前字符特性”将字符按</font><font style="color:rgb(77, 77, 77);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">字典顺序</font>`<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">进行逐一得 比较。字典排序靠前的字符小， 比较的顺序是从前向后比较，遇到不相等的字符就按这个位置上的两个字符的比较结果确定两个字符串的大小（前面减后面）。</font>

<font style="color:rgb(77, 77, 77);">同时，</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">string ("aaaa") <string(aaaaa)</font>`<font style="color:rgb(77, 77, 77);">。</font>

+ <font style="color:rgb(77, 77, 77);">支持</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">+</font>`**<font style="color:rgb(77, 77, 77);">运算</font>**<font style="color:rgb(77, 77, 77);">符，代表拼接字符串  
</font><font style="color:rgb(77, 77, 77);">string字符串可以拼接，通过"+"运算符进行拼接。</font>

```plain
string s1 = "123";
string s2 = "456";
string s = s1 + s2;
cout << s;   //123456
```

### <font style="color:rgb(79, 79, 79);">9.4 读入详解</font>
**<font style="color:rgb(77, 77, 77);">读入字符串，遇空格，回车结束</font>**

```plain
string s;
cin >> s;
```

**<font style="color:rgb(77, 77, 77);">读入一行字符串（包括空格），遇回车结束</font>**

```plain
string s;
getline(cin, s);
```

<font style="color:rgb(77, 77, 77);">注意:</font><font style="color:rgb(77, 77, 77);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">getline(cin, s)</font>`<font style="color:rgb(77, 77, 77);">会获取前一个输入的换行符，需要在前面添加读取换行符的语句。如：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">getchar()</font>`<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">或</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);"> </font><font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">cin.get()</font>`

<font style="color:rgb(77, 77, 77);">错误读取：</font>

```plain
int n;
string s;
cin >> n;
getline(cin, s); //此时读取相当于读取了前一个回车字符
```

<font style="color:rgb(77, 77, 77);">正确读取：</font>

```plain
int n;
string s;
cin >> n;
getchar(); //cin.get()
getline(cin, s);//可正确读入下一行的输入
```

`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">cin</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">与</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">cin.getline()</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">混用</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">cin输入完后，回车，cin遇到回车结束输入，但回车还在输入流中，cin并不会清除，导致</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">getline()</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">读取回车，结束。  
</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">需要在cin后面加</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">cin.ignore()</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">；主动删除输入流中的换行符。（不常用）</font>

**<font style="color:rgb(77, 77, 77);">cin和cout解锁</font>**

<font style="color:rgb(77, 77, 77);">代码（写在main函数开头）：</font>

```plain
ios::sync_with_stdio(false);
cin.tie(0),cout.tie(0);
```

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">为什么要进行</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">cin</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">和</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">cout</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">的解锁，原因是：</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">在一些题目中，读入的</font>**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">数据量很大</font>**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">，往往超过了1e5（10</font><sup><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">5</font></sup><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">）的数据量,而</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">cin</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">和</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">cout</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">的读入输出的速度</font>**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">很慢</font>**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">（是因为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">cin</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">和</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">cout</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">为了兼容C语言的读入输出在性能上做了妥协），远不如</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">scanf</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">和</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">printf</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">的速度，具体原因可以搜索相关的博客进行了解。</font>

**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">所以</font>**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">对</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">cin</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">和</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">cout</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">进行解锁使</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">cin</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">和</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">cout</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">的速度几乎接近</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">scanf</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">和</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">printf</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">，避免输入输出超时。</font>

**<font style="color:rgb(77, 77, 77);">注意</font>**<font style="color:rgb(77, 77, 77);">：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">cin cout</font>`<font style="color:rgb(77, 77, 77);">解锁使用时，不能与</font><font style="color:rgb(77, 77, 77);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">scanf,getchar, printf,cin.getline()</font>`<font style="color:rgb(77, 77, 77);">混用，一定要注意，会出错。</font>

**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">string与C语言字符串（C-string）的区别</font>**

+ <font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);">string  
</font><font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);">是C++的一个类，专门实现字符串的相关操作。具有丰富的操作方法，数据类型为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">string</font>`<font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);">，字符串结尾没有</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">\0</font>`<font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);">字符</font>
+ <font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);">C-string  
</font><font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);">C语言中的字符串，用char数组实现，类型为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">const char *</font>`<font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);">,字符串结尾以</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">\0</font>`<font style="color:rgba(0, 0, 0, 0.5);background-color:rgb(238, 240, 244);">结尾</font>

<font style="color:rgb(77, 77, 77);">一般来说string向char数组转换会出现一些问题，所以为了能够实现转换，string有一个方法</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">c_str()</font>`<font style="color:rgb(77, 77, 77);">实现string向char数组的转换。</font>

```plain
string s = "xing ma qi";
const char *s2 = s.c_str();
```

### <font style="color:rgb(79, 79, 79);">9.5 函数方法</font>
+ **<font style="color:rgba(0, 0, 0, 0.75);">获取字符串长度</font>**

| **<font style="color:rgb(79, 79, 79);">代码</font>** | **<font style="color:rgb(79, 79, 79);">含义</font>** |
| :---: | :---: |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.size()</font>`<br/><font style="color:rgb(79, 79, 79);">和</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.length()</font>` | <font style="color:rgb(79, 79, 79);">返回string对象的字符个数，他们执行效果相同。</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.max_size()</font>` | <font style="color:rgb(79, 79, 79);">返回string对象最多包含的字符数，超出会抛出length_error异常</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.capacity()</font>` | <font style="color:rgb(79, 79, 79);">重新分配内存之前，string对象能包含的最大字符数</font> |


+ **<font style="color:rgba(0, 0, 0, 0.75);">插入</font>**

| **<font style="color:rgb(79, 79, 79);">代码</font>** | **<font style="color:rgb(79, 79, 79);">含义</font>** |
| :---: | :---: |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.push_back()</font>` | <font style="color:rgb(79, 79, 79);">在末尾插入</font> |
| <font style="color:rgb(79, 79, 79);">例：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.push_back('a')</font>` | <font style="color:rgb(79, 79, 79);">末尾插入一个字符a</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.insert(pos,element)</font>` | <font style="color:rgb(79, 79, 79);">在pos位置插入element</font> |
| <font style="color:rgb(79, 79, 79);">例：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.insert(s.begin(),'1')</font>` | <font style="color:rgb(79, 79, 79);">在第一个位置插入1字符</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.append(str)</font>` | <font style="color:rgb(79, 79, 79);">在s字符串结尾添加str字符串</font> |
| <font style="color:rgb(79, 79, 79);">例：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.append("abc")</font>` | <font style="color:rgb(79, 79, 79);">在s字符串末尾添加字符串“abc”</font> |


+ **<font style="color:rgba(0, 0, 0, 0.75);">删除</font>**

| **<font style="color:rgb(79, 79, 79);">代码</font>** | **<font style="color:rgb(79, 79, 79);">含义</font>** |
| :---: | :---: |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">erase(iterator p)</font>` | <font style="color:rgb(79, 79, 79);">删除字符串中p所指的字符</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">erase(iterator first, iterator last)</font>` | <font style="color:rgb(79, 79, 79);">删除字符串中迭代器区间</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">[first,last)</font>`<br/><font style="color:rgb(79, 79, 79);">上所有字符</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">erase(pos, len)</font>` | <font style="color:rgb(79, 79, 79);">删除字符串中从索引位置pos开始的len个字符</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">clear()</font>` | <font style="color:rgb(79, 79, 79);">删除字符串中所有字符</font> |


+ **<font style="color:rgba(0, 0, 0, 0.75);">字符替换</font>**

| **<font style="color:rgb(79, 79, 79);">代码</font>** | **<font style="color:rgb(79, 79, 79);">含义</font>** |
| :---: | :---: |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.replace(pos,n,str)</font>` | <font style="color:rgb(79, 79, 79);">把当前字符串从索引pos开始的n个字符替换为str</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.replace(pos,n,n1,c)</font>` | <font style="color:rgb(79, 79, 79);">把当前字符串从索引pos开始的n个字符替换为n1个字符c</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.replace(it1,it2,str)</font>` | <font style="color:rgb(79, 79, 79);">把当前字符串</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">[it1,it2)</font>`<br/><font style="color:rgb(79, 79, 79);">区间替换为str</font><font style="color:rgb(79, 79, 79);"> </font>**<font style="color:rgb(79, 79, 79);">it1 ,it2为迭代器哦</font>** |


+ **<font style="color:rgba(0, 0, 0, 0.75);">大小写转换</font>**

<font style="color:rgb(77, 77, 77);">法一：</font>

| **<font style="color:rgb(79, 79, 79);">代码</font>** | **<font style="color:rgb(79, 79, 79);">含义</font>** |
| :---: | :---: |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">tolower(s[i])</font>` | <font style="color:rgb(79, 79, 79);">转换为小写</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">toupper(s[i])</font>` | <font style="color:rgb(79, 79, 79);">转换为大写</font> |


<font style="color:rgb(77, 77, 77);">法二：</font>

<font style="color:rgb(77, 77, 77);">通过stl的</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">transform</font>`<font style="color:rgb(77, 77, 77);">算法配合</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">tolower</font>`<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">和</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">toupper</font>`<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">实现。  
</font><font style="color:rgb(77, 77, 77);">有4个参数，前2个指定要转换的容器的起止范围，第3个参数是结果存放容器的起始位置，第4个参数是一元运算。</font>

```plain
string s;
transform(s.begin(),s.end(),s.begin(),::tolower);//转换小写
transform(s.begin(),s.end(),s.begin(),::toupper);//转换大写
```

+ **<font style="color:rgba(0, 0, 0, 0.75);">分割</font>**

| **<font style="color:rgb(79, 79, 79);">代码</font>** | **<font style="color:rgb(79, 79, 79);">含义</font>** |
| :---: | :---: |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.substr(pos,n)</font>` | <font style="color:rgb(79, 79, 79);">截取从pos索引开始的n个字符</font> |


+ **<font style="color:rgba(0, 0, 0, 0.75);">查找</font>**

| **<font style="color:rgb(79, 79, 79);">代码</font>** | **<font style="color:rgb(79, 79, 79);">含义</font>** |
| :---: | :---: |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.find (str, pos)</font>` | <font style="color:rgb(79, 79, 79);">在当前字符串的pos索引位置（默认为0）开始，查找子串str，返回找到的位置索引，-1表示查找不到子串</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.find (c, pos)</font>` | <font style="color:rgb(79, 79, 79);">在当前字符串的pos索引位置（默认为0）开始，查找字符c，返回找到的位置索引，-1表示查找不到字符</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.rfind (str, pos)</font>` | <font style="color:rgb(79, 79, 79);">在当前字符串的pos索引位置开始，反向查找子串s，返回找到的位置索引，-1表示查找不到子串</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.rfind (c,pos)</font>` | <font style="color:rgb(79, 79, 79);">在当前字符串的pos索引位置开始，反向查找字符c，返回找到的位置索引，-1表示查找不到字符</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.find_first_of (str, pos)</font>` | <font style="color:rgb(79, 79, 79);">在当前字符串的pos索引位置（默认为0）开始，查找子串s的字符，返回找到的位置索引，-1表示查找不到字符</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.find_first_not_of (str,pos)</font>` | <font style="color:rgb(79, 79, 79);">在当前字符串的pos索引位置（默认为0）开始，查找第一个不位于子串s的字符，返回找到的位置索引，-1表示查找不到字符</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.find_last_of(str, pos)</font>` | <font style="color:rgb(79, 79, 79);">在当前字符串的pos索引位置开始，查找最后一个位于子串s的字符，返回找到的位置索引，-1表示查找不到字符</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">s.find_last_not_of ( str, pos)</font>` | <font style="color:rgb(79, 79, 79);">在当前字符串的pos索引位置开始，查找最后一个不位于子串s的字符，返回找到的位置索引，-1表示查找不到子串</font> |


```plain
#include<string>
#include<iostream>
int main() {
    string s("dog bird chicken bird cat");
//字符串查找-----找到后返回首字母在字符串中的下标
// 1. 查找一个字符串
    cout << s.find("chicken") << endl;// 结果是：9
    
// 2. 从下标为6开始找字符'i'，返回找到的第一个i的下标
    cout << s.find('i',6) << endl;// 结果是：11
    
// 3. 从字符串的末尾开始查找字符串，返回的还是首字母在字符串中的下标
    cout << s.rfind("chicken") << endl;// 结果是：9
    
// 4. 从字符串的末尾开始查找字符
    cout << s.rfind('i') << endl;// 结果是：18因为是从末尾开始查找，所以返回第一次找到的字符
    
// 5. 在该字符串中查找第一个属于字符串s的字符
    cout << s.find_first_of("13br98") << endl;// 结果是：4---b
    
// 6. 在该字符串中查找第一个不属于字符串s的字符------先匹配dog，然后bird匹配不到，所以打印4
    cout << s.find_first_not_of("hello dog 2006") << endl; // 结果是：4
    cout << s.find_first_not_of("dog bird 2006") << endl;  // 结果是：9
    
// 7. 在该字符串最后中查找第一个属于字符串s的字符
    cout << s.find_last_of("13r98") << endl;// 结果是：19

// 8. 在该字符串最后中查找第一个不属于字符串s的字符------先匹配t--a---c，然后空格匹配不到，所以打印21
    cout << s.find_last_not_of("teac") << endl;// 结果是：21
}
```

+ **<font style="color:rgba(0, 0, 0, 0.75);">排序</font>**

```plain
sort(s.begin(),s.end());  //按ASCII码排序
```

---

## <font style="color:rgb(79, 79, 79);">10 bitset</font>
### <font style="color:rgb(79, 79, 79);">10.1 介绍</font>
<font style="color:rgb(77, 77, 77);">bitset 在 bitset 头文件中，它类似数组，并且每一个元素只能是０或１，每个元素只用１bit空间</font>

```plain
//头文件
#include<bitset>
```

### <font style="color:rgb(79, 79, 79);">10.2 初始化定义</font>
[<font style="color:rgb(77, 77, 77);">初始化方法</font>](https://so.csdn.net/so/search?q=%E5%88%9D%E5%A7%8B%E5%8C%96%E6%96%B9%E6%B3%95&spm=1001.2101.3001.7020)

| **<font style="color:rgb(79, 79, 79);">代码</font>** | **<font style="color:rgb(79, 79, 79);">含义</font>** |
| :---: | :---: |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">bitset < n >a</font>` | <font style="color:rgb(79, 79, 79);">a有n位，每位都为0</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">bitset < n >a(b)</font>` | <font style="color:rgb(79, 79, 79);">a是unsigned long型u的一个副本</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">bitset < n >a(s)</font>` | <font style="color:rgb(79, 79, 79);">a是string对象s中含有的位串的副本</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">bitset < n >a(s,pos,n)</font>` | <font style="color:rgb(79, 79, 79);">a是s中从位置pos开始的n个位的副本</font> |


<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">注意：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">n</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">必须为常量</font>[<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">表达式</font>](https://so.csdn.net/so/search?q=%E8%A1%A8%E8%BE%BE%E5%BC%8F&spm=1001.2101.3001.7020)

<font style="color:rgb(77, 77, 77);">演示代码：</font>

```plain
#include<bits/stdc++.h>
using namespace std;
int main() {
	bitset<4> bitset1;　　  //无参构造，长度为４，默认每一位为０
	
	bitset<9> bitset2(12);　//长度为9，二进制保存，前面用０补充
	
	string s = "100101";
	bitset<10> bitset3(s);　　//长度为10，前面用０补充
	
	char s2[] = "10101";
	bitset<13> bitset4(s2);　　//长度为13，前面用０补充
	
	cout << bitset1 << endl;　　//0000
	cout << bitset2 << endl;　　//000001100
	cout << bitset3 << endl;　　//0000100101
	cout << bitset4 << endl;　//0000000010101
	return 0;
}
```

---

### <font style="color:rgb(79, 79, 79);">10.3 特性</font>
`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">bitset</font>`<font style="color:rgb(77, 77, 77);">可以进行</font>**<font style="color:rgb(77, 77, 77);">位操作</font>**

```plain
bitset<4> foo (string("1001"));
bitset<4> bar (string("0011"));

cout << (foo^=bar) << endl;// 1010 (foo对bar按位异或后赋值给foo)

cout << (foo&=bar) << endl;// 0001 (按位与后赋值给foo)

cout << (foo|=bar) << endl;// 1011 (按位或后赋值给foo)

cout << (foo<<=2) << endl;// 0100 (左移2位，低位补0，有自身赋值)

cout << (foo>>=1) << endl;// 0100 (右移1位，高位补0，有自身赋值)

cout << (~bar) << endl;// 1100 (按位取反)

cout << (bar<<1) << endl;// 0110 (左移，不赋值)

cout << (bar>>1) << endl;// 0001 (右移，不赋值)

cout << (foo==bar) << endl;// false (1001==0011为false)

cout << (foo!=bar) << endl;// true  (1001!=0011为true)

cout << (foo&bar) << endl;// 0001 (按位与，不赋值)

cout << (foo|bar) << endl;// 1011 (按位或，不赋值)

cout << (foo^bar) << endl;// 1010 (按位异或，不赋值)
```

**<font style="color:rgb(77, 77, 77);">访问</font>**

```plain
//可以通过 [ ] 访问元素(类似数组)，注意最低位下标为０，如下：
bitset<4> foo ("1011"); 

cout << foo[0] << endl;　　//1
cout << foo[1] << endl;　　//0
cout << foo[2] << endl;　　//1
```

---

### <font style="color:rgb(79, 79, 79);">10.4 方法函数</font>
| **<font style="color:rgb(79, 79, 79);">代码</font>** | **<font style="color:rgb(79, 79, 79);">含义</font>** |
| :---: | :---: |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">b.any()</font>` | <font style="color:rgb(79, 79, 79);">b中是否存在置为1的二进制位，有 返回true</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">b.none()</font>` | <font style="color:rgb(79, 79, 79);">b中是否没有1，没有 返回true</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">b.count()</font>` | <font style="color:rgb(79, 79, 79);">b中为1的个数</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">b.size()</font>` | <font style="color:rgb(79, 79, 79);">b中二进制位的个数</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">b.test(pos)</font>` | <font style="color:rgb(79, 79, 79);">测试b在pos位置是否为1，是 返回true</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">b[pos]</font>` | <font style="color:rgb(79, 79, 79);">返回b在pos处的二进制位</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">b.set()</font>` | <font style="color:rgb(79, 79, 79);">把b中所有位都置为1</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">b.set(pos)</font>` | <font style="color:rgb(79, 79, 79);">把b中pos位置置为1</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">b.reset()</font>` | <font style="color:rgb(79, 79, 79);">把b中所有位都置为0</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">b.reset(pos)</font>` | <font style="color:rgb(79, 79, 79);">把b中pos位置置为0</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">b.flip()</font>` | <font style="color:rgb(79, 79, 79);">把b中所有二进制位取反</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">b.flip(pos)</font>` | <font style="color:rgb(79, 79, 79);">把b中pos位置取反</font> |
| `<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">b.to_ulong()</font>` | <font style="color:rgb(79, 79, 79);">用b中同样的二进制位返回一个unsigned long值</font> |


# 11.array数组
## <font style="color:rgb(79, 79, 79);">1️⃣</font><font style="color:rgb(79, 79, 79);">介绍</font><font style="color:rgb(79, 79, 79);">1️⃣</font>
<font style="color:rgb(77, 77, 77);">头文件</font>

```plain
#include<array>
```

`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">array</font>`<font style="color:rgb(77, 77, 77);">是C++11新增的容器，效率与普通数据相差无几，比</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">vector</font>`<font style="color:rgb(77, 77, 77);">效率要高，自身添加了一些成员函数。</font>

<font style="color:rgb(77, 77, 77);">和其它容器不同，</font>[<font style="color:rgb(77, 77, 77);">array</font>](https://so.csdn.net/so/search?q=array&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">容器的大小是</font>**<font style="color:rgb(77, 77, 77);">固定</font>**<font style="color:rgb(77, 77, 77);">的，无法动态的扩展或收缩，</font>**<font style="color:rgb(77, 77, 77);">只允许访问或者替换存储的元素。</font>**

**<font style="color:rgb(77, 77, 77);">注意：</font>**

`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">array</font>`<font style="color:rgb(77, 77, 77);">的使用要在</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">std</font>`<font style="color:rgb(77, 77, 77);">命名空间里</font>

## <font style="color:rgb(79, 79, 79);">2️⃣</font><font style="color:rgb(79, 79, 79);">简实使用</font><font style="color:rgb(79, 79, 79);">2️⃣</font>
### <font style="color:rgb(79, 79, 79);">1.声明与初始化</font>
#### <font style="color:rgb(79, 79, 79);">1.1.基础数据类型</font>
<font style="color:rgb(77, 77, 77);">声明一个大小为100的</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">int</font>`<font style="color:rgb(77, 77, 77);">型数组，元素的值不确定</font>

```plain
array<int, 100> a;
```

<font style="color:rgb(77, 77, 77);">声明一个大小为100的</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">int</font>`<font style="color:rgb(77, 77, 77);">型数组，</font>[<font style="color:rgb(77, 77, 77);">初始值</font>](https://so.csdn.net/so/search?q=%E5%88%9D%E5%A7%8B%E5%80%BC&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">均为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">0</font>`<font style="color:rgb(77, 77, 77);">(初始值与默认</font>[<font style="color:rgb(77, 77, 77);">元素类型</font>](https://so.csdn.net/so/search?q=%E5%85%83%E7%B4%A0%E7%B1%BB%E5%9E%8B&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">等效)</font>

```plain
array<int, 100> a{};
```

<font style="color:rgb(77, 77, 77);">声明一个大小为100的</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">int</font>`<font style="color:rgb(77, 77, 77);">型数组，初始化部分值，其余全部为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">0</font>`

```plain
array<int, 100> a{1, 2, 3};
```

<font style="color:rgb(77, 77, 77);">或者可以用等号</font>

```plain
array<int, 100> a = {1, 2, 3};
```

#### <font style="color:rgb(79, 79, 79);">1.2.高级数据类型</font>
<font style="color:rgb(77, 77, 77);">不同于数组的是对元素类型不做要求，可以套结构体</font>

```plain
array<string, 2> s = {"ha", string("haha")};
array<node, 2> a;
```

### <font style="color:rgb(79, 79, 79);">2. 取存元素值</font>
<font style="color:rgb(77, 77, 77);">⭐</font><font style="color:rgb(77, 77, 77);">️修改元素</font>

```plain
array<int, 4> a = {1, 2, 3, 4};
a[0] = 4;
```

<font style="color:rgb(77, 77, 77);">⭐</font><font style="color:rgb(77, 77, 77);">️访问元素</font>

<font style="color:rgb(77, 77, 77);">⭐</font><font style="color:rgb(77, 77, 77);">️</font><font style="color:rgb(77, 77, 77);">⭐</font><font style="color:rgb(77, 77, 77);">️下标访问</font>

```plain
array<int, 4> a = {1, 2, 3, 4};
for(int i = 0; i < 4; i++) 
    cout << a[i] << " \n"[i == 3];
```

<font style="color:rgb(77, 77, 77);">⭐</font><font style="color:rgb(77, 77, 77);">️</font><font style="color:rgb(77, 77, 77);">⭐</font><font style="color:rgb(77, 77, 77);">️利用</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">auto</font>`<font style="color:rgb(77, 77, 77);">访问</font>

```plain
for(auto i : a)
    cout << i << " ";
```

<font style="color:rgb(77, 77, 77);">⭐</font><font style="color:rgb(77, 77, 77);">️</font><font style="color:rgb(77, 77, 77);">⭐</font><font style="color:rgb(77, 77, 77);">️迭代器访问</font>

```plain
auto it = a.begin();
for(; it != a.end(); it++) 
    cout << *it << " ";
```

<font style="color:rgb(77, 77, 77);">⭐</font><font style="color:rgb(77, 77, 77);">️</font><font style="color:rgb(77, 77, 77);">⭐</font><font style="color:rgb(77, 77, 77);">️</font><font style="color:rgb(77, 77, 77);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">at()</font>`<font style="color:rgb(77, 77, 77);">函数访问</font>

<font style="color:rgb(77, 77, 77);">下标为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">1</font>`<font style="color:rgb(77, 77, 77);">的元素加上下标为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">2</font>`<font style="color:rgb(77, 77, 77);">的元素，答案为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">5</font>`

```plain
array<int, 4> a = {1, 2, 3, 4};
int res = a.at(1) + a.at(2);
cout << res << "\n";
```

<font style="color:rgb(77, 77, 77);">⭐</font><font style="color:rgb(77, 77, 77);">️</font><font style="color:rgb(77, 77, 77);">⭐</font><font style="color:rgb(77, 77, 77);">️</font><font style="color:rgb(77, 77, 77);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">get</font>`<font style="color:rgb(77, 77, 77);">方法访问</font>

<font style="color:rgb(77, 77, 77);">将</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">a</font>`<font style="color:rgb(77, 77, 77);">数组下标为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">1</font>`<font style="color:rgb(77, 77, 77);">位置处的值改为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">x</font>`

<font style="color:rgb(77, 77, 77);">💧</font><font style="color:rgb(77, 77, 77);">注意</font><font style="color:rgb(77, 77, 77);">💧</font><font style="color:rgb(77, 77, 77);"> 获取的下标只能写数字，不能填变量</font>

```plain
get<1>(a) = x;
```

## <font style="color:rgb(79, 79, 79);">3️⃣</font><font style="color:rgb(79, 79, 79);">成员函数</font><font style="color:rgb(79, 79, 79);">3️⃣</font>
| **<font style="color:rgb(79, 79, 79);">成员函数</font>** | **<font style="color:rgb(79, 79, 79);">功能</font>** |
| :---: | :---: |
| <font style="color:rgb(79, 79, 79);">begin()</font> | <font style="color:rgb(79, 79, 79);">返回容器中第一个元素的访问迭代器（地址）</font> |
| <font style="color:rgb(79, 79, 79);">end()</font> | <font style="color:rgb(79, 79, 79);">返回容器最后一个元素之后一个位置的访问迭代器（地址）</font> |
| <font style="color:rgb(79, 79, 79);">rbegin()</font> | <font style="color:rgb(79, 79, 79);">返回最后一个元素的访问迭代器（地址）</font> |
| <font style="color:rgb(79, 79, 79);">rend()</font> | <font style="color:rgb(79, 79, 79);">返回第一个元素之前一个位置的访问迭代器（地址）</font> |
| <font style="color:rgb(79, 79, 79);">size()</font> | <font style="color:rgb(79, 79, 79);">返回容器中元素的数量，其值等于初始化 array 类的第二个模板参数</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">N</font>` |
| <font style="color:rgb(79, 79, 79);">max_size()</font> | <font style="color:rgb(79, 79, 79);">返回容器可容纳元素的最大数量，其值始终等于初始化 array 类的第二个模板参数 N</font> |
| <font style="color:rgb(79, 79, 79);">empty()</font> | <font style="color:rgb(79, 79, 79);">判断容器是否为空</font> |
| <font style="color:rgb(79, 79, 79);">at(n)</font> | <font style="color:rgb(79, 79, 79);">返回容器中 n 位置处元素的引用，函数会自动检查 n 是否在有效的范围内，如果不是则抛出 out_of_range 异常</font> |
| <font style="color:rgb(79, 79, 79);">front()</font> | <font style="color:rgb(79, 79, 79);">返回容器中第一个元素的直接引用，函数不适用于空的 array 容器</font> |
| <font style="color:rgb(79, 79, 79);">back()</font> | <font style="color:rgb(79, 79, 79);">返回容器中最后一个元素的直接引用，函数不适用于空的 array 容器。</font> |
| <font style="color:rgb(79, 79, 79);">data()</font> | <font style="color:rgb(79, 79, 79);">返回一个指向容器首个元素的指针。利用该指针，可实现复制容器中所有元素等类似功能</font> |
| <font style="color:rgb(79, 79, 79);">fill(x)</font> | <font style="color:rgb(79, 79, 79);">将</font><font style="color:rgb(79, 79, 79);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">x</font>`<br/><font style="color:rgb(79, 79, 79);"> </font><font style="color:rgb(79, 79, 79);">这个值赋值给容器中的每个元素,相当于初始化</font> |
| <font style="color:rgb(79, 79, 79);">array1.swap(array2)</font> | <font style="color:rgb(79, 79, 79);">交换 array1 和 array2 容器中的所有元素，但前提是它们具有相同的长度和类型</font> |


## <font style="color:rgb(79, 79, 79);">4️⃣</font><font style="color:rgb(79, 79, 79);">部分用法示例</font><font style="color:rgb(79, 79, 79);">4️⃣</font>
### <font style="color:rgb(79, 79, 79);">data()</font>
<font style="color:rgb(77, 77, 77);">指向底层元素存储的指针。对于非空容器，返回的指针与首元素地址比较相等。</font>

### <font style="color:rgb(79, 79, 79);">at()</font>
<font style="color:rgb(77, 77, 77);">下标为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">1</font>`<font style="color:rgb(77, 77, 77);">的元素加上下标为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">2</font>`<font style="color:rgb(77, 77, 77);">的元素，答案为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">5</font>`

```plain
array<int, 4> a = {1, 2, 3, 4};
int res = a.at(1) + a.at(2);
cout << res << "\n";
```

### <font style="color:rgb(79, 79, 79);">fill()</font>
<font style="color:rgb(77, 77, 77);">array的</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">fill()</font>`<font style="color:rgb(77, 77, 77);">函数，将</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">a</font>`<font style="color:rgb(77, 77, 77);">数组全部元素值变为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">x</font>`

```plain
a.fill(x);
```

<font style="color:rgb(77, 77, 77);">另外还有其它的</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">fill()</font>`<font style="color:rgb(77, 77, 77);">函数:将</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">a</font>`<font style="color:rgb(77, 77, 77);">数组</font><font style="color:rgb(77, 77, 77);">[ b e g i n , e n d ) [begin,end)</font><font style="color:rgb(77, 77, 77);">[</font>_<font style="color:rgb(77, 77, 77);">b</font>__<font style="color:rgb(77, 77, 77);">e</font>__<font style="color:rgb(77, 77, 77);">g</font>__<font style="color:rgb(77, 77, 77);">in</font>_<font style="color:rgb(77, 77, 77);">,</font>_<font style="color:rgb(77, 77, 77);">e</font>__<font style="color:rgb(77, 77, 77);">n</font>__<font style="color:rgb(77, 77, 77);">d</font>_<font style="color:rgb(77, 77, 77);">)</font><font style="color:rgb(77, 77, 77);">全部值变为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">x</font>`

```plain
fill(a.begin(), a.end(), x);
```

### <font style="color:rgb(79, 79, 79);">get方法获取元素值</font>
<font style="color:rgb(77, 77, 77);">将</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">a</font>`<font style="color:rgb(77, 77, 77);">数组下标为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">1</font>`<font style="color:rgb(77, 77, 77);">位置处的值改为</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">x</font>`

<font style="color:rgb(77, 77, 77);">⭐</font><font style="color:rgb(77, 77, 77);">️注意</font><font style="color:rgb(77, 77, 77);">⭐</font><font style="color:rgb(77, 77, 77);">️获取的下标只能写数字，不能填变量</font>

```plain
get<1>(a) = x;
```

### <font style="color:rgb(79, 79, 79);">排序</font>
```plain
sort(a.begin(), a.end());
```

# <font style="color:rgb(34, 34, 38);">12.tuple元组</font>
## <font style="color:rgb(79, 79, 79);">1️⃣</font><font style="color:rgb(79, 79, 79);"> 介绍 </font><font style="color:rgb(79, 79, 79);">1️⃣</font>
<font style="color:rgb(77, 77, 77);">tuple模板是pair的泛化，可以封装不同类型任意数量的对象。</font>

<font style="color:rgb(77, 77, 77);">可以把tuple理解为pair的扩展，tuple可以声明</font>[<font style="color:rgb(77, 77, 77);">二元组</font>](https://so.csdn.net/so/search?q=%E4%BA%8C%E5%85%83%E7%BB%84&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">，也可以声明三元组。</font>

<font style="color:rgb(77, 77, 77);">tuple可以等价为</font>**<font style="color:rgb(77, 77, 77);">结构体</font>**<font style="color:rgb(77, 77, 77);">使用</font>

<font style="color:rgb(77, 77, 77);">❤️</font><font style="color:rgb(77, 77, 77);"> 头文件</font>

```plain
#include<tuple>
```

## <font style="color:rgb(79, 79, 79);">2️⃣</font><font style="color:rgb(79, 79, 79);"> 基础用法 </font><font style="color:rgb(79, 79, 79);">2️⃣</font>
### <font style="color:rgb(79, 79, 79);">声明及初始化</font>
<font style="color:rgb(77, 77, 77);">声明一个空的</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">tuple</font>`[<font style="color:rgb(77, 77, 77);">三元组</font>](https://so.csdn.net/so/search?q=%E4%B8%89%E5%85%83%E7%BB%84&spm=1001.2101.3001.7020)

```plain
tuple<int, int, string> t1;
```

<font style="color:rgb(77, 77, 77);">赋值</font>

```plain
t1 = make_tuple(1, 1, "hahaha");
```

<font style="color:rgb(77, 77, 77);">创建的同时初始化</font>

```plain
tuple<int, int, int, int> t2(1, 2, 3, 4);
```

<font style="color:rgb(77, 77, 77);">可以使用pair对象构造tuple对象，但tuple对象必须是两个元素</font>

```plain
auto p = make_pair("wang", 1);
tuple<string, int> t3 {p}; //将pair对象赋给tuple对象
```

### <font style="color:rgb(79, 79, 79);">元素操作</font>
<font style="color:rgb(77, 77, 77);">获取tuple对象</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">t</font>`<font style="color:rgb(77, 77, 77);">的第一个元素</font>

```plain
int first = get<0>(t);
```

<font style="color:rgb(77, 77, 77);">修改tuple对象</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">t</font>`<font style="color:rgb(77, 77, 77);">的第一个元素</font>

```plain
get<0>(t) = 1;
```

## <font style="color:rgb(79, 79, 79);">3️⃣</font><font style="color:rgb(79, 79, 79);"> 函数操作 </font><font style="color:rgb(79, 79, 79);">3️⃣</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">获取元素个数</font>

```plain
tuple<int, int, int> t(1, 2, 3);
cout << tuple_size<decltype(t)>::value << "\n"; // 3
```

+ <font style="color:rgba(0, 0, 0, 0.75);">获取对应元素的值</font>

<font style="color:rgb(77, 77, 77);">通过</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">get<n>(obj)</font>`<font style="color:rgb(77, 77, 77);">方法获取,</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">n</font>`<font style="color:rgb(77, 77, 77);">必须为数字不能是变量</font>

```plain
tuple<int, int, int> t(1, 2, 3);
cout << get<0>(t) << '\n'; // 1
cout << get<1>(t) << '\n'; // 2
cout << get<2>(t) << '\n'; // 3
```

+ <font style="color:rgba(0, 0, 0, 0.75);">通过</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">tie</font>`<font style="color:rgba(0, 0, 0, 0.75);">解包 获取元素值</font>

`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">tie</font>`<font style="color:rgb(77, 77, 77);">可以让tuple变量中的三个值依次赋到tie中的三个变量中</font>

```plain
int one, three;
string two; 
tuple<int, string, int> t(1, "hahaha", 3);
tie(one, two, three) = t;
cout << one << two << three << "\n"; // 1hahaha3
```

