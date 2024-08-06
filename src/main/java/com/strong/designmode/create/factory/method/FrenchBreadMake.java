package com.strong.designmode.create.factory.method;

import com.strong.designmode.create.factory.simple.Bread;
import com.strong.designmode.create.factory.simple.FrenchBread;

/**
 * @author zhangzhiqiang
 * @date 2024/6/17 10:50
 * @description
 */
public class FrenchBreadMake extends BreadMake{
    @Override
    public Bread getBread() {
        return new FrenchBread();
    }
}
