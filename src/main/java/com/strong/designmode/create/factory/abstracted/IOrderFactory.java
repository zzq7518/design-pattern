package com.strong.designmode.create.factory.abstracted;

import com.strong.designmode.create.factory.simple.IPay;

/**
 * @author zhangzhiqiang
 * @date 2024/6/18 22:55
 * @description
 */
public interface IOrderFactory {

    IPay pay();

    IRefund refund();
}
