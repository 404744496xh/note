### 1\. (填空题)

设计一个合理的Storm流程实现实时词频统计，填写空缺的代码。

public class WordCountTopology {

    public static void main(String\[\] args) throws Exception {

      TopologyBuilder builder = new TopologyBuilder();

        builder.setSpout("wordcount\_spout", new WordCountSpout());

        builder.setBolt("wordcount\_split\_bolt", new (1)  ()).shuffleGrouping ( (2)  );

        builder.setBolt("wordcount\_count\_bolt", new  (3)  ()).fieldsGrouping ((4)   , new Fields("word"));

……//部分代码省略

}

public static class WordCountSpout extends BaseRichSpout {

……此处定义按行接收数据的代码

}

public static class WordCountSplitBolt extends BaseRichBolt {

    private OutputCollector collector;

    @Override

    public void execute(Tuple tuple) {

        String str = tuple.getStringByField("sentence");

        str = str.replace(",", " ").replace(".", " ").trim();

        String\[\] words = str.split(" ");

        for (String w : words) {

            this.collector.emit((5)    );

        }

    }

    @Override

    public void prepare(Map arg0, TopologyContext arg1, OutputCollector collector) {

        this.collector = collector;

    }

    @Override

    public void declareOutputFields(OutputFieldsDeclarer declarer) {

            declarer.declare((6)   );    

    }

}

public static class WordCountTotalBolt extends BaseRichBolt {

    private OutputCollector collector;

    private (7)       result = (8)     ;

        @Override

        public void execute(Tuple tuple) {

            String word = (9)        ;

            int count = (10)        ;

            int total =count ;

           if (result.containsKey(word)) {

             total = (11)          ;

           }

           result.put(word, total );

           System.out.println(word+":" + total );

           this.collector.emit( (12)                   );

        }

        ……//部分代码省略

}


_正确答案：_

(1) WordCountSplitBolt

(2) "wordcount\_spout"

(3) WordCountTotalBolt

(4) "wordcount\_split\_bolt"

(5) new Values(w, 1)

(6) new Fields("word", "count")

(7) Map<String, Integer>

(8) new HashMap<>()

(9) tuple.getStringByField("word")

(10) tuple.getIntegerByField("count")

(11) result.get(word) + count)

(12) new Values(word, total )

### 2\. (填空题)

请补充完整MongoDB数据库安全配置的步骤。

步骤1：用超级管理员登录MongoDB，使用(1)             命令切换至admin数据库。

步骤2：用如下命令创建管理员用户superUser，密码为123456，拥有root权限：

db.(2)            ({user:"superUser",pwd:"123456",roles:\[{role:"root",db:"admin"}\]})。

步骤3：关闭数据库，使用如下命令重启MongoDB，使得MongoDB支持身份验证：

mongod  (3)         \--port 27017  \--dbpath /data/db  --logpath /tmp/mongodb.log  --fork。

步骤4：用新创建的superUser用户重新登录MongoDB：

mongo  (4)                      admin

    步骤5：如果绑定了登录的IP为127.0.0.1，端口为27018，那么在登录MongoDB时应增加参数(5)              

    若要绑定登录IP为127.0.0.1，应该在步骤3重启MongoDB时增加参数(6)               。



_正确答案：_

(1) use admin

(2) createUser

(3) \--auth

(4) \-usuperUser  -p123456

(5) 127.0.0.1:20018

(6) \--bind\_ip 127.0.0.1 

### 3\. (填空题)

按要求补充填写配置Hadoop完全分布式集群的操作步骤。

第一步：配置主机映射。分别在3台主机上执行(1)            指令，并在该文件中编辑主机IP与域名的映射关系，3主机分别称master、slave1、slave2。

第二步：配置免密登录。配置完成后，在master上执行(2)              ~/.ssh/id\_rsa.pub >> ~/.ssh/authorized\_keys指令，将slave1上的公钥复制到master上。用同样的方法复制slave2上的公钥。

第三步：安装JDK。使用(3)           jdk-8u11-linux-x64.tar.gz 指令解压缩JDK安装包，并配置好环境变量。

第四步：解压Hadoop，并配置相关配置文件。其中hdfs-site.xml中

<property>  

    <name>dfs.replication</name>  

    <value>3</value>  

</property>

