[文档](https://05x-docs.pyecharts.org/#/zh-cn/prepare)

# line折线图

## JSON数据和Python字典的相互转换

```python
"""
演示JSON数据和Python字典的相互转换
"""
import json
# 准备列表，列表内每一个元素都是字典，将其转换为JSON
data = [{"name": "张大山", "age": 11}, {"name": "王大锤", "age": 13}, {"name": "赵小虎", "age": 16}]
json_str = json.dumps(data, ensure_ascii=False)
print(type(json_str))
print(json_str)
# 准备字典，将字典转换为JSON
d = {"name":"周杰轮", "addr":"台北"}
json_str = json.dumps(d, ensure_ascii=False)
print(type(json_str))
print(json_str)
# 将JSON字符串转换为Python数据类型[{k: v, k: v}, {k: v, k: v}]
s = '[{"name": "张大山", "age": 11}, {"name": "王大锤", "age": 13}, {"name": "赵小虎", "age": 16}]'
l = json.loads(s)
print(type(l))
print(l)
# 将JSON字符串转换为Python数据类型{k: v, k: v}
s = '{"name": "周杰轮", "addr": "台北"}'
d = json.loads(s)
print(type(d))
print(d)
```

## pyecharts的基础入门

```python
"""
演示pyecharts的基础入门
"""
# 导包
from pyecharts.charts import Line
from pyecharts.options import TitleOpts, LegendOpts, ToolboxOpts, VisualMapOpts
# 创建一个折线图对象
line = Line()
# 给折线图对象添加x轴的数据
line.add_xaxis(["中国", "美国", "英国"])
# 给折线图对象添加y轴的数据
line.add_yaxis("GDP", [30, 20, 10])

# 设置全局配置项set_global_opts来设置,
line.set_global_opts(
    title_opts=TitleOpts(title="GDP展示", pos_left="center", pos_bottom="1%"),
    legend_opts=LegendOpts(is_show=True),# 图例
    toolbox_opts=ToolboxOpts(is_show=True),# 工具箱
    visualmap_opts=VisualMapOpts(is_show=True),  # 视觉映射控件
)

# 通过render方法，将代码生成为图像
line.render()
```

## 04\_地图可视化的基本使用

```python
"""
演示地图可视化的基本使用
"""
from pyecharts.charts import Map
from pyecharts.options import VisualMapOpts

# 准备地图对象
map = Map()
# 准备数据
data = [
    ("北京市", 99),
    ("上海市", 199),
    ("湖南省", 299),
    ("台湾省", 399),
    ("广东省", 499)
]
# 添加数据
map.add("测试地图", data, "china")

# 设置全局选项
map.set_global_opts(
    visualmap_opts=VisualMapOpts(
        is_show=True,# 是否显示
        is_piecewise=True,# 是否分段
        pieces=[
            {"min": 1, "max": 9, "label": "1-9", "color": "#CCFFFF"},
            {"min": 10, "max": 99, "label": "10-99", "color": "#FF6666"},
            {"min": 100, "max": 500, "label": "100-500", "color": "#990033"}
        ]
    )
)

# 绘图
map.render()
```
## 05\_柱状图的基本使用
```python
"""
演示带有时间线的柱状图开发
"""
from pyecharts.charts import Bar, Timeline
from pyecharts.options import LabelOpts
from pyecharts.globals import ThemeType
import os

# 使用Bar构建基础柱状图
bar1 = Bar()
# 添加x轴的数据
bar1.add_xaxis(["中国", "美国", "英国"])
# 添加y轴数据
bar1.add_yaxis("GDP", [30, 30, 20], label_opts=LabelOpts(position="right"))
# 反转x和y轴
bar1.reversal_axis()

bar2 = Bar()
bar2.add_xaxis(["中国", "美国", "英国"])
bar2.add_yaxis("GDP", [50, 50, 50], label_opts=LabelOpts(position="right"))
bar2.reversal_axis()

bar3 = Bar()
bar3.add_xaxis(["中国", "美国", "英国"])
bar3.add_yaxis("GDP", [70, 60, 60], label_opts=LabelOpts(position="right"))
bar3.reversal_axis()

# 构建时间线对象
timeline = Timeline({"theme": ThemeType.LIGHT})
# 在时间线内添加柱状图对象
timeline.add(bar1, "点1")
timeline.add(bar2, "点2")
timeline.add(bar3, "点3")

# 自动播放设置
timeline.add_schema(
    play_interval=1000,     # 播放间隔
    is_timeline_show=True,  # 是否显示时间线
    is_auto_play=True,      # 是否自动播放
    is_loop_play=True       # 是否循环播放
)

# 获取当前文件的完整路径
current_file_path = __file__
# 获取当前文件所在的目录
current_dir = os.path.dirname(current_file_path)
# 获取当前文件的文件名
current_file_name = os.path.basename(current_file_path)

# 绘图是用时间线对象绘图，而不是bar对象了
timeline.render(current_dir + "\\html\\"+current_file_name[:-3]+".html")

```
构建时间线对象时的主题设置
抱歉，我之前的表格中编号确实使用了数字，但根据您提供的图片内容，编号应该是以 "ThemeType." 开头的字符串。以下是修正后的表格：

| ThemeType                | 颜色   | 备注                    |
| ------------------------ | ------ | ----------------------- |
| ThemeType.WHITE          | 红蓝   | 默认颜色等同于bar=Bar() |
| ThemeType.LIGHT          | 蓝黄粉 | 高亮颜色                |
| ThemeType.DARK           | 红蓝   | 黑色背景                |
| ThemeType.CHALK          | 红蓝绿 | 黑色背景                |
| ThemeType.ESSOS          | 红黄   | 暖色系                  |
| ThemeType.INFOGRAPHIC    | 红蓝黄 | 偏亮                    |
| ThemeType.MACARONS       | 紫绿   |                         |
| ThemeType.PURPLE_PASSION | 粉紫   | 灰色背景                |
| ThemeType.ROMA           | 红黑灰 | 偏暗                    |
| ThemeType.ROMANTIC       | 红粉蓝 | 淡黄色背景              |

现在表格中的编号使用了您提供的图片中的 "ThemeType." 格式。如果需要进一步的修改，请告知。

> timeline = Timeline({"theme": ThemeType.LIGHT})

### 动态GDP柱状图(案例)
```python

```

## 列表的sort方法
使用方式：
列表.sort(key=选择排序依据的函数, reverse=True|False)
- 默认是升序
- 参数reverse=True时降序，为Fasle时是升序
- 参数key，是要求传入一个函数，该函数的功能是选择排序依据的字段

```python
# 准备列表
my_list = [["a", 33], ["b", 55], ["c", 11]]

# 排序，基于带名函数
# def choose_sort_key(element):
#     return element[1]
#
# my_list.sort(key=choose_sort_key, reverse=True)
# 排序，基于lambda匿名函数
my_list.sort(key=lambda element: element[1], reverse=True)

print(my_list)
```

