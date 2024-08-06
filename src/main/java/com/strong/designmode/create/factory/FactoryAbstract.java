package com.strong.designmode.create.factory;

/**
 * @author zhangzhiqiang
 * @date 2024/6/3 22:50
 * @description
 */
public class FactoryAbstract {

    public static void main(String[] args) {
        App app = new App(new YtFactory());
        app.type();
        app.run();
    }

}

/**
 * 1.抽象产品
 */
interface Car {
    /**
     * 类型
     */
    void type();

    /**
     * 行驶
     */
    void run();
}

interface Bus {
    /**
     * 类型
     */
    void type();

    /**
     * 行驶
     */
    void run();
}

/**
 * 2.具体产品
 */
class TramCar implements Car {

    @Override
    public void type() {
        System.out.println("电动轿车");
    }

    @Override
    public void run() {
        System.out.println("0～100，3.6秒");
    }
}

class OilCar implements Car {

    @Override
    public void type() {
        System.out.println("汽油轿车");
    }

    @Override
    public void run() {
        System.out.println("0～100，13.6秒");
    }
}

class TramBus implements Bus {

    @Override
    public void type() {
        System.out.println("电动公交车");
    }

    @Override
    public void run() {
        System.out.println("0～100，6.6秒");
    }
}

class OilBus implements Bus {

    @Override
    public void type() {
        System.out.println("汽油公交车");
    }

    @Override
    public void run() {
        System.out.println("0～100，16.6秒");
    }
}

/**
 * 3.抽象工厂
 */
interface CarFactory {
    Car createCar();

    Bus createBus();
}

/**
 * 4.具体工厂
 */
class BydFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new TramCar();
    }

    @Override
    public Bus createBus() {
        return new TramBus();
    }
}

class YtFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new OilCar();
    }

    @Override
    public Bus createBus() {
        return new OilBus();
    }
}

/**
 * 5.客户端
 */
class App {
    private final Car car;
    private final Bus bus;

    public App(CarFactory factory) {
        car = factory.createCar();
        bus = factory.createBus();
    }

    public void type() {
        car.type();
        bus.type();
    }

    public void run() {
        car.run();
        bus.run();
    }
}
