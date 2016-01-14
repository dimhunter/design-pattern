package a01_factory.simple.factory;

import a01_factory.simple.production.Audi;
import a01_factory.simple.production.Benz;
import a01_factory.simple.production.Bmw;
import a01_factory.simple.production.Car;

/**
 * Created by shenluguo on 2015/6/9.
 * 工厂类角色
 */
public class DriveFactory {

    // 注意返回的是抽象产品。根据不同的值，生成返回不同的对象。
    public static Car getCar(String type){
        if("benz".equals(type)){
            return new Benz();
        }else if ("bmw".equals(type)){
            return new Bmw();
        }else if ("audi".equals(type)){
            return new Audi();
        }else{
            throw new RuntimeException("no car");
        }
    }

}
