# 第一讲 

- javaSE：java Standard Edition
- javaME：java Micro Edition
- javaEE：java Enterprise Edition

* * *

JDK:java Development Kit（Java开发包）
JRE:java Runtime Environment(java执行环境)
**JDK包含了JRE**

* * *

如何查询Java版本
`java -version`

![在这里插入图片描述](https://img-blog.csdnimg.cn/c10628ac5cd14ff8aeacbe0b8d8dcefd.png)


* * *

实现你的第一个Java程序{Hello World}

- 注：所有的Java代码，其后缀都是以Java结尾

  ```Java
  public class Text{
    public static void main {String[] args}{
         System.out.println("hello world");
    }
  }
  ```

  java程序的执行过程分为两步

1. 编译 `Javac Text.java`
2. 执行 `java Text`
   最后就会出现Hello World了

* * *

**class 文件是字节码文件，程序最终执行的就是这个字节码（bytecode）文件**


# 第二讲 

java中的数据类型分为两类：

1.  原生数据类型 （primitive Data Type）
2.  引用数据类型 ｛对象类型｝（Reference Type）

* * *

###  java中的原生数据类型共有8种

1.  整型：使用int表示。

```java
    public static void mai n (String[] args){
        int a;
        a = 1;
        System.out.println(a);    
    }
}
```

2.  字节型：使用byte表示。（表示-128~127之间的256个整数）

```java
    public static void main(String[] args){
        byte b = 2;
        System.out.println(b);
    }
}
```

3.  短整型：使用short表示。（占比16位）
4.  长整型：使用long表示。（占比64位）
5.  单精度浮点型：使用float表示。所谓浮点型，指的就是小数。也叫作实数。
6.  双精度浮点型：使用double表示。双精度浮点型表示的数据范围要比单精度浮点型要大。
    `即便double类型的值处于float类型的范围内也是不可以的。总之，能否成功赋值取决于等号右边的值的类型与等号左边的值的类型是否一致。`
    **问：如何将double类型转换为float类型的变量？
    答: 强制转换，强制转换的语法是：类型 变量名 = （类型）变量值**

```java
    public static void main (String[] args){
        /*第一种方法*/
        float a =(float) 1.2;//强制转换
        System.out.println(a);

        /*第二种方法*/
        float a =1.2f;//强制转换
        System.out.println(a);
    }
}
```

7.  字符型：使用char表示（char是character的缩写）。所谓的字符，就是单个的字符表示，比如字母a,或中文张，外面用单引号包围上，比如char a = 'b'; char b = '张'；

```java
    public static void main(String[] args){
        char a = 'b';
        System.out.println(a);
    }
}
```

8.  布尔类型，使用boolean表示。布尔类型只有两种可能值，分别是true或者是flase。

```java
    public static void main (String[] args){
        boolean  a = flase;
        System.out,println(a);
    }
}
```

`可以将表示范围小的值赋给表示范围大的变量，但直接不能将表示范围大的值赋给表示范围小的变量，只能通过强制类型转换实现。`
​	



# 第三讲 

1. java中所有浮点类型默认情况下都是double。不能将double类型的值赋给float类型的变量，即便该double类型的值处于float类型的范围内也是不可以的。总之，能否成功赋值取决于等号右边的值的类型与等号左边的变量类型是否一致
2. **如何将double类型的值赋给float类型的变量？**
   强制类型转换，将double类型的值强制转换为float类型
   **强制转换的语法：类型 变量名 = （类型） 变量值**
3. 变量在使用前必须要赋值；变量必须要声明其类型方可使用；变量在使用前必须要定义，并且只能定义一次。



# 第四讲 

1.  当有若干个变量参与运算时，结果类型取决于这些变量中表示范围最大的那个变量类型。

比如：参与运算的变量中，有整型 int ， 有双精度浮点型double，有短整型short，那么最后的结果类型就是double。

```
public class test{
    public static void main (String[] args){
        int a = 1;
        int b = 2;
        
        int c = a + b;//3
        int d = a - b;//-1
        int e = a/b;//0
        int f = a*b;//2
        System.out.println(c); 
        System.out.println(d); 
        System.out.println(e); 
        System.out.println(f); 
    }
}
```

```public
    public static void main (String[] args){
        double a = 1;//出现double都让路
        int b = 2;

        double c = a + b;
        double d = a - b;
        double e = a/b;
        double f = a*b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
```

下面的代码中，a 和 b 都是整型，但是通过（double）a这种转换将a转换为一个匿名的变量，该变量的类型是double，但是要注意：a本身依旧是int类型，而不是double类型，这样。(double)a/b就是double类型除以int类型，结果自然是double类型。

```public
    public ststic void main (String[] args){
        int a = 1;
        int b = 2;
        double e = (double) a/b;
        System.out.println(e);
    }
}
```

取模运算符：使用%表示。【取模的规律：取模的结果符号永远与被除数的符号相同】

```java
public class text{
   public static void main (String[] args){
       int a = 5;
       int b = 3;
       int c = a % b;
       System.out.println (c);
   }
}
```



# 第五讲 

1.  关系运算符：大于（>），小于（&lt;），等于（==）， 不等于（!=），大于等于（&gt;=）,小于等于（<=），关系运算的结果是个boolean值。

```java
public class text{
    public static void main (String[] args){
        int a = 3 ;
        int b = 2 ;

        boolean c = ( a>b );
        System.out.println(c);
    }
}
/*结果显示（true）*/
```

2.逻辑运算符：重点讲解两个，逻辑运算符本身也返回一个boolean值。

1）逻辑与：使用&&表示，逻辑与是个双目运算符（即有两个操作数的运算符），只有当两个操作数都为真的时候，结果才为真；其余均为假。（逻辑与表示的并且的意思）

```java
public static void main (String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        
        boolean e = (a < b) && (c < d);
        System.out.println(e);
    }
}
/*结果显示：true*/
```

2）逻辑或：使用||表示，逻辑或也是个双目运算符，只有当两个操作数都为假的时候，结果才为假；其余情况都为真。（逻辑或表示或者的意思）

```java
public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        boolean e = (a<b)||(c<d);
        System.out.println(e);
    }
}
/*结果显示：true*/
```

3）关于逻辑运算符的短路特性。

1.  逻辑与：如果第一个操作数为flase，那么结果肯定就是flase，所以在这种情况下，，将不会执行后面的运算了，即发现了短路现象。

2.  逻辑或：如果第一个操作数为true，那么结果肯定就是true，所在在这种情况下，将不会执行逻辑或后面的运算了，即发生了短路现象

```java
public static void main (String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int f = 5;
        boolean e = (a > b)||((f = c) < d);
        System.out.println(e); 
        System.out.println(f);
   }
}
/* 结果是：true
          5
*/
```

4）关于变量的自增与自减运算
1.关于 int b = a++,作用是将a的值先赋给b，然后再让a自增1。
2.关于 int b = ++a,作用是将a的值先自增1，然后将自增后的结果赋给b。

```java
public class test {
    public static void main (String [] args){
        int a = 3;
        //a += 1;//等价于 a = a + 1;
        a++;
        
        System.out.println(a);
    }
}
/*结果是：4*/
```

```public
    public static void main (String [] args){
        int a = 3;
        //a += 1;//等价于 a = a + 1;
        ++a;
        
        System.out.println(a);
    }
}
/*结果是：4
```

```public
    public static void main (String [] args){
        int a = 3;
        //a += 1;//等价于 a = a + 1;
        a--;
        
        System.out.println(a);
    }
}
/*结果是：2*/
```

```public
    public static void main (String [] args){
        int a = 3;
        //a += 1;//等价于 a = a + 1;
        --a;
        
        System.out.println(a);
    }
}
/*结果是：2*/
```


# 第七讲

1.  java中的循环控制语句一共有三种，分别是while，do...while以及for循环。
    1）while循环，形式为：

```Java
while (布尔表达式){
    //待执行的代码
}
```

```Java
    public static void main (String[] args){
        int a = 1;//循环变量
        int sum = 0;//存储相加后的变量
        
        while(a <= 100){
            sum += a;
            a++;76
    }
}
/*结果是：5050*/
```

​                 2）do......while循环，形式为：

```Java
do{
    //待执行的代码
}while(布尔表达式);
```

```Java
    public static void main (String[] args){
        int a = 1;
        int sum = 0;

        do{
            sum += a;
            a++;
        }while(a<=100);
        System.out.println(sum);
    }
}
/*结果是：5050*/
```

while与do......while之间的区别：如果布尔表达式的第一次判断就为false，那么while循环一次也不执行；do.......while循环则会执行一次。如果布尔表达式第一次判断为true，那么while循环与do.......while循环等价。
3）for循环（使用最多的一种循环），形式为：

```Java
for(变量初始化；条件判断；步进){
   //待执行的代码
}
```

for循环的执行过程： 
1）执行变量初始化。
2）执行条件判断。如果条件判断结果为假，那么退出for循环，开始执行循环后面的代码；如果条件判断为真，执行for循环里面的代码。
3）执行步进。
4）重复步骤2。

```java
public class test{
    public static void main (String[] args){
        int sum = 0;//存储相加后的结果
        for(int i = 1; i <= 100;i++){
            sum += i;
        }
        System.out.println(sum);
    } 
}
```

# 第八讲

### 理想面对程序对象

1.  break语句：经常用在循环语句中，用于跳出整个循环，执行循环后面的代码。

```
public class test{
    public static void main (String[] args){
        for(int i = 0;i < 10 ; i++){
            if(5 == i){
                break;
            }
            System.out.println(i);
        }
    }
}
/*结果是：
0
1
2
3
4
*/
```

2.continue语句：经常用在循环语句中，用于跳出当前的这个循环（或者是跳出本次循环），开始下一次循环的执行。

```
public class test{
    public static void main (String[] args){
        for(int i = 0;i < 10 ; i++){
            if(5 == i){
                continue;
            }
            System.out.println(i);
        }
    }
}
/*结果是：
0
1
2
3
4
6
7
8
9
*/
```

3.break与continue可以搭配标签使用，在实际开发中，根本没有人会将break与continue搭配标签来使用。

```
public class test{
    public static void main (St  ring[] args){
        for(int i = 0;i < 3; i++){
            if(1 == i){
                break;
            }
            for (int j = 0 ; j <= i; ++j){
                if(1 == j){
                    continue;
                }
                System.out.println("j="+j);
            }
            System.out.println("i="+i);
        }
    }
}
/*结果是：
j=0
i=0
*/

```

4.面向对象程序设计（object oriented programming;oop）
1)什么是面向对象？
在面向对象程序设计中有两个重要的概念：类（class）与对象（object）。
2）类
类是一种抽象概念，类包含了数据（通常使用名词来表示）与对数据的操纵（通常使用动词来表示）。比如说人就是一种抽象的概念，人具有姓名、年龄、身高等数据，还有吃饭、跑步等操纵数据的动作。
**类包含两个内容**

