package com.strong.designmode.create.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author zhangzhiqiang
 * @date 2024/6/19 22:44
 * @description
 */
public class SingletonReview {
    public static void main(String[] args) {
        SingletonReview1 instance = SingletonReview1.getInstance();
        System.out.println("instance = " + instance);
        SingletonReview1 instance1 = SingletonReview1.getInstance();
        System.out.println("instance1 = " + instance1);
    }
}

/**
 * 饿汉式
 */
class SingletonReview1{
    //私有构造
    private SingletonReview1(){}
    //定义成员变量
    private static SingletonReview1 instance = new SingletonReview1();
    //定义获取方法
    public static SingletonReview1 getInstance(){
        return instance;
    }
}

/**
 * 懒汉式-线程不安全
 */
class SingletonReview2{
    //私有构造
    private SingletonReview2(){}
    //定义成员变量
    private static SingletonReview2 instance;
    //定义获取方法
    public static SingletonReview2 getInstance(){
        if (instance == null){
            instance = new SingletonReview2();
        }
        return instance;
    }
}

/**
 * 懒汉式-双检锁
 */
class SingletonReview3{
    //私有构造
    private SingletonReview3(){}
    //定义成员变量
    private static volatile SingletonReview3 instance;
    //定义获取方法
    public static SingletonReview3 getInstance(){
        if (instance == null){
            synchronized (SingletonReview3.class){
                if (instance == null){
                    instance = new SingletonReview3();
                }
            }
        }
        return instance;
    }
}

/**
 * 内部类
 */
class SingletonReview4{
    //私有构造
    private SingletonReview4(){}
    //定义成员变量
    private static class SingletonHolder{
        private static SingletonReview4 instance = new SingletonReview4();
    }
    //定义获取方法
    public static SingletonReview4 getInstance(){
        return SingletonHolder.instance;
    }
}

/**
 * cas
 */
class SingletonReview6{
    //私有构造
    private SingletonReview6(){}
    //定义成员变量
    private static final AtomicReference<SingletonReview6> INSTANCE = new AtomicReference<>();
    //定义获取方法
    public static SingletonReview6 getInstance(){
        for (;;){
            SingletonReview6 instance = INSTANCE.get();
            if (instance == null){
                INSTANCE.compareAndSet(null,new SingletonReview6());
            }
            return INSTANCE.get();
        }
    }
}

/**
 * 枚举
 */
enum SingletonReview7{
    INSTANCE;
}