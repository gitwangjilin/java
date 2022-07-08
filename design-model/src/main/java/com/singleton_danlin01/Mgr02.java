package main.java.com.singleton_danlin01;

/*************************************************************************
 ******
 * - Copyright (c) 2022 shangzhao.com
 * - File Name: Mgr01
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 * 饿汉模式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，不管用到与否，类装载时就完成实例化
 * 与01一样
 * - History:
 * Date        Author          Modification
 * 2022/6/15   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class Mgr02 {
    private static final Mgr02 INSTNCE;

    static {
        INSTNCE = new Mgr02();
    }

    private Mgr02() {

    }

    public static Mgr02 getInstance() {
        return INSTNCE;
    }

    public static void main(String[] args) {
        Mgr02 m1 = Mgr02.getInstance();
        Mgr02 m2 = Mgr02.getInstance();
        System.out.println(m1.hashCode() + "===" + m2.hashCode());

    }
}
