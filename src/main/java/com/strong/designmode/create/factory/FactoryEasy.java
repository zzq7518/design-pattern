package com.strong.designmode.create.factory;

/**
 * @author zhangzhiqiang
 * @date 2024/6/3 14:32
 * @description
 */
public class FactoryEasy {


    public static void main(String[] args) {

    }

}

interface Animal {
    void eat();
}

class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}

class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

