package com.strong.designmode.structure.adapter;

import lombok.Data;

import java.time.LocalDate;

/**
 * @author zhangzhiqiang
 * @date 2022/12/8 13:55
 * @description
 */
@Data
public class OrderMq {
    private String uid;           // 用户ID
    private String sku;           // 商品
    private String orderId;       // 订单ID
    private LocalDate createOrderTime; // 下单时间
}
