package com.strong.designmode.create.singleton;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author zhangzhiqiang
 * @date 2024/6/1 17:43
 * @description
 */
public class SingletonReceive {
    private static volatile boolean flag = false;
    //1.私有构造防止通过new对象
    private SingletonReceive() {
        synchronized (SingletonReceive.class){
            if (flag){
                throw new RuntimeException();
            }
            flag = true;
        }
    }

    //2.定义成员变量
    private static volatile SingletonReceive instance;

    //3.创建函数获取实列
    public static SingletonReceive getInstance() {
        if (instance == null) {
            synchronized (SingletonReceive.class) {
                if (instance == null) {
                    instance = new SingletonReceive();
                }
            }
        }
        return instance;
    }
}

@RestController
class Test1 {

    @RequestMapping("test1")
    public String test() {
        SingletonReceive instance = SingletonReceive.getInstance();
        return "sucess1";
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<SingletonReceive> receiveClass = SingletonReceive.class;
        Constructor<SingletonReceive> constructor = receiveClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonReceive singletonReceive1 = constructor.newInstance();
        SingletonReceive singletonReceive2 = constructor.newInstance();
        System.out.println(singletonReceive1 == singletonReceive2);
    }
}