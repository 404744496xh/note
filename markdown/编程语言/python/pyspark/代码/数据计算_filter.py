"""
演示RDD的filter成员方法的使用
"""
from pyspark import SparkConf, SparkContext
import os
os.environ["PYSPARK_PYTHON"] = "D:\\Anaconda\\python.exe"
conf = SparkConf().setMaster("local[*]").setAppName("test_spark")
sc =SparkContext(conf=conf)
#准备一个RDD
rdd=sc.parallelize([1,2,3,4,5])
# 对RDD的数据进行过滤
rdd_filter=rdd.filter(lambda x:x>3)
# 打印结果
print("rdd_filter:",rdd_filter.collect())
sc.stop()