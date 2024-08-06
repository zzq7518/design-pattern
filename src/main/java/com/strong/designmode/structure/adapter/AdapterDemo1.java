package com.strong.designmode.structure.adapter;

/**
 * @author zhangzhiqiang
 * @date 2024/6/27 16:24
 * @description
 */
public class AdapterDemo1 {
}

interface IPort{

}

class Vga{
    public void link(){
        System.out.println("VGA 连接显示器");
    }
}

class Hdmi{
    public void link(){
        System.out.println("HDMI 连接显示器");
    }
}
