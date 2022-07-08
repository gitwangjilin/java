# JUC

## 1 JUC介绍

### 1.1 生命周期

![image-20211214172753504](image/juc生命周期.png)

### 1.2 线程状态

- NEW（初始化状态）
- READY（可运行 / 运行状态）
- BLOCKED（阻塞状态）
- WAITING（无时限等待）
- TIMED_WAITING（有时限等待）
- TERMINATED（终止状态）

### 1.3 wait/sleep区别

1. sleep是Thread的静态方法，wait是Object的方法，任何对象实体都能调用。

   2.sleep不会释放锁，它不需要占用锁。wait会释放锁，但调用它的前提当前线程占有锁（既代码要在synchronized中）。

   3.它们都可以被interrupted方法中断。

### 1.4 并发与并行

#### 1.4.1 串行模式

![image-20211215094029769](image/串行模式.png)

#### 1.4.2 并行模式

![image-20211215094134127](image/并行模式1.png)

![image-20211215094201382](image/并行模式2.png)

#### 1.4.3 并发

![image-20211215094311955](image/并发.png)

#### 1.4.4 小结（重点）

![image-20211215094552239](image/并发小结.png)

### 1.5 管程

![image-20211215094717418](image/管程.png)

### 1.6 用户线程和守护线程

![image-20211215100648612](image/用户和守护线程.png)

## 2 Lock接口

### 2.1 Synchronized

#### 2.1.1 Synchronized关键字

![image-20211215101647455](image/synchronized介绍1.png)

![image-20211215101716225](image/synchronized介绍2.png)

#### 2.1.2 售票案例

![image-20211215102052673](image/售票案例.png)

### 2.2 Lock

![image-20211215103101219](image/Lock介绍1.png)

![image-20211215103122781](image/Lock介绍2.png)

#### 2.2.1 Lock类接口

![image-20211215103443925](image/Lock接口.png)

#### 2.2.2 lock接口

![](image/lock接口介绍1.png)

![image-20211215103650377](image/lock接口介绍2.png)

#### 2.2.3 newCondition

![image-20211215104302446](image/newCondition.png)

### 2.3 ReentrantLock

![image-20211215112551765](image/ReentrantLock介绍1.png)

![image-20211215112725788](image/ReentrantLock介绍2.png)

### 2.4 ReadWriteLock

![image-20211215140254201](image/readwriteLock.png)

![image-20211215140335758](image/readwriteLock2.png)

![image-20211215140419799](image/readwriteLock3.png)

![image-20211215140500516](image/readwritelock4.png)

![image-20211215140527978](image/readwritelock5.png)

![image-20211215140608400](image/readwriteLock6.png)

![image-20211215140629687](image/readwritelock7.png)

![image-20211215140704521](image/readwritelock8.png)

#### 2.5 小结

![image-20211215140745659](image/lock和synchronized1.png)

![image-20211215140812182](image/lock和synchronized2.png)

## 3 线程间通信

![image-20211215160733116](image/线程间通信.png)

### 3.1 synchronize方案

代码

```java
juc\src\main\java\com\juc\sync\ThreadDemo1.java
```

### 3.2 Lock方案

代码

```java
juc\src\main\java\com\juc\lock\ThreadDemo2.java
```

### 3.3 虚假唤醒问题

![image-20211217151046848](image/%E8%99%9A%E5%81%87%E5%94%A4%E9%86%92.png)

### 3.4 定制化通讯

#### 3.4.1 定制化通讯

![image-20211220112231827](image/%E5%AE%9A%E5%88%B6%E5%8C%96%E9%80%9A%E8%AE%AF.png)

1.通过flag标注位来判断线程通讯的标识。

2.定义flag是否当前要执行的线，如果不是就把当前线程设置等待，待想要的线程执行完更新flag,唤醒线程。

#### 3.4.2代码

```java
juc\src\main\java\com\juc\lock\ThreadDemo3.java
```

#### 3.4.3 synchronized实现同步基础

java中的每一个对象都可以作为锁

	1. 对于普通同步方法，锁是当前实例对象。
 	2. 对象静态同步方法，锁是当前类的class对象。
 	3. 对于同步方法块，锁是synchonized括号里配置的对象。

## 4 集合线程安全

### 4.1 ArrayList 线程不安全

异常内容：councurrentModifcontionException 
原因：源码中add方法没有加锁

### 4.2 解决ArrayList线程不安全

#### 4.2.1 Vector

![image-20211220154828088](image/Vector.png)

vector底层add加synchronized

#### 4.2.2 Collections

Collections提供了synchronizedList保证list同步线程安全

#### 4.2.3 CopyOnWriteArrayList

![image-20211220155201849](image/copyonwritearraylist.png)

![image-20211220155243187](image/copyonwritearraylist2.png)

![image-20211220155346427](image/copyonwritearraylist3.png)

### 4.3 总结

