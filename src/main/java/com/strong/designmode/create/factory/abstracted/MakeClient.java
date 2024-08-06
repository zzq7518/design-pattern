package com.strong.designmode.create.factory.abstracted;

import com.strong.designmode.create.factory.simple.Bread;

/**
 * @author zhangzhiqiang
 * @date 2024/6/17 11:16
 * @description
 */
public class MakeClient {

    private final Bread bread;

    private final Dessert dessert;

    public MakeClient(MakeFactory makeFactory){
        this.bread = makeFactory.makeBread();
        this.dessert = makeFactory.makeDessert();
    }

    public void makeBread(){
        bread.make();
    }

    public void makeDessert(){
        dessert.make();
    }
}
