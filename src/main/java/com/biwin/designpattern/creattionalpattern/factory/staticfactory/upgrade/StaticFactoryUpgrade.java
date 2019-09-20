package com.biwin.designpattern.creattionalpattern.factory.staticfactory.upgrade;

import java.util.HashMap;
import java.util.Map;

import static com.biwin.designpattern.creattionalpattern.factory.staticfactory.ClassUtil.getAllClass;

/**
 * @Description
 * @auther wangli
 * @create 2019-09-20 11:02
 */
public class StaticFactoryUpgrade {

    private static Map<String, Vehicle> registeredVehicle;

    static {
        try {
            registeredVehicle = registerVehicle();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, Vehicle> registerVehicle() throws IllegalAccessException, InstantiationException {
        registeredVehicle = new HashMap<>();
        try {
            for(Class<?> c:getAllClass(Vehicle.class)){
                registeredVehicle.put(c.getSimpleName(), (Vehicle)c.newInstance());
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return registeredVehicle;
    }

    public Vehicle createVehicle(String vehicleId){
        return registeredVehicle.get(vehicleId).newInstance();
    }
}

class StaticFactoryUpgradeTest{
    public static void main(String[] args) {
        StaticFactoryUpgrade factory = new StaticFactoryUpgrade();
        factory.createVehicle("Bike").driven();
        factory.createVehicle("Car").driven();
        factory.createVehicle("Truck").driven();
    }
}
