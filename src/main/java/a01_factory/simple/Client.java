package a01_factory.simple;

import a01_factory.simple.factory.DriveFactory;
import a01_factory.simple.production.Car;

/**
 * Created by shenluguo on 2015/6/9.
 */
public class Client {

    public static void main(String[] args){
        //告诉司机我今天坐宝马
        Car car = DriveFactory.getCar("bmw");
        //下令开车
        car.drive();
    }

}
