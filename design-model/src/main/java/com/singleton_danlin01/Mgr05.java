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
 * 对代码块加锁，多线程不安全
 * - History:
 * Date        Author          Modification
 * 2022/6/15   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class Mgr05 {
    private static  Mgr05 INSTNCE;


    private Mgr05() {

    }

    public static Mgr05 getInstance() {
        if (INSTNCE == null) {
            synchronized (Mgr05.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTNCE = new Mgr05();
            }
        }
        return INSTNCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();

        }

    }
}
