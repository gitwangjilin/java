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
 * 双层判断   完美
 * - History:
 * Date        Author          Modification
 * 2022/6/15   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class Mgr06 {
    private static volatile Mgr06 INSTNCE;//volatile 指令重排计算机的汇编语言的问题


    private Mgr06() {

    }

    public static Mgr06 getInstance() {
        if (INSTNCE == null) {
            synchronized (Mgr06.class) {
                if (INSTNCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTNCE = new Mgr06();
                }
            }
        }
        return INSTNCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr06.getInstance().hashCode());
            }).start();

        }

    }
}
