package 集合;

import java.util.*;

class IteratorTest {
    public void test() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        Iterator iterator = coll.iterator();
// 方式一：
// System.out.println(iterator.next());
// System.out.println(iterator.next());
// System.out.println(iterator.next());
// System.out.println(iterator.next());
// System.out.println(iterator.next());
// // 报异常：NoSuchElementException
// // 因 为： 在 调 用 it.next() 方 法 之 前 必 须 要 调 用 it.hasNext()
//        进行检测。若不调用，且下一条记录无效，直接调用 it.next() 会抛出
//        NoSuchElementException 异常。
// System.out.println(iterator.next());
        // 方式二：不推荐
// for(int i = 0; i < coll.size(); i++){
// System.out.println(iterator.next());
// }
// 方式三：推荐
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}