package com.strong.designmode.create.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

/**
 * @author zhangzhiqiang
 * @date 2022/11/8 16:22
 * @description
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Topic {

    private Map<String, String> option;

    private String key;
}