```
a）数据，数据在类中称作属性（Property或者attribute）或者叫成员变量（Member variable）
b)对数据的操纵，这种操纵再类中称作方法（method）
```

3）对象
对象是一种具体的概念，是类的一种具体的表现形式。比如说人是一种类，而张三、李四、王五等具体的人就是对象。


# 第九讲

1. 面向对象程序设计的三大基本特征：继承（inheritence）、封装（Encapsulation）、多态（Polymporphism）。

2. 封装：类包含了数据与方法，将数据与方法放在一个类中就构成了封装。

3. 如何定义类？

   ```java
   修饰符  class 类的名字{
          //类的内容(包含了属性与方法)
      }
   ```

4. 方法：如何定义方法？

   ```
   修饰符 返回类型  方法名称([参数一，参数二，参数三]){
      //方法体
   }
   ```

5. Main方法是整个JAVA程序的入口点，如果类的定义中没有main方法则程序无法执行。

   ```
   class Text{
       //两个整数相加
       public int  add(int a,int b){
           return a + b;
       }
       //两个整数相-
       public int  subtract(int a,int b){
           return a - b;
       }
       //两个整数相乘
       public int  multiply(int a,int b){
           return a * b;
       }
       //两个整数相除
       public int  divide(int a,int b){
           return a / b;
       }
   }
   ```

   

