- [什么是版本控制](https://note.youdao.com/md/#%E4%BB%80%E4%B9%88%E6%98%AF%E7%89%88%E6%9C%AC%E6%8E%A7%E5%88%B6)
- [Git介绍 分布式版本控制工具 Vs 集中式版本控制工具](https://note.youdao.com/md/#git%E4%BB%8B%E7%BB%8D-%E5%88%86%E5%B8%83%E5%BC%8F%E7%89%88%E6%9C%AC%E6%8E%A7%E5%88%B6%E5%B7%A5%E5%85%B7-vs-%E9%9B%86%E4%B8%AD%E5%BC%8F%E7%89%88%E6%9C%AC%E6%8E%A7%E5%88%B6%E5%B7%A5%E5%85%B7)
   - [集中式版本控制工具](https://note.youdao.com/md/#%E9%9B%86%E4%B8%AD%E5%BC%8F%E7%89%88%E6%9C%AC%E6%8E%A7%E5%88%B6%E5%B7%A5%E5%85%B7)
   - [分布式版本控制工具](https://note.youdao.com/md/#%E5%88%86%E5%B8%83%E5%BC%8F%E7%89%88%E6%9C%AC%E6%8E%A7%E5%88%B6%E5%B7%A5%E5%85%B7)
- [Git工作机制](https://note.youdao.com/md/#git%E5%B7%A5%E4%BD%9C%E6%9C%BA%E5%88%B6)
- [Git安装](https://note.youdao.com/md/#git%E5%AE%89%E8%A3%85)
- [Git常用命令](https://note.youdao.com/md/#git%E5%B8%B8%E7%94%A8%E5%91%BD%E4%BB%A4)
- [Git分支](https://note.youdao.com/md/#git%E5%88%86%E6%94%AF)
   - [分支的好处](https://note.youdao.com/md/#%E5%88%86%E6%94%AF%E7%9A%84%E5%A5%BD%E5%A4%84)
   - [分支的操作](https://note.youdao.com/md/#%E5%88%86%E6%94%AF%E7%9A%84%E6%93%8D%E4%BD%9C)
      - [** linux系统操作指令**](https://note.youdao.com/md/#linux%E7%B3%BB%E7%BB%9F%E6%93%8D%E4%BD%9C%E6%8C%87%E4%BB%A4)
# 什么是版本控制
记录文件更新的情况，和修改的历史记录。即可以切换到其他版本
# Git介绍 分布式版本控制工具 Vs 集中式版本控制工具
## 集中式版本控制工具
svn....
## 分布式版本控制工具

# Git常用命令
| **命令名称** | **作用** |
| --- | --- |
| git config --global [user.name](http://user.name/)
 用户名 | 设置用户签名 |
| git config --global user.email 邮箱 | 设置用户签名 |
| git init | 初始化本地库 |
| git status | 查看本地库状态 |
| git add 文件名 | 添加到缓存区 |
| git commit -m "日志信息" 文件名 | 提交到本地库 |
| git reflog | 查看历史操作记录 |
| git reset --hard 版本号 | 版本穿梭 |
| git log | 查看提交记录 |

注意：在vim里面：:yy是复制，:p是粘贴，:wq保存
vim 文件名 （打开文件）
因为Linux和git是是同一个*所以Linux里的命令可以在git里用
例：git commit -m "first commit" holle.txt

图中10f5732这7位是版本号
Ctrl+l清屏
cat 文件名 查看文件
按tab可以补充命令
**git log详细的历史记录**
**在.git/HEAD里面可以看指针指向那个版本**

# Git分支

**←**
## 分支的好处
同时推进各个功能的开发提升效率
如果分支在开发过程中失败不会对其他分支有影响
## 分支的操作
| **命令名称** | **作用** |
| --- | --- |
| git branch 分支名 | 创建分支 |
| git branch -v | 查看分支 |
| git checkout 分支名 | 切换分支 |
| git merge 分支名 | 把指定分支合并到当前分支上 |
| git branch -d 分支名 | 删除分支 |

### ** linux系统操作指令**
| **指令** | **含义** | **说明** |
| --- | --- | --- |
| cd 目录 | change directory | 改变操作目录 |
| cd .. |  | 退回到上一级目录 |
| pwd | Print work directory | 打印工作目录 |
| ls | list directory contents | 显示当前目录的文件及子文件目录 |
| ll | ls -l 简化版本 | 更详细地显示当前目录的文件及子文件目录 |
| mkdir 文件夹名称 | make directory | 新建一个文件夹 |
| rm 文件 | remove | 删除文件 |
| rm -r 文件夹 | Remove | 删除文件目录 |
| touch 文件 |  | 如果创建的文件不存在，那么创建一个空文件 |
| reset |  | 清屏 |
| clear |  | 清屏 |
| exit |  | 退出终端窗口 |

