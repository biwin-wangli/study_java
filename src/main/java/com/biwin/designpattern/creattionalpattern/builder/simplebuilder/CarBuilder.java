package com.biwin.designpattern.creattionalpattern.builder.simplebuilder;


/**
 * @Description
 * @auther wangli
 * @create 2019-09-25 15:42
 */
public abstract class CarBuilder {

    abstract Car buildCar();

    abstract void addEngine(String engine);

    abstract void addWheel(String wheel);

    abstract void paint(String color);

    abstract void addTransmission(String transmission);

    public void addGasTank(String gasTank){
        if(null == gasTank || "".equals(gasTank)){
            gasTank = "默认油桶";
        }
        getCar().setGasTank(gasTank);
    }

    public void addBatteries(String batteries){
        if(null == batteries || "".equals(batteries)){
            batteries = "默认电池";
        }
        getCar().setBatteries(batteries);
    }

    public Car getCar(){
        return buildCar();
    }

}
