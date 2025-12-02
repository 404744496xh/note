"""
演示将RDD输出为Python对象
"""
from pyspark import SparkConf, SparkContext
import os
import json
os.environ["PYSPARK_PYTHON"] = "D:\\Anaconda\\python.exe"
conf = SparkConf().setMaster("local[*]").setAppName("test_spark")
sc =SparkContext(conf=conf)
#准备RDD
rdd =sc.parallelize([1,2,3,4,5])

#collect算子，输出RDD为list对象
rdd_list = rdd.collect()
print(rdd_list)

#reduce算子，对RDD进行两两聚合
rdd_reduce = rdd.reduce(lambda x,y:x+y)
print(rdd_reduce)

# take算子，取出RDD前N个元素，组成list返回
rdd_take = rdd.take(3)
print(rdd_take)

# count，统计rdd内有多少条数据，返回值为数字
rdd_count = rdd.count()
print(f'RDD里有{rdd_count}个元素')

sc.stop()