package com.Practical;

public class Engine {
    private String engineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void startEngine() {
        System.out.println("Engine started: " + engineType);
    }
}
