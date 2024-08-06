package com.strong.designmode.structure.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangzhiqiang
 * @date 2022/12/12 15:57
 * @description
 */
@Slf4j
public class POPOrderService {

    public boolean isFirstOrder(String uId) {
        log.info("POP商家，查询用户的订单是否为首单：{}", uId);
        return true;
    }

}
