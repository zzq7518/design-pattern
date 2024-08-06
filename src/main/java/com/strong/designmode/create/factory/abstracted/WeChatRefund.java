package com.strong.designmode.create.factory.abstracted;

/**
 * @author zhangzhiqiang
 * @date 2024/6/18 22:57
 * @description
 */
public class WeChatRefund implements IRefund{
    @Override
    public void refund() {
        System.out.println("微信退款");
    }
}
