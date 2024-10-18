""" 
演示获取PySpark的执行环境入库对象:SparkContext
并通过SparkContext对象获取当前PySpark的版本
"""
# 导包
from pyspark import SparkContext,SparkConf
# 创建Sparkconf对象
conf = SparkConf().setMaster("local[*]").setAppName("test_Spark_app")

# conf = SpaarkConf
# conf.setMaster("local[*]")
# conf.setAppName("test_Spark_app") 

# 基于spaprkConf创建SparkContext对象
sc = SparkContext(conf=conf)

# 获取PySpark的版本
print("PySpark version: ", sc.version)

# 停止SparkContext对象的运行（停止spark程序）
sc.stop()