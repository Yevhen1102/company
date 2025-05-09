package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

import java.util.Scanner;

public class Car {
    Engine engine;
    Driver driver;

    public void displayInfo1() {
        driver.displayInfo1();
    }

    public void displayInfo2() {
        engine.displayInfo2();
    }


    public static void main(String[] args) {
        //ввод модели двигателя
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите модель двигателя: ");
        String userModel = scanner1.nextLine();
        //ввод модели машины
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите модель машины: ");
        String carModel = scanner2.nextLine();
        //ввод двух аргументов
        //1
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Введите номер машины: ");
        String machineNumber = scanner3.nextLine();
        //2
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Введите имя водителя: ");
        String nameDriver = scanner4.nextLine();
        //вывод
        Car car = new Car();
        car.engine = new Engine(userModel);
        car.driver = new Driver(carModel);
        car.displayInfo1();
        car.displayInfo2();
        System.out.println(
                "MachineNumber: " + machineNumber +
                        "\nNameDriver: " + nameDriver
        );
        System.out.println("HelloWorld!");
    }
}
