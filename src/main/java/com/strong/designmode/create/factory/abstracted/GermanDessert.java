package com.strong.designmode.create.factory.abstracted;

/**
 * @author zhangzhiqiang
 * @date 2024/6/17 11:04
 * @description
 */
public class GermanDessert implements Dessert{
    @Override
    public void make() {
        System.out.println("制作德式甜点");
    }
}
