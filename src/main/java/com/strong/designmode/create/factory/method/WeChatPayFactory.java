package com.strong.designmode.create.factory.method;

import com.strong.designmode.create.factory.simple.IPay;
import com.strong.designmode.create.factory.simple.WeChatPay;

/**
 * @author zhangzhiqiang
 * @date 2024/6/18 22:51
 * @description
 */
public class WeChatPayFactory implements IPayFactory{
    @Override
    public IPay getPay() {
        return new WeChatPay();
    }
}
