### numpy初识：
作为数据分析[三剑客](https://so.csdn.net/so/search?q=%E4%B8%89%E5%89%91%E5%AE%A2&spm=1001.2101.3001.7020)之一的numpy，只要用到python来进行数据分析，那numpy是必不可少的

NumPy，一言以蔽之，是Python中基于数组对象的科学计算库。它是Python语言的一个扩展程序库，支持大量的维度数组与矩阵运算，以及大量的数学函数库。NumPy的核心是ndarray对象，它是一个功能强大的N维数组对象，封装了n维同类数组。很多运算是由编译过的代码来执行的，以此来提高效率。

以下是NumPy的一些主要特点：

1. **多维数组对象**：NumPy的核心数据结构是`ndarray`，它是一个多维数组，用于存储同质数据类型的元素。这些数组可以是一维、二维、三维等，非常适用于向量化操作和矩阵运算。
2. **广播功能**：NumPy允许在不同形状的数组之间执行操作，通过广播功能，它可以自动调整数组的形状，以使操作变得有效。
3. **丰富的数学函数**：NumPy提供了大量的数学、统计和线性代数函数，包括基本的加减乘除、三角函数、指数和对数函数、随机数生成、矩阵操作等。
4. **索引和切片**：NumPy允许使用索引和切片操作来访问和修改数组中的元素，这使得数据的选择和处理非常灵活。
5. **高性能计算**：NumPy的底层实现是用C语言编写的，因此它在处理大规模数据时非常高效。此外，NumPy还与其他高性能计算库（如BLAS和LAPACK）集成，提供了快速的线性代数运算。
6. **互操作性**：NumPy可以与许多其他Python库和数据格式（例如Pandas、SciPy、Matplotlib）无缝集成，这使得数据科学工作流更加流畅。



NumPy的广泛应用范围包括数据处理、科学研究、机器学习、图像处理、信号处理等各种领域。

它为数据分析人员、科学家和工程师提供了一个功能强大且高效的工具，以便进行数值计算和数据处理

### 
### 安装numpy
         这里介绍anaconda命令行安装方法

#### 第一步，打开anaconda终端
            ![](https://i-blog.csdnimg.cn/blog_migrate/99d36daa7727801984a652dc61b05391.png)  

#### **第二步，创建虚拟环境**
（已经创建好虚拟环境的可以直接到第四步)

```python
conda create -n NumpyTest python=3.7
```

(NumTest为你要创建虚拟环境的名称 ，后面为对应的版本,你想创建3.10的版本,后面就改为python=3.10)

![](https://i-blog.csdnimg.cn/blog_migrate/526ae58225ff06b0e4c39d27afba6d16.png)

#### 第三步，输入y安装基础包
![](https://i-blog.csdnimg.cn/blog_migrate/e64aff0c2b2988a9687000b39b5cfe0c.png)

#### 
#### 第四步 切换至你创建的虚拟环境的目录下
 我这里创建的是虚拟环境的名字是NumpyTest，所以我切换至NumpyTest环境下

```python
conda activate NumpyTest
```

 ![](https://i-blog.csdnimg.cn/blog_migrate/b11a80cf63debd1e52e7709e3de0da81.png)

#### 第五步：安装 numpy包
```plain
pip install numpy
```

![](https://i-blog.csdnimg.cn/blog_migrate/fd616cb684cdb30ee9f9100fb1c19240.png)

有些小伙伴可能因为网络问题安装不了，可以切换至清华园镜像，代码也是很简单的，我这里就不赘叙了

1. 还缺啥包直接pip install 包名
2. 在pycharm中加载该环境即可，创建的环境在**anaconda****\****envs**下面

### 创建数组
#### 1.1创建一维数组
```python
import numpy as np

data=np.array([1,2,3,4])

print(data)
```

#### 1.2创建创建二维数组（矩阵）array
```python
import numpy as np

data=np.array([[1,2,3,4],[4,5,6,7]])

print(data)
```

#### 1.3创建全0数组
  **shape属性代表形状 shape（2，5） 就代表创建2行5列的全零数组**

创建全零数组的用途是初始化一个具有特定形状和大小的数组，其中所有元素都设置为0。在处理图像或其他数据时，全零数组可以用作初始值或占位符。

例如，假设我们要读取一个尺寸为（255，255，255）的图片，我们可以创建一个相同维度的全零数组，然后将图片读入该数组进行填充。这样做的好处是，我们可以直接将原始图像数据存储在全零数组中，而无需担心数据溢出或其他问题。

```python
import numpy as np

data=np.zeros(shape=(5,3))

print(data)
```

#### 1.4创建全1数组
创建全1数组的用途是初始化一个具有特定形状和大小的数组，其中所有元素都设置为1。在处理一些数学问题或算法时，全1数组可以用作初始值或占位符。

例如，假设我们要计算一个矩阵与自身的转置相乘的结果，我们可以创建一个与输入矩阵相同维度的全1数组，然后将输入矩阵读入该数组进行填充。这样做的好处是，我们可以直接将原始矩阵数据存储在全1数组中，而无需担心数据溢出或其他问题。

```python
import numpy as np

data=np.ones(shape=(5,3))

print(data)
```

#### 1.5创建全空数组
创建出来的全空数组中的数据都是无限小的、无限接近于0但不是0，这方便我们数学上的一些操作

```python
import numpy as np

data=np.empty(shape=(5,3))

print(data)
```

#### 1.6 创建有连续序列的数组 arange
数组从10开始步长为2，所以创建出来数组元素就是10，12，14

```python
import numpy as np

data = np.arange(10,16,2)

print(data)
```

#### 1.7 创建有连续间隔的数组 linspace
         也可以称为线性等分向量（linear space），在一个指定区间内按照指定的步长，将区间均等分，生成的是一个线段类型的数组。生成的线性间隔数据中，是有把区间的两端加进去的

```python
import numpy as np

data= np.linspace(1,10,20)

print(data)
```

#### 1.8创建随机数组
       创建随机数组的用途是初始化一个具有特定形状和大小的数组，其中所有元素都是随机生成的。在处理一些需要模拟随机数据的情况时，随机数组可以用作占位符或测试数据。

```python
import numpy as np

data = np.random.rand(3,4)

print(data)
```

           这里我们还可以用另外一种方法创建数组，这种方法很灵活，也好用

      这段代码使用[NumPy库](https://so.csdn.net/so/search?q=NumPy%E5%BA%93&spm=1001.2101.3001.7020)创建了一个4行5列的随机整数数组，其中每个元素的值在2到5之间

```python
import numpy as np

data=np.random.randint(2,5,size=(4,5));

print(data)
```

 效果图：

 ![](https://i-blog.csdnimg.cn/blog_migrate/a48be1269e888c6f36ef24fce2d4e49b.png)

#### 1.9改变数组形状
              这个怎么理解呢，比如说你本来有一个2行3列的数组，你可以把它改成为3行2列的数组

              注意：因为数组中元素是没有改变的，所以重塑数组指定的尺寸大小是否和原本的尺寸大小一样，大一点和小一点都会报错，2行3列的数组，你可以把它改成为3行2列的数组 ，或者1行6列，改后尺寸必须一样，reshape本质就是原本数组中的元素按顺序展开来，然后依次填入新定义的尺寸中去.注意 reshape后面填的是元组数据类型

```python
import numpy as np

data1=[1,2,3,4,5]

data2=[1,2,3,4,5]

data=np.array([data1,data2])

print("改之前的数组形状为:")

print(data.shape)

data=data.reshape((5,2))

print("改之后的数组形状为:")

print(data.shape)
```

    运行结果：

      ![](https://i-blog.csdnimg.cn/blog_migrate/a0bb70de651ce0d89804f49eec174339.png)

#### 1.10数组转置
```python
import numpy as np

data = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

data_array = np.array(data)

print("没有转置数组之前数组为：")

print(data)

print("转置数组之后数组为：")

print(data_array.T)
```

    运行效果

    ![](https://i-blog.csdnimg.cn/blog_migrate/ec22d794d04aa66760ca168a4d5789dd.png)

### 数组显示操作
#### 2.1数组维度 ndim
   ndim属性代表数组维度

```python
data = np.array([1,2,3])

print(data.ndim)
```

#### 2.2数组形状shape
  shape属性代表数组形状，可以这么理解shape是各个方向的维度(ndim)

```python
print(data.shape)
```

#### 2.3数组中元素个数
```python
print(data.size)
```

#### 2.4 数组的数据类型 dtype
```python
print(data.dtype)
```

### 数组的运算
这里简单讲两个例子

#### 数组加法
```python
import numpy as np

array1 = np.array([1, 2, 3])

array2 = np.array([4, 5, 6])

result = array1 + array2

print(result)
```

#### 数组乘法
```python
result=array1*array2

print(result)
```

### 数组中的数据统计
      数据统计大家有个印象就行，不要刻意的去记，用到的时候回来看一眼就可以了，多用也就会了

#### 计算数组的平均值
`numpy.mean(arr, axis=None, dtype=None, out=None)`**:** 计算数组的平均值。参数`axis`表示沿着哪个轴进行计算，默认为None，表示计算整个数组的平均值；`dtype`表示返回结果的数据类型，默认为float64；`out`表示将结果存储在指定的数组中,一般情况下，传个数组进去就可以了，其他的用默认的就好了，其它的方法也是一样，我不赘述

```python
import numpy as np

data=[1,5,6,9]

mindle=np.mean(data)

print(mindle)
```

#### 计算数组的中位数
`numpy.median(arr, axis=None, out=None)`: 计算数组的中位数。参数`axis`和`out`的含义与`numpy.mean()`相同

```python
import numpy as np

data=[1,5,6,9]

data1=np.median(data)

print(data1)
```

 其他的我就不给代码示例了，直接上参数详解好吧，也不要浪费这个时间

#### 计算数组的标准差
`numpy.std(arr, axis=None, dtype=None, out=None)`**:** 计算数组的标准差。参数`axis`、`dtype`和`out`的含义与`numpy.mean()`相同。

#### 计算数组的方差
`numpy.var(arr, axis=None, dtype=None, out=None)`**:** 计算数组的方差。参数`axis`、`dtype`和`out`的含义与`numpy.mean()`相同。

#### 计算数组的最小值
`numpy.min(arr, axis=None, out=None)`**:** 计算数组的最小值。参数`axis`和`out`的含义与`numpy.mean()`相同。

#### 计算数组的最大值
`numpy.max(arr, axis=None, out=None)`**:** 计算数组的最大值。参数`axis`和`out`的含义与`numpy.mean()`相同

#### 计算数组的元素之和
`numpy.sum(arr, axis=None, dtype=None, out=None)`**:** 计算数组的元素之和。参数`axis`、`dtype`和`out`的含义与`numpy.mean()`相同。

#### 计算数组的元素乘积
`numpy.prod(arr, axis=None, dtype=None, out=None)`**:** 计算数组的元素乘积。参数`axis`、`dtype`和`out`的含义与`numpy.mean()`相同

#### 计算数组的累积和
`numpy.cumsum(arr, axis=None, dtype=None, out=None)`**:** 计算数组的累积和。参数`axis`、`dtype`和`out`的含义与`numpy.mean()`相同。

数组的索引和切片

   切片怎么说呢，一维数组好讲，多维数组不太好讲，我们一起看看吧

#### 一维数组切片
    对于一维数组来说，它类似于一条直线，其上的坐标位置用一个数字就可以表示。例如，对于一个长度为5的一维数组`arr = [1, 2, 3, 4, 5]`，我们可以用数字0到4来表示它的每一个位置。当我们使用切片操作时，就可以通过指定起始位置和结束位置来获取数组中的一部分元素。例如，如果我们想要获取从索引1到索引3的元素，可以使用切片操作`arr[1:4]`，结果为`[2, 3, 4]`。需要注意的是，切片操作是左闭右开的，即包括起始位置，但不包括结束位置

```python
import numpy as np

arr = np.array([1,2,3,4,5])

print(arr[1:4])
```

#### 多维数组切片
      多维数组单纯讲不太好讲，我多举几个例子吧

```python
import numpy as np

data1=[1,2,3,4,5]

data2=[6,7,8,9,10]

data3=[11,12,13,14,15]

data4=[16,17,18,19,20]

data5=[21,22,23,24,25]

data6=[26,27,28,29,30]

data=np.array([[data1,data2,data3],[data4,data5,data6]])
```

   我先创建了一个3维数组，其形状shape=(2,3,5)运行效果图如下

   ![](https://i-blog.csdnimg.cn/blog_migrate/5a0eb1138d62888ac8203ee329eb50bf.png)

我们以实操来进行讲解

##### 行切片
           假设我们现在只想取前面两行，那我们应该怎么做呢？

          思路：我们先取第一维数据

```python
print(data[0:1])
```

     运行效果：

            ![](https://i-blog.csdnimg.cn/blog_migrate/5f83feb12040d1b2a1be6b3c515fe329.png)   

现在它现在是不是就被分解成一个2维数组，我们再对这个2维数组进行操作，要想取这个2维数组前面两行，代码是啥呢？是不是就是data[0:2],那我们结合第一步的代码，应该怎么做呢？

```python
print(data[0:1,0:2])
```

 运行效果:

            ![](https://i-blog.csdnimg.cn/blog_migrate/b72794c227d171eb63c9f4a383eae3da.png)

 这样是不是就取到最前面两行了

  其实就是进行分解操作就行，一维一维的进行分解，那我们再来看看列切片吧

##### 列切片
    还是以这个数组进行列切片操作

```python
print(data[:,])
```

运行效果图：

![](https://i-blog.csdnimg.cn/blog_migrate/25fd335c05822b76c7aba01a37f1c74a.png)

可能这个操作小伙伴有些就看不懂了，啥意思呢，还是一句话，一维一维的进行分解，因为我们要取的是列，所有全部的行我们就应该都算进去，换句话来说，忽略行的影响 代码就是data[:,]

再来取第2维

    代码还是data[:]结合起来就是

```python
print(data[:,:]
```

 效果图：

  ![](https://i-blog.csdnimg.cn/blog_migrate/30ac9bccb96cccbe6ca0dcb60cfe96d8.png)

我们再来取最后一维

```python
print(data[:,:,0:2])
```

 运行效果 ：

        ![](https://i-blog.csdnimg.cn/blog_migrate/cb427c7611cce036d7b7eca9b1bf43b6.png)

至此，列取片也完成

总结：不管是列取片，还是行取片，你都去一维一维的去进行拆分，一维一维的去切片就好了 

### 数组堆叠
#### 垂直堆叠
```python
stacked_vertically = np.vstack((array1, array2))
```

#### 水平堆叠
```python
stacked_horizontally = np.hstack((array1, array2))
```

### 保存和加载数组
#### 保存数组到文件
```python
np.save('my_array.npy', data)
```

#### 加载数组
```python
loaded_data = np.load('my_array.npy')
```