![](image/%E9%9B%86%E5%90%88%E7%BA%BF%E7%A8%8B%E6%80%BB%E7%BB%931.png)

![image-20211220155607520](image/%E9%9B%86%E5%90%88%E7%BA%BF%E7%A8%8B%E6%80%BB%E7%BB%932.png)

## 5 多线程锁 

### 5.1 synchonized锁

![image-20211220165023730](image/%E5%A4%9A%E7%BA%BF%E7%A8%8B%E9%94%81.png)

### 5.2 公平锁和非公平锁

![image-20211220170053292](image/%E5%85%AC%E5%B9%B3%E9%94%81%E5%92%8C%E9%9D%9E%E5%85%AC%E5%B9%B3%E9%94%81.png)

### 5.3 可重入锁

![image-20211220172022988](image/%E5%8F%AF%E9%87%8D%E5%85%A5%E9%94%81.png)

![image-20211220172043844](image/%E6%98%BE%E7%A4%BA%E9%94%81.png)

### 5.4 死锁

生成原因： 是指多个进程在运行过程中因争夺资源而造成的一种僵局，当进程处于这种僵持状态时，若无外力作用，它们都将无法再向前推进。 

死锁必要条件：

1.互斥条件：进程要求对所分配的资源进行排它性控制，即在一段时间内某资源仅为一进程所占用。
2.请求和保持条件：当进程因请求资源而阻塞时，对已获得的资源保持不放。
3.不剥夺条件：进程已获得的资源在未使用完之前，不能剥夺，只能在使用完时由自己释放。
4.环路等待条件：在发生死锁时，必然存在一个进程--资源的环形链。
解决死锁：

1. 加锁顺序
2. 加锁时限
3. 死锁检测

## 6 Callable&Future接口

### 6.1 Callable接口

#### 6.1.1  创建线程的方式

1. 继承Thread类 

2. 实现Runnable接口

3. Callable接口

4. 线程池方式

   

#### 6.1.2 线程比较

1. 是否有返回值
2. 是否抛出异常
3. 实现方式不同，一个是run方法，一个是call方法

### 6.2 代码

```java
juc\src\main\java\com\juc\callable\Demo1.java
```



## 7 JUC三大辅助类

![image-20211222145231499](image/JUC%E4%B8%89%E5%A4%A7%E8%BE%85%E5%8A%A9%E7%B1%BB.png)

### 7.1  减少技术CountDownLatch

![image-20211222145522057](image/%E5%87%8F%E5%B0%91%E8%AE%A1%E6%95%B0countDownLatch.png)

```java
juc\src\main\java\com\juc\juc\CountDownLatchDemo.java
```

### 7.2 循环栅栏CyclicBarrier

![image-20211222150735944](image/%E5%BE%AA%E7%8E%AF%E6%A0%85%E6%A0%8FCyclicBarrier.png)

```java
juc\src\main\java\com\juc\juc\CyclicBarrierDemo.java
```

### 7.3 信号灯Semaphore

![image-20211222151223963](image/%E4%BF%A1%E5%8F%B7%E7%81%AFSemaphore.png)

## 8 读写锁 ReentrantReadWriteLock

#### 8.1 悲观锁也悲观锁

​		悲观锁：单线程执行，用户过来先加锁，执行结束在释放锁

​		乐观锁：多线程，用户过来先分配版本号，如果谁先做修改，下次人来就不能修改。

![05-乐观锁和悲观锁](image/05-%E4%B9%90%E8%A7%82%E9%94%81%E5%92%8C%E6%82%B2%E8%A7%82%E9%94%81.png)

#### 8.2 表锁行锁

​		行锁：会出现死 锁

​		表锁：不会出现

​		读锁:共享线程，发送死锁

​		写锁:独占锁，发送死锁

![08-读写锁](image/%E8%AF%BB%E5%86%99%E9%94%81.png)

​		缺点：

​		1.造成锁饥饿，一直读，没有写操作

​        2.读的时候不能写，只有读完才能写。

![14-读写锁演变](D:/%E5%AD%A6%E4%B9%A0%E8%A7%86%E9%A2%91/%E5%B0%9A%E7%A1%85%E8%B0%B7%E8%A7%86%E9%A2%91%E9%9B%86/juc/%E7%AC%94%E8%AE%B0/%E7%AC%94%E8%AE%B0/%E5%88%86%E6%9E%90%E5%9B%BE/14-%E8%AF%BB%E5%86%99%E9%94%81%E6%BC%94%E5%8F%98.png)

#### 8.3 代码

```java
juc\src\main\java\com\juc\readwrite\ReadWriteLockDemo.java
```

#### 8.4 锁降级

​	例如：学霸在写别人抄作业，学霸必须的先写，学渣先看，然后在写

![15-读写锁降级](image/15-%E8%AF%BB%E5%86%99%E9%94%81%E9%99%8D%E7%BA%A7.png)

代码

```java
juc\src\main\java\com\juc\readwrite\Demo.java
```

