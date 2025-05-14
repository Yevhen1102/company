package com.company.vehicles;

import com.company.details.Engine;
import org.example.professions.Driver;

import java.util.Scanner;

public class Car {
    Engine engine;
    Driver driver;

    public static void main(String[] args) {
        launchCar();
    }
    private static void launchCar(){
        String arg1 = enterArg1();
        String arg2 = enterArg2();
        Car car = new Car();
        car.engine = new Engine(enterEngineType());
        car.driver = new Driver(enterCarModel());
        System.out.println(
                "MachineNumber: " + arg1 +
                        "\nNameDriver: " + arg2
        );
        car.displayInfo2();
        car.displayInfo1();
    }
    private void displayInfo1() {
        driver.displayInfo1();
    }

    private void displayInfo2() {
        engine.displayInfo2();
    }

    private static String enterEngineType() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите модель двигателя: ");
        return scanner1.nextLine();
    }

    private static String enterCarModel() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите модель машины: ");
        return scanner2.nextLine();
    }

    private static String enterArg1() {
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Введите номер машины: ");
        return scanner3.nextLine();
    }

    private static String enterArg2() {
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Введите имя водителя: ");
        return scanner4.nextLine();
    }
}
