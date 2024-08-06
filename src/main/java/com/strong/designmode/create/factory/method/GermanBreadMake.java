package com.strong.designmode.create.factory.method;

import com.strong.designmode.create.factory.simple.Bread;
import com.strong.designmode.create.factory.simple.GermanBread;

/**
 * @author zhangzhiqiang
 * @date 2024/6/17 10:53
 * @description
 */
public class GermanBreadMake extends BreadMake{
    @Override
    public Bread getBread() {
        return new GermanBread();
    }
}
