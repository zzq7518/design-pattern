package com.strong.designmode.create.singleton;

/**
 * @author zhangzhiqiang
 * @date 2022/12/12 16:31
 * @description 饿汉式 静态代码块
 * ● 1）这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优缺点和上面是一样的。
 * ● 2）结论：这种单例模式可用，但是可能造成内存浪费
 */
public class Singleton2 {

    //    私有构造
    private Singleton2() {
    }

    //    类内部声名对象
    private static Singleton2 instance;

    //    静态代码块中创建对象
    static {
        instance = new Singleton2();
    }

    //    向外暴露静态公共方法
    public static Singleton2 getInstance() {
        return instance;
    }
}
