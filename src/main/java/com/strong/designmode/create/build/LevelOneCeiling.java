package com.strong.designmode.create.build;

import java.math.BigDecimal;

/**
 * @author zhangzhiqiang
 * @date 2022/11/9 09:37
 * @description
 */
public class LevelOneCeiling implements Matter {
    public String scene() {
        return "吊顶";
    }

    public String brand() {
        return "装修公司自带";
    }

    public String model() {
        return "一级顶";
    }

    public BigDecimal price() {
        return new BigDecimal(260);
    }

    public String desc() {
        return "造型只做低一级，只有一个层次的吊顶，一般离顶120-150mm";
    }
}
