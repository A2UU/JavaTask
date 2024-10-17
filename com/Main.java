package com.Practical;

public class Main {
    public static void main(String[] args) {
        // Creating an Engine object
        Engine engine = new Engine("V8");

        // Passing Engine object to Car (Composition)
        Car car = new Car("Ford Mustang", engine);

        // Starting the car, which internally starts the engine
        car.startCar();

        // Displaying car details
        System.out.println(car.getCarDetails());
    }
}