6. 方法定义不能嵌套，也就是说不能在一个方法中定义另外一个方法，方法只能定义在类中。

7. 关于方法的执行，首先需要定义方法，接下来就可以使用方法（调用方法），当方法调用完毕后，方法可以返回值，方法到底是否返回值是由方法的定义决定的。

8. 如何生成对象？通过类来生成对象（通常使用new关键字来生成对象）。

```
public class Person{
    
}
类名    变量名    = new 类名；
Person persion1 = new persion();
new之后才是对象
```

9. 方法调用需要通过对象来完成。方法调用的形式：

   对象变量.方法名([参数值一，参数值二，参数值三……])

   ```Java
   class Text{
       //两个整数相加
       public int  add(int a,int b){
           return a + b;
       }
       //两个整数相-
       public int  subtract(int a,int b){
           return a - b;
       }
       //两个整数相乘
       public int  multiply(int a,int b){
           return a * b;
       }
       //两个整数相除
       public int  divide(int a,int b){
           return a / b;
       }
       
       public static void main (String[] args){
           Text text = new Text();
           int x = 6;
           int y = 1;
           int a = text.add(x,y);
           System.out.println(a);
       }
   } 
   ```

10. 关于方法的注意事项:

    1) 在方法定义中，方法的返回类型与return后面的变量或常量类型保持一致。
    2) 在方法调用时，给方法传递的参数需要与方法定义时的参数保持一致（参数个数保持一致，参数类型保持一致）。
    3) 方法定义时的返回类型与接收方法返回值的变量类型保持一致。

11. ```
    public int add (int a,int b){
        return a + b;
    }
    方法定义时的参数叫做形式参数。
    int a = text.add(1,1);
    方法调用时所赋予的具体值叫做实际参数。
    ```

12. 关键字void 表示方法不返回值

    ```java
    class Text{
        //使用void。关键字表示方法不返回值
        public void  output(){
            System.out.println("Hello world");
        }
        public static void main (String[] args){
            Text text = new Text();
            text.output();
        }
    }
    ```

13. 如果方法不返回值，那么声明方法的时候使用void关键字。在方法定义中，可以有两种情况实现不返回值：

    a) 不使用return语句。

    b）使用return。但return后面没有任何值或者变量，return后面只有一个分号，表示退出方法，返回到方法调用端。`return；`

    

# 第十讲

1. 类中的属性又叫做成员变量（member variable），属性用英文表示为property或者attribute。

2. 对象（Object）又叫做实例。生成一个对象的过程又叫做实例化。

3. 命名约定

   a) 类：首字母大写，如果一个类名有多个单词构成，那么每个单词的首字母都大写，          中间不使用任何的连接符。比如：Person类，MemberTest类。

   b)方法：首字母小写。如果一个方法由多个单词构成，那么第一个单词的所有字母全都小写，从第二个单词开始，每个单词的首字母大写。比如add，addThreeInt。

   c）属性：命名约定与方法相同。比如age，ageOfPerson。

4. 属性需要定义在类中，又叫做成员变量；而定义在方法中的变量叫做局部变量。

5. 如何定义属性？

   ```java
   public class Persion{
       修饰符  类型  属性名称；
   }
   ```

6. 如何使用属性？与方法一样，使用“.”运算符。首先需要生成类的实例，然后使用实例+“.”到方式来使用属性。

   ```哦
   Person person = new person();
   person.age
   ```

   ```java
   public class Persion{
       int age = 20 ;
       public static void main (String[] args){
           Persion persion = new Persion();
           System.out.println(Persion.age);
       }
   }
   ```

