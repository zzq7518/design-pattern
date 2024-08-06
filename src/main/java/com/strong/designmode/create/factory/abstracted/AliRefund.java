package com.strong.designmode.create.factory.abstracted;

/**
 * @author zhangzhiqiang
 * @date 2024/6/18 22:56
 * @description
 */
public class AliRefund implements IRefund{
    @Override
    public void refund() {
        System.out.println("支付宝退款");
    }
}
