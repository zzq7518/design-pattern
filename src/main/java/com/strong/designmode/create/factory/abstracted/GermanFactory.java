package com.strong.designmode.create.factory.abstracted;

import com.strong.designmode.create.factory.simple.Bread;
import com.strong.designmode.create.factory.simple.GermanBread;

/**
 * @author zhangzhiqiang
 * @date 2024/6/17 11:05
 * @description
 */
public class GermanFactory implements MakeFactory {
    @Override
    public Bread makeBread() {
        return new GermanBread();
    }

    @Override
    public Dessert makeDessert() {
        return new GermanDessert();
    }
}
