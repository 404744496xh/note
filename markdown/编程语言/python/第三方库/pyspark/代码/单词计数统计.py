"""
完成练习案例:单词计数统计
"""
# 1.构建执行环境入口对象
from pyspark import SparkConf,SparkContext
import os
os.environ["PYSPARK_PYTHON"] = "D:\\Anaconda\\python.exe"
conf = SparkConf().setMaster("local[*]").setAppName("test_spark_map")
sc = SparkContext(conf=conf)
# 2.读取数据文件
rdd = sc.textFile("data/hello.txt")
# print(rdd.collect())
# 3、取出全部单词
rdd_word = rdd.flatMap(lambda x:x.split(" "));
# 4.将所有单词都转换成二元元组，单词为Key，value设置为1
word_with_one_rdd = rdd_word.map(lambda x:(x,1))
print(word_with_one_rdd.collect())
# 5.分组并求和
group_rdd = word_with_one_rdd.reduceByKey(lambda x,y:x+y)
# 6.打印输出结果
print(group_rdd.collect())
sc.stop()