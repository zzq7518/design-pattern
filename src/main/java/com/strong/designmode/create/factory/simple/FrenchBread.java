package com.strong.designmode.create.factory.simple;

/**
 * @author zhangzhiqiang
 * @date 2024/6/7 11:09
 * @description
 */
public class FrenchBread implements Bread{
    @Override
    public void make() {
        System.out.println("制作法式蛋糕");
    }
}
