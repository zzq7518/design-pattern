package com.strong.designmode.structure.adapter;

import lombok.Data;

/**
 * @author zhangzhiqiang
 * @date 2022/12/8 13:59
 * @description
 */
@Data
public class RebateInfo {
    private String userId;  // 用户ID
    private String bizId;   // 业务ID
    private String bizTime;   // 业务时间
    private String desc;    // 业务描述

}
