"""
演示将RDD输出到文件中
"""

from pyspark import SparkConf, SparkContext
import os
import json
os.environ["PYSPARK_PYTHON"] = "D:\\Anaconda\\python.exe"
os.environ["HADOOP_HOME"] = "D:\\Toolbox\\hadoop-3.0.0"
conf = SparkConf().setMaster("local[*]").setAppName("test_spark")
conf.set("spark.default.parallelism", 1)
sc =SparkContext(conf=conf)
# 准备RDD1
rdd1 = sc.parallelize([1,2,3,4,5])
#准备RDD2
rdd2 = sc.parallelize([("Hello",3),("spark",5),("Hi",7)])
# 准备RDD3
rdd3 = sc.parallelize([[1,3,5,[6,7,9],[11,13,11]]])
# 输出到文件中
rdd1.saveAsTextFile("data/output_rdd1")
rdd2.saveAsTextFile("data/output_rdd2")
rdd3.saveAsTextFile("data/output_rdd3")

sc.stop()