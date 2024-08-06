package com.strong.designmode.create.factory;

/**
 * @author zhangzhiqiang
 * @date 2024/6/3 14:42
 * @description
 */
public class FactoryMethod {
    private static Dialog dialog;
    public static void main(String[] args) {
        dialog = new HtmlDialog();
        dialog.renderWindow();
        dialog = new WindowsDialog();
        dialog.renderWindow();
    }
}

/**
 * 1.抽象产品
 */
interface Button {
    void render();
    void onClick();
}

/**
 * 2.具体产品
 */
class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("html button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! html Button says - 'html!'");
    }
}

class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("windows button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! windows Button says - 'windows!'");
    }
}

/**
 * 抽象创建者
 */
abstract class Dialog{
    public void renderWindow(){
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();

}

/**
 * 4.具体创建者
 */
class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

class WindowsDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
