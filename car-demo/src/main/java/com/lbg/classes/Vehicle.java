package com.lbg.classes;

public class Vehicle {
    private int numberOfWheels;
    private String registrationNumber;


    public Vehicle(){
        this.setNumberOfWheels(4);
        this.setRegistrationNumber("Unregistered");
    }

    public Vehicle(int numWheels, String regNumber){
        this.setNumberOfWheels(numWheels);
        this.setRegistrationNumber(regNumber);
    }


    @Override
    public String toString() {
        //return super.toString(); looking for base java.obj.lang class
        return "Vehicle " + this.getNumberOfWheels() + " " + this.getRegistrationNumber();
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