配置表示 (4)                          含义。

第五步：格式化namenode。使用命令(5)                       完成。最后启动Hadoop。


_正确答案：_

(1) vi /etc/hosts

(2) ssh slave1 cat

(3) tar -zxvf 

(4) 指定集群数据有3副本

(5) hadoop namenode -format

### 4\. (填空题)

根据要求配置Flume的conf文件，实现故障转移。（每空1分，共13分）

要求：1、日志数据采集的来源是本地文件，路径是/root/log/data\_log.txt

2、数据采集的目标地址是HDFS的/logs目录，文件前缀为flume。

3、hadoop102和hadoop103两台服务器进行数据传输，默认使用hadoop102。当hadoop102故障，hadoop103可以继续工作

a1.sources = r1

a1.channels = c1

a1.sinkgroups = g1

a1.sinks = k1 k2

a1.sources.(1)   .type = (2)        

a1.sources.(1)   .(3)         \= (4)             /root/log/data\_log.txt

a1.sinkgroups.(5)    .processor.type = failover

a1.sinkgroups.(5)    .processor.priority.k1 = (6)        

a1.sinkgroups.(5)    .processor.priority.k2 = (7)        

a1.sinkgroups.(5)    .processor.maxpenalty = 10000

a1.sinks.k1.type = (8)       

a1.sinks.k1.hostname = (9)         

a1.sinks.k1.port = 4141

a1.sinks.k2.type =(8)        

a1.sinks.k2.hostname = (10)        

a1.sinks.k2.port = 4142

a1.channels.c1.type = memory

a1.channels.c1.capacity = 1000

a1.channels.c1.transactionCapacity = 100

\# 绑定 source and sink to the channel

a1.sources.r1.channels = c1

a1.sinkgroups.g1.sinks = (11)        

a1.sinks.(12)    .channel = c1

a1.sinks.(13)    .channel = c1

_正确答案：_

(1) r1

(2) exec

(3) command

(4) tail -n +0 -f

(5) g1

(6) 5

(7) 10

(8) avro

(9) hadoop103

(10) hadoop102

(11)  k1 k2

(12)  k1

(13) k2

### 5\. (填空题)

请配置Flume的/root/log\_to\_kafka.conf文件，实现与Kafka对接。（每空1分，共13分）

要求：1、日志数据采集的来源是网络工具NetCat，监听端口为6666。

2、数据采集的目标是Kafka集群，集群服务器域名为hadoop102，端口为9092。

3、Kafka主题为bigdata

                    4、Flume缓冲区类型选择Memory Channel。

a3.sources = (1)        

a3.channels = c1

a3.sinks = k1

a3.sources.r2.type = (2)          

a3.sources.r2.(3)        \= 0.0.0.0

a3.sources.r2.(4)        \= 6666

a3.sinks.k1.type=org.apache.flume.sink.kafka.KafkaSink

a3.sinks.k1.kafka.bootstrap.servers =(5)             

a3.sinks.k1.kafka.topic = (6)           

a3.sinks.k1.kafka.flumeBatchSize = 100

a3.channels.c1.type = (7)           

a3.channels.c1.capacity = 1000

a3.channels.c1.transactionCapacity = 100

\# 绑定 source and sink to the channel

a3.sources.r1. (8)          = c1

a3.sinks.k1. (9)          = c1

配置完成后，在Kafka的安装目录下，执行bin/(10)\_\_\_\_\_  config/server.properties &指令启动Kafka，创建主题。

接着执行bin/kafka-console-consumer.sh --bootstrap-server hadoop102:9092 --topic bigdata --from-beginning；

第三步，在Flume安装目录下执行：(11)\_\_\_\_\_  -Dflume.root.logger=INFO,console，启动Flume；

第四步，使用命令：(12)                ，启动NetCat。

第五步，在NetCat上输入信息，如果在(13)             处看到相同信息被打印在控制台上，说明Flume与Kafka对接成功。

_正确答案：_

(1) r2

(2) netcat

(3) bind

(4) port

(5) hadoop102:9092

(6) bigdata

(7) memory

(8) channels

(9) channel

(10) bin/kafka-server-start.sh config/server.properties &

(11) flume-ng agent -n a1 -c conf -f /root/log\_to\_kafka.conf

(12) nc  localhost  6666

