package com.strong.designmode.create.singleton;

/**
 * @author zhangzhiqiang
 * @date 2022/12/12 16:31
 * @description 懒汉式 双重检查
 * ● 1）构造器私有化
 * ● 2）类的内部创建对象，同时用volatile关键字修饰修饰
 * ● 3）向外暴露一个静态的公共方法，加入同步处理的代码块，并进行双重判断，解决线程安全问题
 */
public class Singleton6 {

    //    私有构造
    private Singleton6() {
    }

    //    类内部声名对象,同时用volatile关键字修饰
    private static volatile Singleton6 instance;

    //    向外暴露静态公共方法,加入同步代码块处理,解决线程安全问题
    public static Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
