package com.strong.designmode.structure.adapter;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhangzhiqiang
 * @date 2022/12/12 15:55
 * @description
 */
public class InsideOrderService implements OrderAdapterService {

    @Autowired
    private OrderService orderService = new OrderService();

    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
