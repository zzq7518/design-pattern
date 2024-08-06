package com.strong.designmode.structure.adapter;

import lombok.Data;

import java.time.LocalDate;

/**
 * @author zhangzhiqiang
 * @date 2022/12/8 13:53
 * @description
 */
@Data
public class CreateAccount {

    private String number;      // 开户编号
    private String address;     // 开户地
    private LocalDate accountDate;   // 开户时间
    private String desc;        // 开户描述

}
