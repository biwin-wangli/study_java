package com.biwin.designpattern.creattionalpattern.builder.simplebuilder;

/**
 * @Description 统一对外的建造总负责器
 * @auther wangli
 * @create 2019-09-25 15:39
 */
public class CarBuilderDirector {

    public Car buildElectricCar(CarBuilder builder){
        builder.buildCar();
        builder.addEngine("Electric 150 kW");
        builder.addBatteries("1500 kWh");
        builder.addTransmission("Manual");
        for(int i=0; i < 4; i++){
            builder.addWheel("20*12*30");
        }
        builder.paint("red");
        return builder.getCar();
    }

    public Car buildHybridCar(CarBuilder builder){
        builder.buildCar();
        builder.addEngine("Electric 150 kW");
        builder.addBatteries("1500 kWh");
        builder.addTransmission("Manual");
        for(int i = 0; i < 4; i++){
            builder.addWheel("20*12*30");
        }
        builder.paint("red");
        builder.addGasTank("1500 kWh");
        builder.addEngine("Gas 1600cc");
        return builder.getCar();
    }
}

class BuilderTest{

    public static void main(String[] args) {
        CarBuilderDirector carBuilderDirector = new CarBuilderDirector();
        CarBuilder carBuilder = new ElectricCarBuilder();
        System.out.println(carBuilderDirector.buildElectricCar(carBuilder).toString());

        CarBuilder car2Builder = new GasolineCarBuilder();
        System.out.println(carBuilderDirector.buildHybridCar(car2Builder).toString());
    }
}
