package com.biwin.designpattern.creattionalpattern.factory.staticfactory.factorymethod;

/**
 * @Description 具体的汽车工厂类
 * @auther wangli
 * @create 2019-09-20 17:49
 */
public class CarFactory extends VehicleFactory {

    @Override
    protected Vehicle createVehicle(String size) {
        if(size.equals("small")){
            return new SportCar();
        }else if(size.equals("large")){
            return new SedanCar();
        }
        return null;
    }

}

class CarFactoryTest{
    public static void main(String[] args) {
        VehicleFactory factory = new CarFactory();
        factory.createVehicle("large", "blue");
    }
}
