package com.strong.designmode.create.factory.abstracted;

/**
 * @author zhangzhiqiang
 * @date 2024/6/17 11:03
 * @description
 */
public class FrenchDessert implements Dessert{
    @Override
    public void make() {
        System.out.println("制作法式甜点");
    }
}