## 9 阻塞队列

### 9.1 BlockingQueue简介

![image-20211223151538540](image/BlockingQuew%E4%BB%8B%E7%BB%8D1.png)

![image-20211223151623763](image/BlockingQuew%E4%BB%8B%E7%BB%8D2.png)

![image-20211223151654486](image/BlockingQuew%E4%BB%8B%E7%BB%8D3.png)

![image-20211223151720874](image/BlockingQuew%E4%BB%8B%E7%BB%8D4.png)

### 9.2 BlockingQueue核心方法

![image-20211223151817901](image/BlockingQueue%E6%A0%B8%E5%BF%83%E6%96%B9%E6%B3%951.png)

![image-20211223151912383](image/BlockingQueue%E6%A0%B8%E5%BF%83%E6%96%B9%E6%B3%952.png)

### 9.3 代码

```java
juc\src\main\java\com\juc\queue\BlockingQueueDemo.java
```

## 10 ThreadPool线程池

### 10.1 线程池介绍

![image-20220105111439853](image/%E7%BA%BF%E7%A8%8B%E6%B1%A0%E4%BB%8B%E7%BB%8D.png)

![image-20220105111615696](image/%E7%BA%BF%E7%A8%8B%E6%B1%A0%E7%9A%84%E4%BC%98%E5%8A%BF.png)

![image-20220105111715886](image/%E7%BA%BF%E7%A8%8B%E6%B1%A0%E7%9A%84%E7%89%B9%E7%82%B9.png)

![image-20220105111800315](image/%E7%BA%BF%E7%A8%8B%E6%B1%A0%E6%9E%B6%E6%9E%84%E5%9B%BE.png)

### 10.2 线程池参数

![image-20220105111902291](image/%E7%BA%BF%E7%A8%8B%E6%B1%A0%E5%8F%82%E6%95%B0%E4%BB%8B%E7%BB%8D.png)

![image-20220105111939627](image/%E7%BA%BF%E7%A8%8B%E6%B1%A0%E5%8F%82%E6%95%B0%E4%BB%8B%E7%BB%8D2.png)

### 10.3 拒绝策略

![image-20220105112041271](image/%E7%BA%BF%E7%A8%8B%E6%B1%A0%E6%8B%92%E7%BB%9D%E7%AD%96%E7%95%A5.png)

### 10.4 线程池的种类与创建

![image-20220105112820094](image/newCachedThreadPool%E5%88%9B%E5%BB%BA.png)

![image-20220105142228924](image/%E5%8F%AF%E7%BC%93%E5%AD%98%E7%BA%BF%E7%A8%8B%E6%B1%A0.png)

![image-20220105142315910](image/%E5%9B%BA%E5%AE%9A%E7%BA%BF%E7%A8%8B%E6%95%B0%E7%9A%84%E7%BA%BF%E7%A8%8B%E6%B1%A0.png)

![image-20220105142352799](image/%E5%8F%AF%E5%9B%BA%E5%AE%9A%E7%BA%BF%E7%A8%8B%E6%B1%A0%E9%95%BF%E5%BA%A6%E7%89%B9%E5%BE%81.png)

![image-20220105142428721](image/%E5%8F%AF%E5%9B%BA%E5%AE%9A%E7%BA%BF%E7%A8%8B%E6%B1%A0%E9%95%BF%E5%BA%A6%E6%96%B9%E6%B3%95.png)

![image-20220105142505548](image/%E5%8D%95%E4%B8%80%E7%BA%BF%E7%A8%8B%E6%B1%A0.png)

![image-20220105142527461](image/%E5%8D%95%E4%B8%80%E7%BA%BF%E7%A8%8B%E6%B1%A0%E4%BD%9C%E7%94%A8.png)

![image-20220105142551804](image/%E5%8D%95%E4%B8%80%E7%BA%BF%E7%A8%8B%E6%B1%A0%E5%88%9B%E5%BB%BA.png)

![image-20220105142613360](image/%E5%8D%95%E4%B8%80%E7%BA%BF%E7%A8%8B%E5%BA%94%E7%94%A8%E5%9C%BA%E6%99%AF.png)

![image-20220105142658507](image/jdk8%E8%87%AA%E5%B8%A6.png)

![image-20220105142719953](image/forkjoin.png)

![image-20220105142742136](image/jdk%E8%87%AA%E5%B8%A6%E5%BA%94%E7%94%A8%E5%9C%BA%E6%99%AF.png)

### 10.5 线程池底层工作原理

![image-20220105142955873](image/%E7%BA%BF%E7%A8%8B%E6%B1%A0%E5%B7%A5%E4%BD%9C%E5%8E%9F%E7%90%86.png)

### 10.6 线程池注意事项

![image-20220105143349061](image/%E7%BA%BF%E7%A8%8B%E6%B1%A0%E6%B3%A8%E6%84%8F%E4%BA%8B%E9%A1%B9.png)

