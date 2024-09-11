## 创建忽略规则文件

就是屏蔽一些与项目不相关的文件来消除各IDE之间的差异

git.ignore配置文件

\# Compiled class file\
\*.class\
\
\# Log file\
\*.log\
\
\# BlueJ files\
\*.ctxt\
\
\# Mobile Tools for Java (J2ME)\
.mtj.tmp/# Package Files #\
\*.jar\
\*.war\
\*.nar\
\*.ear\
\*.zip\
\*.tar.gz\
\*.rar\
\
hs\_err\_pid\*\
\
.classpath\
.project\
.settings\
target\
.idea\
\*.iml

> \*.文件类型 就是要忽略的文件

.gitconfig文件

```properties
[user]
    name = XH
    email = 404744496@qq.com
[core]
    excludesfile = E:\java\git.ignore
```

![image.png](images/WEBRESOURCE58b54f2ee0308fc5869a885feb0791c0image.png)

合并冲突时

![image.png](images/WEBRESOURCEf2de55fc15d2430e61479172ede3bf28image.png)

![image.png](images/WEBRESOURCE9c25d979e1dd17e2f678be98ba073416image.png)

![image.png](images/WEBRESOURCEf21c60321e0d032623841499d2617424image.png)

添加了GitHub后

![image.png](images/WEBRESOURCE531dc85544f6a059fbccc298827241a3image.png)
