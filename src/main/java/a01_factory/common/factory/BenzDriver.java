package a01_factory.common.factory;

import a01_factory.common.production.Benz;
import a01_factory.common.production.Car;

/**
 * Created by shenluguo on 2015/6/9.
 */
public class BenzDriver implements Driver {
    public Car driveCar() {
        return new Benz();
    }
}
