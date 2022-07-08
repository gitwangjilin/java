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
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * - History:
 * Date        Author          Modification
 * 2022/6/15   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class Mgr03 {
    private static Mgr03 INSTNCE;


    private Mgr03() {

    }

    public static Mgr03 getInstance() {
        if (INSTNCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTNCE = new Mgr03();
        }
        return INSTNCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();

        }

    }
}
