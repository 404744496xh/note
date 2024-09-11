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

