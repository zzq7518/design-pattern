package com.strong.designmode.create.factory.simple;

/**
 * @author zhangzhiqiang
 * @date 2024/6/18 22:25
 * @description
 */
public class AliPay implements IPay{
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
