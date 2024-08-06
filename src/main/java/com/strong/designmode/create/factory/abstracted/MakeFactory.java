package com.strong.designmode.create.factory.abstracted;

import com.strong.designmode.create.factory.simple.Bread;

/**
 * @author zhangzhiqiang
 * @date 2024/6/17 11:10
 * @description
 */
public interface MakeFactory {

    Bread makeBread();

    Dessert makeDessert();
}
