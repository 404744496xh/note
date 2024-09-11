"""
 演示通过PySpark代码加载数据，即数据输入
"""
from pyspark import SparkContext, SparkConf

conf = SparkConf().setMaster("local[*]").setAppName("test_spark_dataInput")
sc = SparkContext(conf=conf)

# 通过parallelize方法将python数据加载到Spark中，成为RDD对象
rdd1 = sc.parallelize([1, 2, 3 ,4, 5])
rdd2 = sc.parallelize((1, 2, 3 ,4, 5))
rdd3 = sc.parallelize("abcdefgh")
rdd4 = sc.parallelize({1, 2, 3, 4, 5})
rdd5 = sc.parallelize({"key1": "value1", "key2": "value2", "key3":"value3"})

# 如果要查看RDD中的数据，需要调用collect方法
print(rdd1.collect())
print(rdd2.collect())
print(rdd3.collect())
print(rdd4.collect())
print(rdd5.collect())

# 用textFile方法读取文件加载到spark，成为RDD对象
rdd = sc.textFile("data/hello.txt")
print(rdd.collect())

sc.stop()

