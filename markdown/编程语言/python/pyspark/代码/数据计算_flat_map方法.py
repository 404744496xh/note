# coding:utf8
# 演示rdd的flatMap算子

from pyspark import SparkConf,SparkContext
import os
os.environ["PYSPARK_PYTHON"] = "D:\\Anaconda\\python.exe"
# 0.构建Spark执行环境
conf = SparkConf().setAppName("create rdd").setMaster("local[*]")
sc =SparkContext(conf=conf)
# 准备一个RDD
rdd = sc.parallelize(["itheima itcast 666", "itheima itheima itcast", "python itheima"])

#按照空格切分数据后，解除嵌套（提取单词）
print(rdd.map(lambda x:x.split(" ")).collect())
print(rdd.flatMap(lambda x:x.split(" ")).collect())
sc.stop()
