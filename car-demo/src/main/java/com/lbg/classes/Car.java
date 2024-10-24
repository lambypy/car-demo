package com.lbg.classes;

public class Car {

    public Car(String model) {
        this.setModel(model);
    }


    public Car(){
        this.make = "Unknown";
        this.setModel("Unknown"); // makes sure that the model is actually valid
    }

    private int speed;
    private String make;
    private CarColour colour;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String model;

    public int getSpeed(){
        return this.speed;
    }

    public String get_make(){
        return this.make;
    }


    public CarColour getColour(){
        return this.colour;
    }


    public void setColour(CarColour newColour){
        this.colour = newColour;
    }


    public void accelerate(int deltaV){
        this.speed += deltaV;
    }


    public void decelerate(int deltaV){
        this.speed -= deltaV;
    }


    public void speed_change(int deltaV){
        /*Changes the car speed positively or negatively*/
        this.speed += deltaV;
    }
}
