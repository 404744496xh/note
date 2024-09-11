""" 
文件读取的抽象类用来定义文件读取的接口

"""
from data_define import Record
import json

class FileDefine:
    def __init__(self, file_path):
        """
        :param file_name: 文件名
        """
        pass
    def read(self) -> list[Record] :
        """
        读取文件内容
        :return: 文件内容
        """
        pass

""" 读取文本文件 """
class TextReadFile(FileDefine):
    def __init__(self, file_path):
        self.file_path = file_path
    
    # 复写（实现）父类的方法
    def read(self) -> list[Record]:
        fr = open(self.file_path, 'r', encoding='utf-8')
        lines = fr.readlines()
        list_record = []
        for line in lines:
            line.strip()
            list = line.split(',')
            # print(line,type(line))
            list_record.append(Record(list[0], list[1],int(list[2]), list[3]))

        fr.close()
        return list_record


if __name__ == '__main__':
    file_path = '编程语言\\python\\销售额统计(数据分析案例)\\2011年1月销售数据.txt'
    text_read_file = TextReadFile(file_path)
    list_record = text_read_file.read()
    for record in list_record:
        print(record)



""" 读取json文件 """
class JsonReadFile(FileDefine):
    def __init__(self, file_path):
        self.file_path = file_path


    
    # 复写（实现）父类的方法
    def read(self) -> list[Record]:
        fr = open(self.file_path, 'r', encoding='utf-8')
        lines = fr.readlines()
        list_record = []
        for line in lines:
            line.strip()
            list = json.loads(line)
            list_record.append(Record(list['date'], list['order_id'], int(list['money']), list['province']))
            # print(line,type(line))
        fr.close()
        return list_record
    

if __name__ == '__main__':
    file_path = '编程语言\\python\\销售额统计(数据分析案例)\\2011年2月销售数据JSON.txt'
    text_read_file = JsonReadFile(file_path)
    list_record = text_read_file.read()
