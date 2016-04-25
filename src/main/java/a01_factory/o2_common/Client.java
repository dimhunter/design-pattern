package a01_factory.o2_common;

import a01_factory.o2_common.factory.BenzDriver;
import a01_factory.o2_common.factory.Driver;
import a01_factory.o2_common.production.Car;

/**
 * Created by shenluguo on 2015/6/9.
 *
 * 工厂模式和简单工厂的主要区别就是工厂模式把工厂也抽象化了，避免多一个产品的时候，还需要修改工长里的逻辑代码。
 * 这样只需要加入一个抽象工厂的具体子类就可以了。
 *
 */
public class Client {

    public static void main(String[] args) {
        Driver driver = new BenzDriver();
        Car car = driver.driveCar();
        car.drive();
    }

}
