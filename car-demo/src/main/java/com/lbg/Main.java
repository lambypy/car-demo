package com.lbg;
import com.lbg.classes.*;

import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        // javaPart1();
        javaPart2();
    }

    private static void javaPart1() {
        System.out.println("hi");

        Car bartCar = new Car();
        System.out.println(bartCar.getSpeed());
        System.out.println(bartCar);
        System.out.println(bartCar.getMake());
        bartCar.setModel(CarModel.FIESTA);
        bartCar.setColour(CarColour.BLACK);
        System.out.println("The car colour is " + bartCar.getColour());
        bartCar.setColour(CarColour.RED);
        System.out.println("The car colour is " + bartCar.getColour());
        bartCar.speed_change(5);
        System.out.println(bartCar.getSpeed());
        bartCar.speed_change(-5);
        System.out.println(bartCar.getSpeed());


        Car lisaCar = new Car(CarModel.FIESTA, CarColour.RED);
        lisaCar.speed_change(20);
        System.out.println(lisaCar.getSpeed());
        System.out.println();

        Car[] cars = new Car[3];
        cars[0] = bartCar;
        cars[1] = lisaCar;
        cars[2] = new Car(CarModel.FIESTA, CarColour.BLACK);

        for (Car car : cars) {
            System.out.println(car.getColour());
            System.out.println(car.getModel());
        }

        Car[] newCars = new Car[100];

        // loops through 100 times to add a Car and get the colour
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int index = random.nextInt(CarColour.values().length);
            newCars[i] = new Car(CarModel.FIESTA, CarColour.values()[index]);
            newCars[i].setColour(CarColour.values()[index]);
        }

        // Loop through and print color counts
        for (CarColour color : CarColour.values()) {
            long numberForCurrColor = Arrays.stream(newCars)
                    .filter(c -> c.getColour().equals(color))
                    .count();
            System.out.println("Number of " + color.toString().toLowerCase() +
                    " cars available: " + numberForCurrColor);
        }

        System.out.println(bartCar);
        lisaCar.setMake(CarMake.TESLA);
        System.out.println(lisaCar);
    }

    private static void javaPart2(){
        System.out.println("Java Part 2");
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        Car c1 = new Car(CarModel.FIESTA, CarColour.BLACK);
        System.out.println(v2);
        System.out.println(c1.getRegistrationNumber());
        System.out.println(c1.getNumberOfWheels());

        Vehicle v3 = new Vehicle(2, "LS 8");
        System.out.println(v3);
        System.out.println(v2);


        Car c2 = new Car();
        String serviceInfo = v3.performService();
        System.out.println(serviceInfo);
        System.out.println(c1.performService());
        System.out.println();

        Vehicle[] vehicles = {v1, v2, v3, c1, c2};
        // example of polymorphism
        for (Vehicle v: vehicles){
            System.out.println(v); //toString
            System.out.println(v.performService());
        }
    }
}