package com.strong.designmode.create.singleton;

/**
 * @author zhangzhiqiang
 * @date 2022/12/12 17:03
 * @description 枚举单例
 * ● 1）这借助 JDK1.5 中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 * ● 2）这种方式是 Effective Java 作者 Josh Bloch 提倡的方式
 * ● 3）结论：推荐使用
 */
public enum Singleton8 {
    INSTANCE;

    public void sayHello(){
        System.out.println("Hello World");
    }
}
