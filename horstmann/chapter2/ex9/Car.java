package com.mycompany.horstmann.chapter2.ex9;

public class Car {
    private double gasTank; // in gallons
    private double carMileage;
    private double gasConsumptionPerMile;


    public Car(double gasTank, double carMileage, double gasConsumption) {
        this.gasTank = gasTank;
        this.carMileage = carMileage;
        this.gasConsumptionPerMile = gasConsumption; // per mile
    }

    public double getGasTank() {
        return gasTank;
    }

    public double getCarMileage() {
        return carMileage;
    }

    public double getGasConsumptionPerMile() {
        return gasConsumptionPerMile;
    }

    public void refuel(double gallonsOfGas) {
        gasTank += gallonsOfGas;
    }

    public void drive(double miles) {
        double distance = gasTank / gasConsumptionPerMile;
        if (distance < miles) {
            throw new IllegalArgumentException("Not enough fuel. Car can drive " + distance + " miles");
        }
        carMileage += miles;
        gasTank -= miles * gasConsumptionPerMile;
    }
}
