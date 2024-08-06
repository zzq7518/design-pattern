package com.strong.designmode.create.singleton;

/**
 * @author zhangzhiqiang
 * @date 2022/12/12 16:31
 * @description 懒汉式 线程安全，同步代码块
 * ● 1）构造器私有化
 * ● 2）类的内部创建对象
 * ● 3）向外暴露一个静态的公共方法，加入同步处理的代码块
 */
public class Singleton5 {

    //    私有构造
    private Singleton5() {
    }

    //    类内部声名对象
    private static Singleton5 instance;

    //    向外暴露静态公共方法,加入同步代码块处理,解决线程安全问题
    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class){
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
