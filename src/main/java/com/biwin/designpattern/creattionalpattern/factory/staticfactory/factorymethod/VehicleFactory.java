package com.biwin.designpattern.creattionalpattern.factory.staticfactory.factorymethod;

/**
 * @Description
 * @auther wangli
 * @create 2019-09-20 17:42
 */
public abstract class VehicleFactory {

    protected abstract Vehicle createVehicle(String size);

    public Vehicle createVehicle(String size, String color){
        Vehicle vehicle = createVehicle(size);
        vehicle.setColor(color);
        vehicle.driven();
        return vehicle;
    }
}
