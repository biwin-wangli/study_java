package com.biwin.designpattern.creattionalpattern.factory.staticfactory;

import java.util.HashMap;
import java.util.Map;

import static com.biwin.designpattern.creattionalpattern.factory.staticfactory.ClassUtil.getAllClass;

/**
 * @Description 静态工厂类
 * @auther wangli
 * @create 2019-09-20 9:45
 */
public class StaticFactory {

    /**
     * 1.可以通过Spring自动注入Vehicle类的所有子类
     * 2.该例使用Java 反射获取Vehicle类的所有子类
     */
//    private List<Vehicle> vehicleList;

    private static Map<String, Class> registeredVehicle = getVehicle();

    private static Map getVehicle(){
        registeredVehicle = new HashMap<>();
        try {
            for(Class<?> c:getAllClass(Vehicle.class)){
                registeredVehicle.put(c.getSimpleName(), c.getClassLoader().loadClass(c.getName()));
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return registeredVehicle;
    }

    public Vehicle getInstance(String type) throws IllegalAccessException, InstantiationException {
        Class vehicle = registeredVehicle.get(type);
        return (Vehicle) vehicle.newInstance();
    }

}

class StaticFactoryTest{

    //该代码是通过工厂类自身进行类实例化
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        StaticFactory factory = new StaticFactory();
        factory.getInstance("Bike").driven();
        factory.getInstance("Car").driven();
        factory.getInstance("Truck").driven();
    }

}
