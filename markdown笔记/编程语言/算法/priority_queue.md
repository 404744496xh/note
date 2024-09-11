# priority_queue

[优先队列](https://so.csdn.net/so/search?q=%E4%BC%98%E5%85%88%E9%98%9F%E5%88%97&spm=1001.2101.3001.7020)是在正常队列的基础上加了优先级，保证每次的队首元素都是优先级最大的。

可以实现每次从优先队列中取出的元素都是队列中

它的底层是通过

```cpp
//头文件
#include<queue>
//初始化定义
priority_queue<int> q;
1234
```

| 代码 | 含义 | 
| -- | -- |
| q.top() | 访问队首元素 | 
| q.push() | 入队 | 
| q.pop() | 堆顶（队首）元素出队 | 
| q.size() | 队列元素个数 | 
| q.empty() | 是否为空 | 
| 注意 | 不提供该方法 | 
| 优先队列只能通过 |   | 


```cpp
priority_queue<int> pq; // 默认大根堆, 即每次取出的元素是队列中的最大值
priority_queue<int, vector<int>, greater<int> > q; // 小根堆, 每次取出的元素是队列中的最小值
12
```

**参数解释：**

- 第二个参数：

vector< int >[数据结构](https://so.csdn.net/so/search?q=%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84&spm=1001.2101.3001.7020)堆的容器，若优先队列中存放的是

**总之存的是什么类型的数据，就相应的填写对应类型。同时也要改动第三个参数里面的对应类型。**

- 第三个参数：

less< int >

greater< int >

**int代表的是数据类型，也要填优先队列中存储的数据类型**

下面介绍基础数据类型优先级设置的写法。

**1. 基础写法（非常常用）**

```cpp
priority_queue<int> q1; // 默认大根堆, 即每次取出的元素是队列中的最大值
priority_queue<int, vector<int>, less<int> > q2; // 大根堆, 每次取出的元素是队列中的最大值，同第一行

priority_queue<int, vector<int>, greater<int> > q3; // 小根堆, 每次取出的元素是队列中的最小值
1234
```

**2. 自定义排序（不常见，主要是写着麻烦）**

下面的代码比较长，基础类型优先级写着太麻烦，用第一种即可。

```cpp
struct cmp1 {
	bool operator()(int x,int y) {
		return x > y;
	}
};
struct cmp2 {
	bool operator()(const int x,const int y) {
		return x < y;
	}
};
priority_queue<int, vector<int>, cmp1> q1; // 小根堆
priority_queue<int, vector<int>, cmp2> q2; // 大根堆
123456789101112
```

> 即优先队列中存储结构体类型，必须要设置优先级，即结构体的比较运算（因为优先队列的堆中要比较大小，才能将对应最大或者最小元素移到堆顶）。


优先级设置可以定义在

```cpp
//要排序的结构体（存储在优先队列里面的）
struct Point {
	int x,y;
};
1234
```

- 版本一：自定义全局比较规则

```cpp
//定义的比较结构体
//注意：cmp是个结构体 
struct cmp {//自定义堆的排序规则 
	bool operator()(const Point& a,const Point& b) {
		return a.x < b.x;
	}
};

//初始化定义， 
priority_queue<Point, vector<Point>, cmp> q; // x大的在堆顶
12345678910
```

- 版本二：直接在结构体里面写

> 因为是在结构体内部自定义的规则，一旦需要比较结构体，自动调用结构体内部重载运算符规则。


结构体内部有两种方式

**方式一**

```cpp
struct node {
	int x, y;
	friend bool operator < (Point a, Point b) {//为两个结构体参数，结构体调用一定要写上friend
		return a.x < b.x;//按x从小到大排，x大的在堆顶
	}
};
123456
```

**方式二**

```cpp
struct node {
    int x, y;
    bool operator < (const Point &a) const {//直接传入一个参数，不必要写friend
        return x < a.x;//按x升序排列，x大的在堆顶
    }
};
123456
```

优先队列的定义

```cpp
priority_queue<Point> q;
1
```

**注意：**

所以只需要记住

- 排序规则：

pair

first

second

first

first

second

> pair请参考下文


```cpp
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
12345678910111213
```

> 结果：8 77 97 8
