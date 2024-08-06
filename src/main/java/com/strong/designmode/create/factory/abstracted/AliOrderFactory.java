package com.strong.designmode.create.factory.abstracted;

import com.strong.designmode.create.factory.simple.AliPay;
import com.strong.designmode.create.factory.simple.IPay;

/**
 * @author zhangzhiqiang
 * @date 2024/6/18 22:56
 * @description
 */
public class AliOrderFactory implements IOrderFactory{
    @Override
    public IPay pay() {
        return new AliPay();
    }

    @Override
    public IRefund refund() {
        return new AliRefund();
    }
}
