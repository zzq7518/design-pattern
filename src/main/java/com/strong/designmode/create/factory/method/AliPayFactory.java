package com.strong.designmode.create.factory.method;

import com.strong.designmode.create.factory.simple.AliPay;
import com.strong.designmode.create.factory.simple.IPay;

/**
 * @author zhangzhiqiang
 * @date 2024/6/18 22:50
 * @description
 */
public class AliPayFactory implements IPayFactory{
    @Override
    public IPay getPay() {
        return new AliPay();
    }
}
