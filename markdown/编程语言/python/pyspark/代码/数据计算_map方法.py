"""
RDD的map成员方法的使用
"""
from pyspark.context import SparkContext, SparkConf
# 设置python解释器
import os
os.environ["PYSPARK_PYTHON"] = "D:\\Anaconda\\python.exe"

conf = SparkConf().setMaster("local[*]").setAppName("test_spark_map")
sc = SparkContext(conf=conf)

# 准备一个RDD
rdd = sc.parallelize([1, 2, 3])
print(rdd.collect())

# 通过map方法将全部数据都乘以10
def map_func(x):
    return x * 10
rdd2 = rdd.map(map_func)
# rdd.map(lambda x: x * 10)
print(rdd2.collect())
# (T) -> U
# (T) -> T

# 链式调用
rdd3 = rdd.map(lambda x: x * 10).map(lambda x: x + 10)
print(rdd3.collect())
sc.stop()