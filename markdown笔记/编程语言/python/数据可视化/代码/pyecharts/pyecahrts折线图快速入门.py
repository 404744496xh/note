"""
演示pyecharts的基础入门
"""
# 导包
import os
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
# 获取当前文件的完整路径
current_file_path = __file__
# 获取当前文件所在的目录
current_dir = os.path.dirname(current_file_path)
# 获取当前文件的文件名
current_file_name = os.path.basename(current_file_path)
# 通过render方法，将代码生成为图像
line.render(current_dir + "\\html\\"+current_file_name[:-3]+".html")