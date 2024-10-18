JUint是Java编程语言的单元测试框架，用于编写和运行可重复的自动化测试。

JUnit 促进了“先测试后编码”TDD的理念，强调建立测试数据的一段代码，可以先测试，然后再应用。这个方法就好比“测试一点，编码一点，测试一点，编码一点……”，增加了程序员的产量和程序的稳定性，可以减少程序员的压力和花费在排错上的时间。

TDD 是Test-Driven Development（测试驱动开发）的缩写。

1. 开源框架
2. 提供注解来识别测试方法
3. 提供断言来测试预期结果。
4. 提高编码速度，并且提高代码的质量
5. 代码优雅简洁，不复杂，减少编码时间
6. JUnit测试可以自动运行并且检查自身结果并提供即时反馈。所以也没有必要人工梳理测试结果的报告。
7. JUnit测试可以被组织为测试套件，包含测试用例，甚至其他的测试套件。
8. JUnit在一个条中显示进度。如果运行良好则是绿色；如果运行失败，则变成红色。

| 注解 | 描述 |
| --- | --- |
| @Test | 测试注解，标记一个方法可以是测试用例 |
| @Before | Before注解表示，该方法必须在类中的每个测试之前执行,以便执行某些必要的先决条件。每个测试方法都会运行一次 |
| @BeforeClass | BeforeClass注解指出这是附着在静态方法必须执行一次并在类的所有测试之前，这种情况一般用于测试计算、共享配制方法(如数据库连接)。每个测试类只运行一次 |
| @After | After注释表示，该方法在每项测试后执行（如执行每一个测试后重置某些变量，删除临时变量等）。每个测试方法都会运行一次 |
| @AfterClass | 当需要执行所有测试在JUnit测试用例类后执行，AlterClass注解可以使用以清理一些资源（如数据库连接），注意：方法必须为静态方法。每个测试类只运行一次 |
| @Ignore | 当想暂时禁用特定的测试执行可以使用这个注解，每个被注解为@Ignore的方法将不再执行 |
| @Runwith | 放在测试类名之前，用来确定这个类怎么运行的。也可以不标注，会使用默认运行器。 |
| @SuiteClasses | 用于套件测试 |
| @Parameters | 用于使用参数化功能。 |


| 断言 | 描述 |
| --- | --- |
| void assertArrayEquals([String message],expectedArray,resultArray) | 断言预期数组和结果数组相等，数组类型可能是int，short，long，byte，char，Object |
| void assertEquals([String message],expected value,actual value) | 断言两个值相等。值类型可能是int，short，long，byte，char，Object，第一个参数是一个可选字符串消息 |
| void assertFalse([String message],boolean condition) | 断言一个条件为假 |
| void assertTrue([String message],boolean condition) | 断言一个条件为真 |
| void assertNotSame([String message],java.lang.Object unexpected,java.lang.Object actual) | 断言两个对象不是引用同一个对象 |
| void assertSame([String message],java.lang.Object expected,java.lang.Object actual) | 断言两个对象引用相同的对象 |
| void assertNull([String message],java.lang.Object object) | 断言一个对象为空（null） |
| void assertNotNull([String message],java.lang.Object object) | 断言一个对象不为空（null） |


例子

```java
import org.junit.Assert;
import org.junit.Test;

public class AssertionTest {

    @Test
    public void test() {
        String obj1 = "junit";
        String obj2 = "junit";
        String obj3 = "test";
        String obj4 = "test";
        String obj5 = null;

        int var1 = 1;
        int var2 = 2;

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        Assert.assertEquals(obj1, obj2);

        Assert.assertSame(obj3, obj4);
        Assert.assertNotSame(obj2, obj4);

        Assert.assertNotNull(obj1);
        Assert.assertNull(obj5);

        Assert.assertTrue(var1 < var2);
        Assert.assertFalse(var1 > var2);

        Assert.assertArrayEquals(array1, array2);

    }
}

1234567891011121314151617181920212223242526272829303132333435
```

运行结果

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1720957235125-2fee1366-0267-4179-ac83-9f321c3a2a60.png)

```java
import org.junit.*;

/**
 * junit的执行过程
 * @author BZR
 *
 */
public class JunitTest1 {

    /**
     * 只执行一次
     */
    @BeforeClass
    public static void beforeClass() {
        System.out.println("in before class");
    }

    /**
     * 只执行一次
     */
    @AfterClass
    public static void afterClass() {
        System.out.println("in after class");
    }

    /**
     * 执行了多少个@Test就执行几次
     */
    @Before
    public void before() {
        System.out.println("in before");
    }

    /**
     * 执行了多少个@Test就执行了几次
     */
    @After
    public void after() {
        System.out.println("in after");
    }

    @Test
    public void testCase1() {
        System.out.println("in test case 1");
    }

    @Test
    public void testCase2() {
        System.out.println("in test case 2");
    }

}

1234567891011121314151617181920212223242526272829303132333435363738394041424344454647484950515253
```

输出结果

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1720957235233-b59b3437-f6cc-4271-a284-9f62f03330fa.png)

1. 一个带有@Ignore注解的测试方法不会被执行
2. 如果一个测试类带有@Ignore注解，则它的测试方法将不会被执行

