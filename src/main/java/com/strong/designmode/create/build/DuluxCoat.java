package com.strong.designmode.create.build;

import java.math.BigDecimal;

/**
 * @author zhangzhiqiang
 * @date 2022/11/9 09:41
 * @description
 */
public class DuluxCoat implements Matter{
    public String scene() {
        return "涂料";
    }

    public String brand() {
        return "多乐士(Dulux)";
    }

    public String model() {
        return "第二代";
    }

    public BigDecimal price() {
        return new BigDecimal(719);
    }

    public String desc() {
        return "多乐士是阿克苏诺贝尔旗下的著名建筑装饰油漆品牌，产品畅销于全球100个国家，每年全球有5000万户家庭使用多乐士油漆。";
    }
}
