package com.company.details;

public class Engine {
    private String model;

    public Engine(String model) {
        this.model = model;
    }

    public void displayInfo2() {
        System.out.println("EngineModel = " + this.model);
    }
}
