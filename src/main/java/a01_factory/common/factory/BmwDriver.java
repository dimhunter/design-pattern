package a01_factory.common.factory;

import a01_factory.common.production.Bmw;
import a01_factory.common.production.Car;

/**
 * Created by shenluguo on 2015/6/9.
 */
public class BmwDriver implements Driver {
    public Car driveCar() {
        return new Bmw();
    }
}
