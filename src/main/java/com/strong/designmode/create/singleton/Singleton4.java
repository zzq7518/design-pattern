package com.strong.designmode.create.singleton;

/**
 * @author zhangzhiqiang
 * @date 2022/12/12 16:31
 * @description 懒汉式 线程安全，同步方法
 * ● 1）构造器私有化
 * ● 2）类的内部创建对象
 * ● 3）向外暴露一个静态的公共方法，加入同步处理的代码，解决线程安全问题
 */
public class Singleton4 {

    //    私有构造
    private Singleton4() {
    }

    //    类内部声名对象
    private static Singleton4 instance;

    //    向外暴露静态公共方法,加入同步处理，解决线程安全问题
    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
