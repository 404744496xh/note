from file_define import *
from pyecharts.charts import Bar
from pyecharts.options import *
from pyecharts.globals import ThemeType
import os

text_data = TextReadFile("编程语言\\python\\销售额统计(数据分析案例)\\2011年1月销售数据.txt")
json_data = JsonReadFile("编程语言\\python\\销售额统计(数据分析案例)\\2011年2月销售数据JSON.txt")

# 得到2个文件的数据
feb_data = text_data.read()
jan_data = json_data.read()
# 合并数据
all_data = feb_data + jan_data
# 统计销售额
data_dict = {}
for data in all_data:
    if data.date in data_dict:
        data_dict[data.date] += data.money
    else:
        data_dict[data.date] = data.money

print(data_dict)
bar = Bar(init_opts=InitOpts(theme=ThemeType.LIGHT))

bar.add_xaxis(list(data_dict.keys()))
bar.add_yaxis("销售额",list(data_dict.values()),label_opts=LabelOpts(is_show=False))

bar.set_global_opts(
    title_opts=TitleOpts(title="每日销售额统计"),
)
# 获取当前文件的完整路径
current_file_path = __file__
# 获取当前文件所在的目录
current_dir = os.path.dirname(current_file_path)
# 获取当前文件的文件名
current_file_name = os.path.basename(current_file_path)
bar.render("编程语言\\python\\销售额统计(数据分析案例)\\每日销售额柱状图.html")
   