![在这里插入图片描述](https://img-blog.csdnimg.cn/f99f8da024634c98b922a44330156b6b.png)

7. 局部变量使用前必须要声明并赋初值；中原变量使用前必须要声明，但可以不赋初值。

8. 成员变量与局部变量的联系与区别：

   a）没有，无论是成员变量还是局部变量，使用前都需要声明嗯或定义。

   b）对于局部变量来说，使用前必须要初始化；对于成员变量来说，使用前可以不初始化。如果没有初始 化成员变量就开始使用，那么每个类型的成员变量都有一个默认的初始值。

   ​    i. byte、short、int、long类型的初始值为0

   ​    ii. float、double类型的初始值为0.0

   ​    iii. char类型的初始值为“\u0000”

   ​    iiii. boolean类型的初始值为false

9. 引用类型（reference type），引用类型是用在对象上的。一个对象可以被多个引用所指向，但同一时刻，每个引用只能指向唯一的一个对象。如果一个对象被多个引用所指向，那么无论哪个引用对对象的属性进行了修改，都会反应到其他的引用当中。

   ```java
   class One {
       int age = 20;
       public void change(One one){
           one.age = 30;
       }
       public static void main (String[] args){
           One one = new One();
           int age = one.age;
           System.out.println(age);
           one.change(one);
           int age2 = one.age;
           System.out.println(age2);
       }
   }
   ```

   ![](https://img-blog.csdnimg.cn/6de5aed6e0fb43fb9386f0753924349d.png)


# 第十一讲

1. 如果一个类包含了属性与方法，那么该类的每个对象都具有自己的属性，但无论一个类有多少对象，这些对象共享同一个方法。

2. 关于方法参数传递的总结：对于JAVA中的方法参数传递，无论传递的是原生数据类型还是引用类型，统一是传值。

   ```Java
   public class ParamText{
       public static void main (String[] args){
           Person person = new Person();
           person.change(person);
           int age = persion.age;
           System.out.println(age);
           System.out.println("-------");
           int i = 10;
           person.change1(i);
           System.out.println(i);
       }
   }
   class Person{
       int age = 20 ;
       public void change(Person person){
           person.age = 30 ;
       }
       public void change1(int age){
           age = 40;
       }
   }
   ```

   3. 什么类型的引用就能指下什么类型的对象，比如People类型的引用就能指向People类型的对象，但不能指向student类型的对象。比如:

      People people = new People();//正确

      People people = new Student();//错误

3. 构造方法（Constructor）：构造方法用于完成对象属性的初始化工作。构造方法的特点：

   1. 构造方法的名字必须与类名完全一致（包括大小写）。
   2. 构造方法没有返回值，连void也不能出现。
   3. 如果在定义一个类的时候，没有喂类声明构造方法。那么JAVA编译器会自动为类添加一个没有参数且方法体为空的构造方法（默认的构造方法）。
   4. 如果在定义一个类的时候为类声明了构造方法，那么JAVA编译器就不会再被类添加构造方法了。
   5. 不能显示调用类的构造方法，构造方法通常是通过new关键字隐式调用。

4. New关键字在生成对象时完成了三件事情：

   1. 为对象开辟内存空间
   2. 调用类的构造方法
   3. 将生成的对象地址返回（返回给引用）

5. 默认的构造方法：构造方法没有参数，且方法体为空。

6. 使用new来生成对象的时候，后面的小括号（）表示构造方法的参数列表，如果构造方法不接受参数，那么小括号中的内容为空；如果构造方法接收参数，那么小括号中的实际参数就要与构造方法定义中的形式参数保持一致（参数的数量一致、参数的类型一致、按照顺序逐一的赋值）。



# 第十二讲

1. 注释：注释是给人看的，不是给计算机看的。JAVA中共有三种类型的注释：

   1. 单行注释：以//开头，//后面的所有内容均被当作注释做注释处理。
   2. 多行注释：以/*开头，以*/结束，中间的所有内容均被当做注释处理，多行注释来源于c/c++。关于多行注释，需要注意的是，多行注释不能嵌套。
   3. 另一种多行注释用于产生JAVA doc帮助文档。

2. 强制类型转换

   float f = 1.2f;

   float f = (float)1.2;

   ```java
   public class FlaotText{
       public static void main(String[] args){
           flaot f = 1.2f;
           System.out.println(f);
       }
   }
   ```


3. 轻量级文本编译器：vi,vim,gvim,UItraEdit,Editplus

3. 类是一种抽象的概念，对象是类的一种具体表示形式，是具体的概念。先有类，然后由类来生成对象，对象又叫做实例。

3. 类有两大部分构成：属性以及方法，属性一般用名词来表示，方法一般用动词来表示。  

3. 如果有一个JAVA源文件中定义了多个类，那么这些类最多只能有一个类是pub换句话说定义的多个类可以都不是public的。

3. 在JAVA中进行方法的参数传递时，无论传递的是原生数据类型还是引用类型，参数传递方式统一是传值，JAVA中没有传引用的概念。

   

   

   **第十二讲到第十六讲都为复习！！！**

   
# 第十七讲

1. 方法重载（Overload）：表示两个或多个方法名字相同，但方法参数不同。方法参数不同有两层含义：1. 参数个数不同。2. 参数类型不同。注意：方法的返回值对重载没有任何影响。

   ```java
   public class Teat{
       public int add (int a,int b){
           return a + b;
       }
       
       public int add (int a,int b,int c){
           return a + b + c;
       }
       
       public static void main (String[] args){
           Teat test = new Teat();
           int result = test.add(1+2);
           int result2 = test.add(1+2+3);
           System.out.println(result);
           System.out.println(result2);
       }
   }
   ```

2. 构造方法重载：只需要看参数即可。如果想在一个构造方法中调用另外一个构造方法，那么可以使用this()的方式调用，this()括号中的参数表示目标构造方法的参数。this()必须要作为构造方法的第一条语句，换句话说，this()之前不能有任何可执行的代码。

   ```java
   public class One{
       public One(){
           Systerm.out.println("test");
       }
       public One(int i){
           System.out.println(++i);
       }
       public static void mian (String[] args){
           One co = new One();
       }
   }
   ```

3. 继承（inheritance）：Java是单继承的，意味着一个类只能从另一个类继承（被继承的类叫做父类【基类，base class】,继承的类叫做子类），Java中的继承使用extends关键字。

   ```java
   public class Child extents Parent{
       public Child(){
           System.out.println("child");
       }
       public static void main (String[] args){
           Child child = new Child();
       } 
   }
   
   class Parent{
       public Parent(){
           System.out.println("parent");
       }
   }
   ```

4. 当生成子类对象时，JAVA默认首先调用父类的不带参数的构造方法。然后执行该构造方法生成父类的对象，接下来再去调用子类的构造方法，生成子类的对象。【要想生成子类的对象，首先需要生成父类的对象，没有父类对象就没有子类对象，比如说没有父亲就没有孩子。】

```java
public class Child extents Parent{
    public Child(){
        super(1);//调用父类特定的构造方法
        System.out.println("child");
    }
    public static void main (String[] args){
        Child child = new Child();
    } 
}

class Parent{
    public Parent(int i){
        System.out.println("parent");
    }
}
```

5. super关键字：super表示对父类对象的引用。
6. 如果子类使用super（）显示调用父类的某个构造方法，那么在执行的时候就会寻找与super（）所对应的构造方法而不会再去寻找父类的不带参数的构造方法。与this一样，super也必须要作为构造方法的第一条执行语句。前面不能有其他可执行的语句。
7. 关于继承有以下几点：
   1. 父类有的，子类也有。
   2. 父类没有的，子类可以增加。
   3. 父类有的，子类可以改变。

8. 关于继承的注意事项
   1. 构造方法不能被继承。
   2. 方法和属性可以被继承。
   3. 子类的构造方法隐式的调用父类的不带参数的构造方法。
   4. 当弗雷没有不带参数的构造方法时，子类需要使用super来显示的调用父类的构造方法，super指的是对父类的引用。
   5. super关键字必须是构造方法中的第一行语句。


# 第十八讲

1. 方法重写（Override）又叫做覆写：子类与父类的方法返回类型一样，方法名称一样，参数一样，这样我们说此类与父类的方法构成了重写关系。

   ```java
   package lianxi;
   
   public class Test2 {
       public static void main(String[] args){
           Dog dog = new Dog();
           dog.run();
       }
   }
   class Animal {
       public void run(){
           System.out.println("animal is runing");
       }
   }
   class Dog extends Animal{
   }
   ```

![在这里插入图片描述](https://img-blog.csdnimg.cn/48472b555652412bbbbd36e86bd5a0fe.png)

```java
package lianxi;
public class Test2 {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.run();
    }
}
class Animal {
    public void run(){
        System.out.println("animal is runing");
    }
}
class Dog extends Animal{
    public void run(){
        System.out.println("dog is running");
    }
}

```
![在这里插入图片描述](https://img-blog.csdnimg.cn/ade43cfc6ddb482ab47aca40ac7f747f.png)


2.  方法重写与方法重载之间的关系：重载发生在同一个类内部的两个或多个方法。重写发生在父类与子类之间。

```java
package lianxi;
public class Test2 {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.run(1);
    }
}
class Animal {
    public void run(){
        System.out.println("animal is runing");
    }
}
class Dog extends Animal{
    public void run(int i){
        super.run();//调用父类的代码
        System.out.println("dog is running");
    }
}

```
![在这里插入图片描述](https://img-blog.csdnimg.cn/6fc9904be4ea40829316899f64688499.png)
3. 当两个方法形成重写关系时，可以在子类方法中通过super.run()形式调用父类的run()方法，其中super.run（）形式调用父类的run（）方法，其中super.run()不必放在第一行语句，因此此时父类对象已经构造完毕，先调用父类的run()方法是根据程序的逻辑决定的。

```java
package lianxi;
public class Test2 {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.run(1);
    }
}
class Animal {
    public void run(){
        System.out.println("animal is runing");
    }
}
class Dog extends Animal{
    public void run(int i){
        System.out.println("dog is running");
        super.run();//调用父类的代码
    }
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/5203bfd3dbdd4959a01816b6fd69072d.png)
4. 在定义一个类的时候，如果没有显试指定该类的父类，那么该类就会继承于java.lang.Object类（JDK提供的一个类，Object类是JAVA中所有类的直接或间接的父类）。

```java
package lianxi;
public class Test2 {
    public static void main(String[] args){
        Son son = new Son();
    }
}
class Grandpa{
    public Grandpa(){
        System.out.println("Grandpa");
    }
}
class Father extends Grandpa{
    public Father(){
        System.out.println("father");
    }
}
class Son extends  Father{
    public Son(){
        System.out.println("son");
    }
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/f3073361212a4b0c84e663a6dc316aa6.png)
5. 多态（Polymorphism）:我们说子类就是父类（玫瑰花是花，男人是人），因此多态的意思就是：父类型的引用可以指向子类对象。

```java
package lianxi;
public class Test2 {
    public static void main(String[] args){
        Flower rose = new Rose();//多态
        rose.sing();
    }
}
class Flower{
    public void sing(){
        System.out.println("it is singing");
    }
}
class Rose extends Flower{

}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/13ce001eb1a048778524cdd74d2a50d1.png)


# 第十九讲

1. 多态：父类型的引用可以指向子类型的对象。

   ```java
   package lianxi;
   public class Test2 {
       public static void main(String[] args){
           Parent child = new Child();
           child.sing();
       }
   }
   class Parent{
       public void sing(){
           System.out.println("parent is singing");
       }
   }
   class Child extends Parent{
       public void sing(){
           System.out.println("child is singing");
       }
   }
   ```
![在这里插入图片描述](https://img-blog.csdnimg.cn/ea390805b3914752a8f0c5e8e1b266b2.png)
2. Parent child = new Child();当使用多态方式调用方法时，首先检查父类是否有sing()方法，如果没有编译错误；如果有，再去调用子类的sing()方法。

```java
package lianxi;
public class Test2 {
    public static void main(String[] args){
        Animal a = new Dog();
        Dog dog =  (Dog)a;
        dog.sing();
    }
}
class Animal {
    public void sing (){
        System.out.println("animal is singing");
    }
}
class Dog extends Animal {
    public void sing(){
        System.out.println("Dog is singing");
    }
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/dc29d9973589418dbef8516925152aff.png)



# 第二十讲

1. ```java
   package lianxi;
   public class Test2 {
       public static void main(String[] args){
           Animal animal = new Dog();
           Animal animal2 = new Animal();
           animal2 = animal;
           animal2.sing();
       }
   }
   class Animal {
       public void sing (){
           System.out.println("animal is singing");
       }
   }
   class Dog extends Animal {
       public void sing(){
           System.out.println("Dog is singing");
       }
   }
   ```

 ![在这里插入图片描述](https://img-blog.csdnimg.cn/0fb6cd4fd2fc4a0b9459220f4f4276f4.png)


2. 一共有两种类型的强制类型转换：

   1. 向上的类型转换（upcast）：比如说将dog类型转换为Animal类型，即将子类型转换为父类型。对于向上类型转换，不需要显示指定。

      ```java
      package lianxi;
      public class Test2 {
          public static void main(String[] args){
              //向上类型转换
              Dog dog = new Dog();
              Animal animal = dog;
              animal.sing();
          }
      }
      class Animal {
          public void sing (){
              System.out.println("animal is singing");
          }
      }
      class Dog extends Animal {
          public void sing(){
              System.out.println("Dog is singing");
          }
      }
      ```

![在这里插入图片描述](https://img-blog.csdnimg.cn/8c278acf187e455d8397d53bd0f393c7.png)


   2. 向下的类型转换（downcast）：比如将Animal类型转换为dog类型。即将父类型转换为子类型。对于向下类型转换，必须要显示指定（必须要使用强制类型转换）。

       

      ```java
      package lianxi;
      public class Test2 {
          public static void main(String[] args){
              //向下类型转换
              Animal a = new Dog();
              Dog dog = (Dog)a;
              dog.sing();
          }
      }
      class Animal {
          public void sing (){
              System.out.println("animal is singing");
          }
      }
      class Dog extends Animal {
          public void sing(){
              System.out.println("Dog is singing");
          }
      }
      ```

      ![在这里插入图片描述](https://img-blog.csdnimg.cn/37db331c533c4924b73f8c2295b17278.png)



# 第二十一讲
1. 抽象类（abstract class ）:使用abstract关键字所修饰的累叫做抽象类。抽象类无法实例化，也就是说，不能new出来一个抽象类的对象（实例）。
**错误演示**

```
package exercise;

public class exercise001 {
    public static void main (String[] args){
        T t = new T();
    }
}
//使用abstract关键字所修饰的累叫做抽象类。
abstract class T{

}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/e1e98c9f9e984305a539663aaa6a8305.png)
2. 抽象方法（abstract method）:使用abstract关键字所修饰的方法叫做抽象方法。***抽象方法需要定义在抽象类中。*** 相对于抽象方法，之前所定义的方法叫做具体方法（有声明，有实现）

```java
package exercise;

public class exercise001 {
    public static void main (String[] args){
        
    }
}
//使用abstract关键字所修饰的累叫做抽象类。
abstract class T{
    public abstract void method();
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/b6e6516ab05e46758084517582c06968.png)
3. 如果有一个类包含了抽象方法，那么这个类一定是个抽象类。
4. 如果某个类是抽象类，那么该类可以包含具体方法（有声明，有实现）。

```java
package exercise;

public class exercise001 {
    public static void main (String[] args){
    }
}
//使用abstract关键字所修饰的累叫做抽象类。
abstract class T{
    public abstract void method();
    public void test(){
        System.out.println("test");
    }
}
```

![在这里插入图片描述](https://img-blog.csdnimg.cn/2912ab85e50e4b0695b8c37d180bbdf7.png)
5. 如果一个类中包含了抽象方法，那么这个类一定要声明成abstract class ，也就是说，该类一定是抽象类；反之，如果某个类是抽象类，那么该类既可以包含抽象方法，也可以包含具体方法。
6. 无论何种情况，只要一个类是抽象类，那么这个类就无法实例化。
7. 在子类继承父类（父类是一个抽象类）的情况下，那么该子类必须要实现父类中所定义的所有抽象方法；否则，该子类需要声明一个**abstract class** 。
***错误示范***

```java
package exercise;

public class exercise001 {
    public static void main (String[] args){
        R r = new R();
    }
}
//使用abstract关键字所修饰的累叫做抽象类。
abstract class T{
    public abstract void method();
    public void test(){
        System.out.println("test");
    }
}
class R extends T{

}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/9a7a59f2bce1448fb79466b5a4540fa6.png)
***正确示范***

```java
package exercise;
public class exercise001 {
    public static void main (String[] args){
        R r = new R();
    }
}
//使用abstract关键字所修饰的累叫做抽象类。
abstract class T{
    public abstract void method();
    public void test(){
        System.out.println("test");
    }
}
class R extends T{
    public void method(){
        System.out.println("test");
    }
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/04f5c12bd20a4659a129724bf93494e0.png)

```java
package exercise;
public class exercise001 {
    public static void main (String[] args){
        //R r = new R();
    }
}
//使用abstract关键字所修饰的累叫做抽象类。
abstract class T{
    public abstract void method();
    public void test(){
        System.out.println("test");
    }
}
abstract class R extends T{
    
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/feec50b62db647388b2bd75e420a4c9a.png)

```java
package exercise;

public class exercise002 {
    public static void main(String[] args){
        Shape shape = new Triange(10,6);
        int area = shape.computeArea();
        System.out.println(area);
        shape = new Rectangle(10,10);
        int areas = shape.computeArea();
        System.out.println(areas);
    }
}
abstract class Shape{
    public abstract int computeArea();//计算形状面积
}
class Triange extends Shape{
    int width;
    int heights;
    public Triange(int width,int heights){
        this.width = width;//自己获取自己
        this.heights= heights;
    }
    public int computeArea(){
        return width * heights /2;
    }
}
class Rectangle extends Shape{
    int width;
    int heights;
    public Rectangle(int width,int heights){
        this.heights = heights;
        this.width = width;
    }
    public int computeArea(){
        return width * heights;
    }
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/daa6fcf041984001a3528bfe630245c2.png)


# 第二十二讲
1. 接口（interface）：接口的地位等同于class, **接口中所有方法都是抽象方法。** 在声明接口中的方法时，可以使用abstract关键字，也可以不使用。通常情况下，都会省略掉abstract关键字。（有声明，无实现）
```java
package exercise;

public interface exercise003 {
    public void output();//抽象方法
    public static void main(String[] args){
    }
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/a745fd10a18146ed9dcbffe93575d648.png)
2. 可以将接口看作是特殊的抽象类（抽象类中可以有具体方法，也可以有抽象方法，而接口中只能有抽象方法，不能有具体方法）。
3. 类可以实现接口，实现使用关键字implements表示，代表了某个类实现了某个接口。

```java
package exercise;
public class exercise003 {
    public static void main (String[] args){
        Myclass myclass = new Myclass();
        myclass.output();
    }
}
interface MyInterface{
    public void output();
}
class Myclass implements MyInterface{
     public void output(){
         System.out.println("output");
     }
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/5ae00973d1e242e58f239c55e63eae76.png)
4. 一个类实现了某个接口，那么该类必须要实现接口声明的所有方法。如果该类是个抽象类，那么就无需实现接口中的方法了。
5. Java是单继承的，也就是说某个类只能有唯一一个父类；一个类可以实现多个接口，多个接口之间使用逗号分隔。

```java
package exercise;

public class exercise003 {
    public static void main (String[] args){
        Myclass myclass = new Myclass();
        myclass.output();
        myclass.output2();
    }
}
interface MyInterface{
    public void output();
}
interface MyInterface2{
    public void output2();
}
class Myclass implements MyInterface,MyInterface2{
     public void output(){
         System.out.println("output");
     }

    @Override
    public void output2() {
        System.out.println("output2");
    }
}

```
![在这里插入图片描述](https://img-blog.csdnimg.cn/9b46109ee97745afad55f63b88ca0d14.png)

```java
package exercise;

public class exercise003 {
    public static void main (String[] args){
        Myclass myclass = new Myclass();
        myclass.output();
        myclass.output2();
        myclass.output3();
    }
}
interface MyInterface{
    public void output();
}
interface MyInterface2{
    public void output2();
}
class Myparent{
    public void output3(){
        System.out.println("output3");
    }
}
class Myclass extends Myparent implements MyInterface,MyInterface2{
     public void output(){
         System.out.println("output");
     }

    @Override
    public void output2() {
        System.out.println("output2");
    }
}

```
![在这里插入图片描述](https://img-blog.csdnimg.cn/82e5aa6ef5cd48a39857254ab1b81e12.png)
6. 多态：所谓多态，就是父类型的引用可以指向子类型的对象，或者接口类型的引用可以指向实现该接口的类的实例。关于接口与实现接口的类之间的强制类型转换方式与父类和子类之间的强制类型转换方式完全一样。

```java
package exercise;

public class exercise004 {
    public static void mian (String[] args){
        AA bb = new BB();//多态
        bb.output();
    }
}
interface  AA{
    public void output();
}
class BB implements AA{
    public void output(){
        System.out.println("BB");
    }
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/52d8864ff5f24acd86a249039287fdaa.png)
7. Static 关键字：可以用于修饰属性，也可以用于修饰方法，还可以用于修饰类。
8. static 修饰属性：无论一个类生成了多少个对象，所有这些对象共同使用唯一一份静态成员变量；一个对象对该静态成员变量进行了修改，其他对象的该静态成员变量的值也随之发生变化。如果一个成员变量是static的，那么我们可以通过 **类名.成员变量名** 的方式来使用它（Java推荐我们使用这种方法）。

```java
package exercise;

public class exercise005 {
    public static void main (String[] args){
        MyStatic myStatic = new MyStatic();
        MyStatic myStatic1 = new MyStatic();
        myStatic.a = 10;
        System.out.println(myStatic1.a);
    }
}
class MyStatic{
    static int a;
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/bff486c301324e9c896b5bcbf59d7797.png)

```java
package exercise;
public class exercise005 {
    public static void main (String[] args){
        MyStatic myStatic = new MyStatic();
        myStatic.a = 10;
        System.out.println(myStatic.a);
    }
}
class MyStatic{
    static int a;
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/dace9f15135240cf9d14da0b18c21d7f.png)


# 第二十三讲
1. static 修饰方法：static 修饰的方法叫做静态方法。对于静态方法来说，可以使用类名.方法名的方式来访问。
***正常***

```java
package exercise;
public class exercise006 {
    public static void main (String[] args){
        MyStatic2 test =new MyStatic2();
        test.out();
    }
}
class MyStatic2{
    public void out(){
        System.out.println("out");
    }
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/d4835af426a94b40a8790e8443ef656e.png)
***修正后的***

```java
package exercise;
public class exercise006 {
    public static void main (String[] args){
        MyStatic2.out();
    }
}
class MyStatic2{
    public static void out(){
        System.out.println("out");
    }
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/fcb3a8c6ac764c9594872c013fadd787.png)
***对比***

```java
package exercise;
public class exercise007 {
    public static void main (String[] args){
        N n = new N();
        n.output();
    }
}
class M{
    public static void output(){
        System.out.println("m");
    }
}
class N extends M{
    public static void output(){
        System.out.println("N");
    }
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/f5e4336ea33f40c684ac72c035b582e9.png)

```java
package exercise;
public class exercise007 {
    public static void main (String[] args){
        M m = new N();
        m.output();
    }
}
class M{
    public static void output(){
        System.out.println("m");
    }
}
class N extends M{
    public static void output(){
        System.out.println("N");
    }
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/5c606d55e9bb4fa698f8a1840c075024.png)
 **2. 静态方法只能继承，不能重写（Override）。**  
 3. final关键字：final可以修饰属性、方法、类。
 4. final修饰类：当一个类被final所修饰时，表示该类是一个终态类，即不能被继承。
```java
package exercise;
public class exercise008 {
    public static void main(String[] args){
        F f = new F();
    }
}
final class E{//表示该类不能被继承
}
class F extends E{
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/cf88ad0e2cb34e69aaa059fc4dce33ce.png)
5. final修饰方法：当一个方法被final所修饰时，表示该方法是一个终态方法，即不能被重写（Override） 。
***错误示例***
```java
package exercise;
public class exercise008 {
    public static void main(String[] args){
        H h =new H();
        h.out();
    }
}
class G{
    public final void out(){
        System.out.println("G");
    }
}
class H extends G{ 
    public void out(){
        System.out.println("H");
    }
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/6b38e1c07f5e4aee8c99f726be2d5325.png)
6. final 修饰属性：当一个属性被final所修饰时，表示该属性不能被改写。
***错误示例***
```java
package exercise;
public class exercise008 {
    public static void main(String[] args){
        People people = new People();
        people.age = 20;
    }
}
class People{
    final int age =10;
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/a53ccd2968fb4c4f863169da17e9642a.png)

```java
package exercise;
public class exercise008 {
    public static void main(String[] args){
        People people = new People();
        people.address.name = "shanghai";
    }
}
class People{
    final Address address = new Address();
}
class Address{
    String name = "dalian";
}
```
***可以执行***
![在这里插入图片描述](https://img-blog.csdnimg.cn/1c2fbe343ceb48f6ac213a0edb74a720.png)
7. 当final修饰一个原生数据类型时，表示该原生数据类型的值不能发生变化（比如说不能从10变成20）；如果final修饰一个引用类型时，表示该引用类型不能在指向其他对象了；但该引用所指向的对象的内容是可以发生变化的。


# 第二十四讲
1. 对于final类型成员变量，一般来说有两种赋初值方式：
    1. 在声明final类型的成员变量时就赋上初值。
```java
package exercise;
public class exercise009 {
    final int a = 0;
}
```
    2. 在声明final类型的成员变量时不赋初值，但在类的所有构造方法中都为其赋上初值。
```java
package exercise;
public class exercise009 {
    final int a;
    public exercise009(){
        a = 0;
    }
    public exercise009(int a){
        this.a = a;
    }
}
```
2. static 代码块：静态代码块。静态代码块的作用也是完成一些初始化工作。首先执行静态代码块，然后执行构造方法。静态代码块在类被加载的时候执行，而构造方法是在生成对象的时候执行；要想调用某个类来生成对象，首先需要将类加载到Java虚拟机上（JVM），然后由jvm加载这个类来生成对象。
```java
package exercise;
public class exercise009 {
    public static void main (String[] args){
        P p = new P();
        P p2 = new P();
    }
}
class P{
    static {
        System.out.println("static block");
    }
    public P(){
        System.out.println("P out");
    }
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/934eb3fb576841c694374f52d25fcfc8.png)

```java
package exercise;
public class exercise009 {
    public static void main (String[] args){
        new S();
    }
}
class P{
    static {
        System.out.println("P static block");
    }
    public P(){
        System.out.println("P out");
    }
}
class Q extends P{
    static {
        System.out.println("Q static");
    }
    public Q(){
        System.out.println("Q out");
    }
}
class S extends Q{
    static {
        System.out.println("S static");
    }
    public S(){
        System.out.println("S out");
    }
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/90dfeef83ee64e4186933c8ba3a6a343.png)
3. 类的静态代码块只会执行一次，是在类被加载的时候执行的，因为每个类只会被加载一次，所有静态代码块也只会被执行一次；而构造方法则不然，每次生成一个对象的时候都会调用类的构造方法，所以new一次就会调用构造方法一次。
4. 如果继承体系中既有构造方法，又有静态代码块，那么首先执行最顶层的类的静态代码块，一直执行到最底层类的静态代码块。**注意：静态代码块只会执行一次** 。
5. 不能在静态方法中访问非静态成员变量；可以在静态方法中访问静态的成员变量。可以在非静态方法中访问静态的成员变量。

```java
package exercise;
public class exercise010 {
    public static void main (String[] args){
        W.change();
    }
}
class W {
    static int a = 10;
    public static void change(){
        a++;
    }
}
```
6. **总结：静态的只能访问静态的；非静态的可以访问一切**
7. **不能在静态方法中使用this关键字。**





1. 多态：父类型的引用可以指向子类型的对象。
2. Parent child = new Child();当使用多态方式调用方法时，首先检查父类是否有sing()方法，如果没有编译错误；如果有，再去调用子类的sing()方法。
3. 一共有两种类型的强制类型转换：
   1. 向上的类型转换（upcast）：比如说将dog类型转换为Animal类型，即将子类型转换为父类型。对于向上类型转换，不需要显示指定。
   2. 向下的类型转换（downcast）：比如将Animal类型转换为dog类型。即将父类型转换为子类型。对于向下类型转换，必须要显示指定（必须要使用强制类型转换）。

4. 抽象类（abstract class ）:使用abstract关键字所修饰的累叫做抽象类。抽象类无法实例化，也就是说，不能new出来一个抽象类的对象（实例）。
5. 抽象方法（abstract method）:使用abstract关键字所修饰的方法叫做抽象方法。***抽象方法需要定义在抽象类中。*** 相对于抽象方法，之前所定义的方法叫做具体方法（有声明，有实现）。
6.  如果有一个类包含了抽象方法，那么这个类一定是个抽象类。
7. 如果某个类是抽象类，那么该类可以包含具体方法（有声明，有实现）。
8. 如果一个类中包含了抽象方法，那么这个类一定要声明成abstract class ，也就是说，该类一定是抽象类；反之，如果某个类是抽象类，那么该类既可以包含抽象方法，也可以包含具体方法。
9. 无论何种情况，只要一个类是抽象类，那么这个类就无法实例化。
10. 在子类继承父类（父类是一个抽象类）的情况下，那么该子类必须要实现父类中所定义的所有抽象方法；否则，该子类需要声明一个**abstract class** 。
11. 接口（interface）：接口的地位等同于class, **接口中所有方法都是抽象方法。** 在声明接口中的方法时，可以使用abstract关键字，也可以不使用。通常情况下，都会省略掉abstract关键字。（有声明，无实现）。
12. 可以将接口看作是特殊的抽象类（抽象类中可以有具体方法，也可以有抽象方法，而接口中只能有抽象方法，不能有具体方法）。
13. 类可以实现接口，实现使用关键字implements表示，代表了某个类实现了某个接口。
14. 一个类实现了某个接口，那么该类必须要实现接口声明的所有方法。如果该类是个抽象类，那么就无需实现接口中的方法了。
15. Java是单继承的，也就是说某个类只能有唯一一个父类；一个类可以实现多个接口，多个接口之间使用逗号分隔。
16. 多态：所谓多态，就是父类型的引用可以指向子类型的对象，或者接口类型的引用可以指向实现该接口的类的实例。关于接口与实现接口的类之间的强制类型转换方式与父类和子类之间的强制类型转换方式完全一样。
17. Static 关键字：可以用于修饰属性，也可以用于修饰方法，还可以用于修饰类。
18. static 修饰属性：无论一个类生成了多少个对象，所有这些对象共同使用唯一一份静态成员变量；一个对象对该静态成员变量进行了修改，其他对象的该静态成员变量的值也随之发生变化。如果一个成员变量是static的，那么我们可以通过 类名.成员变量名 的方式来使用它（Java推荐我们使用这种方法）。
19. static 修饰方法：static 修饰的方法叫做静态方法。对于静态方法来说，可以使用类名.方法名的方式来访问。
20. **静态方法只能继承，不能重写（Override）。**
21. final关键字：final可以修饰属性、方法、类。
22. final修饰类：当一个类被final所修饰时，表示该类是一个终态类，即不能被继承。
23.  final修饰方法：当一个方法被final所修饰时，表示该方法是一个终态方法，即不能被重写（Override） 。
24.  final 修饰属性：当一个属性被final所修饰时，表示该属性不能被改写。
25. 当final修饰一个原生数据类型时，表示该原生数据类型的值不能发生变化（比如说不能从10变成20）；如果final修饰一个引用类型时，表示该引用类型不能在指向其他对象了；但该引用所指向的对象的内容是可以发生变化的。
26. 类的静态代码块只会执行一次，是在类被加载的时候执行的，因为每个类只会被加载一次，所有静态代码块也只会被执行一次；而构造方法则不然，每次生成一个对象的时候都会调用类的构造方法，所以new一次就会调用构造方法一次。
27. 如果继承体系中既有构造方法，又有静态代码块，那么首先执行最顶层的类的静态代码块，一直执行到最底层类的静态代码块。**注意：静态代码块只会执行一次** 。
28. 不能在静态方法中访问非静态成员变量；可以在静态方法中访问静态的成员变量。可以在非静态方法中访问静态的成员变量。
29. **总结：静态的只能访问静态的；非静态的可以访问一切**
30. **不能在静态方法中使用this关键字。**
