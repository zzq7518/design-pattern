package com.strong.designmode.create.singleton;

/**
 * @author zhangzhiqiang
 * @date 2022/12/12 16:31
 * @description 懒汉式 静态内部类
 * ● 1）这种方式采用了类装载的机制，来保证初始化实例时只有一个线程
 * ● 2）静态内部类方式在 Singleton 类被装载时并不会立即实例化，而是在需要实例化时，调用getlnstance方法，才会装载Singletonlnstance 类，从而完成 Singleton 的实例化
 * ● 3）类的静态属性只会在第一次加载类的时候初始化，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的
 * ● 4）优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
 * ● 5）结论：推荐使用
 */
public class Singleton7 {

    //    私有构造
    private Singleton7() {
    }

    //    类内部声名静态内部类
    private static class SingletonInstance {
        public static final Singleton7 instance = new Singleton7();
    }

    //    向外暴露静态公共方法
    public static Singleton7 getInstance() {
        return SingletonInstance.instance;
    }
}
