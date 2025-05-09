package com.company.professions;

public class Driver {
    String message1 = "I\'m driving!";
    private String carModel;

    public Driver(String carModel) {
        this.carModel = carModel;
    }

    public void displayInfo1() {
        System.out.println(message1);
        System.out.println("Hello World!")
        System.out.println("Hello World!")
        System.out.println("Hello World!")
        System.out.println("CarModel = " + this.carModel);
    }


}
