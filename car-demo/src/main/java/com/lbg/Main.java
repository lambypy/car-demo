package com.lbg;
import com.lbg.classes.Car;
import com.lbg.classes.CarColour;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("hi");

        Car bartCar = new Car();
        System.out.println(bartCar.getSpeed());
        System.out.println(bartCar);
        System.out.println(bartCar.get_make());
        bartCar.setModel("Not a Blah");
        bartCar.setColour(CarColour.BLACK);
        System.out.println("The car colour is " + bartCar.getColour());
        bartCar.setColour(CarColour.RED);
        System.out.println("The car colour is " + bartCar.getColour());
        bartCar.speed_change(5);
        System.out.println(bartCar.getSpeed());
        bartCar.speed_change(-5);
        System.out.println(bartCar.getSpeed());


        Car lisaCar = new Car("Blah2");
        lisaCar.speed_change(20);
        System.out.println(lisaCar.getSpeed());
        System.out.println();

        Car[] cars = new Car[3];
        cars[0] = bartCar;
        cars[1] = lisaCar;
        cars[2] = new Car("Blah44");

        for (Car car : cars){
            System.out.println(car.getColour());
            System.out.println(car.getModel());
        }
    }
}