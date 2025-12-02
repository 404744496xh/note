**<font style="color:rgb(77, 77, 77);">Perspective</font>**<font style="color:rgb(77, 77, 77);"> 是一个强大的交互式数据分析和可视化库，它允许你创建高度可配置的报告、仪表板、笔记本和应用程序。给用户提供了一个新的视角来看待数据。</font>

---

![](https://cdn.nlark.com/yuque/0/2025/png/46412986/1755328348007-cbc54be2-90d0-4160-a9de-9c204dba5668.png)

---

| ![](https://cdn.nlark.com/yuque/0/2025/png/46412986/1755328348111-ad879d91-ff2d-473b-bf6c-11174a63bd77.png)**<font style="color:rgb(79, 79, 79);">Stars 数</font>** | <font style="color:rgb(79, 79, 79);">9125</font> |
| :---: | :---: |
| ![](https://cdn.nlark.com/yuque/0/2025/png/46412986/1755328348133-d45463fa-67cf-4488-9cc3-cd72f6f35193.png)**<font style="color:rgb(79, 79, 79);">Forks 数</font>** | <font style="color:rgb(79, 79, 79);">1217</font> |


#### <font style="color:rgb(79, 79, 79);">主要特点</font>
+ **<font style="color:rgb(77, 77, 77);">高效流式查询引擎</font>**<font style="color:rgb(77, 77, 77);">：Perspective使用C++编写，并编译为WebAssembly和Python版本，支持对Apache Arrow的读/写/流式处理。这意味着它可以快速处理大规模数据，同时保持低内存占用。</font>
+ **<font style="color:rgb(77, 77, 77);">高性能列式表达式语言</font>**<font style="color:rgb(77, 77, 77);">：基于ExprTK的高性能列式表达式语言，让你可以轻松进行复杂计算，而不用担心性能问题。</font>
+ **<font style="color:rgb(77, 77, 77);">框架无关的用户界面</font>**<font style="color:rgb(77, 77, 77);">：Perspective的UI作为自定义元素打包，可以通过WebAssembly在浏览器内运行，或者通过WebSocket服务器（Python/Node）虚拟支持。这种设计让Perspective可以轻松集成到各种前端框架中。</font>
+ **<font style="color:rgb(77, 77, 77);">JupyterLab小部件</font>**<font style="color:rgb(77, 77, 77);">：Perspective提供了JupyterLab小部件，让你可以在笔记本中进行交互式数据分析。</font>

<font style="color:rgb(77, 77, 77);">Perspective 需要较新版本的浏览器才能正常运行 处理超大数据集时，建议先在小数据集上测试你的配置 *实时数据更新频率不要太高，以免影响性能。</font>

<font style="color:rgb(79, 79, 79);background-color:rgb(238, 240, 244);">官网：</font>[<font style="color:rgb(78, 161, 219);background-color:rgb(238, 240, 244);">Perspective | Perspective</font>](https://perspective.finos.org/)

<font style="color:rgb(79, 79, 79);background-color:rgb(238, 240, 244);">GitHub：</font>[<font style="color:rgb(78, 161, 219);background-color:rgb(238, 240, 244);">https://github.com/finos/perspective</font>](https://github.com/finos/perspective)<font style="color:rgb(78, 161, 219);background-color:rgb(238, 240, 244);"></font>

---

#### <font style="color:rgb(79, 79, 79);">Python环境下的使用方法</font>

##### <font style="color:rgb(77, 77, 77);">安装</font>
可以使用pip安装perspective-python库：
```bash
pip install perspective-python
```

##### <font style="color:rgb(77, 77, 77);">基本使用</font>
Perspective for Python提供了与JavaScript版本相似的API，同时增加了对Python常用数据类型的支持：

+ **pandas DataFrame**: 最常用的数据格式，可以直接传入DataFrame对象
+ **polars DataFrame**: 高性能的数据处理库支持
+ **Apache Arrow**: 适用于大数据集和跨语言数据交换
+ **CSV字符串**: 支持直接解析CSV格式的数据
+ **JSON数据**: 支持行式和列式JSON格式

数据类型支持：
- `boolean`: 布尔值类型
- `date`: 日期类型（年月日）
- `datetime`: 毫秒精度的日期时间类型（UTC时区）
- `float`: 64位浮点数
- `integer`: 32位有符号整数
- `string`: 字符串类型（内部使用字典编码）

所有列类型都支持空值。

以下是一个简单的示例，展示如何创建表、应用视图以及处理数据：
```python
import pandas as pd
import numpy as np
from datetime import date, datetime
import perspective

# 创建示例数据
data = pd.DataFrame({
    "int": np.arange(100),
    "float": [i * 1.5 for i in range(100)],
    "bool": [i % 2 == 0 for i in range(100)],
    "date": [date.today() for i in range(100)],
    "datetime": [datetime.now() for i in range(100)],
    "string": [f"item_{i}" for i in range(100)]
})

# 创建Perspective Table
table = perspective.table(data, index="float")

# 创建View进行数据操作
view = table.view(
    group_by=["bool"],
    filter=[["int", ">", 50]],
    columns=["int", "float", "string"],
    sort=[["float", "desc"]]
)

# 导出结果为pandas DataFrame
result_df = view.to_df()
print(result_df)
```

##### <font style="color:rgb(77, 77, 77);">服务端使用</font>
Perspective还提供了服务端功能，可以通过WebSocket与前端进行交互。支持以下Web框架：

+ **Tornado**: 使用 `PerspectiveTornadoHandler` 处理WebSocket连接
+ **Starlette/FastAPI**: 使用 `PerspectiveStarletteHandler` 
+ **AIOHTTP**: 使用 `PerspectiveAIOHTTPHandler`

服务端模式的优势：
+ 数据保持在服务器端，只传输必要的数据到客户端
+ 支持大规模数据集的实时更新
+ 多个客户端可以共享同一个数据源
+ 通过多线程提供高性能的数据处理

基本示例：
```python
from perspective import Server

# 创建服务器
server = perspective.Server()

# 创建本地客户端
client = server.new_local_client()

# 在服务器上创建表
table = client.table(data, name="sample_data")

# 获取表的视图
view = table.view(group_by=["bool"])

# 查看结果
result = view.to_json()
print(result)
```

##### <font style="color:rgb(77, 77, 77);">JupyterLab集成</font>
Perspective提供了JupyterLab小部件`PerspectiveWidget`，可以在笔记本中进行交互式数据分析。主要特点：

+ **交互式数据可视化**: 支持多种图表类型和数据透视操作
+ **实时数据更新**: 可以通过流式处理实时更新数据
+ **高度可配置**: 支持自定义显示、过滤、排序等操作
+ **多种导出格式**: 支持导出为CSV、JSON、Excel等格式
+ **完整API访问**: 可以通过Python代码控制所有功能

基本使用示例：
```python
from perspective import PerspectiveWidget

# 创建示例数据
data = pd.DataFrame({
    "int": np.arange(100),
    "float": [i * 1.5 for i in range(100)],
    "bool": [i % 2 == 0 for i in range(100)]
})

# 创建Perspective小部件
widget = PerspectiveWidget(data, plugins=["datagrid"], group_by=["bool"])

# 在JupyterLab中显示
# display(widget)
```

##### <font style="color:rgb(77, 77, 77);">高级特性</font>

###### 1. 实时数据流

Perspective 支持实时数据流的处理，适合构建实时数据仪表板：

```python
# 创建一个实时数据流的示例
import time

# 创建表和视图
table = perspective.table(schema={"timestamp": "datetime", "value": "float"})
view = table.view()

# 设置更新回调
def on_update():
    print("数据已更新")

view.on_update(on_update)

# 模拟实时数据流
for i in range(10):
    table.update({
        "timestamp": [datetime.now()],
        "value": [np.random.random()]
    })
    time.sleep(1)  # 每秒更新一次
```

###### 2. 自定义聚合

支持多种聚合函数和自定义计算：

```python
# 创建表并设置自定义聚合
table = perspective.table({
    "product": ["A", "A", "B", "B"],
    "sales": [100, 200, 150, 300],
    "cost": [80, 150, 120, 250]
})

view = table.view(
    group_by=["product"],
    aggregates={
        "sales": "sum",
        "cost": "sum",
        "profit": {
            "column": "sales",
            "op": "custom",
            "func": lambda x: sum(x) * 0.8  # 假设80%是利润
        }
    }
)
```

###### 3. 高级过滤

支持复杂的过滤条件组合：

```python
# 创建带有复杂过滤条件的视图
view = table.view(
    filter=[
        ["sales", ">", 1000],
        "and",
        [
            ["region", "==", "North"],
            "or",
            ["region", "==", "South"]
        ],
        "and",
        ["date", ">=", date(2024, 1, 1)]
    ]
)
```

##### <font style="color:rgb(77, 77, 77);">完整示例和文档</font>

完整的示例代码和交互式演示可以在以下位置找到：

+ **示例代码**: [perspective_demo.ipynb](e:\office\资料\笔记\markdown\我的笔记\开源项目\代码\perspective_demo.ipynb)
+ **官方文档**: [Perspective Python API](https://perspective.finos.org/docs/python)
+ **示例项目**:
  + [Tornado示例](https://github.com/finos/perspective/tree/master/examples/python-tornado)
  + [Starlette示例](https://github.com/finos/perspective/tree/master/examples/python-starlette)
  + [AIOHTTP示例](https://github.com/finos/perspective/tree/master/examples/python-aiohttp)

该示例和文档包含了从基础到高级的所有功能示例，包括数据处理、可视化配置、服务端部署等内容。

