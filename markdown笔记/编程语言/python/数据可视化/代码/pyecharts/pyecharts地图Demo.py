"""
演示地图可视化的基本使用
"""
from pyecharts.charts import Map
from pyecharts.options import VisualMapOpts
from pyecharts import options as opts
import os
import json
# 准备地图对象
map = Map()
# 准备数据
f =  open("编程语言\python\数据可视化\代码\data\疫情.txt","r",encoding="utf-8")
data = f.read()
f.close()
# 将json数据转换成字典格式
data_dict = json.loads(data)
# 从字典中取出省份的数据
province_data_list = data_dict['areaTree'][0]['children']

# 绘图所需要的列表
data_list = []
for province_data in province_data_list:
    # 取出省份名称
    province_name = province_data['name']+'省'
    
    # 取出省份的疫情数据
    province_confirm = province_data['total']['confirm']
    data_list.append((province_name, province_confirm))

print(data_list)

# 绘图
map.add("疫情", data_list, "china")
# 设置全局配置项
map.set_global_opts(
    title_opts=opts.TitleOpts(title="全国疫情"),    # 标题
    visualmap_opts=VisualMapOpts(                   # 视觉映射配置项
        is_show=True,                              # 是否显示
        is_piecewise=True,                         # 是否分片显示
        pieces=[                                    # 通过列表设置分片
            {"min": 0, "max": 99, "label": "0~99", "color": "#4cca4a"},
            {"min": 100, "max": 999, "label": "100~999", "color": "#f3f3f3"},
            {"min": 1000, "max": 9999, "label": "1000~9999", "color": "#459ca7"},
            {"min": 10000, "max": 99999, "label": "10000~99999", "color": "#455ba7"},
            {"min": 100000, "max": 999999, "label": "100000~999999", "color": "#8345a7"},
            {"min": 1000000,  "label": "1000000+", "color": "#a74555"},
        ]
    ),
    toolbox_opts=opts.ToolboxOpts(is_show= True)      # 工具箱
)

# 获取当前文件的完整路径
current_file_path = __file__
# 获取当前文件所在的目录
current_dir = os.path.dirname(current_file_path)
# 获取当前文件的文件名
current_file_name = os.path.basename(current_file_path)
# 显示
map.render(current_dir + "\\html\\"+current_file_name[:-3]+".html")
