package com.strong.designmode.structure.adapter;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhangzhiqiang
 * @date 2022/12/8 13:56
 * @description
 */
@Data
public class POPOrderDelivered {
    private String uId;     // 用户ID
    private String orderId; // 订单号
    private Date orderTime; // 下单时间
    private Date sku;       // 商品
    private Date skuName;   // 商品名称
    private BigDecimal decimal; // 金额
}
