package com.biwin.designpattern.creattionalpattern.builder.simplebuilder;

/**
 * @Description 电动车建造监工
 * @auther wangli
 * @create 2019-09-25 15:44
 */
public class ElectricCarBuilder extends CarBuilder {

    private Car car = new Car();

    @Override
    Car buildCar() {
        return car;
    }

    @Override
    void addEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    void addWheel(String wheel) {
        car.setWheel(wheel);
    }

    @Override
    void paint(String color) {
        car.setPaint(color);
    }

    @Override
    void addTransmission(String transmission) {
        car.setTransmission(transmission);
    }

}
