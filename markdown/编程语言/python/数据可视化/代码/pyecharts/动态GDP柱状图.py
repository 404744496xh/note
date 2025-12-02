from pyecharts.charts import Bar, Timeline
from pyecharts.options import *
from pyecharts.globals import ThemeType
import os

# 读取文件
f = open(r'E:\office\资料\markdown笔记\编程语言\python\数据可视化\data\1960-2019全球GDP数据.csv', 'r',encoding= 'GB2312')
data_lines = f.readlines()
f.close()
data_lines.pop(0)
# 删除第一条数据
data_lines.pop(0)
# 将数据转换为字典存储，格式为：
# { 年份: [ [国家, gdp], [国家,gdp], ......  ], 年份: [ [国家, gdp], [国家,gdp], ......  ], ...... }
# { 1960: [ [美国, 123], [中国,321], ......  ], 1961: [ [美国, 123], [中国,321], ......  ], ...... }
# 先定义一个字典对象
data_dict ={}
# 遍历数据，将数据存入字典中
for data in data_lines:
    # 拆分数据
    data_list = data.split(',')
    # 获取年份
    year = int(data_list[0])
    # 获取国家
    country = data_list[1]
    # 获取GDP
    gdp = float(data_list[2])
    if year not in data_dict:
        data_dict[year] = []
    data_dict[year].append([country, gdp])

# print(data_dict)

# 排序年份
sorted_year_list = sorted(data_dict.keys())
timeline = Timeline({"theme": ThemeType.PURPLE_PASSION})
for year in sorted_year_list:
    # 获取年份对应的GDP数据
    data_dict[year].sort(key=lambda x:x[1], reverse=True)
    # 取出前八名国家的信息
    year_data = data_dict[year][0:8]
    x_data = []
    y_data = []
    
    for country, gdp in year_data:
        x_data.append(country)
        y_data.append(gdp/100000000)
        
    x_data.reverse()
    y_data.reverse()
    bar = Bar()
    bar.add_xaxis(x_data)
    bar.add_yaxis('GDP(亿)', y_data,label_opts=LabelOpts(position='right'))# 设置标签位置position='right'将标签放在右边

    # 反转x轴和y轴
    bar.reversal_axis()
    # 图表的标题
    bar.set_global_opts(
        title_opts = TitleOpts(title= f"{year}年全球前八GFP数据")
    )
    timeline.add(bar, f'{year}年')

# 自动播放设置
timeline.add_schema(
    play_interval=1000,     # 播放间隔
    is_timeline_show=True,  # 是否显示时间线
    is_auto_play=True,      # 是否自动播放
    is_loop_play=False       # 是否循环播放
)


# 获取当前文件的完整路径
current_file_path = __file__
# 获取当前文件所在的目录
current_dir = os.path.dirname(current_file_path)
# 获取当前文件的文件名
current_file_name = os.path.basename(current_file_path)

# 绘图
timeline.render(current_dir + "\\html\\"+current_file_name[:-3]+".html")