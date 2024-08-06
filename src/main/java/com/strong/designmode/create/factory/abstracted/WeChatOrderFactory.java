package com.strong.designmode.create.factory.abstracted;

import com.strong.designmode.create.factory.simple.IPay;
import com.strong.designmode.create.factory.simple.WeChatPay;

/**
 * @author zhangzhiqiang
 * @date 2024/6/18 22:57
 * @description
 */
public class WeChatOrderFactory implements IOrderFactory{
    @Override
    public IPay pay() {
        return new WeChatPay();
    }

    @Override
    public IRefund refund() {
        return new WeChatRefund();
    }
}
