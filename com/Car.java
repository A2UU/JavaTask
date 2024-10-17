package com.Practical;

public class Car {
    private String model;
    private Engine engine;  // Composition: Car has an Engine

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void startCar() {
        System.out.println("Car model: " + model);
        engine.startEngine();  // Car starts by using the Engine's method
        System.out.println("Car is running.");
    }

    public String getCarDetails() {
        return "Car model: " + model + ", Engine type: " + engine.getEngineType();
    }
}
