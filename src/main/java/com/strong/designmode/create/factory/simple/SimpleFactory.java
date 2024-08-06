package com.strong.designmode.create.factory.simple;

/**
 * @author zhangzhiqiang
 * @date 2024/6/17 09:52
 * @description
 */
public class SimpleFactory {

    private static Bread bread;

    public static Bread getBread(String type) {
        switch (type) {
            case "french":
                bread = new FrenchBread();
                break;
            case "german":
                bread = new GermanBread();
                break;
            default:
                throw new RuntimeException("未知的类型");
        }
        return bread;
    }
}
