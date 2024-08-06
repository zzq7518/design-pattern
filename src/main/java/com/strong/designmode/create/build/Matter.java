package com.strong.designmode.create.build;

import java.math.BigDecimal;

/**
 * @author zhangzhiqiang
 * @date 2022/11/9 09:28
 * @description
 */
public interface Matter {

    /**
     * 场景：地板、地砖、涂料、吊顶
     *
     * @return
     */
    String scene();

    /**
     * 品牌
     *
     * @return
     */
    String brand();

    /**
     * 型号
     *
     * @return
     */
    String model();

    /**
     * 价格
     */
    BigDecimal price();

    /**
     * 描述
     *
     * @return
     */
    String desc();
}
