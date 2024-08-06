package com.strong.designmode.create.factory.abstracted;

import com.strong.designmode.create.factory.simple.Bread;
import com.strong.designmode.create.factory.simple.FrenchBread;

/**
 * @author zhangzhiqiang
 * @date 2024/6/17 11:05
 * @description
 */
public class FrenchFactory implements MakeFactory {

    @Override
    public Bread makeBread() {
        return new FrenchBread();
    }

    @Override
    public Dessert makeDessert() {
        return new FrenchDessert();
    }
}
