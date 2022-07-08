package main.java.com.singleton_danlin01;

/*************************************************************************
 ******
 * - Copyright (c) 2022 shangzhao.com
 * - File Name: Mgr01
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 * 饿汉模式  完美
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，不管用到与否，类装载时就完成实例化
 * - History:
 * Date        Author          Modification
 * 2022/6/15   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class Mgr01 {
    private static final Mgr01 INSTNCE = new Mgr01();

    private Mgr01() {

    }

    public static Mgr01 getInstance() {
        return INSTNCE;
    }

    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1.hashCode() + "===" + m2.hashCode());

    }
}