```java
import org.junit.*;

/**
 * junit的忽略测试
 * @author BZR
 *
 */
public class JunitTest1 {
 @Ignore
    @Test
    public void testCase2() {
        System.out.println("in test case 2");
    }
}
1234567891011121314
```

输出结果

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1720957235296-bce833d0-9a0c-4e85-ae89-fcf5c1b34bf4.png)

```java

import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class JunitTimeTest {
    @Test(timeout = 1000) //毫秒
    public void testCase1() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5); //秒
        System.out.println("in test case 1");
    }
}

12345678910111213
```

输出结果

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1720957235361-8499b5a9-e063-439e-8811-f98e322de7cc.png)

```java
import org.junit.Test;

public class JunitTestException {
    @Test(expected = ArithmeticException.class)
    public void testCase3() {
        int a = 0;
        int b = 1 / a;
    }
}
123456789
```

输出结果

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1720957235421-a7184c06-3d57-4425-9938-331ae94b581d.png)

_**Junit 4 引入了一个新的功能参数化测试。参数化测试允许开发人员使用不同的值反复运行同一个测试。你将遵循 5 个步骤来创建参数化测试：**_

1. 为准备使用参数化测试的测试类指定特殊的运行器 org.junit.runners.Parameterized。
2. 为测试类声明几个变量，分别用于存放期望值和测试所用数据
3. 为测试类声明一个带有参数的公共构造函数，并在其中为第二个环节中声明的几个变量赋值
4. 为测试类声明一个使用注解 org.junit.runners.Parameterized.Parameters 修饰的，返回值为 java.util.Collection 的公共静态方法，并在此方法中初始化所有需要测试的参数对。
5. 编写测试方法，使用定义的变量作为参数进行测试

首先要分清几个概念：测试方法、测试类、测试集、测试运行器。

1.其中测试方法就是用@Test注解的一些函数。

2.测试类是包含一个或多个测试方法的一个**Test.java文件，

3.测试集是一个suite，可能包含多个测试类。

4.测试运行器则决定了用什么方式偏好去运行这些测试集/类/方法。 而@Runwith就是放在测试类名之前，用来确定这个类怎么运行的。也可以不标注，会使用默认运行器。常见的运行器有：

5.@RunWith(Parameterized.class) 参数化运行器，配合@Parameters使用JUnit的参数化功能

6.@RunWith(Suite.class)

7.@SuiteClasses({ATest.class,BTest.class,CTest.class})

8.测试集运行器配合使用测试集功能

9.@RunWith(JUnit4.class)， junit4的默认运行器

10.@RunWith(JUnit38ClassRunner.class)，用于兼容junit3.8的运行器

11.一些其它运行器具备更多功能。例如@RunWith(SpringJUnit4ClassRunner.class)集成了spring的一些功能

```java

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
     * 步骤一: 指定定参数运行器
     */
@RunWith(Parameterized.class) 
public class PrimeNumberCheckerTest {

        /**
         * 步骤二：声明变量
         */
        private Integer inputNumber;
        private Boolean expectedResult;
        private PrimeNumberChecker primeNumberChecker;

        /**
         * 步骤三：为测试类声明一个带有参数的公共构造函数，为变量赋值
         */
        public PrimeNumberCheckerTest(Integer inputNumber,
                                      Boolean expectedResult) {
            this.inputNumber = inputNumber;
            this.expectedResult = expectedResult;
        }

        /**
         * 步骤四：为测试类声明一个使用注解 org.junit.runners.Parameterized.Parameters 修饰的，返回值为
         * java.util.Collection 的公共静态方法，并在此方法中初始化所有需要测试的参数对
         *   1）该方法必须由Parameters注解修饰
         2）该方法必须为public static的
         3）该方法必须返回Collection类型
         4）该方法的名字不做要求
         5）该方法没有参数
         */
        @Parameterized.Parameters
        public static Collection primeNumbers() {
            return Arrays.asList(new Object[][]{
                    {2, true},
                    {6, false},
                    {19, true},
                    {22, false},
                    {23, true}
            });
        }

        @Before
        public void initialize() {
            primeNumberChecker = new PrimeNumberChecker();
        }

        /**
         * 步骤五：编写测试方法，使用自定义变量进行测试
         */
        @Test
        public void testPrimeNumberChecker() {
            System.out.println("Parameterized Number is : " + inputNumber);
            Assert.assertEquals(expectedResult,
                    primeNumberChecker.validate(inputNumber));
        }
    }


123456789101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869
```

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1720957235490-a4b89b0d-1a13-434d-b884-a0054df22a6e.png)

```java
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        /**
         * 这里的配置影响程序运行的顺序
         */
        JunitTest2.class,
        JunitTest3.class
})
public class JunitSuite {
}
12345678910111213
```

```java

import org.junit.Ignore;
import org.junit.Test;

public class JunitTest2 {


    @Ignore
    @Test
    public void printMessage(){
        System.out.println("in JunitTest2");
    }
}
12345678910111213
```

```java
import org.junit.Test;

public class JunitTest3 {

        @Test
        public void printMessage(){
            System.out.println("in JunitTest3");
        }
    }

12345678910
```

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1720957235550-0a2c9596-822b-40ac-a7f2-120ccf0540d4.png)

```xml
<dependency>
    <groupId>junit</groupId>

    <artifactId>junit</artifactId>

    <version>4.12</version>

    <scope>test</scope>

</dependency>

123456
```

