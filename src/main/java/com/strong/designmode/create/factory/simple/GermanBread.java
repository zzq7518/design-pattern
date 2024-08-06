package com.strong.designmode.create.factory.simple;

/**
 * @author zhangzhiqiang
 * @date 2024/6/7 11:12
 * @description
 */
public class GermanBread implements Bread{
    @Override
    public void make() {
        System.out.println("制作德式面包");
    }
}
