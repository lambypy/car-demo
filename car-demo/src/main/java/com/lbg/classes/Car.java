package com.lbg.classes;

public class Car extends Vehicle{

    // examples of constructor method overloading (different ways of altering the same Car class
    public Car(CarModel model, CarColour color) {
        this.setModel(model);
        this.colour = color;
    }


    public Car(){
        this.make = CarMake.FERRARI;
        this.setModel(CarModel.FIESTA); // makes sure that the model is actually valid
    }

    /*
    public Car(){
        this()
    }
    */


    @Override
    public String toString() {
        // return super.toString();
        String info = "Car: " + this.getMake();
        info += "\nModel: " + this.getModel();
        return info;
    }


    private int speed;
    private CarMake make;
    private CarColour colour;
    private CarModel model;


    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel newModel) {
        this.model = newModel;
    }


    public int getSpeed(){
        return this.speed;
    }

    public CarMake getMake(){
        return this.make;
    }


    public CarColour getColour(){
        return this.colour;
    }


    public void setColour(CarColour newColour){
        this.colour = newColour;
    }


    public void setMake(CarMake newMake){
        this.make = newMake;
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
