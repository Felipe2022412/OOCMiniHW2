/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweis
 */
public abstract class Vehicle {
    private float speed;
    private float direction = 0;
    private String make;
    private String type;
    protected int numWheels = 0;
    protected int numWings = 0;
    protected int numSails = 0;
    private int numPassengers;

    public Vehicle(float speed, String make, String type, int numPassengers) {
        this.speed = speed;
        this.make = make;
        this.type = type;
        this.numPassengers = numPassengers;
    }

   
// Created getters and setters to be used in the main class - to set and get the new parameters
    public float getSpeed() {
        return speed;
    }

    public float getDirection() {
        return direction;
    }

    public String getMake() {
        return make;
    }

    public String getType() {
        return type;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public int getNumWings() {
        return numWings;
    }

    public int getNumSails() {
        return numSails;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setDirection(float direction) {
        this.direction = direction;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public void setNumWings(int numWings) {
        this.numWings = numWings;
    }

    public void setNumSails(int numSails) {
        this.numSails = numSails;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

  
    
    
}