(13) Kafka消费者端

### 6\. (填空题)

阅读Sqoop的指令，按要求填写对指令的理解。

sqoop export  --connect 'jdbc:mysql://hadoop/weather?useUnicode=true&characterEncoding=utf-8'  --username hive  --password hive  --table mean\_temperature  --export-dir /hive/warehouse/ mydb/mean\_temperature  -m  1;

其中，sqoop export表示该指令执行的是(1)                操作；

            --table  mean\_temperature表示(2)                                                 

\--export\-dir /hive/warehouse/mydb/mean\_temperature表示(3)                           

\-m  1表示(4)                                       ；

            --username  hive  --password  hive表示 (5)                                       。


_正确答案：_

(1) 数据导出

(2) 数据导出后存放在Mysql的 mean\_temperature数据表中

(3) 数据源来自HDFS上的/hive/warehouse/mydb/mean\_temperature目录

(4) 并行度为1

(5) 指定连接Mysql的用户名和密码，此处都为hive

### 7\. (填空题)

请将下列步骤补充完整，模拟从Mysql数据库中将数据导入Hadoop的HDFS中。

步骤1：修改(1)             配置文件，指定连接的Mysql数据库和用户、密码等。

<property>

 <name>javax.jdo.option.ConnectionURL</name>

 <value>……</value>

</property>

<property>

 <name>javax.jdo.option.ConnectionDriverName</name>

 <value>……</value>

</property>

<property>

 <name>javax.jdo.option.ConnectionUserName</name>

 <value>……</value>

</property>

<property>

 <name>javax.jdo.option.ConnectionPassword</name>

 <value>……</value>

</property>

以上配置中，javax.jdo.option.ConnectionURL表示(2)                  。

javax.jdo.option.ConnectionDriverName表示(3)                       。

javax.jdo.option.ConnectionUserName表示(4)                         。

javax.jdo.option.ConnectionPassword表示(5)                           。

连接该Mysql数据库的目的是(6)                                    。

步骤2：登录Mysql，创建用户bee，密码123456。

创建用户指令：(7)                                 ;

步骤3：为该用户授权hiveDB数据库的全部权限。

授权指令：(8)               hiveDB.\* to 'bee'@'%' identified by '123123';

步骤4：重新用bee用户登录Mysql，创建数据表，并写入3条模拟数据。

创建数据表指令：CREATE TABLE student (

    stu\_no int PRIMARY KEY,

    stu\_name VARCHAR(20),

    stu\_age INT

);

步骤5：使用(9)         命令启动Hadoop。

步骤6：使用(10)        命令登录Hive客户端。

步骤7：在hive中创建数据库

创建数据库指令：(11)                    ;

步骤8：使用sqoop将Mysql中的student数据表导入Hive的test数据表。 

sqoop import --connect jdbc:mysql://127.0.0.1:3306/hdfsdb --username root --password 123123 --table student  --hive-import  \--delete-target-dir  -m 1  --hive-table test

该指令中 \--delete-target-dir 参数表示(12)              。


_正确答案：_

(1) hive-site.xml

(2) 连接Mysql数据库的URL

(3) 连接Mysql数据库的JDBC驱动程序

(4) 连接Mysql数据库的用户名

(5) 连接Mysql数据库的用户密码

(6) 用于保存Hive的元数据

(7) create user 'bee'@'%' identified by '123123'

(8) grant all privileges on

(9) start-dfs.sh

(10) hive

(11) create database hdfsdb

(12) 如果Hive中目标表已存在，则先删除再导入

### 8\. (填空题)

阅读Hive的HQL语句，按要求填写对语句的理解。

create  table  if not exists temperature (id string comment '气象站id',year string comment '年', temperature int comment '气温')

comment '天气表'

ROW FORMAT DELIMITED FIELDS TERMINATED BY ','

STORED AS  TEXTFILE ;

create  table  if not exists temperature表示(1)                                      。

该语句设置(2)        个字段，

字段名分别是(3)                   。

字段数据类型分别是(4)                  。

ROW FORMAT DELIMITED FIELDS TERMINATED BY ','中的逗号表示(5)     。


_正确答案：_

(1) 如果数据表temperature不存在则创建一个

(2) 3

(3) id、year、temperature

(4) string、string、int

(5) 由逗号作为列的分隔符