package com.strong.designmode.create.singleton;

/**
 * @author zhangzhiqiang
 * @date 2022/12/12 16:31
 * @description 懒汉式 线程不安全
 * ● 1）起到了 Lazy Loading 的效果，但是只能在单线程下使用
 * ● 2）如果在多线程下，一个线程进入了判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例
 * ● 3）结论：在实际开发中，不要使用这种方式
 */
public class Singleton3 {

    //    私有构造
    private Singleton3() {
    }

    //    类内部声名对象
    private static Singleton3 instance;

    //    向外暴露静态公共方法
    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
