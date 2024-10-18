"""
需求，复制以上内容到文件中,使用Spark读取文件进行计算:
- 各个城市销售额排名，从大到小
- 全部城市，有哪些商品类别在售卖
- 北京市有哪些商品类别在售卖
"""
from pyspark import SparkConf,SparkContext
import os
import json
os.environ["PYSPARK_PYTHON"] = "D:\\Anaconda\\python.exe"
conf = SparkConf().setMaster("local[*]").setAppName("test_spark_map")
sc = SparkContext(conf=conf)

# TODO 需求1：各个城市销售额排名，从大到小
# 1.1 读取文件
rdd = sc.textFile("data/orders.txt")

# 1.2 取出一个个json字符串
json_str_rdd = rdd.flatMap(lambda x:x.split("|"))
# print(len(json_str_rdd.collect()))

# 1.3 将一个个json字符串解析成字典
dict_rdd = json_str_rdd.map(lambda x:json.loads(x))
print(dict_rdd.collect())

# 1.4 取出城市名称和销售额
city_sale_rdd = dict_rdd.map(lambda x: (x['areaName'],x['money']))
# print(city_sale_rdd.collect())

# 1.5 按销售额结果进行排序
all_sale_rdd = city_sale_rdd.reduceByKey(lambda x,y:x+y)
# print(all_sale_rdd.collect())
order_sale_rdd = all_sale_rdd.sortBy(lambda x:x[1],False,numPartitions=1)
print("需求1的结果：",order_sale_rdd.collect())
# TODO 需求2：全部城市，有哪些商品类别在售卖
# 2.1 取出城市名称和商品类别
city_category_rdd = dict_rdd.map(lambda x: x['category']).distinct()

# 2.2 将城市名称和商品类别进行聚合

print("需求2的结果：",city_category_rdd.collect())
# 2.3 将商品类别进行去重

# TODO 需求3：北京市有哪些商品类别在售卖
# 3.1 过滤出北京市的数据
beijin_rdd = dict_rdd.filter(lambda x:x['areaName']=='北京')
# print(beijin_rdd.collect())
# 3.2 取出商品类别并去重
all_sale_rdd = beijin_rdd.map(lambda x: x['category']).distinct()
print("需求3的结果：",all_sale_rdd.collect())

sc.stop()