package com.strong.designmode.create.factory.method;

import com.strong.designmode.create.factory.simple.Bread;

/**
 * @author zhangzhiqiang
 * @date 2024/6/17 10:45
 * @description
 */
public abstract class BreadMake {

    public void make() {
        Bread bread = getBread();
        bread.make();
    }

    public abstract Bread getBread();

}
