package com.strong.designmode.create.singleton;

/**
 * @author zhangzhiqiang
 * @date 2022/12/12 16:26
 * @description 饿汉式 静态常量
 * ● 1）优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题
 * ● 2）缺点：在类装载的时候就完成实例化，没有达到 Lazy Loading 的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费
 * ● 3）这种方式基于 classloder 机制避免了多线程的同步问题。不过，instance 在类装载时就实例化，在单例模式中大多数都是调用getlnstance 方法，但是导致类装载的原因有很多种，因此不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 就没有达到 Lazy loading 的效果
 * ● 4）结论：这种单例模式可用，可能造成内存浪费
 *
 */
public class Singleton1 {

    //    私有构造
    private Singleton1() {
    }

    //    类内部创建对象
    public static final Singleton1 instance = new Singleton1();

    //    向外暴露静态公共方法
    public static Singleton1 getInstance() {
        return instance;
    }

}
