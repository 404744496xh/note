定义:

双向队列：支持插入删除元素的线性集合。

java官方文档推荐用deque实现栈（stack）。



和Queue的区别:

Deque是double ended queue，将其理解成双端结束的队列，双端队列，可以在首尾插入或删除元素。

Queue的解释中，Queue就是简单的FIFO队列。

所以在概念上来说，Queue是FIFO的单端队列，Deque是双端队列。







特点

> 1.插入、删除、获取操作支持两种形式：快速失败和返回null或true/false
>
> 2.既具有FIFO特点又具有LIFO特点，即是队列又是栈
>
> 3.不推荐插入null元素，null作为特定返回值表示队列为空
>
> 4.未定义基于元素相等的equals和hashCode
>



接口分析:

:::info
addFirst(): 向队头插入元素，如果元素为空，则发生NPE(空指针异常)

addLast(): 向队尾插入元素，如果为空，则发生NPE

offerFirst(): 向队头插入元素，如果插入成功返回true，否则返回false

offerLast(): 向队尾插入元素，如果插入成功返回true，否则返回false

removeFirst(): 返回并移除队头元素，如果该元素是null，则发生NoSuchElementException

removeLast(): 返回并移除队尾元素，如果该元素是null，则发生NoSuchElementException

pollFirst(): 返回并移除队头元素，如果队列无元素，则返回null

pollLast(): 返回并移除队尾元素，如果队列无元素，则返回null

getFirst(): 获取队头元素但不移除，如果队列无元素，则发生NoSuchElementException

getLast(): 获取队尾元素但不移除，如果队列无元素，则发生NoSuchElementException

peekFirst(): 获取队头元素但不移除，如果队列无元素，则返回null

peekLast(): 获取队尾元素但不移除，如果队列无元素，则返回null

pop(): 弹出栈中元素，也就是返回并移除队头元素，等价于removeFirst()，如果队列无元素，则发生NoSuchElementException

push(): 向栈中压入元素，也就是向队头增加元素，等价于addFirst()，如果元素为null，则发生NPE，如果栈空间受到限制，则发生IllegalStateException

:::

