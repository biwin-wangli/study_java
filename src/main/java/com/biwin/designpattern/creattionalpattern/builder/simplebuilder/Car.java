package com.biwin.designpattern.creattionalpattern.builder.simplebuilder;

/**
 * @Description
 * @auther wangli
 * @create 2019-09-25 15:45
 */
public class Car {

    /**
     * 引擎
     */
    private String engine;

    /**
     * 车轮
     */
    private String wheel;

    /**
     * 车漆
     */
    private String paint;

    /**
     * 动力来源
     */
    private String transmission;

    /**
     * 油桶
     */
    private String gasTank;

    /**
     * 电池
     */
    private String batteries;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getPaint() {
        return paint;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getGasTank() {
        return gasTank;
    }

    public void setGasTank(String gasTank) {
        this.gasTank = gasTank;
    }

    public String getBatteries() {
        return batteries;
    }

    public void setBatteries(String batteries) {
        this.batteries = batteries;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheel='" + wheel + '\'' +
                ", paint='" + paint + '\'' +
                ", transmission='" + transmission + '\'' +
                ", gasTank='" + gasTank + '\'' +
                ", batteries='" + batteries + '\'' +
                '}';
    }
}
