package main.java.com.singleton_danlin01;

/*************************************************************************
 ******
 * - Copyright (c) 2022 shangzhao.com
 * - File Name: Mgr01
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 * 静态内部方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 * - History:
 * Date        Author          Modification
 * 2022/6/15   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class Mgr07 {

    private Mgr07() {

    }

    public static class Mgr07Holder {
        private final static Mgr07 INSTNCE = new Mgr07();
    }

    public static Mgr07 getInstance() {
        return Mgr07Holder.INSTNCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr07.getInstance().hashCode());
            }).start();

        }

    }
}
