package com.strong.designmode.structure.adapter;

/**
 * @author zhangzhiqiang
 * @date 2022/12/12 16:00
 * @description
 */
public class POPOrderAdapterServiceImpl implements OrderAdapterService {
    private POPOrderService popOrderService = new POPOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
